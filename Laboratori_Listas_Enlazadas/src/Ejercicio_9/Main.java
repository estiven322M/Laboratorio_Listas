package Ejercicio_9;

public class Main {
    public static void main(String[] args) {
        ListaCircular listaCircular = new ListaCircular();

        // Insertar elementos en la lista circular
        listaCircular.insertar("Elemento 1");
        listaCircular.insertar("Elemento 2");
        listaCircular.insertar("Elemento 3");

        // Buscar un elemento en la lista circular
        String buscar = "Elemento 2";
        Nodo encontrado = listaCircular.buscar(buscar);
        if (encontrado != null) {
            System.out.println("Encontrado: " + encontrado.dato);
        } else {
            System.out.println("No encontrado: " + buscar);
        }

        // Mostrar todos los elementos de la lista circular
        System.out.println("Elementos en la lista circular:");
        Nodo temp = listaCircular.cabeza;
        if (temp != null) {
            do {
                System.out.println(temp.dato);
                temp = temp.siguiente;
            } while (temp != listaCircular.cabeza);
        }
    }
}
