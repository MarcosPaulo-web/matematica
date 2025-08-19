package org.example;

import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args) {
        int num ;

        do {
            num = getInt("Digite um numero positivo : ");
            if (num < 0) {
                exibirMsg("Numero inserido incorreto, por favor tente novamente!!");
            }
        }while (num<0);
        exibirMsg("O numero positivo inserido foi : "+num);
    }

    static Scanner scan = new Scanner(System.in);

    public static int getInt(String msg) {
        System.out.println(msg);
        return Integer.parseInt(scan.nextLine());
    }
    public static void exibirMsg(String msg) {

        System.out.println(msg);
    }
}
