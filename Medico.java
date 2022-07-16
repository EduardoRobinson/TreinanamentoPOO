package Teste;

public class Medico extends Pessoa {
	private String CRM;
	private String especializacao;
	
	public Medico(String nome,String cpf,int idade,String dataDeNascimento,String CRM,String especializacao) {
		super(nome,cpf,idade,dataDeNascimento);
		this.CRM=CRM;
		this.especializacao=especializacao;
		
	}

	public void realizarTrabalho(String especializacao) {
		if(this.ativo==true && this.especializacao==especializacao) {
			System.out.println("Doutor "+this.nome+" esta realizando um consulta de "+this.especializacao);
		}
	}

	public String getCRM() {
		return CRM;
	}

	public void setCRM(String cRM) {
		CRM = cRM;
	}

	public String getEspecializacao() {
		return especializacao;
	}

	public void setEspecializacao(String especializacao) {
		this.especializacao = especializacao;
	}
	
	@Override
	public String toString() {
		return super.toString()+" Medico [CRM=" + CRM + ", especializacao=" + especializacao + "]";
	}

	
	
	

}
