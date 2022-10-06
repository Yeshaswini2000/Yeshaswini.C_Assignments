package Day2;

import static org.junit.Assert.*;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import org.junit.Test;


import day1.Point3D;

public class SetOfPoints3DTest {
	
	@Test
	 public void testTreeSetfor3D() {
        Set<Point3D> points3d=new TreeSet<>();
        points3d.add(new Point3D(2,3,6));
        assertEquals(1, points3d.size());
        points3d.add(new Point3D(2,3,6));
        assertEquals(1, points3d.size());
        points3d.add(new Point3D(2,5,8));
        assertEquals(2, points3d.size());
        points3d.add(new Point3D(3,2,5));
        assertEquals(3, points3d.size());
        
    }

	@Test
		public void testTreeSet() {
	        Set<Point3D> points =new HashSet<Point3D>();
	        points.add(new Point3D(2,3, 0));
	        assertEquals(1,points.size());
	        points.add(new Point3D(2,3, 0));
	        assertEquals(1,points.size());
	        points.add(new Point3D(3,3, 0));
	        assertEquals(2,points.size());
	        points.add(new Point3D(3,2, 0));
	        assertEquals(3,points.size());
	        
	}

}
