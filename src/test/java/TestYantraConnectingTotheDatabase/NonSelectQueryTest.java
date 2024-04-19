package TestYantraConnectingTotheDatabase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class NonSelectQueryTest {

	public static void main(String[] args) throws SQLException {
//Step1: Register Driver
		Driver driver = new Driver();
		DriverManager.registerDriver(driver);
		
//Step2: Get connection for database
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sdet55", "root", "root");
		
//Step3: Create Statement
		Statement state = con.createStatement();
		String query="select * from rmg;";
		
//Step4: ExecuteQuerry
		ResultSet result = state.executeQuery(query);
		
		while(result.next())
		{
			System.out.println(result.getString(1)+" "+result.getString(2));
		}
	
//Step5: close Database Connection		
		con.close();
		
	}

}
