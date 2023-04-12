package metodos.metodoParametro;

public class Carro {
    String marca;
    String modelo;
    int numPassagers;
    int capCombustivel;
    double consumoCombustivel;
public double calcularCombustivel(double km){
    double qtdCombustivel = km/consumoCombustivel;
    return qtdCombustivel;
}
public double obterAutonomia() {
    return capCombustivel * consumoCombustivel;
}

}
