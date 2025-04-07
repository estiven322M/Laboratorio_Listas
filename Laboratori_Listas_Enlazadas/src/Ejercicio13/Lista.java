package org.example.Ejercicio13;

public class Lista {
    NodoLista inicio;

    public Lista() {
        inicio = null;
    }

    public void agregarAlFinal(int dato) {
        NodoLista nuevo = new NodoLista(dato, null);
        if (inicio == null) {
            inicio = nuevo;
        } else {
            NodoLista actual = inicio;
            while (actual.sig != null) {
                actual = actual.sig;
            }
            actual.sig = nuevo;
        }
    }

    // Método público que llama al recursivo
    public int maximaDistancia(int clave) {
        return maximaDistanciaRec(inicio, clave, 0, 0);
    }

    // Recursivo
    private int maximaDistanciaRec(NodoLista nodo, int clave, int distancia, int maxDistancia) {
        if (nodo == null) return maxDistancia;

        if (nodo.dato == clave) {
            if (distancia > 0) {
                // actualizar si la distancia es mayor
                maxDistancia = Math.max(maxDistancia, distancia);
            }
            // reiniciar distancia
            distancia = 0;
        } else if (distancia >= 0) {
            distancia++;
        }

        return maximaDistanciaRec(nodo.sig, clave, distancia, maxDistancia);
    }

    // Método opcional para mostrar la lista
    public void imprimir() {
        NodoLista actual = inicio;
        while (actual != null) {
            System.out.print(actual.dato + " → ");
            actual = actual.sig;
        }
        System.out.println("null");
    }
}