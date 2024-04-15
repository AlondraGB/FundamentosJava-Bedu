import java.util.*;

public class Reto01 {
    public static void main(String[] args) {
        Queue<Agenda> contact= new PriorityQueue<>();

        Agenda p1=new Agenda("marco", 8713138789L);
        Agenda p2=new Agenda("alejandra", 8713132389L);
        Agenda p3=new Agenda("maria", 8713867789L);
        Agenda p4=new Agenda("catalina", 8713134569L);
        Agenda p5=new Agenda("julian", 8711237789L);

        contact.add(p1);
        contact.add(p2);
        contact.add(p3);
        contact.add(p4);
        contact.add(p5);

        Agenda c = null;

        while((c=contact.poll())!=null) {
            System.out.println(c.getName());
        }
        List<Agenda> contactp= new LinkedList<>();
        contactp.add(p1);
        contactp.add(p2);
        contactp.add(p3);
        contactp.add(p4);
        contactp.add(p5);



    }
}
