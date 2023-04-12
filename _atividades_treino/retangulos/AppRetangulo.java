package retangulos;

public class AppRetangulo {
    public static void main(String[] args) {
        Retangulo retangulo1 = new Retangulo();
        System.out.println("Retangulo 1: ");
        System.out.println("Largura: " + retangulo1.getLargura());
        System.out.println("Altura: " + retangulo1.getAltura());
        System.out.println("Cor: " + retangulo1.getCor());
        System.out.println("Área: " + retangulo1.calcularArea());
        System.out.println("Perimetro: " + retangulo1.calcularPerimetro());
    

        Retangulo retangulo2 = new Retangulo(5.0,10.0,"Verde");
        System.out.println("\n\nRetangulo 2: ");
        System.out.println("Largura: " + retangulo2.getLargura());
        System.out.println("Altura: " + retangulo2.getAltura());
        System.out.println("Cor: " + retangulo2.getCor());
        System.out.println("Área: " +retangulo2.calcularArea());
        System.out.println("Perimetro" + retangulo2.calcularPerimetro());
    }
}
