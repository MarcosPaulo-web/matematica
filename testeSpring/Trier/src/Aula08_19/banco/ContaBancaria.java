package Aula08_19.banco;

public class ContaBancaria {
    private String titular;
    private double saldo;

    public ContaBancaria(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double saldo) {
        if (saldo>0){
            this.saldo += saldo;
        }else {
            System.out.println("Valor inválido para deposito");
        }
    }
    public void sacar(double saldo) {
        if (saldo>0 && this.saldo>=saldo){
            this.saldo -= saldo;
        }else {
            System.out.println("Valor inválido para sacar");
        }
    }
}
