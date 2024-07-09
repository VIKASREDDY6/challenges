package solutions.challenge2.solution1.classesimpl;

import solutions.challenge2.solution1.interfaces.*;

public class Dog implements RunsAnimal, SwimsAnimal {
	private String id;
	private String name;
    
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
