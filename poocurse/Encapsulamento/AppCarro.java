package Encapsulamento;

public class AppCarro {
    public static void main(String[] args) {
        Carro van = new Carro();
        van.setModelo("Fiat");
        van.setMarca("Ducato");
        van.setNumPassagers(10);
        van.setCapCombustivel(100);
        van.setConsumoCombustivel(0.2);

       System.out.println(van.getMarca()); 

    
    
    }
}
