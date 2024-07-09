package solutions.challenge1.strategy_dp_sol1;

import solutions.challenge1.strategy_dp_sol1.db_strategies.*;

public class Main {

	public static void main(String[] args) {
		LoadDataBase mysqlConnection = new LoadDataBase(new MySQL());
		
		LoadDataBase mongodbConnection = new LoadDataBase(new MongoDB());
		
		LoadDataBase mariadbConnection = new LoadDataBase(new MariaDB());
		
		mysqlConnection.connect();
		
		mongodbConnection.connect();
		
		mariadbConnection.connect();
	}

}
