package relacionamentoClasses;

public class Teste {
    public static void main(String[] args) {
        Contato contato = new Contato();
        Pessoa pessoa = new Pessoa("Kayo", 18, 1.78);
        Endereco end = new Endereco("Rua belmonte", "439", "Casa A", "5332-0491", "Olinda", "PE");
        Telefone tel = new Telefone("+55 ", "819", "86228400");


       
        contato.setPessoa(pessoa);
        contato.setEndereco(end);
        contato.setTelefone(tel);

        if(contato.getPessoa() != null ){
            System.out.println(contato.getPessoa().getNome());
        }

        if (contato.getEndereco().getCidade() != null) {
            System.out.print(contato.getEndereco().getNomeRua() + ",");
            System.out.println(contato.getEndereco().getCidade());
        }
        if(contato.getTelefone().getTipo() != null && contato.getTelefone().getDdd() != null && contato.getTelefone().getNumero() != null){
            System.out.print( "("+contato.getTelefone().getTipo()+") " );
            System.out.print(contato.getTelefone().getDdd());
            System.out.println(contato.getTelefone().getNumero());
        }
    }
}
