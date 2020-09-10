package cadastro;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	private static String caminho = "jdbc:mysql://127.0.0.1:3307/?user=root/cadastro";
	private static String usuario = "root";
	private static String senha = "1234567";
	
	public static Connection CreateConnection() throws SQLException {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			return DriverManager.getConnection(caminho, usuario, senha);
			
		} catch (ClassNotFoundException e) {
			throw new SQLException(e.getException());
		}
		
		
		
	}
	
}
