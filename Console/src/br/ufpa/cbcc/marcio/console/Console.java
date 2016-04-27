package br.ufpa.cbcc.marcio.console;

public abstract class Console extends Device {
private String marca;
private Data dataDefabricacao;

	public Console(){
		super("Console");
		this.setMarca("Desconhecida");
		setDataDefabricacao(Data.gerarDataAtual());
		System.out.println("Console instanciado com marca: "+getMarca());
	}
	
	public Console(String marca){
		super("Console");
		this.marca=marca;
		setDataDefabricacao(Data.gerarDataAtual());
		System.out.println("Console instanciado com marca: "+getMarca());
	}
	public Console(Console console){
		super((Device)console);
		marca=console.marca;
		dataDefabricacao=console.dataDefabricacao;
		System.out.println("Console instanciado como copia, marca: "+getMarca());
	}
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public Data getDataDefabricacao() {
		return dataDefabricacao;
	}

	public void setDataDefabricacao(Data dataDefabricacao) {
		this.dataDefabricacao = dataDefabricacao;
	}

	public void printDataDefabricacao(){
		try {
			System.out.println("Fabricacao: "+dataDefabricacao.toString());
		} catch (NullPointerException e) {
			System.out.println("Erro!! Não foi possivel exibir a Data de Fabricação");
		}
	}
	
}
