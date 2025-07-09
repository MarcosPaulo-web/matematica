package aula07_09;

import java.util.Scanner;

public class ControleProducao {
    public static void main(String[] args) {
        //semana // dias
        int semana[][] = new int[2][7];
        int pecaSemana[] = new int[2];
        semana = cadastroInformacoes(semana);

        pecaSemana = pecaPorSemana(semana, pecaSemana);
        double mediaDiaria = calcMedia(pecaSemana);

        resposta(mediaDiaria);

    }

    private static void resposta(double mediaDiaria) {
        System.out.println("media diaria : "+mediaDiaria);
        if (mediaDiaria > 80) {
            exibirMsg("Meta Batida !!");
        } else if (mediaDiaria <= 80 && mediaDiaria >= 50) {
            exibirMsg("Meta quase atingida !!");
        } else {
            exibirMsg("Produção abaixo do esperado");
        }
    }

    private static double calcMedia(int[] pecaSemana) {
        int soma = 0;
        for (int i = 0; i < pecaSemana.length; i++) {
            soma += pecaSemana[i];
        }
        return (soma/14);
    }

    private static int[] pecaPorSemana(int[][] semana, int[] pecaSemana) {
        int soma = 0;
        for (int i = 0; i < semana.length; i++) {
            soma = 0;
            for (int j = 0; j < semana[0].length; j++) {
                soma += semana[i][j];
            }
            pecaSemana[i] = soma;
        }
        return pecaSemana;
    }

    private static int[][] cadastroInformacoes(int[][] semana) {
        for (int i = 0; i < semana.length; i++) {
            exibirMsg("Semana : " + (i + 1));
            for (int j = 0; j < semana[0].length; j++) {
                semana[i][j] = getInt("Quantas peças no dia " + (j + 1) + " da semana " + (i + 1) + " :");
            }

        }
        return semana;
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
