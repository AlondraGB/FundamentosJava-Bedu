import java.awt.datatransfer.SystemFlavorMap;

public class Ejemplo01 {
    public static void main(String[] args) {
        //Valores Numericos enteros: cambia la memoria
        byte vByte = 1;
        short vShort = 127;
        int vInt = 200;
        long vLong = 300L;

        //Valores decimales:
        float vFloat= 1.1F;
        double vDouble= 1.25;//precision decimal

        //valores true and false
        boolean vTrue = true;
        Boolean vFalse =false;

        //Valor Caracter
        char vChar = '*';

        System.out.println(vLong + vInt);
        System.out.println(vDouble + vByte);

        //Casting:convertir los valores
        float intAfloat = (float) vInt;
        System.out.println(intAfloat);

        int floatAint = (int) vFloat;
        System.out.println(floatAint);

        //incrementos
        char vachar = vChar++;
        System.out.println(vachar);

    }
}
