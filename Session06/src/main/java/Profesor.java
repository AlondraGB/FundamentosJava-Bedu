public class Profesor extends Persona{
    String clase;

    public Profesor(String n, String a, String c){
        super(n,a);
        clase= c;
    }
    public void mostrarDatos(){
        super.mostrarDatos();
        System.out.println("Clase: "+ clase);
    }

}
