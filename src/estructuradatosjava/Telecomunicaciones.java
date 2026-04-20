package estructuradatosjava;

import java.util.Scanner;
public class Telecomunicaciones {

	public static void main(String[] args) {
		// Atenuación de Señal en Fibra Óptica En el despliegue de una red de fibra óptica, 
		
		//se mide la pérdida de potencia (atenuación) en 25 empalmes a lo largo de un trayecto intermunicipal.
		//Los valores se registran en decibelios (dB) en un vector. 
		//Según el estándar de ingeniería, un empalme es óptimo si su pérdida es inferior a 0.1 dB y debe ser reparado si supera los 0.3 dB.
		//El programa debe analizar el vector para informar cuántos empalmes requieren mantenimiento inmediato y calcular la pérdida de potencia total del tramo.
		//El aprendiz trabajará con precisiones decimales y umbrales técnicos de infraestructura de comunicaciones. 
		
		
Scanner scanner = new Scanner(System.in);

double [] empalmes = new double[5];
int contador_de_fallas = 0;
double perdida = 0;
for (int i = 0; i< empalmes.length; i++) {
System.out.println("Atenuación de Señal en Fibra Óptica En el despliegue de una red de fibra óptica, ");
System.out.println("ingrese el primer valor ");
empalmes[i]= scanner.nextDouble();
}

 for (int i = 0 ; i <empalmes.length; i++) {
	 perdida += empalmes[i];
	 
	 if(empalmes[i] < 0.1) {
		 System.out.println ("funciona bien");
	 }else if (empalmes[i] > 0.1 && empalmes[i]< 0.3 ) {
		 System.out.println ("funciona con degradación");
	 }else if (empalmes[i] >= 0.3) {
		 System.out.println ("necesita mantenimiento inmediato" + empalmes[i]);
		 contador_de_fallas++;
	 }
 }
 
 System.out.println("Perdida es igual a " + perdida );
	}

}

