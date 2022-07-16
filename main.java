package Teste;

public class main {
	public static void main(String args[]) {
	Pessoa pessoa1=new Medico("Carlos Souza","05168863809",33,"16/03/1989","2345-0","gastroenteorologista");
	Pessoa pessoa2=new Programador("Douglas Baldon","23452525252",22,"31/11/1999","12314-X","Delphi");
	Pessoa pessoa3=new Professor("Yasmin Riemer","2524232324",20,"22/07/1999","66789-X","Informatica");
	pessoa1.Nascer();
	pessoa2.Nascer();
	pessoa3.Nascer();
	System.out.println(pessoa1);
	System.out.println(pessoa2);
	System.out.println(pessoa3);
	pessoa1.realizarTrabalho("gastroenteorologista");
	pessoa2.realizarTrabalho("Delphi");
	pessoa3.realizarTrabalho("Informatica");
	
	
}
	
}
