package aula08_20_heranca.animal;

public class Jabuti extends Animal {

    void viver(){
        System.out.println("\nO Jabuti está vivendo...\n");
    }

    @Override
    void dormir(){
        System.out.println("\nO Jabuti está dormindo...\n");
    }
    @Override
    void comer(){
        System.out.println("\nO Jabuti está comendo...\n");

    }
    @Override
    void andar(){
        System.out.println("\nO Jabuti está andando...\n");

    }
}
