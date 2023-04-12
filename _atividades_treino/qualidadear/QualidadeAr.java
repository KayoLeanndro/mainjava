package qualidadear;

public class QualidadeAr {
    private int idMedicao;
    private int faixa;
    private String classificacao;

    public QualidadeAr(int id,int faixa){
        this.idMedicao = id;
        this.faixa = faixa;
    }
    public String definirClassificacao(){
        if(this.faixa >= 80 ){
            return "Otima";
        }else if(this.faixa >= 52 && this.faixa <= 79){
            return "Boa";
        }else if(this.faixa >= 37 && this.faixa <= 51){
            return "Razoável";
        }else if(this.faixa >= 20 && this.faixa <= 36){
            return "Ruim";
        }else{
            return "Pessima";
        }
    }
    public int getIdMedicao() {
        return idMedicao;
    }
    public void setIdMedicao(int idMedicao) {
        this.idMedicao = idMedicao;
    }
    public int getFaixa() {
        return faixa;
    }
    public void setFaixa(int faixa) {
        this.faixa = faixa;
    }
    public String getClassificacao() {
        return classificacao;
    }
    public void setClassificacao(String classificacao) {
        this.classificacao = classificacao;
    }
    
}
