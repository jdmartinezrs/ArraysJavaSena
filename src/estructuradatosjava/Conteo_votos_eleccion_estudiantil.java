package estructuradatosjava;

import java.util.Scanner;

public class Conteo_votos_eleccion_estudiantil {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] votos = new int[10];
        int[] votos_candidatos = new int[5];

        for (int i = 0; i < votos.length; i++) {
            System.out.println("Ingrese su voto (1 a 5): ");
            votos[i] = scanner.nextInt();
        }

        for (int i = 0; i < votos.length; i++) {
            votos_candidatos[votos[i] - 1]++;
        }

        System.out.println("Resultados:");

        for (int i = 0; i < votos_candidatos.length; i++) {
            System.out.println("Candidato " + (i + 1) + ": " + votos_candidatos[i] + " votos");
        }

    }
}


