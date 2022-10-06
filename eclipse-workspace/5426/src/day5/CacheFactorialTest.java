package day5;

import static org.junit.Assert.*;

import org.junit.Test;

public class CacheFactorialTest {

	@Test
	public void test() {
	CacheFactorial cf=new CacheFactorial();
	assertEquals(6,cf.factorial(3));
	assertEquals(120,cf.factorial(5));
	assertEquals(120,cf.factorial(5));

	}

}
