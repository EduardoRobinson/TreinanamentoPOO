package Teste;

public abstract class Pessoa {
	protected String nome;
	protected String cpf;
	protected int idade;
	protected String dataDeNascimento;
	protected boolean ativo;
	
	public Pessoa(String nome,String cpf,int idade,String dataDeNascimento) {
		super();
		this.nome=nome;
		this.cpf=cpf;
		this.idade=idade;
		this.dataDeNascimento=dataDeNascimento;
	}
	
	public void Nascer() {
		this.ativo=true;
	}
	
	public void Morrer() {
		this.ativo=false;
	}
	public abstract void realizarTrabalho(String especializacao);


	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", cpf=" + cpf + ", idade=" + idade + ", dataDeNascimento=" + dataDeNascimento
				+ ", ativo=" + ativo + "]";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getDataDeNascimento() {
		return dataDeNascimento;
	}

	public void setDataDeNascimento(String dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}

	public boolean isAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}
	
	
	
	
}
