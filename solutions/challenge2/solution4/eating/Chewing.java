package solutions.challenge2.solution4.eating;

public class Chewing implements EatBehaviour {

	@Override
	public void eat() {
		System.out.println("Eating by Chewing");
	}

	@Override
	public boolean canEat() {
		return true;
	}

}
