package solutions.challenge1.factory_dp_sol2.db_strategies;

public class MySQL implements DBStrategy {

	@Override
	public void connect() {
		System.out.println("MySQL Connected!");
	}

}
