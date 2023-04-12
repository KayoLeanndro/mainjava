package reservarestaurante;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Pessoas {
    public static void main(String[] args) {
        Requisitos pessoa = new Requisitos();
        Requisitos restaurante = new Requisitos();
        pessoa.nome = "Kayo Leanndro";
        pessoa.qtdPessoas = 4;
        pessoa.hora = "2h30";
        pessoa.dia = "2/12";
        pessoa.mesa = 23;
        restaurante.cadeirinhaBebe = "Sim";
        restaurante.estacionamento = "Sim";
        restaurante.mesalivre = 2; 

        pessoa.chegar();
        pessoa.estacionar();
        pessoa.checkar();
        System.out.println("-----------");
        System.out.println("Nome: "+pessoa.nome);
        System.out.println("Quantidade de pessoas"+pessoa.qtdPessoas);
        System.out.println("Hora marcada: "+pessoa.hora);
        System.out.println("Mesa marcada: "+pessoa.mesa);
        System.out.println("-----------");
        pessoa.mover();
        pessoa.comer();
        pessoa.sair();

    }
}
