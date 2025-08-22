package aula08_20_heranca.atividades.lanchonete;

public class Produto {
    private int idProd;
    private String nome;
    private double preco;
    private String desc;
    private int qtdEstoque;
    private String tipo;

    public Produto() {
    }

    public Produto(int id, String nome, double preco, String desc, String tipo, int qtdEstoque) {
        this.idProd = id;
        this.nome = nome;
        this.preco = preco;
        this.desc = desc;
        this.tipo = tipo;
        this.qtdEstoque = qtdEstoque;
    }

    public int getIdProd() {
        return idProd;
    }

    public void setIdProd(int idProd) {
        this.idProd = idProd;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getQtdEstoque() {
        return qtdEstoque;
    }

    public void setQtdEstoque(int qtdEstoque) {
        this.qtdEstoque = qtdEstoque;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "\nidProd=" + idProd +
                "\nnome=" + nome +
                "\npreco=" + preco +
                "\ndesc=" + desc +
                "\nqtd no Estoque=" + qtdEstoque +
                "\ntipo=" + tipo;
    }
}
