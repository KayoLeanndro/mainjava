package cadastroexame;
public class Exame{
    private int idExame;
    private String nomePaciente;
    private int nivelGlicose;

    public Exame(int id, String nome,int nivelG){
        this.idExame = id;
        this.nomePaciente = nome;
        this.nivelGlicose = nivelG;
    }
    
    public int getIdExame() {
        return idExame;
    }

    public String getNomePaciente() {
        return nomePaciente;
    }
    
    public int getNivelGlicose() {
        return nivelGlicose;
    }

    public void setNivelGlicose(int nivelGlicose) {
        this.nivelGlicose = nivelGlicose;
    }
    public void obterDiagnostico(int glicose) {
        if (getNivelGlicose() <= 99) {
            System.out.println("Paciente com Nivel de glicose: Normal"); 
        }
        if (getNivelGlicose() >= 100 && getNivelGlicose() <= 125) {
            System.out.println("Paciente com Nivel de glicose: Pré-diabetes"); 
        }
        else {
            System.out.println("Paciente com Nivel de glicose: Diabetes"); 
        }
    }
}