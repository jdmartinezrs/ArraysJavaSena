package estructuradatosjava;

import java.util.Scanner;

public class Asistencia_servicios_religiosos {

	public static void main(String[] args) {
		// 32. Liturgia y Gestión: Asistencia a Servicios Religiosos Una parroquia comunitaria registra el número de asistentes a la misa diaria durante un mes de 30 días en un vector.
		
		
		//El objetivo es planificar la logística de insumos (hostias y folletos) para el mes siguiente.
		
		//El sistema debe identificar los "Días de Alta Afluencia" (festivos o domingos donde la asistencia se duplica) y calcular el promedio de feligreses por semana. 
		//El programa debe alertar a la administración si la asistencia total cae un 10% respecto al mes anterior para evaluar la implementación de nuevas actividades comunitarias. 

		Scanner scanner = new Scanner(System.in);
		
        int [] asistentesMisaDiasMes = new int [30];
    	int sumaSemana = 0;
    	
    	int inicioSemana1 = 0;
    	int finSemana1 = 7;
    	
    	int sumasemana1 = 0;
    	double promedioSemana1 = 0;
    	
    	int inicioSemana2 = 8;
    	int finSemana2 = 14;
		
    	for (int i =0; i< asistentesMisaDiasMes.length; i++) {
    		System.out.println("Escriba el numero de asistentes a la mis el día " + " " + (i+1));
    		asistentesMisaDiasMes[i] = scanner.nextInt();
    	}
    	
		for(int i = inicioSemana1 ; i<finSemana1; i++) {
		System.out.println(asistentesMisaDiasMes[i]);
		sumasemana1 += asistentesMisaDiasMes[i];
		}
		promedioSemana1 = (double) sumasemana1 / 7;
		System.out.println("Suma de la semana 1: " + sumasemana1);
		System.out.println("promedio de la semana 1: " + promedioSemana1);
		
		
		//for(int i = 0; i< asistentesMisaDiasMes[7]; i++ ) {
			//sumaSemana += asistentesMisaDiasMes[i];
			//System.out.println(asistentesMisaDiasMes[i]);
			//System.out.println("Suma de la semana "+ (i+1)+ " es igual a: " + sumaSemana);
		//}
	}

}
