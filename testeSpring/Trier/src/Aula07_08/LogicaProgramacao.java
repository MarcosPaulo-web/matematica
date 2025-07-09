package Aula07_08;

import java.util.Random;
import java.util.Scanner;

public class LogicaProgramacao {
    public static void main(String[] args) {
        Random random = new Random();
        int numAl = random.nextInt(101);
        boolean acerto = false;
        while (!acerto) {
            int num = getInt("\nQual o numero vc acha que é entre (0 e 100) : ");
            if (num == numAl) {
                exibirMsg("\nAcertoou !!!!!");
                acerto = true;
            } else if (num < numAl) {
                exibirMsg("\nDigite um numero maior ");
            } else {
                exibirMsg("\nDigite um numero menor");
            }

        }

    }

    static Scanner scan = new Scanner(System.in);

    public static int getInt(String msg) {
        System.out.println(msg);
        return Integer.parseInt(scan.nextLine());
    }

    public static void exibirMsg(String msg) {

        System.out.printf(msg);
    }
}
