package estructuradatosjava;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Asistencia_servicios_religiosos {

    public static void main(String[] args) {
		
		//32. Liturgia y Gestión: Asistencia a Servicios Religiosos Una parroquia comunitaria registra el número de asistentes
		//  a la misa diaria durante un mes de 30 días en un vector.
		//  El objetivo es planificar la logística de insumos (hostias y folletos) para el mes siguiente.
		//  El sistema debe identificar los "Días de Alta Afluencia" 

		// (festivos o domingos donde la asistencia se duplica) y calcular el promedio de feligreses por semana.
		//  El programa debe alertar a la administración si la asistencia total cae un 10%
		//  respecto al mes anterior para evaluar la implementación de nuevas actividades comunitarias. 

        Scanner scanner = new Scanner(System.in);

        int[][] asistentes = new int[2][29]; 

        int[] totalMes = new int[2];

        for (int mes = 0; mes < 2; mes++) {

            System.out.println("\n===== MES " + (mes + 1) + " =====");

            int sumaSemana = 0;

            for (int dia = 0; dia < 30; dia++) {

                System.out.println("Día " + (dia + 1));
                asistentes[mes][dia] = scanner.nextInt();

                sumaSemana += asistentes[mes][dia];
                totalMes[mes] += asistentes[mes][dia];

                
                if ((dia + 1) % 7 == 0) {

                    System.out.println("Suma semana: " + sumaSemana);

                    double promedio = sumaSemana / 7.0;
                    System.out.println("promedio de feligreses por semana: " + promedio);

                 
                    Integer[] semana = new Integer[7];

                    for (int k = 0; k < 7; k++) {
                        semana[k] = asistentes[mes][dia - k];
                    }

                    Arrays.sort(semana, Collections.reverseOrder());

                    int count = 0;
                    int lastPrinted = -1;

                    for (int j = 0; j < semana.length; j++) {
                        int actual = semana[j];

                        if (actual == lastPrinted) continue;

                        System.out.println("Mayor afluencia: " + actual);

                        lastPrinted = actual;
                        count++;

                        if (count == 2) break;
                    }

                    sumaSemana = 0;
                }
            }
        }

        System.out.println("\n===== RESUMEN =====");

        for (int i = 0; i < 2; i++) {
            System.out.println("Total mes " + (i + 1) + ": " + totalMes[i]);
        }

       
        if (totalMes[1] < totalMes[0] * 0.9) {
            System.out.println("la asistencia cayó más del 10%");
        }
    }
}