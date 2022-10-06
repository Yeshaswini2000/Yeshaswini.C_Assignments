package day5;

import static org.junit.Assert.*;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

import org.junit.Test;



	public class PasswordStrengthTest {
		@Test
		public void test() {
		    String s="Yes@1234";
		    PasswordStrength pc=new PasswordStrength();
		    assertEquals(23, pc.checker(s));   
		    }
		@Test
		public void testlower() {
			String s="Yes@1234";
		    PasswordStrength pc=new PasswordStrength();
		    assertEquals(true, pc.lowerC(s));
		}
		
		
		@Test
		public void testUpper() {
			String s="Yes@1234";
		    PasswordStrength pc=new PasswordStrength();
		    assertEquals(true, pc.upperC(s));	
		}
		
		@Test
		public void testCount() {
			String s="Yes@1234";
		    PasswordStrength pc=new PasswordStrength();
		    assertEquals(5, pc.countSC(s));	
		}
		
		@Test
		public void testNumber() {
			String s="Yes@1234";
		    PasswordStrength pc=new PasswordStrength();
		    assertEquals(8, pc.countNum(s));	
		}
		
		}


