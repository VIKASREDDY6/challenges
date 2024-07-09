package solutions.challenge2.solution4;

import java.util.*;

import solutions.challenge2.solution4.animals.*;

public class Main {

	public static void main(String[] args) {
		List<Animal> animals = new ArrayList<>();
        animals.add(new Cat("111", "kali"));
        animals.add(new Fish("222", "Nimo"));
        
        // Add Dog that runs and swims
        animals.add(new Dog("333", "Snoopy"));
        
        //Listing animal names
        for(Animal animal: animals) {
        	System.out.println(animal.getName());
        }
        
        // Listing animals Eating
        for(Animal animal: animals) {
        	if(animal.canEat()) {
        		System.out.print(animal.getName() + " -> ");
        		animal.eat();
        	}
        }
        
        // Listing animals Running
        for(Animal animal: animals) {
        	if(animal.canRun()) {
        		System.out.print(animal.getName() + " -> ");
        		animal.run();
        	}
        }
        
        // Listing animals Swimming
        for(Animal animal: animals) {
        	if(animal.canSwim()) {
        		System.out.print(animal.getName() + " -> ");
        		animal.swim();
        	}
        }
	}

}
