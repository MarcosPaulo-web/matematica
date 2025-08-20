package aula08_20_heranca.animal;

public class AnimalMain {


    public static void main(String[] args) {
        Jabuti jabuti = new Jabuti();
        Gato gato = new Gato();
        Cachorro cachorro = new Cachorro();

        jabuti.nome = "Griselda";
        jabuti.peso = 3;
        jabuti.raca = "Jabuti";
        jabuti.sexo = 'F';
        jabuti.comer();
        jabuti.dormir();
        jabuti.viver();

        System.out.println("--------");
        gato.nome = "Frajola";
        gato.peso = 15;
        gato.raca = "Persa";
        gato.sexo = 'F';
        gato.comer();
        gato.dormir();
        gato.comer();
        gato.miar();
        System.out.println("--------");
        cachorro.nome = "Mutley";
        cachorro.peso = 35;
        cachorro.raca = "Dogo Argentino";
        cachorro.sexo = 'M';
        cachorro.comer();
        cachorro.dormir();
        cachorro.latir();
        cachorro.andar();

    }
}
