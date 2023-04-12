package construtores;

public class Carro {
    String marca;
String modelo;
int numPassagers;
double capCombustivel;
double consumoCombustivel;

public Carro(){
numPassagers = 4;
}

public Carro(String marca,String modelo, int numPassagers, double capCombustivel, double consumoCombustivel ){
    this.marca = marca; 
    this.modelo = modelo;
    this.numPassagers = numPassagers;
    this.capCombustivel = capCombustivel;
    this.consumoCombustivel = consumoCombustivel;
}

public double obterAutonomia() {
    return this.capCombustivel * this.consumoCombustivel;
}
public void exibirAutonomia(){
    System.out.println("A autonomia do é: " + this.capCombustivel * this.consumoCombustivel + "Km");
}
public double calcularCombustivel(double km){
    double qtdCombustivel = km/this.consumoCombustivel;
    return qtdCombustivel;
}

}
