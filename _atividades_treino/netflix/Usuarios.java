package netflix;

public class Usuarios {
    public static void main(String[] args) {
        UsuarioCadastro um = new UsuarioCadastro();
        um.nome = "Kayo Leanndro";
        um.cpf = "123.456.567-12";
        um.id = "1222317655";
        um.senha = "um20comeu";
        um.email = "kayoleanndro2@gmail.com";
        um.plano = "Simples";
        um.numeroCartao = 2344-1243-1233-1245;
        um.dataValidade = 12/12;
        um.codigoSeguranca = 923;

       um.logar();
       System.out.println(um.email);
       System.out.println(um.senha);
       um.acessarLista();
       um.entrarVideo();
       um.assitirVideo();
       um.pause();
       um.play();
       um.sairVideo();
       




    }   
}
