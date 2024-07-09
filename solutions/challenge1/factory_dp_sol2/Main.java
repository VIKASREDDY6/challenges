package solutions.challenge1.factory_dp_sol2;

import solutions.challenge1.factory_dp_sol2.db_strategies.DBStrategy;

public class Main {

	public static void main(String[] args) {
		
		DBStrategy mysql = DBFactory.getDB("MYSQL");
		DBStrategy mongodb = DBFactory.getDB("MONGODB");
		DBStrategy mariadb = DBFactory.getDB("MARIADB");
		// Below DB option is not present
		DBStrategy nulldb = DBFactory.getDB("blahblahblah");
		
		mysql.connect();
		mongodb.connect();
		mariadb.connect();
		nulldb.connect();
	}

}
