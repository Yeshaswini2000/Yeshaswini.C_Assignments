package day5;
import java.util.Scanner;

public class factorialUsingRecursion {
	 public static long factorial(long i) {
	      if(i <= 1) {
	         return 1;
	      }
	      return i * factorial(i - 1);
	   }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	      System.out.println("Enter the number to which you need to find the factorial");
	      int i = sc.nextInt();
	      System.out.println("Factorial of the given number is ::"+ factorial(i));

	}

}


