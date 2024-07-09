package solutions.challenge2.solution4.swimming;

public class NoSwimmimg implements SwimBehaviour {

	@Override
	public void swim() {
		System.out.println("Cannot Swim");		
	}

	@Override
	public boolean canSwim() {
		return false;
	}

}
