package aula08_20_heranca.veiculo;

public class VeiculoMain {
    public static void main(String[] args) {
        Carro carro = new Carro();

        carro.marca = "Toyota";
        carro.ano = 2000;
        carro.portas = 4;

        carro.abrirPortaMalas();
        carro.acelerar();//herdados do veiculo
        carro.frear();//   ||       ||   ||

        Moto moto = new Moto();
        moto.marca = "Honda";
        moto.ano = 1985;

        moto.empinar();
        moto.frear();
        moto.acelerar();
    }
}
