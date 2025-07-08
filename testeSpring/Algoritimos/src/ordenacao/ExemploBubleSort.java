package ordenacao;

import java.util.Random;
import java.util.Scanner;

public class ExemploBubleSort {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        Random random = new Random(100);
        int qtd = getInt("Quantos numeros vamos ordenar :");
        int[] vetor = randomizar(qtd);

        exibirMsg(bubbleSort(vetor));

    }

    private static String bubbleSort(int[] vetor) {
        int aux = 0;

        for (int i = 0; i < vetor.length; i++) {

            for (int j = i + 1; j < vetor.length; j++) {
                if (vetor[j] < vetor[i]) {
                    aux = vetor[j];
                    vetor[j] = vetor[i];
                    vetor[i] = aux;
                }
            }
        }
        String resp = "";
        for (int i = 0; i < vetor.length;i++) {
            resp += vetor[i] +"\n";
        }
        return resp;
    }

    private static int[] randomizar(int qtd) {
        int[] nums = new int[qtd];
        Random ran = new Random();
        for (int i = 0; i < qtd; i++) {

            nums[i] = ran.nextInt(100);
        }
        return nums;
    }

    public static int getInt(String msg) {
        System.out.println(msg);
        return Integer.parseInt(scan.nextLine());
    }

    public static double getDouble(String msg) {
        System.out.println(msg);
        return Double.parseDouble(scan.nextLine());
    }

    public static void exibirMsg(String msg) {
        System.out.printf(msg);
    }

    public static String getString(String msg) {
        System.out.println(msg);
        return scan.nextLine();
    }
}
