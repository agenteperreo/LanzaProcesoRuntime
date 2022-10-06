package Ejercicio7;

public class Proceso1 {

    public static void main(String[] args) {

        int ip1, ip2,ip3,ip4;

        for (int i=0; i<10; i++) {
            ip1=(int)(Math.random()*255);
            ip2=(int)(Math.random()*255);
            ip3=(int)(Math.random()*255);
            ip4=(int)(Math.random()*255);
            System.out.printf("%d.%d.%d.%d\n",ip1,ip2,ip3,ip4);
        }

    }
}
