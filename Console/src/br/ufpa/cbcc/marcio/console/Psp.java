package br.ufpa.cbcc.marcio.console;

public class Psp extends PlayStation {

private boolean wifiOn = false;
private int densidadeDePixels;
private int nivelDebateria=50; 
	
public Psp(){
	super("Psp");
	System.out.println("Psp instanciado");
}
public Psp(Psp psp){
	super((PlayStation)psp);
	wifiOn=psp.wifiOn;
	densidadeDePixels=psp.densidadeDePixels;
	nivelDebateria=psp.nivelDebateria;
	System.out.println("Psp instanciado como copia");
}

	@Override
	public boolean logar(String usuario, String senha) {
		try {
			if ((usuario==nomeDeUsuario) && (senha==senhaDeAcesso) && nivelDebateria>0)
				{
				usuarioLogado=true;
				System.out.println("Usuario logado com sucesso!");
				}
			else
				System.out.println("Senha incorreta - Não logado!");
		} catch (Exception e) {
			return false;
		}
		return usuarioLogado;
	}
	@Override
	public boolean alterarSenha(String senha) {
		try {
			senhaDeAcesso=senha;
			System.out.println("Senha alterada com sucesso!");
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}
	public boolean deslogar(){
		try {
			usuarioLogado=false;
			System.out.println("Usuario deslogado com sucesso!");
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}
	
	public boolean isWifiOn() {
		return wifiOn;
	}
	public void setWifiOn(boolean wifiOn) {
		this.wifiOn = wifiOn;
	}
	public int getDensidadeDePixels() {
		return densidadeDePixels;
	}
	public void setDensidadeDePixels(int densidadeDePixels) {
		this.densidadeDePixels = densidadeDePixels;
	}
	public int getNivelDebateria() {
		return nivelDebateria;
	}
	public void setNivelDebateria(int nivelDebateria) {
		this.nivelDebateria = nivelDebateria;
	}
	public void printNivelDeBateria() {
		System.out.println("Nivel de Bateria: "+nivelDebateria);
	}
	@Override
	public String toString() {
		return "Psp [wifiOn=" + wifiOn + ", densidadeDePixels=" + densidadeDePixels + ", nivelDebateria="
				+ nivelDebateria + "]";
	}
	

}
