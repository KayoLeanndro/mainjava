package reservarestaurante;

public class Requisitos {
    String nome;
    String restaurante;
    String estacionamento;
    String cadeirinhaBebe;
    int mesalivre;
    int mesa;
    int qtdPessoas;
    String dia;
    String hora;

    void chegar(){
        System.out.println("Chegando no restaurante");
    }
    void estacionar(){
        System.out.println("Estacionando");
    }
    void checkar(){
        System.out.println("Checando a reserva");
    }
    void mover(){
        System.out.println("Indo até a mesa");
    }
    void sentar(){
        System.out.println("Sentando na mesa");
    }
    void comer(){
        System.out.println("Comer");
    }
    void sair(){
        System.out.println("Saindo");
    }



}
