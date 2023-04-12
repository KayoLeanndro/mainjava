package reservacorte;

import java.util.Scanner;

public class clientes {
    public static void main(String[] args) {
        Barberaria cliente = new Barberaria();
        Scanner sc = new Scanner(System.in);
        cliente.nome = sc.nextLine();
        cliente.hora = sc.nextLine();
        cliente.data = sc.nextLine();
        cliente.tipoCorte = "fade";
        cliente.preco = 25.00;

        cliente.marcar();
        cliente.chegar();
        cliente.dados();
        System.out.println("-----------");
        System.out.println(cliente.nome);
        System.out.println(cliente.hora);
        System.out.println(cliente.data);
        System.out.println(cliente.tipoCorte);
        System.out.println(cliente.preco);
        System.out.println("-----------");
        cliente.cortar();
        cliente.tchau();
    }
}
