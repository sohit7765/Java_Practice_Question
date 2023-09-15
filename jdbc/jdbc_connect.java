package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class jdbc_connect {

	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","SohitKumar","Sohit123"); 
			Statement smt=con.createStatement();
			smt.executeUpdate("create table emp(eno number, ename varchar(20),esal number)");
			con.close();
			System.out.println("table create Succesfully");
			
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}

}
