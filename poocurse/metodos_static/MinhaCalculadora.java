package metodos_static;

public class MinhaCalculadora {
    public int somar(int num1, int num2){
        return num1 + num2;
    }
    public static double somar(double num1,int num2){
        return num1 + num2;
    }
    public static int soma(int num1, int num2, int num3){
        return num1 + num2 + num3;
    }
    public static int somar(int[] n){
        int total = 0;
        for (int i : n) {
            total += n[i];
        }
        return total;
    }
    
}
