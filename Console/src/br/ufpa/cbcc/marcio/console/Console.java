package br.ufpa.cbcc.marcio.console;

public abstract class Console extends Device {
private String marca;

	public Console(){
		super("Console");
		this.setMarca("Desconhecida");
		System.out.println("Console instanciado com marca: "+getMarca());
	}
	
	public Console(String marca){
		super("Console");
		this.marca=marca;
		System.out.println("Console instanciado com marca: "+getMarca());
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

}
