package Day2;

import static org.junit.Assert.*;

import java.awt.Point;

import org.junit.Test;

public class JUNIT {
@Test
public void testequals() {
	Point p=new Point(2,3);
	Point p1=new Point(2,3);
	Point p2=p;
	assertTrue(p==p2);
	assertFalse(p==p1);
	assertTrue(p.equals(p1));
	assertEquals(p.hashCode(),p1.hashCode());
	}

}
