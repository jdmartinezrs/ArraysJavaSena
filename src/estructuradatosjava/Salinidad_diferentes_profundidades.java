package estructuradatosjava;

import java.util.Scanner;

public class Salinidad_diferentes_profundidades {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double salinidad[][] = new double[10][5];

        // Ingreso de datos
        for (int i = 0; i < 10; i++) {
            System.out.println("Estación #" + (i + 1));
            for (int j = 0; j < 5; j++) {
                System.out.print("Ingrese salinidad en profundidad " + (j + 1) + ": ");
                salinidad[i][j] = scanner.nextDouble();
            }
        }

        // 1. Promedio por profundidad
        System.out.println("\nPromedio de salinidad por profundidad:");
        for (int j = 0; j < 5; j++) {
            double suma = 0;
            for (int i = 0; i < 10; i++) {
                suma += salinidad[i][j];
            }
            double promedio = suma / 10;
            System.out.println("Profundidad #" + (j + 1) + ": " + promedio);
        }

        // 2. Estación con mayor salinidad total
        double maxSalinidad = -1;
        int estacionMayor = 0;

        for (int i = 0; i < 10; i++) {
            double suma = 0;
            for (int j = 0; j < 5; j++) {
                suma += salinidad[i][j];
            }
            if (suma > maxSalinidad) {
                maxSalinidad = suma;
                estacionMayor = i;
            }
        }

        System.out.println("\nLa estación con mayor salinidad es la #" + (estacionMayor + 1));

        // 3. Detección de anomalías
        System.out.println("\nAnomalías detectadas:");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 4; j++) {
                double diferencia = Math.abs(salinidad[i][j] - salinidad[i][j + 1]);

                if (diferencia > 5) { // umbral (puedes ajustarlo)
                    System.out.println("Anomalía en estación " + (i + 1) +
                            " entre profundidad " + (j + 1) +
                            " y " + (j + 2));
                }
            }
        }

        scanner.close();
    }
}