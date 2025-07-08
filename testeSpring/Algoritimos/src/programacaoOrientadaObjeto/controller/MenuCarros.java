package programacaoOrientadaObjeto.controller;

import programacaoOrientadaObjeto.model.Carro;

import java.util.ArrayList;
import java.util.Scanner;

public class MenuCarros {
    static ArrayList<Carro> carros = new ArrayList<Carro>();

    public static void main(String[] args) {
        int op;
        cadastrarCarrosDeTeste();
        do {
            op = getInt("\n1- Cadastrar Carros\n2- Listar por periodo de fabricação\n3- Listar carro por marca\n4- Lista de carro por cor\n5- Sair");

            switch (op) {
                case 1:
                    cadastrarCarro();
                    break;
                case 2:
                    listarPorFabricação();
                    break;
                case 3:
                    listarPorMarca();
                    break;
                case 4:
                    listarPorCor();
                    break;
            }

        } while (op != 5);


    }

    private static void listarPorCor() {
        String cor = getString("Qual a cor : ").trim();
        ArrayList<Carro> carroCor = new ArrayList<Carro>();

        for (Carro car : carros) {
            if (car.cor.equalsIgnoreCase(cor)) {
                carroCor.add(car);
            }
        }
        mostrarDados(carroCor);
        exibirMsg("Porcemtual :"+porcentual(carros.size(),carroCor.size()));
    }

    private static void listarPorMarca() {
        String marca = getString("Qual a marca do carro :").trim();
        ArrayList<Carro> carroMarca = new ArrayList<Carro>();
        for (Carro car : carros) {
            if (car.marca.equalsIgnoreCase(marca)) {
                carroMarca.add(car);
            }
        }
        mostrarDados(carroMarca);
        exibirMsg("porcentual :"+porcentual(carros.size(),carroMarca.size()));
    }

    public static void listarPorFabricação() {

        int anoInicial = getInt("Ano inicial :");
        int anoFinal = getInt("Ano final : ");
        ArrayList<Carro> carrosFabricacao = new ArrayList<Carro>();
        for (Carro car : carros) {
            if (car.ano >= anoInicial && car.ano <= anoFinal) {
                carrosFabricacao.add(car);
            }
        }

        mostrarDados(carrosFabricacao);
        exibirMsg("Porcemtagem : "+porcentual(carros.size(),carrosFabricacao.size()));
    }


    private static void mostrarDados(ArrayList<Carro> listCarros) {
        if (listCarros.isEmpty()) {
            System.out.println("\nNão localizamos o veiculo ");
        }
        for (Carro cars : listCarros) {
            exibirMsg("\nAno : " + cars.ano + "\nMarca : " + cars.marca + "\nCor : " + cars.cor + "\n");
        }

    }

    private static void cadastrarCarro() {
        Carro car = new Carro();
        car.marca = getString("Qual a marca do carro :").trim();
        car.ano = getInt("Qual o ano do carro : ");
        car.cor = getString("Qual a cor do carro").trim();
        if (car.marca.trim().equals("") || car.cor.trim().equals("") || car.ano < 1886) {
            exibirMsg("Verifique suas informações");
        } else {
            carros.add(car);
        }
    }

    static Scanner scan = new Scanner(System.in);

    public static int getInt(String msg) {
        System.out.println(msg);
        return Integer.parseInt(scan.nextLine());
    }

    public static double getDouble(String msg) {
        System.out.println(msg);
        return Double.parseDouble(scan.nextLine());
    }

    public static void exibirMsg(String msg) {
        System.out.printf(msg);
    }

    public static String getString(String msg) {
        System.out.println(msg);
        return scan.nextLine();
    }

    static double porcentual(int valTotal, int val){
        return ((double) val/valTotal)*100;
    }

    public static void cadastrarCarrosDeTeste() {
        Carro car1 = new Carro();
        car1.marca = "Toyota";
        car1.ano = 2020;
        car1.cor = "Prata";
        carros.add(car1);

        Carro car2 = new Carro();
        car2.marca = "Ford";
        car2.ano = 2018;
        car2.cor = "Preto";
        carros.add(car2);

        Carro car3 = new Carro();
        car3.marca = "Chevrolet";
        car3.ano = 2022;
        car3.cor = "Branco";
        carros.add(car3);
    }
}
