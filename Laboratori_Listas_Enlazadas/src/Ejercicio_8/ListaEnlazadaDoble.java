package Ejercicio_8;

public class ListaEnlazadaDoble {
    private Persona cabeza;

    public ListaEnlazadaDoble() {
        cabeza = null;
    }
    public void agregarPersona(String nombre, String cedula) {
        Persona nuevaPersona = new Persona(nombre, cedula);
        if (cabeza == null) {
            cabeza = nuevaPersona;
        } else {
            Persona temp = cabeza;
            while (temp.siguiente != null) {
                temp = temp.siguiente;
            }
            temp.siguiente = nuevaPersona;
            nuevaPersona.anterior = temp;
        }
    }
    public void obtenerCedulasConCantidadPar() {
        Persona temp = cabeza;
        while (temp != null) {
            if (temp.getCedula().length() % 2 == 0) {
                System.out.println(temp.getCedula());
            }
            temp = temp.siguiente;
        }

    }
}