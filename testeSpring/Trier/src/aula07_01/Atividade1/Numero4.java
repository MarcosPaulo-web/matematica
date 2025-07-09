package primeiraAula.Atividade1;

import java.util.Scanner;

public class Numero4 {
    public static void main(String[] args) {
        boolean cond = false;
        exibirMsg("Deseja colocar a condição verdadeira (1 = s/2 = n) ? " );
        byte op = scan.nextByte();

        if (op == 1){
            cond = true;
        }

        System.out.println(cond ? "A condição é verdadeira ":"A condição é falsa");

    }

    static Scanner scan = new Scanner(System.in);

    public static int getInt(String msg){
        System.out.println(msg);
        return Integer.parseInt(scan.nextLine());
    }

    public static double getDouble(String msg){
        System.out.println(msg);
        return Double.parseDouble(scan.nextLine());
    }

    public static void exibirMsg(String msg){
        System.out.printf(msg);
    }

    public static String getString(String msg){
        System.out.println(msg);
        return scan.nextLine();
    }
}
