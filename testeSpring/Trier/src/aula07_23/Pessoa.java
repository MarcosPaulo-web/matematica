package aula07_23;

public class Pessoa {
//atributos
    String nome;
    int idade;
    double peso;
    double altura;
    String cpf;
    String sexo;
    int codigo;
    boolean cansaco;


    void trabalhar(){
        if (cansaco){
            System.out.printf("O %s precisa descansar\n",this.nome);
        }else{
            System.out.printf("0 %s pode trabalhar avontade\n",this.nome);
        }
    }

    void estudar(){
        if (cansaco){
            System.out.printf("O %s precisa descansar, mas devera estudar um pouco\n ",this.nome);
        }else{
            System.out.printf("0 %s pode estuda avontade\n",this.nome);
        }
    }

    void descansar(){
        if (cansaco){
            System.out.printf("O %s precisa descansar \n",this.nome);
        }else{
            System.out.printf("0 %s pode trabalhar avontade e estudar\n",this.nome);
        }

    }



}
