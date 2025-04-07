package Ejercicio_8;

public class Persona {
    String nombre;
    String cedula;
    Persona siguiente;
    Persona anterior;

    public Persona(String nombre, String cedula) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.siguiente = null;
        this.anterior = null;
    }

    public String getCedula() {
        return cedula;
    }

}