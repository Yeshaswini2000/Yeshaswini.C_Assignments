package day5;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class StringSorterTest {
	
	
	
	
	@Test
    public void testAlphabeticOrder() {
        String[] names = { "Abc", "Pqr", "Lmno", "Too", "Ab", "z" };
        Arrays.sort(names, new StringSorter());
        assertArrayEquals(new String[] { "z", "Ab", "Pqr", "Abc", "Too", "Lmno" }, names);





  }

	
	
	@Test
  public void testVowelCount() {
     String [] s1 = {"Abc","Pqr","Lmno","Too","Ab","z"};
    Arrays.sort(s1, new StringSorter());
    assertArrayEquals(new String[] {"z","Ab","Pqr","Abc","Too","Lmno"}, s1);
    
  }
}
	

	//@Test
//	public void test() {
	//	String [] names= {"Abc","Pqr","Lmno","Ab","z"};
	//	Arrays.sort(names,new StringSorter());
	//assertArrayEquals(new String[] {"z","Ab","Abc","Pqr","Lmno"},names);
	//}

//}
