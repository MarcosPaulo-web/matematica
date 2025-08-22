package aula08_20_heranca.atividades.lanchonete;

public class Sobremesa extends  Produto{
    private boolean isGelada;
    private boolean isDoce;

    public Sobremesa() {

    }
    public Sobremesa(int id,String nome,double preco,String desc,int qtdEstoque,boolean idGelada, boolean isDoce) {
        super(id,nome, preco, desc, "Sobremesa", qtdEstoque);
        this.isGelada = idGelada;
        this.isDoce = isDoce;
    }

    public boolean isIdGelada() {
        return isGelada;
    }

    public void setIdGelada(boolean idGelada) {
        this.isGelada = idGelada;
    }

    public boolean isDoce() {
        return isDoce;
    }

    public void setDoce(boolean doce) {
        isDoce = doce;
    }

    @Override
    public String toString() {
        return super.toString()+"\nGelada=" + isGelada +
                "\nDoce=" + isDoce;
    }
}
