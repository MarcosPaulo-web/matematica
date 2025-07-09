package Aula07_08.vetor;

import java.util.Scanner;

public class Atividade {
    public static void main(String[] args) {
        //semana //dias
        int hotel[][] = new int[2][7];
        hotel = perguntasClientes(hotel);

        int numTotal = numeroTotal(hotel);
        exibirMsg("\nNumero total :" + numTotal);
        exibirMsg("\nNumero semana 1 : " + numeroTotalSemana1(hotel));
        exibirMsg("\nNumero semana 2 : " + numeroTotalSemana2(hotel));
        exibirMsg("\nMédia de pessoas por dia : " + numTotal / 14);
    }

    private static int numeroTotal(int[][] hotel) {
        int resp = 0;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 7; j++) {
                resp += hotel[i][j];
            }
        }
        return resp;
    }

    private static int numeroTotalSemana1(int[][] hotel) {
        int resp = 0;
        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < 7; j++) {
                resp += hotel[i][j];
            }
        }
        return resp;
    }

    private static int numeroTotalSemana2(int[][] hotel) {
        int resp = 0;
        for (int i = 1; i < 2; i++) {
            for (int j = 0; j < 7; j++) {
                resp += hotel[i][j];
            }
        }
        return resp;
    }

    private static int[][] perguntasClientes(int[][] hotel) {
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.printf("Quantos clientes vieram no %d da semana %d : ", j + 1, i + 1);
                hotel[i][j] = scan.nextInt();
            }
        }
        return hotel;
    }

    static Scanner scan = new Scanner(System.in);
    static Scanner scanString = new Scanner(System.in);

    public static void exibirMsg(String msg) {

        System.out.printf(msg);
    }
}
