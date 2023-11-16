package Db;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbConnection {

	public static Connection con;
	
	public static Connection getConnection(Students stu)
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			String username="vikash";
			String url="jdbc:mysql://localhost:3306/student";
			String password="vikash";
			con=DriverManager.getConnection(url, username, password);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return con;
		
    }

}
