package aula07_15;

import java.util.Scanner;

public class RegistroTemperaturaSemanal {
    public static void main(String[] args) {
        double temp[] = new double[7];

        for (int i = 0; i < temp.length; i++) {
            temp[i] = getDouble("Qual a temperatura do dia " + (i + 1));
        }

        double media = 0;
        for (int i = 0; i < temp.length; i++) {
            media += temp[i];
        }
        media = media / 7;
        System.out.println("Media : " + media);

        switch ((int) media / 10) {//de 50 até -20
            case 5:
            case 4:

            case 3:
                exibirMsg("Muito quente");
                break;
            case 2:
                exibirMsg("normal");
            case 1:
                break;
            case 0:

            case -1:

            case -2:
                exibirMsg("muito frio");
                break;
        }

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
