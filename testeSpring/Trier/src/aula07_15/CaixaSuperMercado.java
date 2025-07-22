package aula07_15;

import java.util.Scanner;

public class CaixaSuperMercado {
    public static void main(String[] args) {
        double[] valores = new double[15];
        double total = 0;
        int descA = 0;
        int descB = 0;
        int semDesc = 0;
        for (int i = 0; i < valores.length; i++) {
            valores[i] = getInt("Qual o valor da compra " + (i + 1) + " :");
        }


        for (int i = 0; i < valores.length; i++) {
            switch ((int) valores[i] / 100) {
                case 2, 1:
                    descA++;
                    total += valores[i] * 0.80;
                    break;
                case 0:
                    descB++;
                    total += valores[i] * 0.90;
                    break;
                default:
                    semDesc++;
                    total += valores[i];
            }
        }

        exibirMsg("Total com desconto : " + total);
        exibirMsg("Desconto A : " + descA + "\nDesconto B : " + descB + "\nSem desconto :" + semDesc);


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

