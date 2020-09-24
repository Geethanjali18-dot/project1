package demo12filehandeling;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

//calling private method
public class ReflectionAPI {
public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
	Class c=Class.forName("demo12filehandeling.Test");
	Test t=(Test)c.newInstance();
	Method m=c.getDeclaredMethod("show",null);
	m.setAccessible(true);
	m.invoke(t, null);
	
}
}
