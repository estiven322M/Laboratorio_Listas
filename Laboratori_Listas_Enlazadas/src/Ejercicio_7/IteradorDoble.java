package Ejercicio_7;

import java.util.Iterator;
import java.util.NoSuchElementException;

class IteradorDoble<T> implements Iterator<T> {
    private Nodo<T> actual;

    public IteradorDoble(Nodo<T> cabeza) {
        this.actual = cabeza;
    }

    @Override
    public boolean hasNext() {
        return actual != null;
    }

    @Override
    public T next() {
        if (!hasNext()) {
            throw new NoSuchElementException("No hay más elementos en la lista.");
        }
        T dato = actual.dato;
        actual = actual.siguiente; // Mover al siguiente nodo
        return dato;
    }
}