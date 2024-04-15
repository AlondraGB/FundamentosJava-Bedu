import java.util.Scanner;

public class Reto01 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Escribe una Frase:");

        String texto = sc.nextLine();

        int nVocales = 0;
        for (char vocal: texto.toLowerCase().toCharArray()){
        if(vocal== 'a'
                || vocal=='e'
                || vocal=='i'
                || vocal=='o'
                || vocal=='u'){
            nVocales++;

        }
        }
        System.out.println(texto + ":" + nVocales);


    }
}
