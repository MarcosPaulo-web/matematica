package aula07_15;

import java.util.Scanner;

public class CalcConsumoEnergia {
    public static void main(String[] args) {
        int consumo[] = new int[6];
        int alta = 0;
        int media = 0;
        int baixa = 0;
        int total = 0;

        for (int i = 0; i < consumo.length; i++) {
            consumo[i] = getInt("Qual o consumo da casa " + (i + 1) + " :");
        }

        for (int i = 0; i < consumo.length; i++) {
            total += consumo[i];
            switch (consumo[i] / 100) {
                case 0:
                    baixa++;
                    break;
                case 1, 2, 3, 4:
                    media++;
                    break;
                default:
                    alta++;
                    break;
            }
        }

        exibirMsg("Valor total arrecadado : "+total);
        exibirMsg("Alta : "+alta+"\nMédia : "+media +"\nBaixa : "+baixa);

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
