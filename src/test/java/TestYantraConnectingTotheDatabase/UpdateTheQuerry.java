package TestYantraConnectingTotheDatabase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;


public class UpdateTheQuerry {

	public static void main(String[] args) throws SQLException {
          Driver driver = new Driver();
          DriverManager.registerDriver(driver);
          Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sdet55", "root", "root");
          Statement state = con.createStatement();
          String query=" insert into rmg values('Ayush','Manual',4);";
          int result = state.executeUpdate(query);
          System.out.println(result);
//          String query2="select * from rmg";
//          ResultSet result2 = state.executeQuery(query2);
//          while(result2.next()) {
//        	  System.out.println(result2.getString(1)+" "+result2.getString(2)+" "+result2.getString(3));
//          }
         
          String query3="delete from rmg where name='Ayush'";
          int result3 = state.executeUpdate(query3);
          String query4="select * from rmg";
          ResultSet result4 = state.executeQuery(query4);
         
          while(result4.next()) {
        	  System.out.println(result4.getString(1)+" "+result4.getString(2)+" "+result4.getString(3));
          }
          con.close();
			
		}
	}


