package Ejercicio_11;

class Polinomio {
    private Termino cabeza;

    public Polinomio() {
        cabeza = null;
    }

    public void agregarTermino(double coeficiente, int exponente) {
        Termino nuevoTermino = new Termino(coeficiente, exponente);
        if (cabeza == null) {
            cabeza = nuevoTermino;
        } else {
            Termino temp = cabeza;
            while (temp.siguiente != null) {
                temp = temp.siguiente;
            }
            temp.siguiente = nuevoTermino;
        }
    }

    public double evaluar(double x) {
        double resultado = 0.0;
        Termino temp = cabeza;
        while (temp != null) {
            resultado += temp.getCoeficiente() * Math.pow(x, temp.getExponente());
            temp = temp.siguiente;
        }
        return resultado;
    }

    public void imprimirTablaValores() {
        System.out.printf("%-10s %-10s%n", "x", "P(x)");
        for (double x = 0.0; x <= 5.0; x += 0.5) {
            double valor = evaluar(x);
            System.out.printf("%-10.1f %-10.2f%n", x, valor);
        }
    }
}
