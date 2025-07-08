package programacaoOrientadaObjeto.controller;

import programacaoOrientadaObjeto.model.Aluno;

import java.util.ArrayList;
import java.util.Scanner;

public class ListaAluno {
    static ArrayList<Aluno> listAluno = new ArrayList<Aluno>();
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        int op;
        do {
            op = getInt("\n1 - Cadastrar Aluno\n2 - Maior que altura\n3 - Listar todos ordenado pela altura\n4 - Sair");

            switch (op) {
                case 1:
                    cadastrar();
                    break;
                case 2:
                    exibirMsg(maiorQue(getDouble("Maior apartir de que altura : ")));
                    break;
                case 3 :
                    exibirMsg(ordemAltura());
            }
        } while (op != 4);

    }

    public static String listarTodos(){
        String res = "";
        for (Aluno al : listAluno){
            res+= al;
        }
        return res;
    }

    private static String ordemAltura() {
     Aluno aux = new Aluno();
        for (int i = 0; i<listAluno.size();i++){
            for (int j = i+1; i<listAluno.size();i++){
                if (listAluno.get(j).altura < listAluno.get(i).altura){
                    aux = listAluno.get(j);
                    listAluno.set(j,listAluno.get(i));
                    listAluno.set(i,aux);
                }
            }
        }
        return listarTodos();
    }

    private static String maiorQue(double alturaLimite) {
        String resp = "";
        for (Aluno al : listAluno) {
            if (al.altura > alturaLimite) {
                resp += al;
            }
        }
        if (resp.trim() == "") resp = "Não achamos nenhum aluno maior que está idade";

        return resp;
    }

    static void cadastrar() {
        Aluno newAluno = new Aluno();
        newAluno.nome = getString("Nome do aluno : ");
        newAluno.altura = getDouble("Qual a altura : ");

        if (newAluno.nome.trim() == "" || newAluno.altura <= 0.0) {
            exibirMsg("Algum dado inserido está incorreto");
        }
        listAluno.add(newAluno);
    }

    public static int getInt(String msg) {
        System.out.println(msg);
        return Integer.parseInt(scan.nextLine());
    }

    public static double getDouble(String msg) {
        System.out.println(msg);
        return Double.parseDouble(scan.nextLine());
    }

    public static void exibirMsg(String msg) {
        System.out.printf(msg);
    }

    public static String getString(String msg) {
        System.out.println(msg);
        return scan.nextLine();
    }
}
