package aula07_23;

public class PessoasMain {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.nome= "antepigmon";
        pessoa.sexo="Masculino";
        pessoa.idade=18;
        pessoa.peso=190;
        pessoa.altura=1.90;
        pessoa.cpf="123.456.789-123";
        pessoa.codigo=1;
        pessoa.cansaco = true;

        pessoa.descansar();
        pessoa.trabalhar();


    }
}
