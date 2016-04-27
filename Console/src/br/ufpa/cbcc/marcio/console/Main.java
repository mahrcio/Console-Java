package br.ufpa.cbcc.marcio.console;
import javax.swing.JOptionPane;
public class Main{
  public static void main(String args[]){
	 int respostaDialog = JOptionPane.YES_NO_OPTION;
     JOptionPane.showConfirmDialog (null, "Criar PlaySation?","PlayStation",respostaDialog);  
     if(respostaDialog == JOptionPane.YES_OPTION){
	 PlayStation playstation = new PlayStation();
	 }
     JOptionPane.showConfirmDialog (null, "Criar Xbox?","Xbox",respostaDialog);  
     if(respostaDialog == JOptionPane.YES_OPTION){
    	 Xbox xbox = new Xbox();
	 }
     JOptionPane.showConfirmDialog (null, "Criar Psp?","Psp",respostaDialog);  
     if(respostaDialog == JOptionPane.YES_OPTION){
    	 Psp psp = new Psp();
	 }
	       
     PlayStation playStation2 = new PlayStation();
     Xbox xbox360 = new Xbox();
     Psp pspVita = new Psp();

     Console videogames[] = {playStation2, xbox360, pspVita};
     for(int i=0 ; i < videogames.length ; i++){
    	 if(videogames[i] instanceof PlayStation){
    		 System.out.println("Instanceof Videogame: PlayStation");
    	 }
    	 else if(videogames[i] instanceof Xbox){
    		 System.out.println("Instanceof Videogame: Xbox");
    	 }
    	 else if(videogames[i] instanceof Psp){
    		 System.out.println("Instanceof Videogame: Psp");
    	 }
    	  
     }
      pspVita.logar("marcio", "12345");
	  pspVita.alterarSenha("123");
	  pspVita.logar("marcio", "12345");
	  pspVita.logar("marcio", "123");
	  pspVita.deslogar();
	  pspVita.printDataDefabricacao();
	  System.out.println("Info PspVita"+pspVita.toString());
	  
  }
}
