package contabancaria;
public class AppContabancaria2 {
     static ContaBancaria contaBancaria = new ContaBancaria();

    public static void main(String[] args) {

        contaBancaria.cadastrarConta(9921, "0001", "9812891-1", "Normal", 0);
        System.out.println("id conta: " + contaBancaria.idConta);
        System.out.println("Agencia conta: " + contaBancaria.agencia);
        System.out.println("Numero da conta: " + contaBancaria.numeroConta);
        System.out.println("Tipo conta: " + contaBancaria.tipo);
        System.out.println("Limite conta: " + contaBancaria.limiteCredito);

        System.out.println(" ");

        contaBancaria.registraDeposito(1000);
        System.out.println("Deposito efetuado,Saldo atual: " + contaBancaria.saldo);
        contaBancaria.registraDeposito(2000);
        System.out.println("Deposito efetuado,Saldo atual: " + contaBancaria.saldo);

        System.out.println(" ");

        contaBancaria.registraSaque(2000);
        System.out.println("Saque: Saldo atual: " + contaBancaria.saldo);
        contaBancaria.registraSaque(3000);
        System.out.println("Saque: Saldo atual: " + contaBancaria.saldo);
    }
}
