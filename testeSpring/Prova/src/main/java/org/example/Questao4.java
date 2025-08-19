package org.example;

import java.util.Scanner;

public class Questao4 {
    public static void main(String[] args) {
        double[] notas = new double[6];
        Scanner scan = new Scanner(System.in);
        double mediaGeral = 0;


        for (int i = 0; i < notas.length; i++) {
            System.out.println("Digite a nota do aluno " + (i + 1) + " : ");
            notas[i] = scan.nextInt();
        }

        for (int i = 0; i < notas.length; i++) {
            mediaGeral += notas[i];
        }

        mediaGeral = mediaGeral / 6;
        System.out.println("Media = " + mediaGeral);


        System.out.println("Notas acima da média : ");
        for (int i = 0; i < notas.length; i++) {

            if (notas[i] > mediaGeral) System.out.println("nota " + (i + 1) + " : " + notas[i]);
        }
    }
}
