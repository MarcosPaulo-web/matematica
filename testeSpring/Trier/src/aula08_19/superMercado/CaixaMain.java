package aula08_19.superMercado;

public class CaixaMain {
    public static void main(String[] args) {
        Caixa caixa = new Caixa();

        caixa.adicionarCompra(10.50);
        caixa.adicionarCompra(5.20);

        System.out.printf("Saldo do caixa : %.2f ",caixa.getTotalCompra());



    }
}
