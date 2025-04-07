package Ejercicio_9;

public class ListaCircular {
    Nodo cabeza;
    public ListaCircular() {
        cabeza = null;
    }


    public void insertar(String dato) {
        Nodo nuevoNodo = new Nodo(dato);
        if (cabeza == null) {
            cabeza = nuevoNodo;
            nuevoNodo.siguiente = cabeza; // Apunta a sí mismo
        } else {
            Nodo temp = cabeza;
            while (temp.siguiente != cabeza) {
                temp = temp.siguiente;
            }

            temp.siguiente = nuevoNodo;
            nuevoNodo.siguiente = cabeza; // Cierra el círculo
        }
    }


    public Nodo buscar(String dato) {
        if (cabeza == null) {
            return null;
        }
        Nodo temp = cabeza;
        do {
            if (temp.dato.equals(dato)) {
                return temp;
            }
            temp = temp.siguiente;
        } while (temp != cabeza);
        return null; // No encontrado
    }
}
