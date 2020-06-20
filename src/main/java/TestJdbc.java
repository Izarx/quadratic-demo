import java.sql.DriverManager;

public class TestJdbc {

	public static void main(String[] args) {
		
		String jdbcUrl = "jdbc:mysql://localhost:3306/quadratic?useSSL=false&serverTimezone=UTC";
		String user = "quadratic";
		String password = "test123";
		
		try {
			System.out.println("Connecting to database: " + jdbcUrl);
			
			DriverManager.getConnection(jdbcUrl, user, password);
			
			System.out.println("Connection successful!");
		}
		catch (Exception e) {
			e.printStackTrace();
		}

	}

}
