package solutions.challenge2.solution2;

public class Dog extends Animal {

	public Dog(String id, String name) {
		super(id, name);
		// Adding Swim and Run actions for Dog
		addAction(Actions.SWIM);
		addAction(Actions.RUN);
	}

}
