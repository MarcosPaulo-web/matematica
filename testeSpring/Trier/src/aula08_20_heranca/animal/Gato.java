package aula08_20_heranca.animal;

public class Gato extends Animal{

    void miar(){
        System.out.println("\nO gato está miando...\n");

    }

    @Override
    void dormir(){
        System.out.println("\nO gato está dormindo...\n");
    }
    @Override
    void comer(){
        System.out.println("\nO gato está comendo...\n");

    }
    @Override
    void andar(){
        System.out.println("\nO gato está andando...\n");

    }
}
