package aula07_02.estruturaRepeticao;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        int num = getInt("Qual a tabuada : ");
        exibirMsg("Tabuada do "+num);
        for (int i = 1; i <= 10; i++) {
            exibirMsg("\n"+num+" x "+ i +" = "+num*i);
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

        System.out.printf(msg);
    }
}
