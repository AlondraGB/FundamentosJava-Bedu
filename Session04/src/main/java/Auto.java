public class Auto {
    //Atributos
    String marca;
    int year;

    //metodo costructores
    public Auto(String m, int y){
        marca = m;
        year = y;
    }
    //sobre escritura = sobre escribir un metodo
    @Override
    public String toString (){
        String cadena = "Es un auto " + marca + " del year "+ year;
        return cadena;
    }

}
