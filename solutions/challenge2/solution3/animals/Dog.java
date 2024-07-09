package solutions.challenge2.solution3.animals;

import solutions.challenge2.solution3.actions.*;

public class Dog implements Animal, Run, Swim {
	private String id;
	private String name;
    
    public Dog() {
    	
    }
    
    public Dog(String id, String name) {
    	this.id = id;
    	this.name = name;
    }

	@Override
	public void swim() {
		System.out.println("Dog Swims: " + name);
	}

	@Override
	public void run() {
		System.out.println("Dog Runs: " + name);
	}

	@Override
	public String getName() {
		return this.name;
	}
	

}
