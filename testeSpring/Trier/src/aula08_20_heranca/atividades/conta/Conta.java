package aula08_20_heranca.atividades.conta;

import java.util.ArrayList;

public class Conta {
    private Cliente cliente;
    private int numeroConta;
    private double saldo;
    private String statusConta;
    private ArrayList<String> historico;

    public Conta(Cliente cliente, int numeroConta, double saldo, String statusConta) {
        this.cliente = cliente;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.statusConta = statusConta;
    }

    public Conta() {

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

    void sacar(double valor){
        if (valor <=0){
            System.err.println(" valor menor que zero");
        }else {
            saldo -= valor;
        }
    }

    void depositar(double valor){
        if (valor >= 0){
            saldo += valor;
            System.out.println("Valor depositado, novo saldo = "+this.saldo);
        }else {
            System.err.println("Valor de deposito está abaixo de zero");
        }
    }

    public String getStatusConta() {
        return statusConta;
    }

    public void setStatusConta(String statusConta) {
        this.statusConta = statusConta;
    }

    @Override
    public String toString() {
        return "Conta{" +
                "cliente=" + cliente +
                ", numeroConta=" + numeroConta +
                ", saldo=" + saldo +
                ", statusConta='" + statusConta + '\'' +
                ", historico=" + historico +
                '}';
    }
}
