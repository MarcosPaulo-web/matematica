package org.example;

import java.util.Scanner;

public class Questao1 {
    public static void main(String[] args) {
        int []lojas = new int[5];

        for (int i = 0; i < lojas.length; i++) {
            lojas[i] = getInt("Qual a quantidade de itens vendidos na loja "+(i+1)+ " : ");
        }
        for (int i = 0; i < lojas.length; i++) {
                exibirMsg("Quantidade da loja "+(i+1)+" : "+lojas[i]);
            }
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
