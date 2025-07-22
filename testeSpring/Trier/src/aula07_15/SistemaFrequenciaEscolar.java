package aula07_15;

import java.util.Scanner;

public class SistemaFrequenciaEscolar {
    public static void main(String[] args) {
        String alunos[][] = new String[5][8];
        int qtdPresencaAlunos[] = new int[8];

        int op = 0;
        for (int i = 0; i < alunos.length; i++) {
            for (int j = 0; j < alunos[0].length; j++) {
                op = getInt("O aluno " + (j + 1) + " estava presente no dia " + (i + 1) + " (1 - presente/2 - atrasado/ 3 - falta) :");
                switch (op) {
                    case 1:
                        alunos[i][j] = "P";
                        break;
                    case 2:
                        alunos[i][j] = "A";
                        break;
                    case 3:
                        alunos[i][j] = "F";
                        break;

                }

            }
        }
String resp = "";
        for (int i = 0; i < alunos.length; i++) {
            resp += "\n\naluno "+(i+1);
            for (int j = 0; j < alunos[0].length; j++) {
                resp += "\n dia "+(i+1)+ " presença : " +alunos[i][j];
                if (alunos[i][j].equalsIgnoreCase("p")) {
                    qtdPresencaAlunos[j] += 1;
                }
                }
        }
        int alunoMaiorFreq = 0;
        for (int i = 0; i < qtdPresencaAlunos.length; i++) {
            System.out.println(i);
            if (alunoMaiorFreq < qtdPresencaAlunos[i]) {
                alunoMaiorFreq = i;
            }
        }
        exibirMsg("Aluno com maior freq : "+(alunoMaiorFreq+1));
        exibirMsg(resp);

        
    }

    static Scanner scan = new Scanner(System.in);
    static Scanner scanString = new Scanner(System.in);

    public static int getInt(String msg) {
        System.out.println(msg);
        return Integer.parseInt(scan.nextLine());
    }

    public static double getDouble(String msg) {
        System.out.println(msg);
        return Double.parseDouble(scan.nextLine());
    }

    public static String getString(String msg) {
        System.out.println(msg);
        return scanString.nextLine();
    }

    public static void exibirMsg(String msg) {

        System.out.println(msg);
    }
}
