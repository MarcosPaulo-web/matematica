package programacaoOrientadaObjeto.controller;

import programacaoOrientadaObjeto.model.Time;

import javax.swing.*;
import java.util.ArrayList;

public class CadastroTimes {
    static ArrayList<Time> times = new ArrayList<Time>();

    public static void main(String[] args) {
        int op;
        do {

            op = menu();
            if (op == 1) cadastrarTime();
            if (op == 2) buscarTime();
            if (op == 3) exibeTimeMaisGols();

        } while (op != 4);

    }

    static void exibeTimeMaisGols() {
        Time mais = times.get(0);
        for (Time t : times) {
            if (t.gols > mais.gols) {
                mais = t;
            }
        }
        mostrarDados(mais
        );
    }


    static int menu() {
        String m = "1 - Cadastrar\n2 - Buscar por nome\n3 - Time com mais gols\n4 - Sair";
        return Integer.parseInt(JOptionPane.showInputDialog(m));
    }

    public static void mostrarDados(Time t) {
        String txt = "Nome do time : " + t.nome + "\nPaís : " + t.pais + "\nGols : " + t.gols;
        JOptionPane.showMessageDialog(null, txt);
    }

    private static void cadastrarTime() {
        Time t = new Time();
        t.nome = JOptionPane.showInputDialog("Nome do time : ");
        t.pais = JOptionPane.showInputDialog("Nome do País : ");
        t.gols = Integer.parseInt(JOptionPane.showInputDialog("Quantos gols : "));
        times.add(t);
    }

    public static void buscarTime() {
        String nmBusca = JOptionPane.showInputDialog("Qual o nome do time : ");
        for (Time t : times) {
            if (t.nome.equalsIgnoreCase(nmBusca)) {
                mostrarDados(t);
                return;
            }
        }
        JOptionPane.showMessageDialog(null, "Nome não encontrado");
    }

}
