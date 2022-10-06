package Day2;

public class Outer {
private int x=5;

public Inner createInner() {
	return new Inner();
}

private class Inner{
	private void printX() {
		System.out.println("X="+x);
	}
	private void increment() {
		x++;
	}
}

public static void main(String[] args) {
	Outer o=new Outer();
	Outer.Inner i=o.new Inner(); //o.new inner is
	Outer.Inner i1=o.createInner();

	i.printX();
	i1.printX();
	i.increment();
	i1.printX();
	Outer.Inner i2=new Outer().createInner();
	i2.printX();
	
}
}
