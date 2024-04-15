public class Ejemplo01 {
    public static void main(String[] args) {
        Profesor p = new Profesor("Juan", "Lopez: ", "Matematicas");
        Alumno e = new Alumno("Maria", "Garcia", "333AG");
        Persona x = new Persona("Miguel", "Gallardo");

        p.mostrarDatos();
        e.mostrarDatos();
        x.mostrarDatos();

    }
}