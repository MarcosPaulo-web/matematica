package aula07_15;

import java.util.Scanner;

public class ControleEstoqueProduto {
    public static void main(String[] args) {
        int produtos[] = new int[5];

        int op;

        do {
            op = getInt("\n    Menu    " +
                    "\n\n1- Entrada de itens" +
                    "\n2- Saida de itens" +
                    "\n3- Encerrar programa" +
                    "\n4- Relatório");

            switch (op) {
                case 1:
                    produtos = entradaItens(produtos);
                    break;
                case 2:
                    produtos = saidaItens(produtos);
                    break;
                case 3:
                    exibirMsg("Programa encerrado");

                case 4:
                    relatorio(produtos);

                    break;
                default:
                    exibirMsg("Opção inserida fora do menu");
            }
            ;
        } while (op != 3);
    }

    static void relatorio(int[] produtos) {
       String resp = "";
        for (int i = 0; i < produtos.length; i++) {
            resp += "\n\nId : "+(i+1)+ "\nQuantidade : "+produtos[i];
        }
        exibirMsg(resp);
    }

    private static int[] saidaItens(int[] produtos) {
        produtos[getInt("\n1- Banana\n2- goiaba\n3- maça\n4- chocolate\n5- macarrão")-1] -= getInt("Qual a quantidade de saida do produto : ");
        return produtos;
    }

    private static int[] entradaItens(int[] produtos) {
        produtos[getInt("\n1- Banana\n2- goiaba\n3- maça\n4- chocolate\n5- macarrão")-1] += getInt("Qual a quantidade de entrada do produto : ");
        return produtos;
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
