package solutions.challenge2.solution1.classesimpl;

import solutions.challenge2.solution1.interfaces.*;

public class Cat implements EatsAnimal, RunsAnimal {
	private String id;
    private String name;
    
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
