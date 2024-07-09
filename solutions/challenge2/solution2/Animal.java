package solutions.challenge2.solution2;

import java.util.*;

public abstract class Animal {
	private String id, name;
	// An animal can perform a set of actions
	private Set<Actions> actions;
	
	public Animal(String id, String name) {
		this.id = id;
		this.name = name;
		actions = new HashSet<>();
	}
	
	public String getName() {
		return name;
	}
	
	public boolean canPerform(Actions action) {
		return actions.contains(action);
	}
	
	protected void addAction(Actions action) {
		actions.add(action);
	}
	
	public void performAction(Actions action) {
		if(actions.contains(action)) System.out.println(this.name + " " + action);
		else System.out.println(this.name + " cannot " + action);
	}
}
