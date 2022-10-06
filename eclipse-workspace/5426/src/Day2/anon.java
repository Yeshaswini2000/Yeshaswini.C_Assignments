package Day2;

import day1.Animal;

public class anon {



	   public static void main(String[] args) {
	        Animal a= new Animal() {
	            int counter =0;



	           @Override
	            public void makeSound() {
	                counter++;
	                System.out.println("Anon...."+counter);
	            }
	            
	        };
	        
	        a.makeSound();
	        a.makeSound();
	        



	   }



	}