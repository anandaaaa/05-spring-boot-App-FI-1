package in.anand.test;

import java.lang.reflect.Field;

public class Test {
	
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchFieldException, SecurityException {
		
		Class<?> clas = Class.forName("in.anand.test.Demo");
		Field field = clas.getDeclaredField("i");
		field.setAccessible(true);
		
		Object object = clas.newInstance();
		
		field.set(object, 30);
		
		System.out.println(field.get(object));
		
		
		
	}

}
