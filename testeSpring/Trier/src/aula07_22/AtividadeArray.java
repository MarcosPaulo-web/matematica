package aula07_22;

import java.util.ArrayList;
import java.util.Scanner;

public class AtividadeArray {
    //falta colocar editar o id caso remova alg do inicio ao penultimo
    public static void main(String[] args) {
        ArrayList<Integer> id = new ArrayList<Integer>();
        ArrayList<String> nome = new ArrayList<String>();
        ArrayList<Integer> idade = new ArrayList<Integer>();
        ArrayList<String> timeCoracao = new ArrayList<String>();

        int op;
        int idSearch;
        do {
            op = getInt("\n1 - Cadastrar\n2 - Consultar tudo\n3 - consultar por id\n4 - Remover por id\n5 - Remover tudo\n9 - sair");

            switch (op) {
                case 1:
                    id.add(id.size());
                    nome.add(getString("Nome : "));
                    idade.add(getInt("Idade : "));
                    timeCoracao.add(getString("Time Coração : "));

                case 2:
                    String resp = "";
                    for (int i = 0; i < id.size(); i++) {
                        resp += "\n\nid - " + id.get(i) + "\nnome - " + nome.get(i) + "\nidade - " + idade.get(i) + "\nTime do coração - " + timeCoracao.get(i);
                    }
                    System.out.println(resp);
                    break;
                case 3:
                    idSearch = getInt("\nQual o indice da pessoa que deseja buscar : ");
                    if (idSearch >= 0 && idSearch < id.size()) {
                        System.out.println("\nid - " + id.get(idSearch) + "\nnome - " + nome.get(idSearch) + "\nidade - " + idade.get(idSearch) + "\nTime do coração - " + timeCoracao.get(idSearch));
                    } else
                        System.out.println("Não existe este indice");
                    break;

                case 4:
                    idSearch = getInt("\nQual o indice da pessoa que deseja remover : ");
                    if (idSearch >= 0 && idSearch < id.size()) {
                        int isRemove = getInt("\nDeseja mesmo remover a pessoa 1 - sim/ 2 - não :\nid - " + id.get(idSearch) + "\nnome - " + nome.get(idSearch) + "\nidade - " + idade.get(idSearch) + "\nTime do coração - " + timeCoracao.get(idSearch));

                        if (isRemove == 1) {
                            id.remove(idSearch);
                            nome.remove(idSearch);
                            idade.remove(idSearch);
                            timeCoracao.remove(idSearch);
                            System.out.println("Pessoa removida");
                        } else
                            System.out.println("Pessoa não foi removida");
                    } else
                        System.out.println("Não existe este indice !!!");

                    break;
                case 5:
                    int isRemoveAll = getInt("Deseja mesmo remover tudo 1 - sim/ 2 - não ");
                    if (isRemoveAll == 1) {
                        id.clear();
                        nome.clear();// funciona como clear
                        idade.removeAll(idade); //mesma coisa que este
                        timeCoracao.removeAll(timeCoracao);
                        System.out.println("todos os dados apagados");
                    } else
                        System.out.println("Os dados não foram apagados");

                    break;

                case 9:
                    System.out.println("Programa encerrado");
                    break;

                default:
                    System.out.println("comando não encontrado");

            }
        } while (op != 9);

    }


    static Scanner scan = new Scanner(System.in);
    static Scanner scanString = new Scanner(System.in);

    public static int getInt(String msg) {
        System.out.println(msg);
        return Integer.parseInt(scan.nextLine());
    }

    public static String getString(String msg) {
        System.out.println(msg);
        return scanString.nextLine();
    }

    public static void exibirMsg(String msg) {

        System.out.println(msg);
    }
}
