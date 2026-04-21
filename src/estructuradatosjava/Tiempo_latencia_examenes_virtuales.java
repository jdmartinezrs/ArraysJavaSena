package estructuradatosjava;

import java.util.Scanner;

public class Tiempo_latencia_examenes_virtuales {

	public static void main(String[] args) {
		// 11. Pedagogía: Tiempo de Latencia en Exámenes Virtuales Un docente registra en un vector de 22 
		//posiciones el tiempo (en segundos) que tardan sus estudiantes en responder la primera pregunta de una evaluación.
		//El sistema debe detectar posibles casos de fraude si un estudiante responde en menos de 3 segundos (tiempo insuficiente para leer). 
		//Además, se debe calcular el tiempo promedio de respuesta del grupo. 

		Scanner scanner = new Scanner(System.in);
		
		int respuesta;
		double tiempoRespuestas[]= new double[22];
		
		for (int i = 0; i < tiempoRespuestas.length; i++) {
				System.out.println("Evaluación virtual de aprendices");
				System.out.println("cuanto es 1+9");
				
				
				 long inicio = System.nanoTime();
				 
				respuesta=scanner.nextInt();

			        long fin = System.nanoTime();
			        double segundos = (fin - inicio) / 1_000_000_000.0;
			       
			        tiempoRespuestas[i]= segundos;
			        
		}
		for (int i = 0; i< tiempoRespuestas.length; i++) {
			System.out.println("Segundos que le tomó al aprendíz"+ (i+1)+" responder la pregunta \n"+(i + " ") + tiempoRespuestas[i]);
			if(tiempoRespuestas[i]<3.0) {
				System.out.print("El estudiante aprendíz hizo copia \n");
			}
		}
		
		 {
			
		}
	}
	

}
