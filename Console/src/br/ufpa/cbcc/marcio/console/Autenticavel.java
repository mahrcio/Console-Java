/**
 * 
 */
package br.ufpa.cbcc.marcio.console;

/**
 * @author FACOMP
 *
 */
public interface Autenticavel {

	public boolean logar(String usuario, String senha);
	boolean alterarSenha(String senha);
	public boolean deslogar();
	
	
}
