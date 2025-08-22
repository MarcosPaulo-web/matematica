package aula08_20_heranca.atividades.lanchonete;

public class Lanche extends Produto {
    private boolean vegano;

    public Lanche() {

    }
    public Lanche(int id,String nome,int preco,String desc,int qtdEstoque,boolean vegano) {
        super(id,nome, preco, desc, "Lanche", qtdEstoque);
        this.vegano = vegano;
    }

    public boolean isVegano() {
        return vegano;
    }

    public void setVegano(boolean vegano) {
        this.vegano = vegano;
    }

    @Override
    public String toString() {
        return super.toString()+"\nvegano=" + vegano;
    }
}
