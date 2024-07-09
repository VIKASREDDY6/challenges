package solutions.challenge2.solution4.animals;

import solutions.challenge2.solution4.eating.*;
import solutions.challenge2.solution4.running.*;
import solutions.challenge2.solution4.swimming.*;

public class Dog extends Animal {

	public Dog(String id, String name) {
		super(id, name);
		eatBehaviour = new NoEating();
		runBehaviour = new HopAndRun();
		swimBehaviour = new SwimWithLegs();
	}

}
