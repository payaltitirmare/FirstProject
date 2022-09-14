package postgreassql;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Postsql {

	 

		public static void main(String[] args) {
			  Connection connection = null;
		      try {
		    	  //Register JDBC Driver for postgresql
		         Class.forName("org.postgresql.Driver");
		         //Establishing connection between application and postgresql database software
		         connection = DriverManager.getConnection("jdbc:postgresql://localhost:5433/emoployee",
		            "postgres", "payal@123");
		         String query ="insert into employee values(1,'payal')";
		         Statement st =null;
		        
		        	 st= connection.createStatement();
		        	 System.out.println("connection establish");
		        
		         int result=0;
		         result = st.executeUpdate(query);
		        
		      } catch (Exception e) {
		         e.printStackTrace();
		         System.err.println(e.getClass().getName()+": "+e.getMessage());
		         System.exit(0);
		      }
		      System.out.println("Opened database successfully");

		}

	}