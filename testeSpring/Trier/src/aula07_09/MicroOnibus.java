package aula07_09;

import java.util.Scanner;

public class MicroOnibus {
    public static void main(String[] args) {
        int[][] pessoasAllSemana = new int[4][7];
        int[] pessoasSemana = new int[4];
        double[] mediaSemana = new double[4];
        pessoasAllSemana = cadastrarDados(pessoasAllSemana);
        pessoasSemana = pessoasCadaSemana(pessoasAllSemana, pessoasSemana);
        int numTotal = calcNumTotal(pessoasSemana);
        mediaSemana = calcMediaSemana(pessoasSemana, mediaSemana);
        double mediaAllSemana = calcMediaAllSemana(mediaSemana);
        System.out.println("Media de todas as semanas :" +mediaAllSemana);
        exibirMsg(txtFinal(mediaAllSemana));

    }

    private static String txtFinal(double mediaAllSemana) {

        if (mediaAllSemana > 60) {
            return "Precisa de mais 4 onibus";
        } else if (mediaAllSemana > 30) {
            return "Precisa de mais 2 onibus";
        } else {
            return "Não precisa de mais onibus";
        }
    }

    private static double calcMediaAllSemana(double[] mediaSemana) {
        double soma = 0;
        for (int i = 0; i < mediaSemana.length; i++) {
            soma += mediaSemana[i];
        }
        return soma / 4;

    }

    private static double[] calcMediaSemana(int[] pessoasSemana, double[] mediaSemana) {
        for (int i = 0; i < pessoasSemana.length; i++) {
            mediaSemana[i] = (pessoasSemana[i] / 7.0);
        }
        return mediaSemana;
    }

    private static int calcNumTotal(int[] pessoas) {
        int soma = 0;
        for (int i = 0; i < pessoas.length; i++) {
            soma += pessoas[i];
        }
        return soma;
    }

    private static int[] pessoasCadaSemana(int[][] pessoasSemana, int[] pessoas) {
        int soma = 0;
        for (int i = 0; i < pessoasSemana.length; i++) {
            for (int j = 0; j < pessoasSemana[0].length; j++) {
                soma += pessoasSemana[i][j];
            }
            pessoas[i] = soma;
            soma = 0;
        }
        return pessoas;
    }

    private static int[][] cadastrarDados(int[][] pessoasSemana) {
        for (int i = 0; i < pessoasSemana.length; i++) {
            for (int j = 0; j < pessoasSemana[0].length; j++) {
                pessoasSemana[i][j] = getInt("Quantas pessoas passaram no dia " + (j + 1) + " da semana " + (i + 1) + " :");
            }
        }
        return pessoasSemana;
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
