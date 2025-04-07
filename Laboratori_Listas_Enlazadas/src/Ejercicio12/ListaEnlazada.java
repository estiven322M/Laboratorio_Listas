package org.example.pregunta_12;

class ListaEnlazada {
    Nodo cabeza;

    public void agregar(double valor) {
        Nodo nuevo = new Nodo(valor);
        if (cabeza == null) {
            cabeza = nuevo;
        } else {
            Nodo actual = cabeza;
            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }
            actual.siguiente = nuevo;
        }
    }

    public int contar() {
        int contador = 0;
        Nodo actual = cabeza;
        while (actual != null) {
            contador++;
            actual = actual.siguiente;
        }
        return contador;
    }

    public double suma() {
        double total = 0;
        Nodo actual = cabeza;
        while (actual != null) {
            total += actual.valor;
            actual = actual.siguiente;
        }
        return total;
    }

    public double calcularDesviacionEstandar(double media) {
        double sumaCuadrados = 0;
        int contador = 0;
        Nodo actual = cabeza;
        while (actual != null) {
            sumaCuadrados += Math.pow(actual.valor - media, 2);
            contador++;
            actual = actual.siguiente;
        }
        return Math.sqrt(sumaCuadrados / contador);
    }
}
