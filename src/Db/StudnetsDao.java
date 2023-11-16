package Db;

import java.sql.Connection;
import java.sql.PreparedStatement;


public class StudnetsDao {
	public static boolean insertDb(Students studnets)
	{
		//jdbc codes//
		boolean flag=false;
		try
		{
			Connection con=DbConnection.getConnection(studnets);
			String sql="insert into students(sname,age) values(?,?,?)";
			PreparedStatement prepare=con.prepareStatement(sql);
			prepare.setString(1,studnets.getName());
			prepare.setInt(2, studnets.getAge());
			prepare.execute();
			flag=true;
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		return flag;
	}

}
