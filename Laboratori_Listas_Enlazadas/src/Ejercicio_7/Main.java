package Ejercicio_7;

public class Main {
    public static void main(String[] args) {
        ListaDoble<String> lista = new ListaDoble<>();

        // Agregar elementos a la lista
        lista.agregar("Elemento 1");
        lista.agregar("Elemento 2");
        lista.agregar("Elemento 3");
        lista.agregar("Elemento 4");

        // Usar el iterador para recorrer la lista
        IteradorDoble<String> iterador = lista.iterator();
        System.out.println("Elementos en la lista:");
        while (iterador.hasNext()) {
            String elemento = iterador.next();
            System.out.println(elemento);
        }
    }
}