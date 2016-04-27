package br.ufpa.cbcc.marcio.console;

public class PlayStation extends Console implements Autenticavel {

	protected boolean usuarioLogado=false;
	protected String senhaDeAcesso="12345";
	protected String nomeDeUsuario="marcio";
	private boolean ligadoNaTomada;
	private String subTipo;
	protected boolean conectadoAoServidorSony=false;
	
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
			System.out.println("Usuario logado com sucesso!!");
		} catch (Exception e) {
			System.out.println("Nao logado, Usuario ou senha incorreta!");
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
	
	public void ligar(){
		if (!ligadoNaTomada && !onoff){
			
			System.out.println("PlayStation foi ligado!");
		}
		else if (!ligadoNaTomada && onoff)
			System.out.println("PlayStation já esta ligado!");
		else
			System.out.println("Não foi possivel ligar!");
	}

	@Override
	public void atualizarFirmware(String novaVersao) {
		// TODO Auto-generated method stub
		if (conectadoAoServidorSony)
		versaoFirmware=novaVersao;
	}
public void conectarAoServidorSony(){
	conectadoAoServidorSony=true;
}
}
