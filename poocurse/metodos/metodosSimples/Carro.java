package metodos.metodosSimples;

public class Carro {
String marca;
String modelo;
int numPassagers;
int capCombustivel;
double consumoCombustivel;

public void exibirAutonomia(){
    System.out.println("A autonomia do é: " + capCombustivel * consumoCombustivel + "Km");
}
}
