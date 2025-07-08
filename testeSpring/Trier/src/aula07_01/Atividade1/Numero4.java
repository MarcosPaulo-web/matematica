package aula07_01.Atividade1;

import java.util.Scanner;

public class Numero4 {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        boolean cond = false;
        exibirMsg("Deseja colocar a condição verdadeira (1 = s/2 = n) ? ");
        byte op = scan.nextByte();

        if (op == 1) {
            cond = true;
        } else if (op == 2) {
            cond = false;
        }

        System.out.println(cond ? "A condição é verdadeira " : "A condição é falsa");

        scan.close();

    }
    public static int getInt(String msg) {
        System.out.println(msg);
        return scan.nextInt();
    }

    public static double getDouble(String msg) {
        System.out.println(msg);
        return scan.nextDouble();
    }

    public static void exibirMsg(String msg) {
        System.out.printf(msg);
    }
}
