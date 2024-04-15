import java.sql.SQLOutput;
import java.util.Scanner;

public class Ejemplo01 {
    public static void main(String[] args) {
        //Se genera una instancia
        Scanner sc =  new Scanner(System.in);
        System.out.println("Escribe tu nombre:");
        String nombre = sc.nextLine();
        System.out.println("Hola " + nombre);


    }
}