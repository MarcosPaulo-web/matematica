package aula07_15;

import java.util.Scanner;

public class ControleVendasDiarias {
    public static void main(String[] args) {
        int vendas[] = new int[10];
        int total = 0;
        int diaMaisVendas = 0;

        for (int i = 0; i < vendas.length; i++) {
            vendas[0] = getInt("Quantos produtos foram vendidos no dia " + (i + 1));
            total += vendas[0];
            if (diaMaisVendas < vendas[i]) {
                diaMaisVendas = vendas[i];
            }
        }
        double media = (double) total / vendas.length;
        int op = (int) media / 100;
        switch (op) {
            case 4:
            case 3:

            case 2:
                exibirMsg("Acima da media");

                break;
            case 1:
                exibirMsg("igual a media");
                break;
            case 0:
                exibirMsg("Abaixo da media");


        }
        exibirMsg("Media das vendas : " + media);
        exibirMsg("Dias com mais vendas : " + diaMaisVendas);

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
