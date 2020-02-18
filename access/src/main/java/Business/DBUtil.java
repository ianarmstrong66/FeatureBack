package Business;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
	
	private static final String mySqlUser = "root";
	private static final String mySqlPwd = "Un1f1";
	private static final String mySqlCS = "jdbc:mySQL://localhost:3306/functionfm?useLegacyDatetimeCode=false&serverTimeZone=Europe/London&useSSL=false";

	public static Connection  getConnection() throws Exception {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			throw new Exception("No Database Found");
		}
		return DriverManager.getConnection(mySqlCS,mySqlUser,mySqlPwd);
	}
	
	public static void showErrorMessage(SQLException e) {
		System.err.println("Error : " + e.getMessage());
		System.err.println("Error : " + e.getErrorCode());
	}
}
