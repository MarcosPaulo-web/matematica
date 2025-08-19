package aula07_15;

import java.util.Scanner;

public class AvaliacaoFuncionarios {
    public static void main(String[] args) {
        double notas[] = new double[6];
        int classificacao[] = new int[6];// 0 - ruim/1 - medio/2 - bom
        int qtdRuim = 0;
        int qtdMedia = 0;
        int qtdBoa = 0;
        for (int i = 0; i < notas.length; i++) {
            notas[i] = getInt("Qual a nota do Funcionario " + (i + 1) + " :");
        }

        for (int i = 0; i < notas.length; i++) {

            if (notas[i] >= 7) {
                classificacao[i] = 2;
            } else if (notas[i] <= 4) {
                classificacao[i] = 0;
            } else {
                classificacao[i] = 1;
            }

            switch (classificacao[i]) {
                case 0:
                    qtdRuim++;
                    break;
                case 1:
                    qtdMedia++;
                    break;
                case 2:
                    qtdBoa++;
                    break;

            }
        }

        exibirMsg("\nRuims : "+qtdRuim+"\nMedias : "+qtdMedia+"\nBoas : " + qtdBoa);
    }

    static Scanner scan = new Scanner(System.in);
    static Scanner scanString = new Scanner(System.in);

    public static int getInt(String msg) {
        System.out.println(msg);
        return Integer.parseInt(scan.nextLine());
    }

    public static double getDouble(String msg) {
        System.out.println(msg);
        return Double.parseDouble(scan.nextLine());
    }

    public static String getString(String msg) {
        System.out.println(msg);
        return scanString.nextLine();
    }

    public static void exibirMsg(String msg) {

        System.out.println(msg);
    }
}
