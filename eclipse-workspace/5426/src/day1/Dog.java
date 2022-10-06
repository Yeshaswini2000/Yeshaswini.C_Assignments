package day1;

public class Dog implements Animal {

	
	public static void main(String[] args) {
		Animal a=new Dog();
		a.makeSound();
		
	}

	@Override
	public void makeSound() {
		// TODO Auto-generated method stub
		System.out.println("BOWWW BOWWWW");
		
	}
	
	
	

}

