package vehicleShowroom;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class createMysqlConnection {
	private static Connection con = null;
	public static Connection connection()
	{
		String url = "jdbc:mysql://localhost:3306/vehicleshowroom";
		String user = "root";
		String password = "riyaz2014@";
	
		
		try
		{
			Class.forName("com.mysql.jdbc.Driver");//load driver class forname telusko
		    con = DriverManager.getConnection(url, user, password);
		    System.out.println("connected to data");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return con;
	}
}
