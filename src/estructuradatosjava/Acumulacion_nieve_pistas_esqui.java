package estructuradatosjava;
import java.util.Scanner;

public class Acumulacion_nieve_pistas_esqui {

public static void main(String[] args){

    //53. Turismo de Invierno: Acumulación de Nieve en Pistas Una estación de esquí

    // mide el espesor de la capa de nieve en 10 puntos críticos de una montaña antes de abrir al público.
    // Los valores en centímetros se guardan en un vector. 
    // Para que una pista sea segura y esquiable, debe tener al menos 30 cm de nieve compacta. 
    // El aprendiz debe identificar qué puntos tienen nieve insuficiente,
    // calcular el promedio de acumulación y reportar el punto con la mayor profundidad
    // para recomendarlo como la zona de descenso más segura del día. 

Scanner scanner = new Scanner(System.in);
double Acumulacion= 0;
double puntos = 0.10;
double promedioAcumulacion = Acumulacion / puntos;
double [] centimetroNieveEnPuntosMontana = new  double  [10];
double maxAcumulacion = centimetroNieveEnPuntosMontana[0];

for (int i = 0 ; i < centimetroNieveEnPuntosMontana.length ; i++){
    System.out.println("Ingrese el nivel del punto:"+ (i+ 1));
    centimetroNieveEnPuntosMontana[i] = scanner.nextDouble();
    Acumulacion  += centimetroNieveEnPuntosMontana[i];
   if(centimetroNieveEnPuntosMontana[i]< 30){
    System.out.println("El punto "+(i+1)+ " " + " tienen nieve insuficiente");
   }
  
}
 for(int nivel = 0; nivel < centimetroNieveEnPuntosMontana.length; nivel ++){
    if (nivel>  maxAcumulacion){
         maxAcumulacion = nivel;
    }
    
   }
 System.out.println("El promedio de acumulación es: "+ promedioAcumulacion );
  System.out.println(" la zona de descenso más segura del día, es el punto: "+ maxAcumulacion);
}

}
