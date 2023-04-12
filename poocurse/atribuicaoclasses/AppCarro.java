package atribuicaoclasses;

public class AppCarro {
    public static void main(String[] args) {
        Carro volvo = new Carro("Fiat", "Red", 45, 23, 23);
        volvo.ligar();
        System.out.println("Ligado ? " + volvo.ligado);
        volvo.acelerar();
        volvo.acelerar();
        System.out.println("Gasolina atual: "+ volvo.qtdGas);
        

    }
}
