package metodos.metoroRetorno;

public class Carro {
    String marca;
    String modelo;
    int numPassagers;
    int capCombustivel;
    double consumoCombustivel;

    public double obterAutonomia() {
        return capCombustivel * consumoCombustivel;
    }
}
