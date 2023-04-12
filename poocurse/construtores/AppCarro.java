package construtores;

public class AppCarro {
    public static void main(String[] args) {
        Carro van = new Carro();
        van.marca = "Fiat";
        van.modelo = "Ducato";
        van.numPassagers = 10;
        van.capCombustivel = 100;
        van.consumoCombustivel = 0.2;

        Carro van2 = new Carro("Fiat","Uno", 4,50.5,0.2);
        System.out.println(van2.marca);
        System.out.println(van2.modelo);
        System.out.println(van2.numPassagers);
        System.out.println(van2.capCombustivel);
        System.out.println(van2.consumoCombustivel);

    }
}
