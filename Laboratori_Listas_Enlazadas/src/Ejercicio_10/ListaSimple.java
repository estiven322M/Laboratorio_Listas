package Ejercicio_10;

public class ListaSimple {
    NodoSimple cabeza;
    public ListaSimple() {
        cabeza = null;
    }

    public void agregar(String dato) {
        NodoSimple nuevoNodo = new NodoSimple(dato);
        if (cabeza == null) {
            cabeza = nuevoNodo;
        } else {
            NodoSimple temp = cabeza;
            while (temp.siguiente != null) {
                temp = temp.siguiente;
            }
            temp.siguiente = nuevoNodo;
        }
    }

    public ListaSimple concatenar(ListaSimple otraLista) {
        ListaSimple nuevaLista = new ListaSimple();
        NodoSimple temp = this.cabeza;
        while (temp != null) {
            nuevaLista.agregar(temp.dato);
            temp = temp.siguiente;
        }
        temp = otraLista.cabeza;
        while (temp != null) {
            nuevaLista.agregar(temp.dato);
            temp = temp.siguiente;
        }
        return nuevaLista;
    }
}
