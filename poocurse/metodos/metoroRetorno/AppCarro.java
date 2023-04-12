package metodos.metoroRetorno;

public class AppCarro {
    public static void main(String[] args) {
        Carro van = new Carro();
        van.marca = "Fiat";
        van.modelo = "Ducato";
        van.numPassagers = 10;
        van.capCombustivel = 100;
        van.consumoCombustivel = 0.2;

        double autonomiaCarro = van.obterAutonomia();

        System.out.println(van.marca);
        System.out.println(van.modelo);
        System.out.println("autonomia sendo colocada na variavel: " + autonomiaCarro);
        System.out.println("A autonomia puxada direto do metodo: " + van.obterAutonomia());
    }
}
