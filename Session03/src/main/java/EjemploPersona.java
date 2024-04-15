public class EjemploPersona{
    public static void main(String[] args) {

        Persona p1 = new Persona("Luis",28,"Americano", "masculino" );
        System.out.println("Nombre :" +p1.getNombre());
        System.out.println("Edad :" + p1.getEdad());
        p1.setEdad(40);
        System.out.println("Edad actualizada: " +p1.getEdad());


    }
}
