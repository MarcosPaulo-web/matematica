package aula07_01.Atividade1;

import java.util.Scanner;

public class numero2 {
  static   Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        double num1 = getDouble("Digite o numero 1 : ");
        double num2 = getDouble("Digite o numero 2 : ");
        exibirMsg("Valor da soma = " + (num1+num2));
    }
    public static int getInt(String msg){
        System.out.println(msg);
        return scan.nextInt();
    }

    public static double getDouble(String msg){
        System.out.println(msg);
        return scan.nextDouble();
    }

    public static void exibirMsg(String msg){
        System.out.printf(msg);
    }
}
