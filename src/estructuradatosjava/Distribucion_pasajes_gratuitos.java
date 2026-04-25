package estructuradatosjava;
import java.util.Scanner;

public class Distribucion_pasajes_gratuitos {


 public static void main(String[] args){
//95. Transporte Social: Distribución de Pasajes Gratuitos
//Un municipio otorga pasajes gratuitos a beneficiarios de 12 fundaciones en las 4 rutas de
//transporte local. La matriz de [12][4] registra el uso mensual.

// El programa debe: 1. Calcular el
//total de pasajes redimidos por cada fundación. 

// 2. Identificar la ruta más utilizada por los
//beneficiarios para aumentar la frecuencia de buses. 

// 3. Determinar el costo total que el//municipio debe pagar a las empresas de transporte por este subsidio social.

Scanner scanner = new Scanner(System.in);

int [][] usoMensualBeneficiarios = new int [12][4]; //12 fundaciones //4 Rutas 
int [][] totalUsoRutas = usoMensualBeneficiarios;
int maxUso = 0;
int rutaMasUsada = 0;
int sumaTotal = 0;


for (int i= 0 ; i < usoMensualBeneficiarios.length; i++ ){
    for(int j = 0; j < usoMensualBeneficiarios[i].length; j ++){
        System.out.println("Ingrese los pasajes redimidos por lafuncación" + (i + 1) + "en la ruta" + (j + 1));
        usoMensualBeneficiarios[i][j] = scanner.nextInt();
        sumaTotal += usoMensualBeneficiarios[i][j];
        
    }
}
 int constoApagar = (int) sumaTotal * 3000;
    System.out.println("Csoto a pagar por el municipio: " + constoApagar);

for (int i = 0; i < usoMensualBeneficiarios.length; i++){
    System.out.println("Los pasajes redimidos por la fundacion " + (i+1) + " " + java.util.Arrays.toString(usoMensualBeneficiarios[i]));
}

for (int j = 0; j < totalUsoRutas[0].length; j++ ) {
    int sumaRutas = 0;
    for (int i = 0; i< totalUsoRutas.length; i++){
        sumaRutas += totalUsoRutas[i][j];
    }
    if(sumaRutas> maxUso){
        maxUso = sumaRutas;
        rutaMasUsada = j;
    }
}
System.out.println("La ruta más utilizada es la ruta "+ rutaMasUsada + "con :" +  maxUso);
 }
}
