package Ejercicio_11;

class Termino {
    private double coeficiente;
    private int exponente;
    Termino siguiente;

    public Termino(double coeficiente, int exponente) {
        this.coeficiente = coeficiente;
        this.exponente = exponente;
        this.siguiente = null;
    }

    public double getCoeficiente() {
        return coeficiente;
    }

    public int getExponente() {
        return exponente;
    }
}