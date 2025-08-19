package aula07_09.testeNumRandom;

import java.util.Random;

public class NumeroAleatorio {
    public static void main(String[] args) {
        int min = 1;
        int max = 100;

        for (int i = 0; i < 10; i++) {
            int numAleatorio = getIntAleatorio(max, min);
            System.out.println("Numero aleatorio " + (i + 1) + "Numero aleatório : " + numAleatorio);
        }
    }
    static Random aleatorio = new Random(100);

    private static int getIntAleatorio(int max, int min) {

        return aleatorio.nextInt(max - min + 1) + min;
    }
}
