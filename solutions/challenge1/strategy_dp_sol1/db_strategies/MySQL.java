package solutions.challenge1.strategy_dp_sol1.db_strategies;

public class MySQL implements DBStrategy {

	@Override
	public void connect() {
		System.out.println("MySQL Connected!");
	}

}
