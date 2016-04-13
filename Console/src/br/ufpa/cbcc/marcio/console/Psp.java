package br.ufpa.cbcc.marcio.console;

public class Psp {
  bool wifiOn = false;
  @Override
	public boolean logar(String usuario, String senha) {
		if ((usuario=="Marcio") && (senha=="123456") && wifiOn)
			return true;
		return false;
	}

}
