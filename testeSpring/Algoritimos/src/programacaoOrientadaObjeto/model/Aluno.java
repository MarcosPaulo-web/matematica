package programacaoOrientadaObjeto.model;

public class Aluno {

    public String nome;
    public double altura;

    @Override
    public String toString() {
        return "\nnome = " + nome + "\naltura=" + altura;
    }
}
