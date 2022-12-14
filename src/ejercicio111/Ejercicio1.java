package ejercicio111;

import java.io.IOException;
import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		//Abrimos el escaner
		Scanner sc = new Scanner(System.in);

		//Variable para le comado
		String comando="cmd /C";

		//Variable para la ruta de la carpeta
		String ruta;

		System.out.println("Dime la ruta: ");
		ruta=sc.nextLine();

		int opc = menu();

		// Según la opción introducida debemos lanzar un proceso u otro.
		// Todos los procesos son comandos de Windows, por lo que deben comenzar con cmd
		
		switch (opc) {
		// Si elige crear una carpeta, debo pedirle también la ruta donde quiere crearla
		// y el nombre de la carpeta
		case 1:
			crearCarpeta(sc, ruta, comando);
			break;
		// Si elige crear un fichero, debo pedirle también la ruta donde quiere crearlo
		// y el nombre del fichero
		case 2:
			crearFichero(sc, ruta, comando);
			break;
		// Si elige mostrar un directorio, debo pedirle también la ruta del directorio a
		// mostrar. Si lo deja vacío, debo mostrar el contenido del directorio actual
		case 3:
			mostrarDirectorio(ruta,comando);
			break;
		default:
			System.out.println("La opción introducida no es correcta");
		}

		sc.close();
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

		return opc;
	}

	private static void crearCarpeta(Scanner sc, String ruta, String comando) { //Pasamos por parametros la ruta, el comando y la clase Scanner
		System.out.print("¿Cual va a ser el nombre de la carpeta?: "); //Pedimos el nombre de la carpeta
		String nom = sc.next(); //Leemos el nombre
		comando+=" md "+ruta+"" +"\\"+nom; //Concatenamos el comando con la parte del comando correspondiente y la ruta
		ProcessBuilder pb = new ProcessBuilder(comando.split(" ")); //Creamos el proceso
		pb.inheritIO(); //Cogemos la salida predeterminada

		try {
			Process p = pb.start(); //Iniciamos el proceso
		} catch (IOException e) {
			e.getMessage(); //Mostramos el mensaje de error en caso de haberlo
		}
	}

	private static void crearFichero(Scanner sc, String ruta, String comando) { //Pasamos por parametros la ruta, el comando y la clase Scanner
		System.out.print("¿Que nombre quieres ponerle al fichero?: "); //Pedimos el nombre del fichero
		String nom=sc.next(); //Leemos el nombre
		comando+=" type nul > "+ruta+"\\"+nom; //Concatenamos el comando con la parte del comando correspondiente y la ruta
		ProcessBuilder pb = new ProcessBuilder(comando.split(" ")); //Creamos el proceso
		pb.inheritIO(); //Cogemos la salida predeterminada

		try {
			Process p = pb.start(); //Iniciamos el proceso
		} catch (IOException e) {
			e.getMessage(); //Mostramos el mensaje de error en caso de haberlo
		}
	}

	private static void mostrarDirectorio(String ruta, String comando) {
		comando+=" dir "+ruta; //Concatenamos el comando con la parte del comando correspondiente y la ruta
		ProcessBuilder pb = new ProcessBuilder(comando.split(" ")); //Creamos el proceso
		pb.inheritIO(); //Cogemos la salida predeterminada

		try {
			Process p = pb.start(); //Iniciamos el proceso
		} catch (IOException e) {
			e.getMessage(); //Mostramos el mensaje de error en caso de haberlo
		}
	}
}
