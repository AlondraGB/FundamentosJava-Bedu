import java.io.*;

//file  es referencia de un archivo
//filereader establese conexion del archivo

public class Lectura {
    public static void main(String[] args) {
     try {
         File archivo = new File("./src/main/java/Importante.txt");

         FileReader conexion = new FileReader(archivo);
         BufferedReader lector = new BufferedReader(conexion);

         //leer la linea
         String linea = lector.readLine();
         System.out.println("Linea 1:"+linea);

         linea = lector.readLine();
         System.out.println("Linea 2:"+linea);

         linea = lector.readLine();
         System.out.println("Linea 3:"+linea);

     lector.close();
     }catch (FileNotFoundException fnex){
         System.out.println("archivo no existe ");
     }
     catch (IOException IOex){
         System.out.println("archivo no existe o no se puede abrir");
     }
     catch (Exception ex){
         System.out.println("Error en el codigo");
     }
    }
}
