package ejercicio111;

import java.io.IOException;
import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		//Abrimos el escaner
		Scanner sc = new Scanner(System.in);

		//Variable para el nombre de la carpeta
		String nom;

		int opc = menu();

		// Según la opción introducida debemos lanzar un proceso u otro.
		// Todos los procesos son comandos de Windows, por lo que deben comenzar con cmd
		
		switch (opc) {
		// Si elige crear una carpeta, debo pedirle también la ruta donde quiere crearla
		// y el nombre de la carpeta
		case 1:
			System.out.print("¿Cual es el nombre de la carpeta?: ");
			nom = sc.nextLine();
			String[] comando1 = {"cmd", "/C", "md", "C:\\"+nom};
			ProcessBuilder pb1 = new ProcessBuilder(comando1);

			try {
					Process p = pb1.start();
			} catch (IOException e) {
				e.getMessage();
			}

			break;
		// Si elige crear un fichero, debo pedirle también la ruta donde quiere crearlo
		// y el nombre del fichero
		case 2:
			break;
		// Si elige mostrar un directorio, debo pedirle también la ruta del directorio a
		// mostrar. Si lo deja vacío, debo mostrar el contenido del directorio actual
		case 3:
			break;
		default:
			System.out.println("La opción introducida no es correcta");
		}
	}

	public static int menu() {
		// En opc guardaremos la opción seleccionada por el usuario
		int opc;
		Scanner sc = new Scanner(System.in);

		// Imprimimos el menú con las diversas opciones
		System.out.println("Elija qué comando desea ejecutar:");
		System.out.println("1. Crear carpeta");
		System.out.println("2. Crear fichero");
		System.out.println("3. Mostrar contenido del directorio");

		// Leemos la opción de teclado
		opc = sc.nextInt();
		sc.close();

		return opc;
	}
}
