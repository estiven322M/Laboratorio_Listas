package org.example.Ejercicio13;

public class main {
    public static void main(String[] args) {
        Lista lista = new Lista();

        int[] datos = {9, 4, 6, 4, 8, 5, 4};
        for (int dato : datos) {
            lista.agregarAlFinal(dato);
        }

        lista.imprimir();

        int clave = 4;
        int resultado = lista.maximaDistancia(clave);

        System.out.println("Máxima distancia entre elementos con clave " + clave + ": " + resultado);
    }
}