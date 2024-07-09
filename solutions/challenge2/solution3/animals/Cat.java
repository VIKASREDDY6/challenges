package solutions.challenge2.solution3.animals;

import solutions.challenge2.solution3.actions.*;

public class Cat implements Animal, Eat, Run {
	private String id;
	private String name;
    
    public Cat() {
    	
    }
    
    public Cat(String id, String name) {
    	this.id = id;
    	this.name = name;
    }

	@Override
	public void run() {
		System.out.println("Cat Runs: " + name);
	}

	@Override
	public void eat() {
		System.out.println("Cat Eats: " + name);
	}

	@Override
	public String getName() {
		return this.name;
	}

}
