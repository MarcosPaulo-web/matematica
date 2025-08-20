package aula08_20_heranca.animal;

public class Cachorro extends Animal {

    void latir() {
        System.out.println("\nO cachorro está latirando...\n");
    }

    @Override
    void comer() {
        System.out.println("\nO cachorro está comendo...\n");
    }

    @Override
    void andar() {
        System.out.println("\nO cachorro está andando...\n");
    }

    @Override
    void dormir() {
        System.out.println("\nO cachorro está dormindo...\n");
    }
}
