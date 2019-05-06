package opdracht2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import jdbcdemo.connection;



public class OraclebaseDAO {
	private static final String DB_DRIV = "oracle.jdbc.driver.OracleDriver";
	private static final String DB_URL = "jdbc:oracle:thin:@//localhost:1521/xepdb1";
	private static final String DB_USER = "arlin";
	private static final String DB_PASS = "admin";
	private static Connection conn;
	//protected Connection getconnection;
	
	public OraclebaseDAO() {
		//maak connectie aan
		try {
			if(conn ==null){
			conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
				
		}
	}
	
	protected Connection getConnection() {
		//return de connectyion
		
	
	return conn;	
		
	}
	public void CloseConnection() {
		try {
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
}

}