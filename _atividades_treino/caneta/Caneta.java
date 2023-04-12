package caneta;

import javax.swing.text.StyledEditorKit.BoldAction;

public class Caneta {
    private String modelo;
    private float ponta;
    private boolean tampada;


    public Caneta(){
        this.modelo = "Bic";
        this.ponta = 0.7f;
        this.tampada = true;
    }
    public String getModelo() {
        return this.modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public float getPonta() {
        return this.ponta;
    }
    public void setPonta(float ponta) {
        this.ponta = ponta;
    }
    public void setTampada(boolean tampada) {
        this.tampada = tampada;
    }
    public boolean getTampada(){
        return this.tampada;
    }

    public void tampar(){
        this.tampada = true;
    }
    public void destampar(){
        this.tampada = false;
    }
}
