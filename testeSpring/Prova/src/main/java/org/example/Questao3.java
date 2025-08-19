package org.example;

import java.util.Scanner;

public class Questao3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("1- Massas\n2- Carnes\n3- Saladas");
        int op = scan.nextInt();

        switch (op) {
            case 1:
                System.out.println("Tipo de prato escolhido : \n- Massas");
                break;
            case 2:
                System.out.println("Tipo de prato escolhido : \n- Carnes");
                break;
            case 3:
                System.out.println("Tipo de prato escolhido : \n- Saladas");
            default:
                System.out.println("Opção escolhida inválida !! ");
        }
    }
}
