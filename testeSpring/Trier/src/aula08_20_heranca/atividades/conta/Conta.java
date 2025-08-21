package aula08_20_heranca.atividades.conta;

import java.time.LocalDate;
import java.util.ArrayList;

public class Conta {
    private Cliente cliente;
    private int numeroConta;
    private double saldo;
    private String statusConta;
    private ArrayList<String> historico;
    private LocalDate dataSaldoNegativo;
    private String tipoConta;


    public Conta(Cliente cliente, int numeroConta, double saldo, String statusConta) {
        this.cliente = cliente;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.statusConta = statusConta;
    }

    public Conta() {
        this.historico = new ArrayList<>();
        dataSaldoNegativo = null;

    }

    public String getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ArrayList<String> getHistorico() {
        return historico;
    }

    public void setHistorico(String historico) {
        this.historico.add(historico);
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    void sacar(double valor) {
        if (statusConta.equals("Bloqueada")) {
            System.err.println("Conta está bloqueada");
            return;
        }
        if (valor <= 0) {
            System.err.println(" valor menor que zero");
        } else if ((saldo - valor) >= -200) {
            saldo -= valor;
        } else {
            System.err.println("Valor maior que o  limite de crédito");
        }
    }

    void depositar(double valor) {
        if (statusConta.equals("Bloqueada")) {
            System.err.println("Conta está bloqueada");
            return;
        }
        if (valor >= 0) {
            saldo += valor;
            System.out.println("Valor depositado, novo saldo = " + this.saldo);
        } else {
            System.err.println("Valor de deposito está abaixo de zero");
        }
    }

    public String getStatusConta() {
        return statusConta;
    }

    public void setStatusConta(String statusConta) {
        this.statusConta = statusConta;
    }

    void isSaldoNegativo(double saldoMechido) {
        if (saldoMechido < 0 && this.dataSaldoNegativo == null) {
            this.dataSaldoNegativo = LocalDate.now();
            System.out.println(dataSaldoNegativo);
        }
    }

    void isMesAtrasado(LocalDate dataComparacao) {
        System.out.println(saldo);
        if ((dataComparacao.getMonthValue() - dataSaldoNegativo.getMonthValue()) != 0 && 0 > this.saldo) {
            setStatusConta("Bloqueada");
            System.out.printf("Conta %d do cliente %s Bloqueada", this.numeroConta, cliente.getNome());
        }
    }

    @Override
    public String toString() {
        return  "\n" + cliente +
                "\nnumero da conta = " + numeroConta +
                "\nsaldo = " + saldo +
                "\nstatus da conta = " + statusConta +
                "\nhistorico = " + historico +
                "\ndata saldo negativo = " + dataSaldoNegativo +
                "\ntipo de conta = " + tipoConta ;
    }
}
