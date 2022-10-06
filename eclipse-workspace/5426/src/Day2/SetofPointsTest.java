package Day2;

import static org.junit.Assert.*;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import org.junit.Test;

import day1.Point;

public class SetofPointsTest {
	
	@Test
	public void testTreeSet() {
		Set<Point> points=new TreeSet<>();
		points.add(new Point(2,3));
		assertEquals(1, points.size());
		points.add(new Point(2,3));
		assertEquals(1, points.size());
		points.add(new Point(3,3));
		assertEquals(2, points.size());
		points.add(new Point(3,2));
		assertEquals(3, points.size());
		
		
		
		
		
	}
	
	@Test
	public void testSetOfPoints() {
		Set<Point> points=new HashSet<>();
		points.add(new Point(2,3));
		assertEquals(1, points.size());
		points.add(new Point(2,3));
		assertEquals(1, points.size());
		
		
	
	
	}
	
	
	
	
	
	
	
	
	@Test
	public void testSetOfStringsWthGenerics() {
		Set<String> myWords=new HashSet<>();     //GENERIC USE IS TO MENTION THat ur set contains only type string or specific to which type u are using
		myWords.add("Hello");
		myWords.add("VALTECH");
		myWords.add("LEARN JAVA PROPERLY");
		for (Iterator iterator = myWords.iterator(); iterator.hasNext();) {
			String string = (String) iterator.next();
			System.out.println(string);
			
		}
		
		
	}

	@Test
	public void testSetOfStrings() {
		Set setOfStrings=new HashSet(); //set is an interface
		setOfStrings.add("Hello");
		assertEquals(1,setOfStrings.size());
		setOfStrings.add("Hello");
		assertEquals(1,setOfStrings.size());
		setOfStrings.add("HEllo");
		assertEquals(2,setOfStrings.size());
		//System.out.println(setOfStrings);
		//setOfStrings.add(123);      here where generic comes
		
		
		for (Iterator iterator = setOfStrings.iterator(); iterator.hasNext();) {
			Object object = (Object) iterator.next();
			String s=(String)object;
			System.out.println(s);
		}
		
	}

}
