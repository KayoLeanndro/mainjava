package retangulos;

public class Retangulo {
    private double largura;
    private double altura;
    private String cor;
    private double perimetro;
    private double area;

    public Retangulo(){
        this.cor = "Branco";
        this.largura = 1;
        this.altura = 1;
    }
    public Retangulo(double altura,double largura,String cor){
        this.cor = cor;
        this.altura = altura;
        this.largura = largura; 
    }

    public double calcularArea(){
        this.area = this.altura*this.largura;
        return this.area;
    }
    public double calcularPerimetro(){
        this.perimetro = 2*(this.altura+this.largura);
        return this.perimetro;
    }

    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public String getCor() {
        return cor;
    }
    public void setLargura(double largura) {
        this.largura = largura;
    }
    public double getLargura() {
        return largura;
    }
    public double getPerimetro() {
        return perimetro;
    }
    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }
    public double getArea() {
        return area;
    }
    public void setArea(double area) {
        this.area = area;
    }

}
