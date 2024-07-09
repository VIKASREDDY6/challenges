package solutions.challenge2.solution4.animals;

import solutions.challenge2.solution4.eating.*;
import solutions.challenge2.solution4.running.*;
import solutions.challenge2.solution4.swimming.*;

public abstract class Animal {
	private String id, name;
	protected EatBehaviour eatBehaviour;
	protected RunBehaviour runBehaviour;
	protected SwimBehaviour swimBehaviour;
	
	public Animal(String id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public boolean canEat() {
		return eatBehaviour.canEat();
	}
	
	public boolean canRun() {
		return runBehaviour.canRun();
	}
	
	public boolean canSwim() {
		return swimBehaviour.canSwim();
	}
	
	public void eat() {
		eatBehaviour.eat();
	}
	
	public void run() {
		runBehaviour.run();
	}
	
	public void swim() {
		swimBehaviour.swim();
	}
	
}
