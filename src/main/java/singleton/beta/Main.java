package singleton.beta;

import java.sql.Connection;

public class Main {

	public static void main(String[] args) {

		DBHandler dbHandler = DBHandler.getInstance();

		Connection connection = dbHandler.getConnection();

		dbHandler.closeConnection();
	}

}
