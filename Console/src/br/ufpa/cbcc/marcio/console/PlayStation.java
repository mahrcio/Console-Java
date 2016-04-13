package br.ufpa.cbcc.marcio.console;

public class PlayStation implements Autenticavel {

	@Override
	public boolean logar(String usuario, String senha) {
		if ((usuario=="Marcio") && (senha=="123456"))
			return true;
		return false;
	}
	@Override
	public boolean alterarSenha() {
		// TODO Auto-generated method stub
		return false;
	}
	public boolean desconectar(){
		
	}
	

}
