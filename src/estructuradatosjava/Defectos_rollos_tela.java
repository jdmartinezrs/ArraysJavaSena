package estructuradatosjava;

import java.util.Scanner;

public class Defectos_rollos_tela {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int defectos[][] = new int[15][3];

        // Ingreso de datos
        for (int i = 0; i < 15; i++) {
            System.out.println("Tipo de tela #" + (i + 1));
            for (int j = 0; j < 3; j++) {
                System.out.print("Ingrese defectos del turno " + (j + 1) + ": ");
                defectos[i][j] = scanner.nextInt();
            }
        }

        // 1. Tela con más defectos
        int maxDefectos = -1;
        int tipoPeor = 0;

        for (int i = 0; i < 15; i++) {
            int suma = 0;
            for (int j = 0; j < 3; j++) {
                suma += defectos[i][j];
            }
            if (suma > maxDefectos) {
                maxDefectos = suma;
                tipoPeor = i;
            }
        }

        // 2. Turno con menos defectos
        int mejorTurno = 0;
        int minDefectos = Integer.MAX_VALUE;

        for (int j = 0; j < 3; j++) {
            int suma = 0;
            for (int i = 0; i < 15; i++) {
                suma += defectos[i][j];
            }
            if (suma < minDefectos) {
                minDefectos = suma;
                mejorTurno = j;
            }
        }
        // 3. Promedio por tipo de tela
        System.out.println("\nPromedio de defectos por tipo de tela:");
        for (int i = 0; i < 15; i++) {
            int suma = 0;
            for (int j = 0; j < 3; j++) {
                suma += defectos[i][j];
            }
            double promedio = suma / 3.0;
            System.out.println("Tela #" + (i + 1) + ": " + promedio);
        }

        // Resultados
        System.out.println("\nLa tela con más defectos es la #" + (tipoPeor + 1));
        System.out.println("El turno con mejor control de calidad es el turno #" + (mejorTurno + 1));

        scanner.close();
    }
}