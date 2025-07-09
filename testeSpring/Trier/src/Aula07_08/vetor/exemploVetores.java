package Aula07_08.vetor;

public class exemploVetores {
    public static void main(String[] args) {
        int[] num = new int[10];
        int[] dados = new int[5];
        double[] salario = new double[10];
        dados[2] = 9;
        dados[3] = 7;
        dados[0] = 6;

        System.out.println(dados[3]);

        String nome[] = {"Matheus", "João", "Noah"};
        int i, n = nome.length;
        for ( i = 0; i < n; i++) {
            System.out.printf("%d°. nome = %s\n", (i+1), nome[i]);
        }
    }
}
