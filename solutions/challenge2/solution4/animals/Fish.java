package solutions.challenge2.solution4.animals;

import solutions.challenge2.solution4.eating.*;
import solutions.challenge2.solution4.running.*;
import solutions.challenge2.solution4.swimming.*;

public class Fish extends Animal {

	public Fish(String id, String name) {
		super(id, name);
		eatBehaviour = new Swallowing();
		runBehaviour = new NoRunning();
		swimBehaviour = new SwimWithFins();
	}

}
