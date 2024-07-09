package solutions.challenge2.solution2;

import java.util.ArrayList;
import java.util.List;


public class Main {

	public static void main(String[] args) {
		List<Animal> animals = new ArrayList<>();
		
		animals.add(new Cat("111", "Loki"));
		animals.add(new Fish("222", "Goldy"));
		animals.add(new Dog("333", "Fluffy"));
		animals.add(new Cat("444", "Harry"));
		animals.add(new Fish("555", "Nimo"));
		animals.add(new Dog("666", "Jimmy"));
		
		// Listing name of Animals
		for(Animal animal: animals) {
			System.out.println(animal.getName());
		}
		
		// Listing Animals Running
		for(Animal animal: animals) {
			if(animal.canPerform(Actions.RUN)) 
				animal.performAction(Actions.RUN);
		}
		
		// Listing Animals Eating
		for(Animal animal: animals) {
			if(animal.canPerform(Actions.EAT)) 
				animal.performAction(Actions.EAT);
		}
		
		// Listing Animals Swimming
		for(Animal animal: animals) {
			if(animal.canPerform(Actions.SWIM)) 
				animal.performAction(Actions.SWIM);
		}
	}

}
