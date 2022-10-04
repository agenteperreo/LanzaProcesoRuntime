package ejercicio5;

import java.util.Scanner;

public class Nombre {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Dime tu nombre: ");

        String nombre = sc.nextLine();

        System.out.printf("!Hola %s¡",nombre);


    }

}
