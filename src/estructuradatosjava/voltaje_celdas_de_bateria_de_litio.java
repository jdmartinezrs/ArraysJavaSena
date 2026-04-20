package estructuradatosjava;

import java.util.Scanner;

public class voltaje_celdas_de_bateria_de_litio {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double[] voltajeCeldas = new double[30];

        // Variables para máximo y mínimo
        double max = 0;
        double min = 0;

        for (int i = 0; i < voltajeCeldas.length; i++) {
            System.out.println("Ingrese voltaje de la celda " + (i + 1));
            voltajeCeldas[i] = scanner.nextDouble();

            // Inicialización en la primera vuelta
            if (i == 0) {
                max = voltajeCeldas[i];
                min = voltajeCeldas[i];
            }

            // Buscar máximo y mínimo
            if (voltajeCeldas[i] > max) {
                max = voltajeCeldas[i];
            }

            if (voltajeCeldas[i] < min) {
                min = voltajeCeldas[i];
            }
        }

        // Diferencia
        double diferencia = max - min;

        System.out.println("\nVoltaje máximo: " + max);
        System.out.println("Voltaje mínimo: " + min);
        System.out.println("Diferencia: " + diferencia);

        if (diferencia <= 0.2) {
            System.out.println("Batería BALANCEADA");
        } else {
            System.out.println("Requiere equilibrado electrónico");
        }

        scanner.close();
    }
}