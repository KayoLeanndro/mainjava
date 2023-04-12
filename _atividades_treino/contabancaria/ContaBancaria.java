package contabancaria;

public class ContaBancaria {
	int idConta;
	String agencia;
	String numeroConta;
	String tipo;
	double saldo;
	double limiteCredito;


	public void cadastrarConta(int id, String ag, String nrConta, String tipo,double limiteCredito){
	    this.idConta = id;
	    this.agencia = ag;
	    this.numeroConta = nrConta;
	    if( tipo.equalsIgnoreCase("E")){
	    	this.limiteCredito = limiteCredito;
	    }
	    else {
	    	this.limiteCredito = 0;	
	    }
	    
	   
	}
	void registraDeposito(double valor){
		   this.saldo = this.saldo + valor;
	   }
	
	boolean registraSaque(double valor){
	  if(valor <= this.saldo + this.limiteCredito) {
		  this.saldo -= valor;
		  return true;
	  }
	  return false;
}
}
