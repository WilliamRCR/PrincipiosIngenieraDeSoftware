import java.util.ArrayList;
import java.util.List;

public class NoKISSLista {

    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);

        int suma = 0;

        for (int i = 0; i < numeros.size(); i++) {
            Integer numero = numeros.get(i);

            if (numero != null) {
                if (numero > 0) {
                    suma = suma + numero;
                }
            }
        }

        System.out.println("Suma: " + suma);
    }
}

public class ConKISSLista {

    public static void main(String[] args) {
        List<Integer> numeros = List.of(1, 2, 3, 4);

        int suma = 0;

        for (int numero : numeros) {
            suma += numero;
        }

        System.out.println("Suma: " + suma);
    }
}