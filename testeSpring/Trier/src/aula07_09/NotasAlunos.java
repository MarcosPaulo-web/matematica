package aula07_09;

import java.util.Scanner;

public class NotasAlunos {
    public static void main(String[] args) {
        int qtdAlunos = getInt("Quantos alunos : ");
        double alunos[][] = new double[qtdAlunos][4];
        double mediaAlunos[] = new double[qtdAlunos];

        for (int i = 0; i < qtdAlunos; i++) {
            for (int j = 0; j < 4; j++) {
                alunos[i][j] = getDouble("Qual a nota da prova " + (j + 1) + " do aluno " + (i + 1) + " :");
            }
        }

        mediaAlunos = mediaIndividual(alunos, mediaAlunos);
        exibirMsg(aprovados(mediaAlunos));
        exibirMsg(mediaGeral(mediaAlunos));
    }

    private static String mediaGeral(double[] mediaAlunos) {
        double soma = 0;
        for (int i = 0; i < mediaAlunos.length; i++) {
            soma += mediaAlunos[i];
        }

        return "Media geral da sala : "+soma/ (mediaAlunos.length);
    }

    private static String aprovados(double[] mediaAlunos) {
        int apro = 0;
        int rec = 0;
        int repro = 0;

        for (int i = 0; i < mediaAlunos.length; i++) {
            if (mediaAlunos[i] >= 7) {
                apro++;
            } else if (mediaAlunos[i] >= 5 && mediaAlunos[i] < 7) {
                rec++;
            } else if (mediaAlunos[i] < 5) {
                repro++;
            }
        }

        return "Numero aprovados = "+apro+"\nNumero dos que ficaram em recuperação : "+rec +
                "\nReprovados = "+repro;
    }

    private static double[] mediaIndividual(double[][] alunos, double[] mediaAlunos) {

        double soma = 0;

        for (int i = 0; i < alunos.length; i++) {
            soma = 0;
            for (int j = 0; j < alunos[0].length; j++) {
                soma += alunos[i][j];
            }
            System.out.println(soma/4);
            mediaAlunos[i] = soma/4;
        }
        return mediaAlunos;

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
