package programacaoOrientadaObjeto.model;

public class ListaCompras {
    public String nomeProduto;
    public int qtd;
    public double valor;

    @Override
    public String toString() {
        return "\n" +
                "nomeProduto = " + nomeProduto +
                "\nqtd = " + qtd +
                "\nvalor = " + valor +
                '\n';
    }
}
