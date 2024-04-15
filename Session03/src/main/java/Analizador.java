public class Analizador {
    //atributos
    int vocales;
    int numeros;

    //metodos
    public boolean isVocal(char c) {
        // || este es el or
        // se define el tipo de regreso falso o verdadero
        return (c == 'a'
                || c == 'e'
                || c == 'i'
                || c == 'o'
                || c == 'u');

    }

    public boolean isNumero(char c) {
        short ascii = (short) c;
        return ascii >= 48 && ascii <= 57;
    }

    public int cVocales(String s) {
        for (char c : s.toLowerCase().toCharArray()) {
            if (isVocal(c)) {
                vocales++;
            }
        }
        return vocales;
    }
        public int cNumeros(String s){
            for (char c : s.toLowerCase().toCharArray()) {
                if (isNumero(c)) {
                    numeros++;
                }
            }
            return numeros;

        }
    }

