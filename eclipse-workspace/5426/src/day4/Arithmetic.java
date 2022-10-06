package day4;

import java.awt.print.Printable;

import day1.Point;

public class Arithmetic<E extends Number> {                         //ANGULAR BRACKETS COMPILER UNDERSTANDS IT AS GENERICS 

	  //public String add(E a,E b) {
		  //return a.toString()+b.toString();
	public <F> void Printable(F obj) {   //made method as f=generics without mentioning the type 
		System.out.println("recd .. class"+obj.getClass().getName()+" "+obj);
	}
	
		 public double add(E a,E b) {
			 return a.doubleValue()+b.doubleValue();	

}
	  public static void main(String[] args) {
		Arithmetic<Integer> a=new Arithmetic<>();
		System.out.println(a.add(2,3));
		System.out.println(new Arithmetic<Double>().add(2.3, 4.6));
		System.out.println(new Arithmetic<Double>().add(2.3 , 4.6));
		//System.out.println(new Arithmetic<Point>().add(new Point(2,3),new Point(3,5)));
				
	}
}
