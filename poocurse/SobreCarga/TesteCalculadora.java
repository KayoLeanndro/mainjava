package SobreCarga;

public class TesteCalculadora {
    public static void main(String[] args) {
        MinhaCalculadora calculadora = new MinhaCalculadora();

        System.out.println(calculadora.soma(10, 3, 2));
        System.out.println(calculadora.somar(19, 23));
        System.out.println(calculadora.somar(213, 2));
        System.out.println(calculadora.somar(12, 12));
    }
}
