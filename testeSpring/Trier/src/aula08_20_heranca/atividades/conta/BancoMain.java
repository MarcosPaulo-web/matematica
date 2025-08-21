package aula08_20_heranca.atividades.conta;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class BancoMain {
    static final int saldoInicial = 0;
    static ArrayList<Conta> contas = new ArrayList<>();
    static Scanner scan = new Scanner(System.in);
    static Scanner scanText = new Scanner(System.in);

    public static void main(String[] args) {
        Conta conta = null;
        int op;

        do {
            op = getInt("\n1 - Criar cliente\n2 - Depositar\n3 - Sacar\n4 - Transferir saldo para outra conta" +
                    "\n5 - Ver saldo\n6 - Ver extrato da conta\n7 - Mostrar conta\n8 - Rendimento\n9 - Simular 1 mes afrente para bloqueio\n0 - Sair");
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
                case 4:
                    transferirValor();
                    break;
                case 5:
                    conta = contas.get(getIndexConta("numero da conta : "));
                    System.out.printf("Saldo da conta : %.2f", conta.getSaldo());
                    break;
                case 6:
                    conta = contas.get(getIndexConta("numero da conta : "));
                    System.out.println("extrato da conta : " + conta.getHistorico());
                    break;
                case 7:
                    conta = contas.get(getIndexConta("numero da conta : "));
                    System.out.println(conta);
                case 8:
                    rendimento();
                    break;
                case 9:
                    saldoNegativo();
                    break;
                case 0:
                    System.out.println("Programa encerrado... ");
                    break;
                default:
                    System.err.println("Informe um numero de 0 a 9 ...");
            }

        } while (op != 0);
    }

    private static int getIndexConta(String txt) {

        boolean contaExist = false;
        int totalConta = contas.size();
        int idConta;
        do {
            idConta = getInt(txt);
            if (idConta <= totalConta && idConta >= 0) {
                contaExist = true;
            } else {
                System.err.println("Esta conta não existe");
            }
        } while (!contaExist);
        return idConta;
    }

    private static void saldoNegativo() {
        LocalDate mesPosterior = LocalDate.now().plusMonths(1);
        for (Conta conta : contas) {
            conta.isMesAtrasado(mesPosterior);
        }
    }

    private static void rendimento() {
        for (Conta conta : contas) {
            if (conta instanceof ContaPoupanca) {
                ContaPoupanca cp = (ContaPoupanca) conta;
                int mes = cp.getMes();
                cp.isRendimento(mes + 1);
            }
        }
    }

    private static void transferirValor() {

        Conta remetente = contas.get(getIndexConta("Qual o numero da conta do remetente"));
        Conta destinatario = contas.get(getIndexConta("Qual o numero da conta do destinatário"));


        double valorSacado = getDouble("Qual o valor que deseja sacar ? ");
        if (valorSacado >= 0) {
            remetente.setHistorico("-----\nSaldo inicial : " + remetente.getSaldo() + "\n " +
                    "Valor sacado : " + valorSacado + "\nSaldo final " + (remetente.getSaldo() - valorSacado) + "\n");
            remetente.sacar(valorSacado);

            destinatario.depositar(valorSacado);
            destinatario.setHistorico("-----\nSaldo inicial :" + destinatario.getSaldo() + "\n" +
                    "Valor depositado : " + valorSacado + "\nSaldo final :" + (destinatario.getSaldo() + valorSacado) + "\n");
            destinatario.depositar(valorSacado);
        } else {
            System.err.println("O valor inserido não pode ser transferido por ser menor que 0 ou maior que ");
        }


    }

    private static void sacar() {
        Conta contaCliente = contas.get(getIndexConta("Qual o numero da conta :"));
        double valor = getDouble("Qual valor deseja sacar :");
        contaCliente.setHistorico("-----\nSaldo inicial :" + contaCliente.getSaldo() + "\n " +
                "Valor sacado : " + valor + "\nSaldo final" + (contaCliente.getSaldo() - valor) + "\n");
        contaCliente.sacar(valor);
        contaCliente.isSaldoNegativo(contaCliente.getSaldo());


    }

    private static void depositar() {

        Conta contaCliete = contas.get(getIndexConta("Qual o numero da conta : "));
        double valor = getDouble("Qual valor deseja depositar : ");

        contaCliete.setHistorico("-----\nSaldo inicial : " + contaCliete.getSaldo() + "\n " +
                "Valor depositado : " + valor + "\nSaldo final " + (contaCliete.getSaldo() + valor) + "\n");

        contaCliete.depositar(valor);
    }

    static Cliente criarCliente() {
        Cliente cliente = new Cliente();
        cliente.setNome(getString("Qual o nome do cliente : "));
        cliente.setIdade(getInt("Idade do cliente : "));
        return cliente;
    }

    static void criarNovaConta(Cliente cliente) {
        int op = getInt("Qual tipo de conta deseja criar :\n1 - Conta corrente \n2 -Conta poupança\n");

        if (op == 1) {

            ContaCorrente cc = new ContaCorrente();
            cc.setNumeroConta(contas.size());
            cc.setSaldo(saldoInicial);
            cc.setStatusConta("Ativa");
            cc.setCliente(cliente);
            cc.setTipoConta("Corrente");
            contas.add(cc);
            System.out.println(contas.get(cc.getNumeroConta()));
        } else if (op == 2) {
            ContaPoupanca cp = new ContaPoupanca();


            cp.setNumeroConta(contas.size());
            cp.setSaldo(saldoInicial);
            cp.setStatusConta("Ativa");
            cp.setCliente(cliente);
            cp.setTipoConta("Poupança");
            contas.add(cp);
            System.out.println(contas.get(cp.getNumeroConta()));
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
