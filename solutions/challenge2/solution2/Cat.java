package solutions.challenge2.solution2;

public class Cat extends Animal {
	
	public Cat(String id, String name) {
		super(id, name);
		// Adding Eat and Run actions for Cat
		addAction(Actions.EAT);
		addAction(Actions.RUN);
	}

}
