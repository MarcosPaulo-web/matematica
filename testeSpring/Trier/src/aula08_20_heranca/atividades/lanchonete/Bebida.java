package aula08_20_heranca.atividades.lanchonete;

public class Bebida extends Produto{
    private boolean gelada;
    private double volume;

    public Bebida() {

    }
    public Bebida(int id,String nome,double preco,String desc,int qtdEstoque,boolean gelada, double volume) {
        super(id,nome, preco, desc, "Bebida", qtdEstoque);
        this.gelada = gelada;
        this.volume = volume;
    }

    public boolean isGelada() {
        return gelada;
    }

    public void setGelada(boolean gelada) {
        this.gelada = gelada;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return super.toString()+"\ngelada=" + gelada +
                "\nvolume=" + volume;
    }
}
