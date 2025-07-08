package programacaoOrientadaObjeto.model;

public class Carro {
    public String marca;
    public int ano;
    public String cor;

    @Override
    public String toString() {
        return
                "\nmarca=" + marca +
                        "\nano=" + ano +
                        "\ncor='" + cor;
    }

}
