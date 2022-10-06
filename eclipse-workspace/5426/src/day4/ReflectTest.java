package day4;

import static org.junit.Assert.*;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.junit.Test;

import day1.Point;

public class ReflectTest {

	@Test
	public void test() throws InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
		
	Point p=Point.class.newInstance();
	System.out.println(p);
	Method m=Point.class.getMethod("setX", Integer.class);
	m.invoke(p,10);
	System.out.println(p);
	
	}

}
//type eraser feature invoking add method at runtime it takes any type of arguements of datatypes

//generic is a compile time 