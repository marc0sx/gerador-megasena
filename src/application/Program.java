package application;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Gerar numeros de quais jogos?");
        System.out.println("1 - Mega Sena");
        System.out.println("2 - Lotofácil");
        int n = sc.nextInt();

        if (n == 1) {
            generateMegaSenaNumbers();
        } else if (n == 2){
        	generateLotofacilNumbers();
        } else {
        	System.out.println("Número invalido");
        	
        }sc.close();
    }

    private static void generateMegaSenaNumbers() {
        int[] numeros = new int[6];
        Random random = new Random();

        for (int i = 0; i < 6; i++) {
            int randomNumber;
            do {
                randomNumber = random.nextInt(60) + 1; 
            } while (contains(numeros, randomNumber));

            numeros[i] = randomNumber;
        }

        
        Arrays.sort(numeros);

        System.out.println("Números gerados para Mega Sena: " + Arrays.toString(numeros));
    }

    private static void generateLotofacilNumbers() {
        int[] numeros = new int[15];
        Random random = new Random();

        for (int i = 0; i < 15; i++) {
            int randomNumber;
            do {
                randomNumber = random.nextInt(25) + 1; // Gerar um número entre 1 e 60
            } while (contains(numeros, randomNumber));

            numeros[i] = randomNumber;
        }

        // Classificar os numeros em ordem crescente
        Arrays.sort(numeros);

        System.out.println("Números gerados para Lotofácil: " + Arrays.toString(numeros));
    }
    
    private static boolean contains(int[] array, int number) {
        for (int value : array) {
            if (value == number) {
                return true;
            }
        }
        return false;
    } 
}
