package Aula08_19.banco;

public class ContaBancariaMain {
    public static void main(String[] args) {
        ContaBancaria cb = new ContaBancaria("Matheus",20000);
        cb.depositar(5000);
        cb.sacar(10000);
        System.out.printf("Titular : %s\n ",cb.getTitular());
        System.out.printf("Saldo : %.2f\n  ",cb.getSaldo());
    }
}
