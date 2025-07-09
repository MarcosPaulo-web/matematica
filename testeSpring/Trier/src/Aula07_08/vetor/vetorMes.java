package Aula07_08.vetor;

public class vetorMes {
    public static void main(String[] args) {
        String mes[] = {
                "Janeiro", "Fevereiro", "Março", "Abril",
                "Maio", "Junho", "Julho", "Agosto", "Setembro",
                "Outubro", "Novembro", "Dezembro"
        };

        int diaMes[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int i;

        for (i = 0; i < 12; i++) {
            System.out.printf("%s, Tem %d dias.\n", mes[i], diaMes[i]);
        }
    }
}
