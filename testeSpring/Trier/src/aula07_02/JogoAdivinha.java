package aula07_02;

import java.util.Random;
import java.util.Scanner;

public class JogoAdivinha {
    public static void main(String[] args) {

        Random gerador = new Random();
        int numAleatorio = gerador.nextInt(100);

        Scanner entrada = new Scanner(System.in);
        System.out.println("Adivinhe o numero que estou pensando");
        int num = entrada.nextInt();

        if (num == numAleatorio) {
            System.out.println("Parabens, você acertou o numero que eu pensei : "+numAleatorio);
        }else {
            System.out.println("Eroooouuuuu, o numero era : "+numAleatorio);
        }

    }
}
