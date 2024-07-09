package solutions.challenge2.solution4.swimming;

public class SwimWithFins implements SwimBehaviour {

	@Override
	public void swim() {
		System.out.println("Swimming with Fins");		
	}

	@Override
	public boolean canSwim() {
		return true;
	}

}
