package contabancaria;
public class AppContaBancaria1 {
    public static void main(String[] args) {
        ContaBancaria contaBancaria = new ContaBancaria();

        contaBancaria.cadastrarConta(120, "0001", "98892173-1", "Especial", 2000);
        System.out.println("id conta: " + contaBancaria.idConta);
        System.out.println("Agencia conta: " + contaBancaria.agencia);
        System.out.println("Numero da conta: " + contaBancaria.numeroConta);
        System.out.println("Tipo conta: " + contaBancaria.tipo);
        System.out.println("Limite conta: " + contaBancaria.limiteCredito);

        System.out.println(" ");

        contaBancaria.registraDeposito(1000);
        System.out.println("Deposito efetuado,Saldo atual: " + contaBancaria.saldo);
        contaBancaria.registraDeposito(1000);
        System.out.println("Deposito efetuado,Saldo atual: " + contaBancaria.saldo);

        System.out.println(" ");

        contaBancaria.registraSaque(1000);
        System.out.println("Saque: Saldo atual: " + contaBancaria.saldo);
        contaBancaria.registraSaque(3000);
        System.out.println("Saque: Saldo atual: " + contaBancaria.saldo);

        System.out.println(" ");

    }
}
