package Selenium;

import java.sql.*;

public class DatabaseTesting_1 {

	public static void main(String[] args) throws Exception {
		
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/student","admin","admin");
		Statement st = conn.createStatement();
		String query = "select * from student";
		ResultSet rs = st.executeQuery(query);
		
		while(rs.next()) {
			int sno = rs.getInt("sno");
			String sname = rs.getString("sname");
			int marks = rs.getInt("marks");
			
			System.out.println(sno+" "+sname+" "+marks);
		}
	}

}
