package metodos_static;

public class TesteCalculadora {

    static int numero;
    public static void main(String[] args) {
      numero = MinhaCalculadora.soma(1, 23, 4);
      System.out.println(numero);
      System.out.println(subtrair(3, 2));
    }
    static int subtrair(int n1, int n2){
        return n1 - n2;
    }
}
