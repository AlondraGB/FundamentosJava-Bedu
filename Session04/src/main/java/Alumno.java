public class Alumno {
    //Atributos

    String curso;
    int session;
    String objetivo;

    //bloque de inicializacion
    {
        curso = "java";
        System.out.println("esta vivo");
    }

    //metodo
//getters : obtener
    public String getCurso(){
        return curso;
    }

    public int getSession(){
        return session;
    }

    public String getObjetivo(){
        return objetivo;
    }
    //setterrs : modificacion
    public void setCurso(String nuevoCurso){
        curso=nuevoCurso;
    }
    public void setSession(int nuevaSession){
        this.session=nuevaSession;
    }

    public void setObjetivo(String nuevoObjetivo){
        objetivo=nuevoObjetivo;
    }

}
