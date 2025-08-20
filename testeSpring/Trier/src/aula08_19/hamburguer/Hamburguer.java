package aula08_19.hamburguer;

import java.util.ArrayList;

public class Hamburguer {
    private ArrayList <String> ingredientes = new ArrayList<>();

    public void addIngrediente(String ingrediente){
        if (ingrediente!= null && !ingrediente.isEmpty()){
            ingredientes.add(ingrediente);
        }else {
            System.err.println("Erro, valor nulo ou vazio");
        }
    }

    public void mostrarHamburguer(){
        System.out.printf("Hamburguer com %s ",ingredientes);
    }
}
