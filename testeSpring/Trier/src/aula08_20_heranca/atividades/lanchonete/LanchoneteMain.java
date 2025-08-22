package aula08_20_heranca.atividades.lanchonete;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class LanchoneteMain {
    static ArrayList<Produto> produtos = new ArrayList<>();
    static ArrayList<Carrinho> carrinho = new ArrayList<>();
    static int contCliente = 1;
    static String relatorio = "";
    static double valorFinalDia = 0;


    public static void main(String[] args) {
        int op;
        addProdutos();

        do {
            carrinho.clear();

            op = getInt("\ncliente :" + contCliente +
                    "\n1 - Fazer pedido" +
                    "\n0- SAIR");

            switch (op) {
                case 1:

                    boolean isCompraFinalizada = false;
                    do {
                        fazerPedido();
                        int opCompra = getInt("1 - ADD MAIS UM PRODUTO AO CARRINHO" +
                                "\n2 - FINALIZAR COMPRA");
                        if (opCompra == 1) {
                            System.out.println("Pedido 2");
                        } else if (opCompra == 2) {
                            isCompraFinalizada = true;
                        } else {
                            System.out.println("Numero possiveis são 1 e 2");
                        }

                    } while (!isCompraFinalizada);


                    finalCompra();

                    break;
                case 0:
                    System.out.println("Relatório do final do dia :\n " +relatorio+"\nValor total do dia "+ valorFinalDia);
                    System.out.println("Programa encerrado...");
            }


        } while (op != 0);
    }

    private static void addToRelatorio(String txt) {
        relatorio += txt;
    }

    private static void retirarProdsEstoque() {
        for (Carrinho itemCarrinho : carrinho) {
            produtos.get(itemCarrinho.getProduto().getIdProd()).setQtdEstoque(itemCarrinho.produto.getQtdEstoque() - itemCarrinho.getQtd());
        }
    }

    private static void finalCompra() {
        double valorFinal = 0;
        String itensQts = "";
        for (Carrinho itemCarrinho : carrinho) {
            System.out.println(itemCarrinho);
            valorFinal += itemCarrinho.qtd * itemCarrinho.produto.getPreco();
            itensQts += "\nItem : "+ itemCarrinho.getProduto().getNome()+"\nQuantidade : "+itemCarrinho.getQtd();
        }
        System.out.printf("Valor final : %.2f ", valorFinal);
        int comprar = 0;
        do {


            comprar = getInt("Deseja cancelar a compra(1 = não, 2 = sim) ? ");


            if (comprar == 1) {
                System.out.println("Compra finalizada");
                retirarProdsEstoque();
                relatorio += "\nCliente " + contCliente + ":" + "" +
                        "\nitens : " + itensQts+
                        "\nValor da compra : " + valorFinal + "\n====================\n";
                valorFinalDia += valorFinal;
                contCliente++;
                return;
            } else if (comprar == 2) {
                System.out.println("Compra cancelada");
                return;

            } else {
                System.out.println("Opção inválida");
            }
        } while (comprar != 1 || comprar != 2);
    }

    private static void fazerPedido() {
        Carrinho itemCarrinho = new Carrinho();
        for (Produto prod : produtos) {
            System.out.println(prod);
        }
        int idProd = 0;
        int qtd = 0;
        do {
            idProd = getInt("Deseja adicionar qual produto ao carrinho (id do produto): ");
            if (idProd >= produtos.size() || idProd < 0) {
                idProd = 0;
                System.out.println("Erro, id do produto inváliddo");
            } else {
                itemCarrinho.produto = produtos.get(idProd);
            }

        } while (idProd == 0);

        do {
            qtd = getInt("Quantos deseja adicionar");
            if (qtd > itemCarrinho.getProduto().getQtdEstoque() || qtd < 0) {
                System.err.println("A quantidade é maior que a tida no estoque ou menor que zero\nQuantidade atual = " + itemCarrinho.produto.getQtdEstoque());
                qtd = 0;
            } else {
                itemCarrinho.qtd = qtd;
            }
        } while (qtd == 0);

        carrinho.add(itemCarrinho);
    }

    private static void addProdutos() {

        Lanche lanche1 = new Lanche(0, "X-Burger", 20, "Hambúrguer com queijo", 10, false);
        Lanche lanche2 = new Lanche(1, "X-Salada", 22, "Hambúrguer com salada", 8, false);
        Lanche lanche3 = new Lanche(2, "Vegano Burguer", 25, "Hambúrguer vegetal", 5, true);
        produtos.add(lanche1);
        produtos.add(lanche2);
        produtos.add(lanche3);

        Bebida bebida1 = new Bebida(3, "Coca-Cola", 8, "Refrigerante lata", 30, true, 350);
        Bebida bebida2 = new Bebida(4, "Suco de Laranja", 10, "Suco natural", 20, false, 300);
        Bebida bebida3 = new Bebida(5, "Água Mineral", 5, "Sem gás", 50, true, 500);
        produtos.add(bebida1);
        produtos.add(bebida2);
        produtos.add(bebida3);

        Sobremesa sobremesa1 = new Sobremesa(6, "Sorvete", 12, "Casquinha crocante", 15, true, true);
        Sobremesa sobremesa2 = new Sobremesa(7, "Pudim", 10, "Pudim de leite condensado", 7, false, true);
        Sobremesa sobremesa3 = new Sobremesa(8, "Salada de Frutas", 15, "Mix de frutas frescas", 12, true, false);
        produtos.add(sobremesa1);
        produtos.add(sobremesa2);
        produtos.add(sobremesa3);
    }

    static Scanner scan = new Scanner(System.in);
    static Scanner scanText = new Scanner(System.in);

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
        return scanText.nextLine();
    }
}
