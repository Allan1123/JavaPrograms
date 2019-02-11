package week10day1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ConnectDatabase {

	public static void main(String[] args) {
		try {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/HUB164", "sa","abc@123");
		Statement stmt= con.createStatement();
		ResultSet set= stmt.executeQuery("Select * from tplayers");
		while(set.next())
		System.out.println(set.getInt(1)+" "+set.getString(2));
		con.close();
		}catch (Exception e) {
System.out.println(e);
		}
	}

}
