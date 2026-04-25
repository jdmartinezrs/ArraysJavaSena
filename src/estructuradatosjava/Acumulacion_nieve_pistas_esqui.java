package estructuradatosjava;
import java.util.Arrays;
import java.util.OptionalInt;
import java.util.Scanner;
import java.util.stream.IntStream;
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
int puntos = 10;


int [] centimetroNieveEnPuntosMontana = new  int  [10];
int [] datos = centimetroNieveEnPuntosMontana;
int max = datos [0];
int indiceMax = 0;

for (int i = 0 ; i < centimetroNieveEnPuntosMontana.length ; i++){
    System.out.println("Ingrese el nivel del punto:"+ (i+ 1));
    centimetroNieveEnPuntosMontana[i] = scanner.nextInt();
    Acumulacion  += centimetroNieveEnPuntosMontana[i];
   if(centimetroNieveEnPuntosMontana[i]< 30){
    System.out.println("El punto "+(i+1)+ " " + " tienen nieve insuficiente");
   }
  
}

for (int i = 1; i< datos.length; i++){
    if(datos[i] > max){
        max= datos[i];
        indiceMax = i;
    }
}
   double promedioAcumulacion = (double) Acumulacion / puntos;
 System.out.println("El promedio de acumulación es: "+ promedioAcumulacion );
  System.out.println(" la zona de descenso más segura del día, es el punto: "+ indiceMax +" con una profundidad en la nieve de " +max+ " centimetros");
}

}
