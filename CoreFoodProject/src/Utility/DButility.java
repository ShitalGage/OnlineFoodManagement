package Utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DButility 
{

	public static Connection getConnect()
	{
		Connection con=null;
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/BasicDB,"root","Squ@d123");

		}
		catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		catch(SQLException q)
		{
			q.printStackTrace();
		}
		return con;
	}
}
