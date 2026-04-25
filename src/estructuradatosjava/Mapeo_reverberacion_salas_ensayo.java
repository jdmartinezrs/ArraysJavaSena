package estructuradatosjava;
import java.util.Scanner;

public class Mapeo_reverberacion_salas_ensayo {

    public static void main(String[] args){

    //94. Ingeniería Acústica: Mapeo de Reverberación en Salas de Ensayo
    //Se divide una sala de música en una cuadrícula de 8x8 metros. Se mide el nivel de eco o
    //reverberación (en milisegundos) en cada celda. La matriz de [8][8] permite mejorar el sonido.
    //El aprendiz debe:
    // 
    
     //1. Localizar el "punto muerto" de la sala (mínima reverberación). 2. Calcular
    //la reverberación promedio del recinto. 3. Identificar las zonas donde el eco supera los 500ms
    //para instalar paneles acústicos absorbentes.

    Scanner scanner = new Scanner(System.in);

    long [][] milisegundos = new long[2][2];
   long menorReverberacion = Long.MAX_VALUE;
   long suma = 0;
   long promedioRecinto = 0; 

   int filaMenor = 0;
   int columnaMenor = 0;

    //int menorPosicion = matriz[0][0];
    
    for (int i = 0; i < milisegundos.length; i ++){
        for(int j = 0; j < milisegundos[i].length; j ++ ){
            System.out.println("Ingrese lo niveles de reverberación (en milisegundos) ");
            milisegundos[i][j] = scanner.nextLong();
            suma += milisegundos[i][j];

            
            if(milisegundos[i][j] < menorReverberacion ){
                menorReverberacion  = milisegundos[i][j];
                filaMenor = i;
                columnaMenor = j;
            } 
            
            if(milisegundos[i][j] >= 500){
                System.out.println("Instalar paneles acústicos absorbentes EN ESTA ZONA");
            }
        }
    }

    long totalDatos = milisegundos.length * milisegundos[0].length;
    double promedio = (double) suma / totalDatos;

System.out.println("La menor reberberación es: " + menorReverberacion  );
System.out.println("Posición: [" + filaMenor + "][" + columnaMenor + "]");
System.out.println("la reverberación promedio del recinto es : " + promedio );
    }
}
