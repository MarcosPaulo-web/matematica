package aula07_23;

public class Carro {

    public String modelo;
    public String cor;
    public String marca;
    public String observacao;
    public boolean situacao;
    private String placa;
    public int km;
    public int ano;
    public boolean cambio;


    void andar() {
        System.out.printf(situacao ? "\nO carro %s está em prefeitas condições para andar" : "\nO carro %s esta quebrado, chamar mecanico",this.modelo);
    }

    void estado() {
        System.out.printf(situacao ? "\nO carro %s está em perfeitas condições": "\nO carro %d esta em pessimas condições para vendas",this.modelo);
    }

    void freiar() {
        System.out.printf("O carro %s precisa freiar urgente",this.modelo);
    }

    void ligar() {
        System.out.printf("O carro %s sera ligado em 3s... ",this.modelo);
    }

    void acelerar() {
        System.out.println("Vruuuuuuuum!!!!");
    }

    @Override
    public String toString() {
        return
                "\n modelo = " + modelo+
                "\n cor = " + cor +
                "\n marca = " + marca +
                "\n observacao = " + observacao +
                "\n situacao = " + (situacao ? " Boa": " Ruim") +
                "\n placa = " + placa  +
                "\n km = " + km +
                "\n ano = " + ano +
                "\n cambio = " + (cambio ? " Automatico":" Manual");
    }
}

