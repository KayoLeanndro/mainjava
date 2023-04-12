package Encapsulamento;

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
public String getMarca() {
    return marca;
}
public void setMarca(String marca) {
    this.marca = marca;
}
public String getModelo() {
    return modelo;
}
public void setModelo(String modelo) {
    this.modelo = modelo;
}
public int getNumPassagers() {
    return numPassagers;
}
public void setNumPassagers(int numPassagers) {
    this.numPassagers = numPassagers;
}
public double getCapCombustivel() {
    return capCombustivel;
}
public void setCapCombustivel(double capCombustivel) {
    this.capCombustivel = capCombustivel;
}
public double getConsumoCombustivel() {
    return consumoCombustivel;
}
public void setConsumoCombustivel(double consumoCombustivel) {
    this.consumoCombustivel = consumoCombustivel;
}
}

