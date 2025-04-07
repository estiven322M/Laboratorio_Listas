package Ejercicio_11;

public class Main {
    public static void main(String[] args) {
        Polinomio polinomio = new Polinomio();

        // Agregar términos al polinomio 3x^4 - 4x^2 + 11
        polinomio.agregarTermino(3, 4);  // 3x^4
        polinomio.agregarTermino(-4, 2); // -4x^2
        polinomio.agregarTermino(11, 0); // +11

        // Imprimir la tabla de valores del polinomio
        polinomio.imprimirTablaValores();
    }
}