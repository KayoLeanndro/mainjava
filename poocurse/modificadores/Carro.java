package modificadores;

public class Carro {
private  String marca;
private  String modelo;
private  int numPassagers;
private  double capCombustivel;
private  double consumoCombustivel;

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
