package factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
	private String driver = "com.mysql.jdbc.Driver";
	private String url = "jdbc:mysql://localhost/dbprojeto2021";
	private String usuario = "root";
	private String senha = "";
	
	public Connection getConexao() {
		try {
			Class.forName(driver);
			return DriverManager.getConnection(url, usuario, senha);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			return null;
		}
	}
}
