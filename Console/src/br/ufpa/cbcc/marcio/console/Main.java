package br.ufpa.cbcc.marcio.console;

public class Main{
  public static void main(String args[]){
  
	  Psp psp = new Psp();
	  Xbox xbox = new Xbox();
	  psp.logar("marcio", "12345");
	  psp.alterarSenha("123");
	  psp.logar("marcio", "12345");
	  psp.logar("marcio", "123");
	  psp.deslogar();
  }
}
