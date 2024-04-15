import java.util.ArrayList;
import java.util.List;

public class Ejemplo03 {
    public static void main(String[] args) {
        List<String> compras = new ArrayList();
        compras.add("leche");
        compras.add("huevo");
        compras.add("fruta");
        compras.add("verdura");

        for (int i = 0; i < compras.size(); i++) {
            System.out.println(compras.get(i));
        }
        List<Integer> calificaciones = new ArrayList<>();
        calificaciones.add(10);
        calificaciones.add(9);
        calificaciones.add(8);
        for (int j = 0; j < calificaciones.size(); j++) {
            System.out.println(calificaciones.get(j));

        }
    }
}
