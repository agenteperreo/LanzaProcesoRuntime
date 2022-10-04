package ejercicio6;

import java.util.Scanner;

public class TicketCompra {

    public static void main(String[] args) {

        int codigo, cantidad;
        double precio, total;

        Scanner sc = new Scanner(System.in);

        codigo = sc.nextInt();

        precio = sc.nextDouble();

        cantidad = sc.nextInt();

        total = precio*(double) cantidad;

        System.out.printf("%d - %.2f - %d - %.2f\n",codigo,precio,cantidad,total);
    }

}
