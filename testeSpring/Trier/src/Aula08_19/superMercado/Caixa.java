package Aula08_19.superMercado;

public class Caixa {
    private double totalCompra;

    public void adicionarCompra(double preco) {
        if (preco > 0) {
            this.totalCompra += preco;
        }
    }

    public double getTotalCompra() {
        return this.totalCompra;
    }

}
