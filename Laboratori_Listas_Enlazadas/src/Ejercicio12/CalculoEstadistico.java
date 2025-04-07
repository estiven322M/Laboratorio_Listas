package org.example.pregunta_12;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CalculoEstadistico {

    public static void main(String[] args) {
        ListaEnlazada lista = new ListaEnlazada();

        try (BufferedReader br = new BufferedReader(new FileReader("numeros.txt"))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                try {
                    double numero = Double.parseDouble(linea);
                    lista.agregar(numero);
                } catch (NumberFormatException e) {
                    System.out.println("Línea inválida: " + linea);
                }
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
            return;
        }

        int cantidad = lista.contar();
        if (cantidad == 0) {
            System.out.println("No hay datos para procesar.");
            return;
        }

        double media = lista.suma() / cantidad;
        double desviacion = lista.calcularDesviacionEstandar(media);

        System.out.printf("Media: %.2f\n", media);
        System.out.printf("Desviación estándar: %.2f\n", desviacion);
    }
}
