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
                    "\n5 - ver saldo\n6 - ver extrato da conta\n7 - mostrar conta\n8 - rendimento\n9 - Simular 1 mes afrente para bloqueio\n0 - sair");
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
                    conta = contas.get(getInt("Numero da conta : "));
                    System.out.printf("Saldo da conta : %.2f", conta.getSaldo());
                    break;
                case 6:
                    conta = contas.get(getInt("Numero da conta : "));
                    System.out.println("extrato da conta : " + conta.getHistorico());
                    break;
                case 7:
                    conta = contas.get(getInt("Numero da conta : "));
                    System.out.println(conta);
                case 8:
                    rendimento();
                    break;
                case 9:
                    saldoNegativo();
                    break;
            }
        } while (op != 0);
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

        Conta remetente = contas.get(getInt("Qual o numero da conta do remetente: "));
        Conta destinatario = contas.get(getInt("Qual o numero da conta do destinatario : "));


        double valorSacado = getDouble("Qual o valor que deseja sacar ? ");
        if (valorSacado >= 0) {
            remetente.setHistorico("-----\nSaldo inicial : " + remetente.getSaldo() + "\n " +
                    "valor sacado : " + valorSacado + "\nsaldo final " + (remetente.getSaldo() - valorSacado) + "\n");
            remetente.sacar(valorSacado);

            destinatario.depositar(valorSacado);
            destinatario.setHistorico("-----\nSaldo inicial : " + destinatario.getSaldo() + "\n " +
                    "valor depositado : " + valorSacado + "\nsaldo final " + (destinatario.getSaldo() + valorSacado) + "\n");
            destinatario.depositar(valorSacado);
        } else {
            System.err.println("O valor inserido não pode ser transferido por ser menor que 0 ou maior que ");
        }


    }

    private static void sacar() {
        Conta contaCliente = contas.get(getInt("Qual o numero da conta : "));
        double valor = getDouble("Qual valor deseja sacar : ");
        contaCliente.setHistorico("-----\nSaldo inicial : " + contaCliente.getSaldo() + "\n " +
                "valor sacado : " + valor + "\nsaldo final " + (contaCliente.getSaldo() - valor) + "\n");
        contaCliente.sacar(valor);
        contaCliente.isSaldoNegativo(contaCliente.getSaldo());


    }

    private static void depositar() {

        Conta contaCliete = contas.get(getInt("Qual o numero da conta : "));
        double valor = getDouble("Qual valor deseja depositar : ");

        contaCliete.setHistorico("-----\nSaldo inicial : " + contaCliete.getSaldo() + "\n " +
                "valor depositado : " + valor + "\nsaldo final " + (contaCliete.getSaldo() + valor) + "\n");

        contaCliete.depositar(valor);
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
            cc.setNumeroConta(contas.size());
            cc.setSaldo(saldoInicial);
            cc.setStatusConta("Ativa");
            cc.setCliente(cliente);
            contas.add(cc);
        } else if (op == 2) {
            ContaPoupanca cp = new ContaPoupanca();


            cp.setNumeroConta(contas.size());
            cp.setSaldo(saldoInicial);
            cp.setStatusConta("Ativa");
            cp.setCliente(cliente);
            contas.add(cp);
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
