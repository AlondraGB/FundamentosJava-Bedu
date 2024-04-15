import java.sql.SQLOutput;

public class Ejemplo02 {
    public static void main(String[] args) {
        int calificacion = 7;
        switch (calificacion){
            case 10:
                System.out.println("Excelente");
                break;
            case 9:
                System.out.println("Muy Bien");
                break;
            case 8:
                System.out.println("Bien");
                break;
            case 7:
                System.out.println("Panzaso");
                break;
            case 6:
                System.out.println("Intentalo nuevamente");
                break;
            case 5:
                System.out.println("no pasaste");
                break;
            default:
                System.out.println("Calificacion no valida");
                break;

        }



    }
}
