package aula08_20_heranca.veiculo;

public class Moto extends Veiculo {

    void empinar(){
        System.out.println("A moto está empinando\n");
    }

    @Override
    void acelerar(){
        System.out.println("A moto está acelerando\n");
    }

    @Override
    void frear(){
        System.out.println("A moto está freando e empinando ao contrario\n");
    }

}
