package br.ufpa.cbcc.marcio.console;

public class Xbox extends Console implements Autenticavel{
	boolean usuarioLogado;
	String senhaDeAcesso;
	String nomeDeUsuario;
	boolean ligadoNaTomada;
	
	
	public Xbox(){
		super("Xbox");
		System.out.println("Xbox instanciado!");
	}
	
	public String getNomeDeUsuario() {
		return nomeDeUsuario;
	}
	public void setNomeDeUsuario(String nomeDeUsuario) {
		this.nomeDeUsuario = nomeDeUsuario;
	}
	public boolean isLigadoNaTomada() {
		return ligadoNaTomada;
	}
	public void setLigadoNaTomada(boolean ligadoNaTomada) {
		this.ligadoNaTomada = ligadoNaTomada;
	}

	
	@Override
	public boolean logar(String usuario, String senha) {
		try {
			if ((usuario==nomeDeUsuario) && (senha==senhaDeAcesso))
				usuarioLogado=true;
		} catch (Exception e) {
			return false;
		}
		return usuarioLogado;
	}
	@Override
	public boolean alterarSenha(String senha) {
		try {
			senhaDeAcesso=senha;
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}
	public boolean deslogar(){
		try {
			usuarioLogado=false;
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
		
		
	}
	

}
