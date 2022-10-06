package assignments;


import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;


public class PhoneNumberTest {
	PhoneNumber p = new PhoneNumber();
	List<Long> nums = new ArrayList<>();

	@Test
	public void test() {
		nums.add(8217690292L);
		nums.add(1234567890L);
		int sz=nums.size();
		
		
		assertEquals(0,PhoneNumber.phoneNumber(sz, nums));
	}
	
	
	@Test
	public void test1() {
		nums.add(1212121212L);
		nums.add(9999999999L);
		nums.add(7300422656L);
		int sz = nums.size();

		assertEquals(1, PhoneNumber.phoneNumber(sz, nums));
	}

	@Test
	public void test2() {
		nums.add(1234567890L);
		nums.add(9876543210L);
		int sz = nums.size();

		assertEquals(0, PhoneNumber.phoneNumber(sz, nums));
	}

	@Test
	public void test3() {
		nums.add(9000099990L);
		nums.add(7300422656L);
		int sz = nums.size();

		assertEquals(0, PhoneNumber.phoneNumber(sz, nums));
	}

	@Test
	public void test4() {
		nums.add(1212121212L);
		nums.add(7300422656L);
		int sz = nums.size();

		assertEquals(0, PhoneNumber.phoneNumber(sz, nums));
	}

}

