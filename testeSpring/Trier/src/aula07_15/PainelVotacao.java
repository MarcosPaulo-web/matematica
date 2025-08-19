package aula07_15;

import java.util.Scanner;


public class PainelVotacao {
    public static void main(String[] args) {
        int votos[] = new int[3];
        boolean votar = true;
        int op;
        while (votar) {
            op = getInt("1- Votar\n2- Sair");
            switch (op) {
                case 1:
                    votos = votar(votos);
                    break;
                case 2:
                    exibirMsg("Programa encerrado");
                    graficoVotacao(votos);
                    votar = false;
                    break;


            }

        }


    }

    private static void graficoVotacao(int[] votos) {
        String resp = "";
        for (int i = 0; i < votos.length; i++) {
            resp += "Voto " + (i + 1) + " : ";
            for (int j = 0; j < votos[i]; j++) {
                resp += "*";
            }
            resp += "\n";
        }
        exibirMsg(resp);
    }

    private static int[] votar(int[] votos) {
        int candidato = getInt("1 - nome 1\n2 - nome 2\n3 - nome 3")-1;

        switch (candidato) {
            case 0:
                votos[0] += 1;
                break;
            case 1:
                votos[1] += 1;
                break;
            case 2:
                votos[2] += 1;
                break;
        }
        return votos;
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
