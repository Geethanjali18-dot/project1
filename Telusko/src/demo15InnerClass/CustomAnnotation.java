package demo15InnerClass;

import java.lang.annotation.Annotation;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import java.util.ArrayList;
//Marker Annotation
/*
 * @interface SmartPhone//to create own annotation
{
	
}
 */
//Single value Annotation
/*
 * @interface SmartPhone//to create own annotation
{
	String os();
	
}
 */
//Multi value Annotation
@Documented
@Inherited
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface SmartPhone//to create own annotation
{
	String os() default "Symbian";
	int version() default 1;
}

@SmartPhone(os="Android",version=6)
class NokiaASeries
{
	String model;
	int size;
	public NokiaASeries(String model, int size) {
		super();
		this.model = model;
		this.size = size;
	}
	
}
public class CustomAnnotation {
public static void main(String[] args) {
	NokiaASeries obj=new NokiaASeries("Fire",5);
	System.out.println(obj.model);
	
	//to fetch annotation values use reflection API
	Class c=obj.getClass();
	Annotation a=c.getAnnotation(SmartPhone.class);
	SmartPhone s=(SmartPhone)a;
	System.out.println(s.os());
	System.out.println(s.version());
	
}
}
