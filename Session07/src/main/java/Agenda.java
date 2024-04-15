public class Agenda implements Comparable <Agenda>{
    String name;
    long phoneN;

    public Agenda(String n, long p){
        name=n;
        phoneN=p;
    }


    @Override
    public String toString() {
        return name + ":" + phoneN;

    }

    @Override
    public int compareTo(Agenda c){


    }


}
