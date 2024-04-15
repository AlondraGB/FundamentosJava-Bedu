import java.util.*;

public class Ejemplo02 {
    public static void main(String[] args) {
        Queue<Libro> colaL=new PriorityQueue<>();
        Libro l1=new Libro("Crepusculo", 100);
        Libro l2=new Libro("Memorias de una geisha", 600);
        Libro l3=new Libro("Brida de portobello", 300);

        colaL.add(l1);
        colaL.add(l2);
        colaL.add(l3);

        Libro l=null;

        while((l=colaL.poll())!=null) {
            System.out.println(l.getTitulo());
        }
        List<Libro> listal = new LinkedList<>();
        listal.add(l1);
        listal.add(l2);
        listal.add(l3);
        System.out.println("____________________");

        for (Libro libro:listal){
            System.out.println(libro.getTitulo());
        }
        Collections.sort(listal);
        System.out.println("___________________");

        for (Libro libro:listal){
            System.out.println(libro.getTitulo());
        }
    }

}
