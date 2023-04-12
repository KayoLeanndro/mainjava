package netflix;

public class UsuarioCadastro {
    String nome;
    String cpf;
    String email;
    String senha;
    String id;
    String plano;
    double numeroCartao;
    double dataValidade;
    double codigoSeguranca;

    void logar(){
        System.out.println("Logando na conta");
    }
    void acessarLista(){
        System.out.println("Acessando lista de favoritos");
    }
    void entrarVideo(){
        System.out.println("Entrando no video");
    }
    void assitirVideo(){
        System.out.println("Assistindo Video");
    }
    void passarvideo(){
        System.out.println("Passando Video");
    }
    void play(){
        System.out.println("Play");
    }
    void pause(){
        System.out.println("Pause");
    }
    void sairVideo(){
        System.out.println("Saindo do video");
    }
}

