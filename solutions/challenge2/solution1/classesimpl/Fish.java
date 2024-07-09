package solutions.challenge2.solution1.classesimpl;

import solutions.challenge2.solution1.interfaces.*;

public class Fish implements EatsAnimal, SwimsAnimal {
	private String id;
	private String name;
    
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
