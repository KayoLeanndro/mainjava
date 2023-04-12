package SobreCarga;

public class MinhaCalculadora {
    public int somar(int num1, int num2){
        return num1 + num2;
    }
    public double somar(double num1,int num2){
        return num1 + num2;
    }
    public int soma(int num1, int num2, int num3){
        return num1 + num2 + num3;
    }
    public int somar(int[] n){
        int total = 0;
        for (int i : n) {
            total += n[i];
        }
        return total;
    }

}
