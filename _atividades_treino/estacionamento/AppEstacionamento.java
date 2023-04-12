package estacionamento;

import java.util.Scanner;

public class AppEstacionamento {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Estacionamento estacionamento1 = new Estacionamento(1, "Manguezal", "Olinda", 15, 3);
        System.out.println("--------------------------");
        System.out.println("Nome: " + estacionamento1.getNomeEstacionamento());
        System.out.println("Vagas ocupadas: " + estacionamento1.getVagasOcupadas());
        System.out.println("Vagas totais: " + estacionamento1.getVagasTotais());
        System.out.println("Preço por hora: " + estacionamento1.getPrecoHora() + " R$");
        System.out.println("--------------------------");
        int resposta = 0;
        int horasCarro;
        do {
            System.out.println("\n(0) - Sair");
            System.out.println("(1) - Adicionar carro");
            System.out.println("(2) - Retirar carro");
            System.out.println("(3) - Mostrar vagas Ocupadas");
            System.out.println("(4) - Mostrar preço por hora");
            System.out.println("(5) - Mostrar vagas totais");
            System.out.print("\nDigite aqui: ");
            resposta = sc.nextInt();

            switch (resposta) {
                case 0:
                    System.out.println("\n--- PROGRAMA FINALIZADO");
                    break;
                case 1:
                    if (estacionamento1.getVagasOcupadas() < estacionamento1.getVagasTotais()) {
                        estacionamento1.estacionarCarro();
                        System.out.println("\nCarro adicionado!");
                    } else {
                        System.out.println("Estacionamento cheio! ");
                    }
                    break;

                case 2:
                    if (estacionamento1.getVagasOcupadas() < estacionamento1.getVagasTotais()) {
                        if (estacionamento1.getVagasOcupadas() > 0) {
                            estacionamento1.retirarCarro();
                            System.out.println("\nCarro Retirado!");
                        } else {
                            System.out.println("Estacionamento Vazio! ");
                            continue;
                        }

                    }
                    break;

                case 3:
                    System.out.println("\nVagas ocupadas: " + estacionamento1.getVagasOcupadas());
                    break;
                case 4:
                    System.out.println("\nPreço por hora: " + estacionamento1.getPrecoHora());
                    break;
                case 5:
                    System.out.println("\nVagas totais: " + estacionamento1.getVagasTotais());
                    break;
                case 6:
                    System.out.println("\nTotal a pagar: "+ estacionamento1.calcularValor(10));
                    break;
                default:
                    System.out.println("\nOpção incorreta, digite novamente.");
                    break;
            }
        } while (resposta != 0);
        System.out.println("--------------------------");
        System.out.println("Nome: " + estacionamento1.getNomeEstacionamento());
        System.out.println("Vagas ocupadas: " + estacionamento1.getVagasOcupadas());
        System.out.println("Vagas totais: " + estacionamento1.getVagasTotais());
        System.out.println("Preço por hora: " + estacionamento1.getPrecoHora() + " R$");
        System.out.println("--------------------------");
    }
}
