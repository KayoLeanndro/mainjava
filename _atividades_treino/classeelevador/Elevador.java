package classeelevador;

public class Elevador {
	private int codigo;
	private int pessoasTransportadas;
	private int limitePessoas;
	private String status;

	public Elevador(int codigo) {
		this.codigo = codigo;
		this.limitePessoas = 8;
		this.status = "Em operação";
	}

	void registraEntrada(int qtdePessoas) {
		this.pessoasTransportadas += qtdePessoas;
		if (this.pessoasTransportadas > this.limitePessoas) {
			this.status = "Bloqueado";
		}
	}

	void registraSaida(int qtdePessoas) {
		this.pessoasTransportadas -= qtdePessoas;
		if (this.pessoasTransportadas <= this.limitePessoas) {
			this.status = "Em operação";
		}
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getCodigo() {
		return this.codigo;
	}

	public void setPessoasTransportadas(int pessoas) {
		this.pessoasTransportadas = pessoas;
	}

	public int getPessoasTransportadas() {
		return this.pessoasTransportadas;
	}

	public void setLimitePessoas(int limitePessoas) {
		this.limitePessoas = limitePessoas;
	}

	public int getLimitePessoas() {
		return limitePessoas;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getStatus() {
		return status;
	}
}
