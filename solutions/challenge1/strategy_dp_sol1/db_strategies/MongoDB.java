package solutions.challenge1.strategy_dp_sol1.db_strategies;

public class MongoDB implements DBStrategy {

	@Override
	public void connect() {
		System.out.println("MongoDB Connected!");
	}

}
