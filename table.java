import java.sql.*;

public class table
{
	public static void main(String args[])
	{
		try{
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			System.out.println("Drive Registered " );
			
			Connection co=DriverManager.getConnection("jdbc:odbc:gym");
			System.out.println("Connection created " );

			Statement s=co.createStatement();

			s.execute("create table tdd(Id INTEGER PRIMARY KEY , Fn VARCHAR(20),Ln VARCHAR(20),Mn VARCHAR(20),ad VARCHAR(20),dob VARCHAR(20),age VARCHAR(20),bg VARCHAR(20),pr VARCHAR(20))");
			
			System.out.println("Table created " );
			
		
			
		     }
		catch(Exception e){}
	}
}

