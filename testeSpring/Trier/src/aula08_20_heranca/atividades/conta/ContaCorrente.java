package aula08_20_heranca.atividades.conta;

public class ContaCorrente extends Conta {
    public ContaCorrente() {
    }

    @Override
    void sacar(double valor) {
        if (getStatusConta().equals("Bloqueada")) {
            System.err.println("Conta está bloqueada");
            return;
        }
        if (valor > 200) {
            System.err.println("Valor acima do limite de crédito");
        } else {
            double saldo = getSaldo();
            saldo -= valor;
            setSaldo(saldo);
        }

    }


}
