package solutions.challenge1.strategy_dp_sol1;

import solutions.challenge1.strategy_dp_sol1.db_strategies.DBStrategy;

public class LoadDataBase {
	DBStrategy dbStrategy;
	
	public LoadDataBase(DBStrategy dbStrategy) {
		this.dbStrategy = dbStrategy;
	}
	
	public void connect() {
		dbStrategy.connect();
	}
}
