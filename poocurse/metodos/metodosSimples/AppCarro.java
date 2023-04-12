package metodos.metodosSimples;

public class AppCarro {
     public static void main(String[] args) {
        Carro van = new Carro();
        van.marca = "Fiat";
        van.modelo = "Ducato";
        van.numPassagers = 10;
        van.capCombustivel = 100;
        van.consumoCombustivel = 0.2;

        System.out.println("Marca: "+ van.marca);
        System.out.println("Modelo: "+ van.modelo);

        
        van.exibirAutonomia();

     }
}
