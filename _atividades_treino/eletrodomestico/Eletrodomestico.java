package eletrodomestico;

public class Eletrodomestico {
    private int codigo;
    private String nome;
    private float potencia;
    private float tempUtilizacaoDiaria;

    public Eletrodomestico(int codigo, String nome, float potencia, float tempUtilizacaoDiaria) {
        this.codigo = codigo;
        this.nome = nome;
        this.potencia = potencia;
        this.tempUtilizacaoDiaria = tempUtilizacaoDiaria;
    }

    public float wattsPorDia() {
        float calculo = this.potencia * this.tempUtilizacaoDiaria;
        return calculo;
    }
    public float wattsPorMes() {
        float calculo = wattsPorDia() * 30;
        return calculo;
    }
    public float wattsPorAno() {
        float calculo = wattsPorMes() * 12;
        return calculo;
    }

    public float gastoMes(float precowatts) {
        float calculo = wattsPorMes()/1000;
        return calculo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPotencia() {
        return potencia;
    }

    public void setPotencia(float potencia) {
        this.potencia = potencia;
    }

    public float getTempUtilizacaoDiaria() {
        return tempUtilizacaoDiaria;
    }

    public void setTempUtilizacaoDiaria(float tempUtilizacaoDiaria) {
        this.tempUtilizacaoDiaria = tempUtilizacaoDiaria;
    }

}
