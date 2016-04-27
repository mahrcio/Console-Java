package br.ufpa.cbcc.marcio.console;

public class PlayStation extends Console implements Autenticavel {

	protected boolean usuarioLogado=false;
	protected String senhaDeAcesso="12345";
	protected String nomeDeUsuario="marcio";
	private boolean ligadoNaTomada;
	private String subTipo;
	
	public PlayStation() {
	super("PlayStation");
	System.out.println("PlayStation instanciado");
	}
	
	public PlayStation(String subTipo){
		super("PlayStation");
		this.subTipo=subTipo;
		System.out.println("PlayStation instanciado com subtipo Psp");
	}
	public PlayStation(PlayStation playstation){
		super((Console)playstation);
		usuarioLogado=playstation.usuarioLogado;
		senhaDeAcesso=playstation.senhaDeAcesso;
		nomeDeUsuario=playstation.nomeDeUsuario;
		ligadoNaTomada=playstation.ligadoNaTomada;
		subTipo=playstation.subTipo;
		System.out.println("PlayStation instanciado como Copia");
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
