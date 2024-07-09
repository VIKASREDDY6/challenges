package solutions.challenge2.solution3.animals;

import solutions.challenge2.solution3.actions.*;

public class Fish implements Animal, Eat, Swim {
	private String id;
	private String name;
    
    public Fish() {
    	
    }
    
    public Fish(String id, String name) {
    	this.id = id;
    	this.name = name;
    }

	@Override
	public void swim() {
		System.out.println("Fish Swims: " + name);
	}

	@Override
	public void eat() {
		System.out.println("Fish Eats: " + name);
	}

	@Override
	public String getName() {
		return this.name;
	}

}
