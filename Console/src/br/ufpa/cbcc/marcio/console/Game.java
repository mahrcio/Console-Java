package br.ufpa.cbcc.marcio.console;

public class Game {
private String nome;
	public Game(String nome) {
	setNome(nome);	
	}
	public Game(Game game) {
		nome=game.nome;	
		}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
