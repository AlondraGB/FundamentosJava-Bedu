public class DSobreCarga {
    public static void main(String[] args) {
        SobreCarga sc=new SobreCarga();
        int sumaInt;
        double sumaDouble;
        //llamando las sumas

        sc.suma();
        sc.suma(4);

        sumaInt = sc.suma(10, 3);
        System.out.println("resultado de la suma "+sumaInt);

        sumaDouble = sc.suma(4.4, 45.67);
        System.out.println("resultado de la suma es "+sumaDouble);
    }
}
