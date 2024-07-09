package solutions.challenge1.factory_dp_sol2.db_strategies;

public class MongoDB implements DBStrategy {

	@Override
	public void connect() {
		System.out.println("MongoDB Connected!");
	}

}
