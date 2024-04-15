import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;

public class Escritura {
    public static void main(String[] args) {
        try {
            FileWriter conexion = new FileWriter("./src/main/java/Nuevo.txt", Charset.forName("utf-8"));
            BufferedWriter escritor = new BufferedWriter(conexion);

            escritor.write("hola");
            escritor.newLine();
            escritor.write("como estas?");

            escritor.close();
        } catch (IOException ioex){
            System.out.println("no se puede escribir en el archivo");
        }

    }
}
