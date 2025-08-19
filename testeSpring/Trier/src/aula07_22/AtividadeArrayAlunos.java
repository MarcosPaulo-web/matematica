package aula07_22;

import java.util.ArrayList;
import java.util.Scanner;

public class AtividadeArrayAlunos {
    static ArrayList<String> nome = new ArrayList<>();
    static ArrayList<Double> nota1 = new ArrayList<>();
    static ArrayList<Double> nota2 = new ArrayList<>();
    static ArrayList<Double> nota3 = new ArrayList<>();
    static ArrayList<Double> nota4 = new ArrayList<>();

    public static void main(String[] args) {

        int op;
        String resp = "";
        double media = 0;
        do {
            op = getInt("\n1 - cadastrar\n2 - consultar aluno por id\n3 - consultar todos\n4 - Sair");
            switch (op) {
                case 1:
                    nome.add(getString("Qual o nome do aluno : "));
                    nota1.add(getDouble("Qual a nota 1 do aluno : "));
                    nota2.add(getDouble("Qual a nota 2 do aluno : "));
                    nota3.add(getDouble("Qual a nota 3 do aluno : "));
                    nota4.add(getDouble("Qual a nota 4 do aluno : "));
                    break;
                case 2:
                    int id =getInt("Qual o id do aluno : ");
                    media = ((nota1.get(id) + nota2.get(id) + nota3.get(id) + nota4.get(id)) / 4);
                    resp += "\nSituação = " + (media >=7 ? "Aprovado" : "Reprovado");
                    exibirMsg(resp);
                    break;
                case 3 :
                    resp = "";
                    for (int i = 0; i < nome.size(); i++) {

                        media = ((nota1.get(i) + nota2.get(i) + nota3.get(i) + nota4.get(i)) / 4);
                        resp += "\nId = " + i + "\nNome = " + nome.get(i) + "\nNota 1 = " + nota1.get(i) +
                                "\nNota 2 = " + nota2.get(i) + "\nNota 3 = " + nota3.get(i) + "\nNota 4 = " + nota4.get(i) +
                                "\nMedia =" + media + "\nSituação = " + (media >=7 ? "Aprovado" : "Reprovado");
                        exibirMsg(resp);


                    }
                    break;
                case 4 :
                    exibirMsg("Sistema encerrado");
                    break;
                default:
                    exibirMsgErr("Não existe está opção do menu");
            }
        } while (op != 4);


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

    public static void exibirMsgErr(String msg) {

        System.err.print(msg);
    }
}
