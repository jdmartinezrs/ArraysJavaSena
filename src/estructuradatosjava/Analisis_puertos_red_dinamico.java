package estructuradatosjava;

import java.util.Scanner;

public class Analisis_puertos_red_dinamico {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[][] red = new int[20][10];
        int totalPuertosAbiertos = 0;

        
        for (int i = 0; i < 20; i++) {
            System.out.println("Equipo " + i);

            for (int j = 0; j < 10; j++) {
                System.out.print("Puerto " + j + " (1 abierto / 0 cerrado): ");
                red[i][j] = scanner.nextInt();
            }
        }

        System.out.println("\nEquipos que incumplen la política (más de 2 puertos abiertos):\n");

        for (int i = 0; i < 20; i++) {

            int contadorEquipo = 0;

            for (int j = 0; j < 10; j++) {

                if (red[i][j] == 1) {
                    contadorEquipo++;
                    totalPuertosAbiertos++;
                }
            }

            if (contadorEquipo > 2) {
                System.out.println("Equipo " + i + " incumple con " + contadorEquipo + " puertos abiertos");
            }
        }

        System.out.println("\nTotal de puertos abiertos en toda la red: " + totalPuertosAbiertos);

  
    }
}