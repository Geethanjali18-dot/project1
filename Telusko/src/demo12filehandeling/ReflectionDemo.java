package demo12filehandeling;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
public class ReflectionDemo {
public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
	Class c=Class.forName("demo12filehandeling.CallingPrivateMethod");
	CallingPrivateMethod t=(CallingPrivateMethod)c.newInstance();
	Method m=c.getDeclaredMethod("show", null);
	m.setAccessible(true);
	m.invoke(t, null);
	
}
}
