package it.betacom.app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Tesyt {
	public static void main(String[] args) {
		Connection con = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			try {
				con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "#Marconato1998");

				Statement stm = con.createStatement();
				Statement stm2 = con.createStatement();
				Statement stms = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);

				ResultSet rs2 = stm2.executeQuery("show databases");
				ResultSet rs = stm.executeQuery("select customer_name, country from customer");
				System.out.println("Connection extabilished");
				while (rs.next())
					System.out.println(rs.getString("customer_name") + "|" + rs.getString("country"));
				while (rs2.next())
					System.out.println(rs2.getString(1));

			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				if (con != null)
					try {
						con.close();
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			}
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		}

	}
}
