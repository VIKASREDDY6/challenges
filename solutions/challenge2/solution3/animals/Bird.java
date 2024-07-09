package solutions.challenge2.solution3.animals;

import solutions.challenge2.solution3.actions.*;

public class Bird implements Animal, Eat, Fly {
	private String id;
	private String name;
    
    public Bird() {
    	
    }
    
    public Bird(String id, String name) {
    	this.id = id;
    	this.name = name;
    }

	@Override
	public void fly() {
		System.out.println("Bird Flies: " + name);
	}

	@Override
	public void eat() {
		System.out.println("Bird Eats: " + name);
	}

	@Override
	public String getName() {
		return this.name;
	}
}
