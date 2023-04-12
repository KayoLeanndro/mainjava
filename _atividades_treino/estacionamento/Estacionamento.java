package estacionamento;
public class Estacionamento{
    private int codigo;
    private String nomeEstacionamento;
    private String cidade;
    private int vagasTotais;
    private int vagasOcupadas;
    private double precoHora;

    public Estacionamento(int codigo, String nomeEstacionamento,String cidade,int vagasTotais,double precohora){
        this.codigo = codigo;
        this.nomeEstacionamento = nomeEstacionamento;
        this.cidade = cidade;
        this.vagasTotais = vagasTotais;
        this.precoHora = precohora;
        this.vagasOcupadas = 0;
    }
    public boolean estacionarCarro(){
        if(vagasOcupadas < vagasTotais){
            vagasOcupadas ++;
            return true;
        }
        else{
            return false;
        }
    }
    public boolean retirarCarro(){
        if(vagasOcupadas < vagasTotais){
            vagasOcupadas --;
            return true;
        }
        else{
            return false;
        }
    }
    public double calcularValor(int horas){
        this.precoHora = this.precoHora* horas;
        return precoHora; 
    }
    public int verificarVagas(){
        this.vagasTotais = this.vagasTotais - this.vagasOcupadas;
        return this.vagasTotais;
    }


    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public String getNomeEstacionamento() {
        return nomeEstacionamento;
    }
    public void setNomeEstacionamento(String nomeEstacionamento) {
        this.nomeEstacionamento = nomeEstacionamento;
    }
    public String getCidade() {
        return cidade;
    }
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    public int getVagasTotais() {
        return vagasTotais;
    }
    public void setVagasTotais(int vagasTotais) {
        this.vagasTotais = vagasTotais;
    }
    public int getVagasOcupadas() {
        return vagasOcupadas;
    }
    public void setVagasOcupadas(int vagasOcupadas) {
        this.vagasOcupadas = vagasOcupadas;
    }
    public double getPrecoHora() {
        return precoHora;
    }
    public void setPrecoHora(double precoHora) {
        this.precoHora = precoHora;
    }
    
}