public class SobreCarga {
    void suma(){
        System.out.println("sin parametros\n");
    }
    void suma (int a){
        System.out.println("un parametro: "+a+"\n");
    }
    int suma(int a, int b){
        System.out.println("Dos parametros "+a+","+b);
        return a+b;
    }
    double suma(double a, double b){
        System.out.println("Dos parametros double"+a+","+b);
        return a+b;

    }
}
