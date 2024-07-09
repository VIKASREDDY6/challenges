package solutions.challenge2.solution4.swimming;

public class SwimWithLegs implements SwimBehaviour {

	@Override
	public void swim() {
		System.out.println("Swimming with Legs");
	}

	@Override
	public boolean canSwim() {
		return true;
	}

}
