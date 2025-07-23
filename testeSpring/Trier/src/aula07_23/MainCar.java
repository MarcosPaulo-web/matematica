package aula07_23;

import java.util.Scanner;

public class MainCar {
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.modelo = "Ferrari";
        carro.ano = 2003;
        carro.cor = "Vermelho";
        carro.cambio = true;///true == automatico , false == manual
        carro.km = 900000;
        carro.marca = "Fiat";
        carro.observacao = "Tudu certo";
        carro.situacao = true;/// true == bom, false == quebrado

        Scanner scan = new Scanner(System.in);
        int op;
        do {
            System.out.println("\n\nPara iniciar o sistema escolha uma das opções abaixo :" +
                    "\n1 - verificar o estado do carro" +
                    "\n2 - Ligar o carro" +
                    "\n3 - Desligar o carro" +
                    "\n4 - Freiar o carro" +
                    "\n5 - Verificar informações do carro" +
                    "\n6 - Sair\n");
            op = scan.nextInt();

            switch (op) {
                case 1:
                    System.out.printf("\no carro %s esta \n", carro.modelo);
                    carro.estado();
                    System.out.printf("\nO carro esta com as seguintes observações : %s", carro.observacao);
                    break;
                case 2:
                    if (carro.situacao) {
                        System.out.printf("\nO carro %s está em perfeitas condições\n", carro.modelo);
                        carro.ligar();
                    } else {
                        System.out.printf("\nO carro %s está em péssimas condições, não sera possivel ligar", carro.modelo);
                    }
                    break;
                case 3:
                    System.out.printf("\nDesligando o carro %s", carro.modelo);
                    break;
                case 4:
                    System.out.println("Qual a velocidade atual do carro");
                    int vel = scan.nextInt();
                    if (vel > 110) {
                        carro.freiar();
                    } else {
                        carro.acelerar();
                    }
                    break;
                case 5:
                    System.out.println(carro);
                    break;
                case 6:
                    System.out.println("Saindo");
                    break;
                default:
                    System.out.println("\nOpção invalida, digite um de acordo com as opções");
            }
        } while (op != 6);

    }
}
