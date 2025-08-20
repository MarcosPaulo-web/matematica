package aula08_20_heranca.atividades.conta;

import java.util.ArrayList;
import java.util.Scanner;

public class BancoMain {
    static final int saldoInicial = 0;
    static ArrayList<ContaCorrente> contasCorrentes = new ArrayList<>();
    static ArrayList<ContaPoupanca> contasPoupancas = new ArrayList<>();
    static Scanner scan = new Scanner(System.in);
    static Scanner scanText = new Scanner(System.in);

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int op;

        do {
            op = getInt("\n1 - Criar cliente\n2 - Depositar\n 3 - Sacar");
            switch (op) {
                case 1:
                    criarNovaConta(criarCliente());
                    break;
                case 2:
                    depositar();
                    break;
                case 3:
                    sacar();
                    break;
                case 4 :
                    transferirValor();
                    break;
                    case 5 :
            }
        } while (op != 0);
    }

    private static void transferirValor() {
        int opRemetente = getInt("deseja transferir de uma ( 1- conta corrente - 2 - conta poupança)");
        int opDestinatario = getInt("deseja mandar para uma ( 1- conta corrente - 2 - conta poupança)");

        Conta remetente = null;
        Conta destinatario = null;

        if (opRemetente == 1) {
             remetente = contasCorrentes.get(getInt("Qual o numero da conta do remetente: "));
        } else if (opRemetente == 2) {
             remetente = contasPoupancas.get(getInt("Qual o numero da conta do remetente: "));
        }

        if (opDestinatario == 1){
             destinatario = contasCorrentes.get(getInt("Qual o numero da conta do destinatario : "));

        } else if (opDestinatario ==2) {
             destinatario = contasPoupancas.get(getInt("Qual o numero da conta do destinatario : "));

        }

        double valorSacado = getDouble("Qual o valor que deseja sacar ? ");
       if (valorSacado >= 0 ){
           remetente.sacar(valorSacado);
           destinatario.depositar(valorSacado);
       }else{
           System.err.println("O valor inserido não pode ser transferido por ser menor que 0 ou maior que ");
       }



    }

    private static void sacar() {
        int op = getInt("1- conta corrente\n 2 - conta poupança");

        if (op == 1) {
            ContaCorrente contaCliete = contasCorrentes.get(getInt("Qual o numero da conta : "));
            contaCliete.sacar(getDouble("Qual valor deseja depositar : "));

        } else if (op == 2) {
            ContaPoupanca contaCliente = contasPoupancas.get(getInt("Qual o numero da conta : "));
            contaCliente.sacar(getDouble("Qual valor deseja sacar : "));

        }


    }

    private static void depositar() {
        int op = getInt("1- conta corrente\n 2 - conta poupança");

        if (op == 1) {
            ContaCorrente contaCliete = contasCorrentes.get(getInt("Qual o numero da conta : "));
            contaCliete.depositar(getDouble("Qual valor deseja depositar : "));

        } else if (op == 2) {
            ContaPoupanca contaCliente = contasPoupancas.get(getInt("Qual o numero da conta : "));
            contaCliente.depositar(getDouble("Qual valor deseja sacar : "));

        }

    }

    static Cliente criarCliente() {
        Cliente cliente = new Cliente();
        cliente.setNome(getString("Qual o nome do cliente : "));
        cliente.setIdade(getInt("Idade do cliente : "));
        return cliente;
    }

    static void criarNovaConta(Cliente cliente) {
        int op = getInt("1 - ligar na conta corrente \n2 - ligar na Criar conta poupança\n");
        if (op == 1) {

            ContaCorrente cc = new ContaCorrente();
            cc.setNumeroConta(contasCorrentes.size());
            cc.setSaldo(saldoInicial);
            cc.setStatusConta("Ativa");
            cc.setCliente(cliente);
            contasCorrentes.add(cc);
        } else if (op == 2) {
            ContaPoupanca cp = new ContaPoupanca();


            cp.setNumeroConta(contasPoupancas.size());
            cp.setSaldo(saldoInicial);
            cp.setStatusConta("Ativa");
            cp.setCliente(cliente);
            contasPoupancas.add(cp);
        }

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
        return scanText.nextLine();
    }
}
