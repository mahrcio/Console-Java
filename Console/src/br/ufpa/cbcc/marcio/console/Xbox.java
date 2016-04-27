package br.ufpa.cbcc.marcio.console;

public class Xbox extends Console implements Autenticavel, SensorDeMovimento{
	protected boolean usuarioLogado;
	protected String senhaDeAcesso;
	protected String nomeDeUsuario;
	private boolean ligadoNaTomada;
	private boolean ligadoSensorDeMovimento=false;
	private boolean onoff=false;
	private boolean conectadoAoServidorMicrosoft=false;
	
	
	public Xbox(){
		super("Xbox");
		System.out.println("Xbox instanciado!");
	}
	public Xbox(Xbox xbox){
		super((Xbox) xbox);
		usuarioLogado=xbox.usuarioLogado;
		senhaDeAcesso=xbox.senhaDeAcesso;
		nomeDeUsuario=xbox.nomeDeUsuario;
		ligadoNaTomada=xbox.ligadoNaTomada;
		ligadoSensorDeMovimento=xbox.ligadoSensorDeMovimento;
		System.out.println("Xbox instanciado como copia!");
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

	@Override
	public void ligarSensor() {
		this.ligadoSensorDeMovimento=true;
		
	}

	@Override
	public void detectarMovimento() {
		if (ligadoSensorDeMovimento){
			System.out.println("Sensor detectando Movimentos");
		}
		
	}
	public void ligar(){
		if (!ligadoNaTomada && !onoff){
			
			System.out.println("Xbox foi ligado!");
		}
		else if (!ligadoNaTomada && onoff)
			System.out.println("Xbox já esta ligado!");
		else
			System.out.println("Não foi possivel ligar!");
	}
	@Override
	public void atualizarFirmware(String novaVersao) {
		// TODO Auto-generated method stub
		if (conectadoAoServidorMicrosoft)
		versaoFirmware=novaVersao;
	}
}
