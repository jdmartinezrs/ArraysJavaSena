package estructuradatosjava;

import java.util.Scanner;

public class Notas_estudiantes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner bn = new Scanner(System.in);
int [][] notas = new int[3][2];

for(int i= 0 ; i < notas.length; i++) {
	for(int j = 0; j < notas.length; j++) {
		System.out.println("Ingrese nota del estudiante "+(i + 1)+ "es asignatura"+ (j + 1)+": ");
		notas[i][j] = bn.nextInt();
	}
	
}
System.out.println("Notas registradas");
for(int i = 0; i< notas.length; i++) {
	for(int j = 0; j < notas[i].length; j++) {
		                                                          
	}
	
}
	}

}
