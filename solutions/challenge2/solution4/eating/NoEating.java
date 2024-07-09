package solutions.challenge2.solution4.eating;

public class NoEating implements EatBehaviour {

	@Override
	public void eat() {
		System.out.println("Cannot Eat");
	}

	@Override
	public boolean canEat() {
		return false;
	}

}
