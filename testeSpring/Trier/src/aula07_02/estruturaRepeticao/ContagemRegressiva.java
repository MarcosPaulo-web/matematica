package aula07_02.estruturaRepeticao;

import java.util.Scanner;

public class ContagemRegressiva {
    public static void main(String[] args) {

        int numContagem = getInt("Qual numero deseja fazer contagem regressiva : ");

        for (int i = 0; i < numContagem; numContagem--) {
            exibirMsg(numContagem + "\n");
            if (numContagem == 1) {
                exibirMsg("Vai");
            }
        }
        scan.close();
    }

    static Scanner scan = new Scanner(System.in);


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
        return scan.nextLine();
    }

    public static void exibirMsg(String msg) {

        System.out.printf(msg);
    }
}
