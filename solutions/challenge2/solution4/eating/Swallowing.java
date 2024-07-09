package solutions.challenge2.solution4.eating;

public class Swallowing implements EatBehaviour {

	@Override
	public void eat() {
		System.out.println("Eating by Swallowing");
	}

	@Override
	public boolean canEat() {
		return true;
	}

}
