package eletrodomestico;

import java.util.Scanner;

public class AppEletrodomestico {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Eletrodomestico[] eletrodomesticos = new Eletrodomestico[4];

        Eletrodomestico objeto1 = new Eletrodomestico(1, "Ventilador", 120f, 4f);
        eletrodomesticos[0] = objeto1;
        Eletrodomestico objeto2 = new Eletrodomestico(2, "Geladeira", 230f, 24f);
        eletrodomesticos[1] = objeto2;
        Eletrodomestico objeto3 = new Eletrodomestico(3, "Televisão", 220f, 6f);
        eletrodomesticos[2] = objeto3;
        Eletrodomestico objeto4 = new Eletrodomestico(4, "Computador", 220f, 10f);
        eletrodomesticos[3] = objeto4;

        for (Eletrodomestico eletrodomestico : eletrodomesticos) {
            System.out.println("ID: " + eletrodomestico.getCode());
            System.out.println("Nome: " + eletrodomestico.getName());
            System.out.println("Voltagem: " + eletrodomestico.getPower());
            System.out.println("Consumo: " + eletrodomestico.spentPerMonth(1.4f));
            System.out.println("------------");
        }
    }
}
