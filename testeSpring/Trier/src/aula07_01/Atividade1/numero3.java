package aula07_01.Atividade1;

import java.util.Scanner;

public class numero3 {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println(verificarIdade(getInt("Qual a sua idade")));

    }

    public static String verificarIdade(int idade) {
        if (idade >= 18)
            return "Maior de idade";
        else
            return "Menor de idade";
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
