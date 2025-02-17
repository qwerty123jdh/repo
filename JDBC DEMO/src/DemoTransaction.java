import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Savepoint;
import java.sql.Statement;

public class DemoTransaction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection connection=null;
		Savepoint s1 = null,s2 = null,s3;
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			 connection=DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=CITI12131", "sa", "sa123");
			connection.setAutoCommit(false);
			System.out.println("connection successful");
			
			Statement st= connection.createStatement();
			st.executeUpdate("insert into employdee values(960, 'abc', 10000)");
			s1 = connection.setSavepoint("s1");
			st.executeUpdate("insert into employdee values(950, 'ABC', 10000)");
			connection.commit();
			s2 = connection.setSavepoint("s2");
			connection.commit();
			st.executeUpdate("insert into employdee values(12, 'ABC', 10000)");
			s3 = connection.setSavepoint("s3");
			st.executeUpdate("insert into employdee values(940, 'ABC', 10000)");
			connection.commit();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			try {
				connection.rollback(s1);
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			e.printStackTrace();
		}
		
	

	}

}
