public class Persona {
    private String name;
    private int age;
    private String nacionality;
    private String gender;

    public Persona(String nombre, int edad, String nacionalidad, String genero) {
        name = nombre;
        age = edad;
        nacionality = nacionalidad;
        gender = genero;
    }

    public void setNombre(String nombre){
        name = nombre;
    }
    public void setEdad(int edad){
        age=edad;
    }
    public void setNacionalidad(String nacionalidad){
        nacionality = nacionalidad;
    }
    public void setGenero(String genero){
        gender = genero;
    }

    public String getNombre(){
        return name;
    }
    public int getEdad(){
        return age;
    }
    public String getNacionalidad(){
        return nacionality;
    }
    public  String getGenero(){
        return gender;
    }


}
