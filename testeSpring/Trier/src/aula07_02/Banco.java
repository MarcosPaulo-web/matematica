package aula07_02;

import java.util.Scanner;

public class Banco {
    static Scanner scan = new Scanner(System.in);
    static Scanner scanString = new Scanner(System.in);

    public static void main(String[] args) {

        double sal = getDouble("Qual o salario dela : ");
        if (sal >= 5000) {
            int anos = getInt("Quantos anos na empresa que ela trabalha ela tem : ");
            char boolDivda = getString("Ela atrasou alguma divida rescentemente s/n : ").charAt(0);
            Character characterSim = 's';
            if (sal > 5000 && anos >= 4 && !characterSim.equals(boolDivda)) {
                System.out.println("Emprestimo liberado");
            } else if (sal > 5000 && (anos < 4 || characterSim.equals(boolDivda))) {
                exibirMsg("Para analise");
            }
        } else {
            exibirMsg("Emprestimo negado");
        }

        scan.close();
        scanString.close();
    }

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
        return scanString.nextLine();
    }

    public static void exibirMsg(String msg) {

        System.out.printf(msg);
    }


}
