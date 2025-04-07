package Ejercicio_7;

class ListaDoble<T> {
    private Nodo<T> cabeza;
    private Nodo<T> cola;

    public ListaDoble() {
        cabeza = null;
        cola = null;
    }

    public void agregar(T dato) {
        Nodo<T> nuevoNodo = new Nodo<>(dato);
        if (cabeza == null) {
            cabeza = nuevoNodo;
            cola = nuevoNodo;
        } else {
            cola.siguiente = nuevoNodo;
            nuevoNodo.anterior = cola;
            cola = nuevoNodo;
        }
    }

    public IteradorDoble<T> iterator() {
        return new IteradorDoble<>(cabeza);
    }
}
