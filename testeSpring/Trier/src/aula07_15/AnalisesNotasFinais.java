package aula07_15;

import java.util.Scanner;

public class AnalisesNotasFinais {
    public static void main(String[] args) {
        double[] notas = new double[10];
        double media = 0;
        for (int i = 0; i < notas.length; i++) {
            notas[i] = getInt("Qual a nota do aluno " + (1 + i) + " :");
        }

        for (int i = 0; i < notas.length; i++) {
            media += notas[i];
        }
        switch ((int) media / 10) {
            case 10, 9:
                exibirMsg("A");
                break;
            case 8, 7:
                exibirMsg("B");
                break;
            case 6, 5:
                exibirMsg("C");
                break;
            case 4, 3:
                exibirMsg("D");
                break;
            case 2, 1, 0:
                exibirMsg("F");
            default:
                exibirMsg("Esta fora do range das medias por algum motivo ");


        }

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
