package Teste;

public class Professor extends Pessoa {
	private String registroDocente;
	private String materia;
	
	public Professor(String nome,String cpf,int idade,String dataDeNascimento,String registroDocente,String materia) {
		super(nome,cpf,idade,dataDeNascimento);
		this.registroDocente=registroDocente;
		this.materia=materia;
	}

	
	public void realizarTrabalho(String materia) {
		if(this.ativo==true && this.materia==materia) {
			System.out.println("O professor "+this.nome+" esta apto a dar a aula de "+this.materia );
		}
		
	}



	public String getRegistroDocente() {
		return registroDocente;
	}



	public void setRegistroDocente(String registroDocente) {
		this.registroDocente = registroDocente;
	}



	public String getMateria() {
		return materia;
	}



	public void setMateria(String materia) {
		this.materia = materia;
	}



	@Override
	public String toString() {
		return super.toString()+"Professor [registroDocente=" + registroDocente + ", materia=" + materia + "]";
	}
	
	

	
}
