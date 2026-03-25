public class SinDRY {

    public static void main(String[] args) {
        double precio1 = 100;
        double precio2 = 200;

        // Cálculo de descuento repetido
        double descuento1 = precio1 * 0.10;
        double total1 = precio1 - descuento1;

        double descuento2 = precio2 * 0.10;
        double total2 = precio2 - descuento2;

        System.out.println("Total 1: " + total1);
        System.out.println("Total 2: " + total2);
    }
}


public class ConDRY {

    public static void main(String[] args) {
        double precio1 = 100;
        double precio2 = 200;

        double total1 = calcularPrecioConDescuento(precio1);
        double total2 = calcularPrecioConDescuento(precio2);

        System.out.println("Total 1: " + total1);
        System.out.println("Total 2: " + total2);
    }

    // Método reutilizable (DRY)
    public static double calcularPrecioConDescuento(double precio) {
        double descuento = precio * 0.10;
        return precio - descuento;
    }
}