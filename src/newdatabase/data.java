package newdatabase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

class data{
	private static String url="jdbc:mysql://localhost:3306/school";
	private static String user="root";
	private static String password="root";
	
	public static void main(String[] args) throws Exception{
		
		Connection con;
		Statement st;
		ResultSet rs;
		
		try {
			con=DriverManager.getConnection(url, user, password);
			st=con.createStatement();
			rs=st.executeQuery("SELECT * FROM student");
			rs.next();
			rs.next();
			
			String id=rs.getString("id");
			String age=rs.getString("age");
			String  first=rs.getString("first");
			String last=rs.getString("last");
			System.out.println(id+" "+age+" "+first+" "+last);
		} catch (Exception e) {
		System.out.println(e);
		}
		
		
	}
	
}