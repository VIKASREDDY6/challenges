package solutions.challenge2.solution3;

import java.util.ArrayList;
import java.util.List;

import solutions.challenge2.solution3.actions.*;
import solutions.challenge2.solution3.animals.*;

public class Main {

	public static void main(String[] args) {
		List<Animal> animals = new ArrayList<>();
		
		animals.add(new Cat("111", "Loki"));
		animals.add(new Fish("222", "Goldy"));
		animals.add(new Dog("333", "Fluffy"));
		animals.add(new Cat("444", "Harry"));
		animals.add(new Fish("555", "Nimo"));
		animals.add(new Dog("666", "Jimmy"));
		animals.add(new Bird("777", "Larry"));
		
		
		// Listing Animal name without
		for(Animal animal: animals) {
			System.out.println(animal.getName());
		}
		
		// Listing Animals Eating
		for(Animal animal: animals) {
			if(animal instanceof Eat) {
				((Eat) animal).eat();
			}
		}
		
		// Listing Animals Running
		for(Animal animal: animals) {
			if(animal instanceof Run) {
				((Run) animal).run();
			}
		}
		
		// Listing Animals Swimming
		for(Animal animal: animals) {
			if(animal instanceof Swim) {
				((Swim) animal).swim();
			}
		}
		
		// Listing Animals Swimming
		for(Animal animal: animals) {
			if(animal instanceof Fly) {
				((Fly) animal).fly();
			}
		}

	}

}
