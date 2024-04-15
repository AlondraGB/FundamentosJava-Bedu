import java.util.Scanner;

public class Ejemplo02 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("escribe tu texto");

        String texto=sc.nextLine();

        Analizador an= new Analizador();
        int v= an.cVocales(texto);
        int n= an.cNumeros(texto);

        System.out.println("Hay:"+ v + "vocal(es)");
        System.out.println("Hay" + n + "numero(s)");

    }
}
