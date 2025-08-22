package aula08_20_heranca.atividades.lanchonete;

public class Carrinho {
    Produto produto;
    int qtd;

    public Carrinho() {
    }

    public Carrinho(Produto produto, int qtd) {
        this.produto = produto;
        this.qtd = qtd;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    @Override
    public String toString() {
        return  "\nproduto= " + produto.getNome() +
                "\npreço= " + produto.getPreco() +
                "\nqtd= " + qtd ;
    }
}
