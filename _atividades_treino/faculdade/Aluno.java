package faculdade;
import java.util.Date;
public class Aluno {
    private int idPessoa;
    private String nome;
    private String telefone;
    private Date dataNascimento;
    private Faculdade faculdade;
    


    public Aluno(int idPessoa, String nome,String telefone,Date data ,Faculdade faculdade) {
        this.idPessoa = idPessoa;
        this.nome = nome;
        this.telefone = telefone;
        this.dataNascimento = data;
        this.faculdade = faculdade;
      
    }
    public int getIdPessoa() {
        return idPessoa;
    }
    public void setIdPessoa(int idPessoa) {
        this.idPessoa = idPessoa;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
 
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public Faculdade getFaculdade() {
        return faculdade;
    }
    public void setFaculdade(Faculdade faculdade) {
        this.faculdade = faculdade;
    }
    public Date getDataNascimento() {
        return dataNascimento;
    }
    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    
   
    
    

    
}
