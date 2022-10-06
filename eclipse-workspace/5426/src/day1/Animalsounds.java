package day1;

public class Animalsounds {

	public void disturb(Animal a) {
		a.makeSound();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Animalsounds as =new  Animalsounds();
		 as.disturb(new Dog());
		 as.disturb(new Cat());
	}

}
