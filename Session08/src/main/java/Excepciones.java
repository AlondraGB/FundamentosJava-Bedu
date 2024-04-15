import java.io.InputStream;
import java.util.InputMismatchException;
import java.util.Scanner;
//scanner nos permite obtener datos de entrada del usuario

public class Excepciones {

    //este metodo ejecuta el metodo
    public static void main(String[] args) {
       //creamos la instancia del scanner

        Scanner sc = new Scanner(System.in);
        int primer=0;
        int segundo=0;
        boolean error=true;

        while(error) {
            System.out.println("Ingresa numero 1:");
            //captura y transforma un dato
            try {
                primer = sc.nextInt();
                error=false;
            }
            //exception se esta relacionando a los errores posibles que puedan existir
            //estamos utilizando un error en expecifico
            catch (InputMismatchException ex) {
                System.out.println("Error al ingresar letras o caracteres, ingresa numeros nuvamente:");
            }
            //limpia la entrada
            sc.nextLine();
        }

        do {

            System.out.println("Ingresa numero 2:");

            //captura y transforma un dato
            try {
                segundo = sc.nextInt();
                error = false;
            } catch (InputMismatchException ex) {
                System.out.println("Se ingresando letras o caracteres, ingresa nuevamente");
                error=true;
            }
            //limpia la entrada
            sc.nextLine();
        }while(error);

        int suma = primer + segundo;
        System.out.println("resultado de la suma:"+ suma);

    }
}
