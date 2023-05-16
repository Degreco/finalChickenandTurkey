package finalChickenAndTurkey;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
 
public class main {
 
	public static void main(String[] args) {
		try {
			// Conexión a la base de datos
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/chickenandturkey", "admin",
					"chicken123");
 
			// Introducción de usuario y contraseña
			String usuario = obtenerEntrada("Ingrese el nombre de usuario: ");
			String contraseña = obtenerEntrada("Ingrese la contraseña: ");
 
			// Consulta a la base de datos para verificar el usuario y la contraseña
			String consulta = "SELECT * FROM usuarios WHERE username = ? AND password = ?";
			PreparedStatement statement = connection.prepareStatement(consulta);
			statement.setString(1, usuario);
			statement.setString(2, contraseña);
			ResultSet resultSet = statement.executeQuery();
 
			if (resultSet.next()) {
				// Credenciales correctas
				// TODO: Vincular menú
				System.out.println("Inicio de sesión exitoso.");

			} else {
				// Credenciales incorrectas
				System.out.println("Usuario o contraseña incorrectos.");
			}
 
			// Cerrar la conexión y liberar recursos
			resultSet.close();
			statement.close();
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
 
	// Método para obtener la entrada del usuario
	private static String obtenerEntrada(String mensaje) {
		System.out.print(mensaje);
		Scanner scanner = new Scanner(System.in);
		return scanner.nextLine();
	}
 
}