package faculdade;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
public class TesteAluno {
    public static void main(String[] args)throws ParseException {
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
		Date data = formato.parse("05/01/2007");
        Faculdade faculdade = new Faculdade(1, "UNIT");
        Aluno aluno = new Aluno(1, "Kayo", "(81)986228400", data, faculdade);

        System.out.println("Aluno: "+ aluno.getNome());
        System.out.println("Faculdade: "+ aluno.getFaculdade().getNome());
        System.out.println("Data de nascimento: "+ aluno.getDataNascimento());

		
		
		
		
	}
}
