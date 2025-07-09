package aula07_09;

import java.util.Scanner;

public class ControleVendasSemanais {
    public static void main(String[] args) {
        double[] dias = new double[5];
        double[] semanas = new double[5];
        double soma = 0;
        for (int i = 0; i < semanas.length; i++) {
            soma = 0;
            exibirMsg("Semana "+(i+1)+" : \n");
            for (int j = 0; j < dias.length; j++) {
                dias[j] = getDouble("Qual o valor do dia" + (j + 1) + " : ");
                soma += dias[j];
            }
            semanas[i] = soma;// calcula o faturamento semanal
        }

        double totalGeral = faturamentoAllSemanas(semanas);
        semanaMaiorFaturamento(semanas);
        exibirMsg("Média diária das 5 semanas : "+(totalGeral/25)+"\n");
        exibirMsg(totalGeral/25 > 500 ? "Exelente desempenho":"Avaliar estratégias de venda");



    }

    private static void semanaMaiorFaturamento(double[] semanas) {

        double semanaMaiorFat = semanas[0];
        int id = 0;
        for (int i = 1; i <semanas.length ; i++) {
            if (semanas[i] > semanaMaiorFat){
                semanaMaiorFat = semanas[i];
                id = i;
            }
        }
        exibirMsg("Semana "+(id+1)+" com maior faturamento : "+semanaMaiorFat);


    }

    private static double faturamentoAllSemanas(double[] semanas) {
        double soma = 0;
        for (int i = 0; i < semanas.length; i++) {

            soma += semanas[i];

        }
        return soma;
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

        System.out.println(msg+"\n");
    }
}
