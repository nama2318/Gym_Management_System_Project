import java.sql.*;

public class custtable
{
	public static void main(String args[])
	{
		try{
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			System.out.println("Drive Registered " );
			
			Connection co=DriverManager.getConnection("jdbc:odbc:gym");
			System.out.println("Connection created " );

			Statement s=co.createStatement();

			s.execute("create table ei(Id INTEGER PRIMARY KEY , En VARCHAR(20),qn VARCHAR(20),Se VARCHAR(20),dt VARCHAR(50),pr VARCHAR(20) )");
			
			System.out.println("Table created " );
			
		
			
		     }
		catch(Exception e){}
	}
}


						
				