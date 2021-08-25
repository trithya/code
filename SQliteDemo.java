package movies;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;


public class SqliteDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String jdbcURL="jdbc:sqlite:/C:\\Users\\ASUS\\Desktop\\NJC\\db\\mydb.db";
		try {
		Connection con=DriverManager.getConnection(jdbcURL);
		String table="movies";
		String sql="Select * from ";
		Statement stmt=con.createStatement();
		ResultSet result= stmt.executeQuery(sql+ table);
		while(result.next()) {
			String name=result.getString("name");
			String actor=result.getString("actor");
			String actress=result.getString("actress");
			String director=result.getString("director");
			String yearOfRelease=result.getString("yearofrelease");
			System.out.println(name+" "+actor+" "+actress+" "+director+" "+yearOfRelease);

			//name, actor, actress, director, year of release)
		}
		}
		catch(SQLException e) {
			System.out.println("Error Connection to sql database");
			e.printStackTrace();
			
		}

	}

}
