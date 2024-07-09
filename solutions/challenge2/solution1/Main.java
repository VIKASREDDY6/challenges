package solutions.challenge2.solution1;

import java.util.*;
import solutions.challenge2.solution1.interfaces.*;
import solutions.challenge2.solution1.classesimpl.*;

public class Main {

	public static void main(String[] args) {
		
		List<Animal> animals = new ArrayList<>();
		
		animals.add(new Cat("111", "Loki"));
		animals.add(new Fish("222", "Goldy"));
		animals.add(new Dog("333", "Fluffy"));
		animals.add(new Cat("444", "Harry"));
		animals.add(new Fish("555", "Nimo"));
		animals.add(new Dog("666", "Jimmy"));
		
		// Listing Animal names using instanceof
		// Not recommended, because of the need for modification during extension
//		for(Animal animal: animals) {
//			String name = "";
//			if(animal instanceof Cat) name = ((Cat) animal).name;
//			else if(animal instanceof Dog) name = ((Dog) animal).name; 
//			else if(animal instanceof Fish) name = ((Fish) animal).name;
//			System.out.println(name);
//		}
		
		// Listing Animal name without using instanceof
		for(Animal animal: animals) {
			System.out.println(animal.getName());
		}
		
		// Listing Animals Eating
		// If an animal implements EatsAnimal, it can perform eat
		for(Animal animal: animals) {
			if(animal instanceof EatsAnimal) {
				((EatsAnimal) animal).eat();
			}
		}
		
		// Listing Animals Running
		// If an animal implements RunsAnimal, it can perform run
		for(Animal animal: animals) {
			if(animal instanceof RunsAnimal) {
				((RunsAnimal) animal).run();
			}
		}
		
		// Listing Animals Swimming
		// If an animal implements SwimsAnimal, it can perform swim
		for(Animal animal: animals) {
			if(animal instanceof SwimsAnimal) {
				((SwimsAnimal) animal).swim();
			}
		}
		
	}

}
