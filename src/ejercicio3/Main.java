package ejercicio3;


import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String comando=sc.nextLine();

        String [] comandos=comando.split(" ");

        ProcessBuilder pb = new ProcessBuilder(comandos);

        pb.redirectOutput(new File("C:\\Users\\igarcia\\IdeaProjects\\LanzaProceso\\src\\ejercicio3\\salidas.txt"));

        pb.redirectError(new File("C:\\Users\\igarcia\\IdeaProjects\\LanzaProceso\\src\\ejercicio3\\errores.log"));

        File directorio = new File("C:\\Users\\igarcia\\IdeaProjects\\LanzaProceso\\src\\ejercicio3");

        pb.directory(directorio);

        //pb.inheritIO();

        try {
            Process p = pb.start();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
