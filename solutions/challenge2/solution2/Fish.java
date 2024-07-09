package solutions.challenge2.solution2;

public class Fish extends Animal {
	
	public Fish(String id, String name) {
		super(id, name);
		// Adding Eat and Swim actions for Fish
		addAction(Actions.EAT);
		addAction(Actions.SWIM);
	}
}
