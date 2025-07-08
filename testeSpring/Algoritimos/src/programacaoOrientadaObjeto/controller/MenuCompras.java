package programacaoOrientadaObjeto.controller;

import programacaoOrientadaObjeto.model.ListaCompras;

import java.util.ArrayList;
import java.util.Scanner;

public class MenuCompras {
    static ArrayList<ListaCompras> list = new ArrayList<ListaCompras>();
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        cadastrarPadrao("Arroz", 2,20);
        cadastrarPadrao("Feijão", 1,77);
        cadastrarPadrao("Macarrão", 3,14.50);
        int op;
        do {
            op = getInt("\n1 - Cadastrar novo produto\n2- buscar por nome\n3 - Listar produtos pela qtd minima\n4 - Listar todos\n5 - sair");

            switch (op) {
                case 1:
                    cadastrar();
                    break;
                case 2:
                    pesquisarNome();
                    break;
                case 3:
                    quantidade(getInt("Qual a quantidade minima : "));
                    break;
                case 4:
                    listarTodos();
                    break;
                default:
                    exibirMsg("Numero do menu n existe");
            }
        } while (op != 5);
    }

    private static void bubbleSort() {
        ListaCompras aux = new ListaCompras();

        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(j).qtd < list.get(i).qtd) {
                    aux = list.get(j);
                    list.set(j, list.get(i));
                    list.set(i, aux);
                }
            }
        }

    }


    private static void listarTodos() {
        bubbleSort();
        String resp = "";
        for (ListaCompras prod : list) {
            resp += prod;

        }
        exibirMsg(resp);
    }

    private static void cadastrarPadrao(String nome, int quantidade, double valor) {

        ListaCompras newList = new ListaCompras();
        newList.nomeProduto = nome;
        newList.qtd = quantidade;
        newList.valor = valor;
        if (newList.nomeProduto.trim().equals("") || newList.qtd <= 0 || valor <=0) {
            exibirMsg("O nome está vazio ou a quantidade/valor é menor que 0");
            return;
        }
        list.add(newList);
    }

    private static void quantidade(int qtdMin) {
        String resp = "";
        if (qtdMin <= 0) {
            qtdMin = 10;
        }

        for (ListaCompras prod : list) {
            if (prod.qtd >= qtdMin) {
                resp += prod.toString();
            }
        }
        exibirMsg(resp.trim() == "" ? "Não retornou nenhum produto" : resp);
    }

    private static void pesquisarNome() {
        String nome = getString("Qual o nome do produto : ");
        String resp = "";
        for (ListaCompras prod : list) {
            if (prod.nomeProduto.equalsIgnoreCase(nome)) {
                resp += prod.qtd;
                exibirMsg(resp);
                return;
            }
        }
        resp = "Não achou o produto";
        exibirMsg(resp);


    }


    private static void cadastrar() {
        ListaCompras newList = new ListaCompras();
        newList.nomeProduto = getString("Qual o nome do produto : ");
        newList.qtd = getInt("Quantidade");
        newList.valor = getDouble("Qual o valor do produto : ");
        if (newList.nomeProduto.trim().equals("") || newList.qtd <= 0 ||newList.valor <=00) {
            exibirMsg("O nome esta vazio ou a quantidade é menor que 0");
            return;
        }
        list.add(newList);
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
        System.out.println(msg);
    }

    public static String getString(String msg) {
        System.out.println(msg);
        return scan.nextLine();
    }
}
