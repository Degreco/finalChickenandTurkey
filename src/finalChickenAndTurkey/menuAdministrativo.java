package finalChickenAndTurkey;

import java.util.Scanner;

public class menuAdministrativo {

	public class MenuAdministrativo {
		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			int opcion;

			do {
				System.out.println("******* MENU ADMINISTRATIVO *******");
				System.out.println("");
				System.out.println("1. Consultar usuarios");
				System.out.println("2. Consultar vehículos");
				System.out.println("3. Probando cosas");
				System.out.println("0. Salir");
				System.out.println("");
				System.out.print("Ingrese una opción: ");

				opcion = scanner.nextInt();

				switch (opcion) {
				case 1:
					consultarUsuarios();
					break;
				case 2:
					consultarVehiculos();
					break;
				case 3:
					probarCosas();
					break;
				case 0:
					System.out.println("Saliendo del programa...");
					break;
				default:
					System.out.println("Opción no válida. Intente nuevamente.");
					break;
				}

				System.out.println("");

			} while (opcion != 0);
		}

		private static void consultarUsuarios() {
			System.out.println("Opción de consultar usuarios seleccionada.");
			// Agregar lógica correspondiente aquí
		}

		private static void consultarVehiculos() {
			System.out.println("Opción de consultar vehículos seleccionada.");
			// Agregar lógica correspondiente aquí
		}

		private static void probarCosas() {
			System.out.println("Opción de probar cosas seleccionada.");
			// Agregar lógica correspondiente aquí
		}
	}

}
