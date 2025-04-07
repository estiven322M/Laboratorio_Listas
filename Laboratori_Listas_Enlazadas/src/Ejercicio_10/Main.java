package Ejercicio_10;

public class Main {
    public static void main(String[] args) {
        ListaSimple lista1 = new ListaSimple();
        ListaSimple lista2 = new ListaSimple();

        // Agregar elementos a la primera lista
        lista1.agregar("Elemento A");
        lista1.agregar("Elemento B");
        lista1.agregar("Elemento C");

        // Agregar elementos a la segunda lista
        lista2.agregar("Elemento D");
        lista2.agregar("Elemento E");

        // Concatenar las dos listas
        ListaSimple listaConcatenada = lista1.concatenar(lista2);

        // Mostrar elementos de la lista concatenada
        System.out.println("Elementos de la lista concatenada:");
        NodoSimple temp = listaConcatenada.cabeza;
        while (temp != null) {
            System.out.println(temp.dato);
            temp = temp.siguiente;
        }
    }
}