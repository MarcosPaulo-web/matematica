package aula07_15;

import java.util.Scanner;

public class CadastroProdutoCodigo {
    public static void main(String[] args) {
        int op;
        int cod[] = new int[10];
        for (int i = 0; i < cod.length; i++) {
            cod[i] = getInt("Qual o codigo do prod " + (i + 1) + " : ");
        }
        do {
            op = getInt("1 - Consultar Código\n2 - Sair ");
            switch (op) {
                case 1:
                    int resCod = 0;
                    int codConsulta = getInt("Qual o codigo que deseja confirmar : ");
                    for (int i = 0; i < cod.length; i++) {
                        if (codConsulta == cod[i]) {
                            resCod = cod[i];
                        }
                    }
                    if (resCod != 0) {
                        exibirMsg("Código encontrado");
                    } else {
                        exibirMsg("Código não encontrado");
                    }
                    break;
                case 2 :
                    exibirMsg("Programa encerrado !!");
                    break;

            }
        } while (op != 2);
    }

    static Scanner scan = new Scanner(System.in);
    static Scanner scanString = new Scanner(System.in);

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

        System.out.println(msg);
    }
}
