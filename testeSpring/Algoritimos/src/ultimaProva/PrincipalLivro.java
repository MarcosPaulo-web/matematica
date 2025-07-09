package ultimaProva;

import java.util.ArrayList;
import java.util.Scanner;


public class PrincipalLivro {
    static ArrayList<Livro> listaLivros = new ArrayList<Livro>();
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int op;
        do {
            op = menu();
            switch (op) {
                case 1:
                    cadastrar();
                    break;
                case 2:
                    buscarTitulo(getString("\nQual o titulo deseja buscar : "));
                    break;
                case 3:
                    buscarFaixaValor(getDouble("\nValor Inicial : "), getDouble("\nValor final : "));
                    break;
                case 4:
                    ordemPaginas();
                    break;
                case 5:
                    ordemValor();
                    break;
                case 6:
                    exibirMsg("Adeus");
                    break;
                default:
                    exibirMsg("Numero do menu errado");
            }
        } while (op != 6);
    }

    private static void ordemPaginas() {
        Livro aux;
        for (int i = 0; i < listaLivros.size(); i++) {
            for (int j = i + 1; j < listaLivros.size(); j++) {
                if (listaLivros.get(j).numPaginas < listaLivros.get(i).numPaginas) {
                    aux = listaLivros.get(j);
                    listaLivros.set(j, listaLivros.get(i));
                    listaLivros.set(i, aux);
                }
            }
        }
        listAll();
    }

    private static void ordemValor() {
        Livro aux;
        for (int i = 0; i < listaLivros.size(); i++) {
            for (int j = i + 1; j < listaLivros.size(); j++) {
                if (listaLivros.get(j).valor < listaLivros.get(i).valor) {
                    aux = listaLivros.get(j);
                    listaLivros.set(j, listaLivros.get(i));
                    listaLivros.set(i, aux);
                }
            }
        }
        listAll();
    }

    private static void listAll() {
        String resp = "";
        for (Livro ordenado : listaLivros) {
            resp += ordenado.toString() + "\n";
        }
        exibirMsg(resp);
    }

    private static void buscarFaixaValor(double valIni, double valFinal) {
        String resp = "";
        for (Livro livro : listaLivros) {
            if (livro.valor > valIni && livro.valor < valFinal) {
                resp += livro.toString() + "\n";
            }
        }

        if (resp.trim().isEmpty()) {
            resp = "\nNenhum livro encontrado";
        }
        exibirMsg("Busca por faixa de valor : \n" + resp);
    }

    private static void buscarTitulo(String titulo) {
     String resp = "";
        for (Livro livro : listaLivros) {
            if (livro.titulo.equalsIgnoreCase(titulo.trim())) {
               resp +=  "\nResultado da busca : \n" + livro.toString() + "\n";
            }
        }
        if (resp.trim().isEmpty()){
            resp = "\nNão retornou nada da busca ";
        }
        exibirMsg(resp);

    }

    private static void cadastrar() {
        Livro novoLivro = new Livro();
        novoLivro.titulo = getString("\nQual o título do livro :");
        novoLivro.valor = getDouble("\nQual o valor do Livro : ");
        novoLivro.numPaginas = getInt("\nQual o numero de páginas : ");
        if (novoLivro.titulo.trim().isEmpty() || novoLivro.valor <= 0 || novoLivro.numPaginas <= 0) {
            exibirMsg("\nCadastro do livro falhou por dados errados, tente novamente");
        } else {
            listaLivros.add(novoLivro);
        }
    }

    private static int menu() {
        return getInt("\n1 - Cadastrar Livro\n2 - Buscar por Título\n3 - Buscar por faixa de valor\n" + "4 - Listar todos por quantidade de páginas\n5 - Listar todos ordenados por valor\n6 - Sair");
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
