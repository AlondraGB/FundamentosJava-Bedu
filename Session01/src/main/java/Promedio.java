import java.util.Scanner;

public class Promedio {

    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        System.out.println("escribe la calificacion parcial1:");
        double calf1 = sn.nextInt();

        System.out.println("escribe la calificacion parcial1:");
        double calf2 = sn.nextInt();

        double prom = (calf1+calf2)/2.1;

        System.out.println("Promedio: "+ prom);


    }
}
