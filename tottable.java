import java.sql.*;

public class tottable
{
	public static void main(String args[])
	{
		try{
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			System.out.println("Drive Registered " );
			
			Connection co=DriverManager.getConnection("jdbc:odbc:gym");
			System.out.println("Connection created " );

			Statement s=co.createStatement();

			s.execute("create table euitotal(tot INTEGER)");
			
			System.out.println("Table created " );
			
		
			
		     }
		catch(Exception e){}
	}
}

