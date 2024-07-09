package solutions.challenge1.factory_dp_sol2;

import solutions.challenge1.factory_dp_sol2.db_strategies.*;

// This class can also be made a SingleTon
public class DBFactory {
	public static DBStrategy getDB(String database) {
		switch(database) {
		case "MYSQL": return new MySQL();
		case "MONGODB": return new MongoDB();
		case "MARIADB": return new MariaDB();
		default: return new NullDB();
		}
	}
}
