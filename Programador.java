package Teste;

public class Programador extends Pessoa {
	private String carteiraDeTrabalho;
	private String area;
	
	public Programador(String nome,String cpf,int idade,String dataDeNascimento,String carteiraDeTrabalho,String area) {
		super(nome,cpf,idade,dataDeNascimento);
		this.carteiraDeTrabalho=carteiraDeTrabalho;
		this.area=area;
		
	}


	public String getCarteiraDeTrabalho() {
		return carteiraDeTrabalho;
	}

	public void setCarteiraDeTrabalho(String carteiraDeTrabalho) {
		this.carteiraDeTrabalho = carteiraDeTrabalho;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}
	
	public void realizarTrabalho(String area) {
		if(this.ativo==true && this.area==area) {
			System.out.println("O programador "+this.nome+" esta apto a fazer o programa de "+this.area);
		}
		
	}
	
	@Override
	public String toString() {
		return super.toString()+" Programador [carteiraDeTrabalho=" + carteiraDeTrabalho + ", area=" + area + "]";
	}


}
