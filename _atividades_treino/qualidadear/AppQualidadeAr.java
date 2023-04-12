package qualidadear;

public class AppQualidadeAr {
    public static void main(String[] args) {   
        QualidadeAr pe = new QualidadeAr(1, 100);
        System.out.println("Pernambuco:"+ pe.getFaixa());
        System.out.println("Qualidade: "+ pe.definirClassificacao());

        QualidadeAr bh = new QualidadeAr(2, 60);
        System.out.println("\nBelo Horizonte:"+ bh.getFaixa());
        System.out.println("Qualidade: "+ bh.definirClassificacao());

        QualidadeAr rj = new QualidadeAr(3, 40);
        System.out.println("\nRio de Janeiro:"+ rj.getFaixa());
        System.out.println("Qualidade: "+ rj.definirClassificacao());

        QualidadeAr ba = new QualidadeAr(4, 25);
        System.out.println("\nBahia:"+ ba.getFaixa());
        System.out.println("Qualidade: "+ ba.definirClassificacao());

        QualidadeAr sp = new QualidadeAr(5, 15);
        System.out.println("\n São paulo:"+ sp.getFaixa());
        System.out.println("Qualidade: "+ sp.definirClassificacao());

        
    }
    
}
