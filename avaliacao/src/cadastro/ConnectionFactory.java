package cadastro;
//faz as importa��es de classes necess�rias para o funcionamento do programa 
import java.sql.Connection; 
//conex�o SQL para Java 
import java.sql.DriverManager; 
//driver de conex�o SQL para Java 
import java.sql.SQLException; 
//classe para tratamento de exce��es 
public class ConnectionFactory {
	 public static Connection getConnection() {
		 try {
			return DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/?user=root","root","");
		 }         
		 catch(SQLException excecao) {
			throw new RuntimeException(excecao);
		 }
     }
	 
}
