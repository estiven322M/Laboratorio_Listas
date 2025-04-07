package Ejercicio_8;

public class Main {
    public static void main(String[] args) {
        ListaEnlazadaDoble listaDoble = new ListaEnlazadaDoble();

        // Agregar personas a la lista
        listaDoble.agregarPersona("Juan", "12345678");
        listaDoble.agregarPersona("Maria", "87654321");
        listaDoble.agregarPersona("Pedro", "1234");
        listaDoble.agregarPersona("Ana", "5678");

        // Obtener cédulas con cantidad par de caracteres
        System.out.println("Cédulas con cantidad par de caracteres:");
        listaDoble.obtenerCedulasConCantidadPar();
    }
}
