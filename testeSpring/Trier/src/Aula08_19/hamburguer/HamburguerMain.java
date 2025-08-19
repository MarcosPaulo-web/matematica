package Aula08_19.hamburguer;

public class HamburguerMain {
    public static void main(String[] args) {
        Hamburguer ham = new Hamburguer();

        ham.addIngrediente("Pão");
        ham.addIngrediente("Carne");
        ham.addIngrediente("Beacon");
        ham.addIngrediente("Cheddar");
        ham.addIngrediente("Alface");
        ham.addIngrediente("milho");
        ham.addIngrediente("queijo");
        ham.addIngrediente("cebola");

        ham.mostrarHamburguer();
    }
}
