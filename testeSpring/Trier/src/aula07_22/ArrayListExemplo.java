package aula07_22;

import java.util.ArrayList;

public class ArrayListExemplo {
    public static void main(String[] args) {

        ArrayList<String> cities = new ArrayList<String>();

        cities.add("São Paulo");
        cities.add("Santos");
        cities.add("Riberão Preto");
        cities.add(0,"Campinas");// ele fura a fila
        System.out.println(cities);

        cities.set(0,"Rio de Janeiro");
        System.out.println(cities);

        cities.remove(0);//remove o indice(id) 2
        System.out.println(cities);

        cities.removeAll(cities);
        System.out.println("Apagamos tudo :( "+cities);

    }
}
