package ejercicio8;

import java.io.*;

public class Lanzamiento {

    public static void main(String[] args) {

        Runtime r = Runtime.getRuntime();
        String[] comando = {"java","C:\\Users\\igarcia\\IdeaProjects\\LanzaProceso\\src\\ejercicio8\\ProcesoLento.java"};

        try {
            Process p = r.exec(comando);

            InputStream is = p.getInputStream();
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader br = new BufferedReader(isr);

            BufferedWriter bw = new BufferedWriter(new FileWriter("salida.txt"));

            String line = br.readLine();
            while (line!=null) {
                bw.write(line);
                bw.newLine();
                line = br.readLine();
            }

            bw.close();
            br.close();
            is.close();
            isr.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
