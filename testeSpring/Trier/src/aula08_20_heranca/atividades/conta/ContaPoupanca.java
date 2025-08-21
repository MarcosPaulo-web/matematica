package aula08_20_heranca.atividades.conta;

import java.time.LocalDate;

public class ContaPoupanca extends Conta{
    LocalDate date;

    ContaPoupanca(){
        date = LocalDate.now();
    }

   void isRendimento(int mes){
       if (date.getMonthValue() < mes){
           rendimento();
       }else {
           System.err.println("Ainda não pode render");
       }
    }

    void rendimento(){
        double saldo = getSaldo();
        saldo = saldo * 1.005;
        setSaldo(saldo);
    }

    public int getMes() {
        return date.getMonthValue();
    }
}
