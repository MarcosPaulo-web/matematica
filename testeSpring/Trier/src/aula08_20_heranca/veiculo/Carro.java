package aula08_20_heranca.veiculo;

public class Carro extends Veiculo{
    int portas;

    void abrirPortaMalas(){
        System.out.println("Abrindo porta malas");
    }

    @Override
    void acelerar(){
        System.out.println("O carro está acelerando de porta malas (asa) aberta\n");
    }

    @Override
    void frear(){
        System.out.printf("O carro está freando com %d portas abertas\n",this.portas);
    }
}

