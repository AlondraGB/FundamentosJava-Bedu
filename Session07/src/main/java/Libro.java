public class Libro implements Comparable <Libro>{
    String titulo;
    int paginas;

    public Libro(String t, int p){
        titulo=t;
        paginas=p;

    }
    public String getTitulo(){
        return  titulo;
    }
    // si el libro es menor a l,0 si son iguales, 1 si el libro es mayor a l
    @Override
    public int compareTo(Libro l) {
    if (paginas < l.paginas) {
    return -1;
    }
    if (paginas>l.paginas){
        return 1;
    }
    return 0;
    }
}
