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
	public boolean alterarSenha();
	public boolean desconectar();
	
}
