package caneta;

public class AppCaneta {
    public static void main(String[] args) {
        Caneta caneta1 = new Caneta();

        System.out.println(caneta1.getModelo());
        System.out.println(caneta1.getPonta());
        System.out.println(caneta1.getTampada());

        Caneta caneta2 = new Caneta();
        caneta2.setModelo("FaberCastel");
        caneta2.setPonta(0.9f);
        caneta2.setTampada(false);
        System.out.println(caneta2.getModelo());
        System.out.println(caneta2.getPonta());
        System.out.println(caneta2.getTampada());
        
    }
}
