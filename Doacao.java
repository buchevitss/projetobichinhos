package Generation;

import java.util.Scanner;

public class Doacao {
	int y;
	String [] nDoador = new String [y];
	String dado;
	private String tf;
	private int vDoado;
	
      public Doacao(String tf,int vDoado)
       {
	     this.tf = tf;
	     this.vDoado = vDoado;
       }
      
      Scanner scan = new Scanner(System.in);
      	 
      public void preecher () {
    	
    	  if ( clicado1 ) {
    		y++;
    		System.out.println("\nPara doar ração vamos fazer um simples cadastro!!\nDigite seu nome completo:");
    		nDoador [y] = scan.nextLine();
    	  }
      }
      public void printD()
      {
    	    
    	    System.out.println("\nAgora informe seu telefone: ");
    	    tf = scan.nextLine();
    	    System.out.println("\nQual valor voce deseja doar: R$");
    	    vDoado = scan.nextInt();
    	    System.out.println("\nNome doador: "+nDoador+"\nTelefone: "+tf+"\nValor doado: "+vDoado);
      }

	public String getnDoador() {
		return nDoador;
	}

	public void setnDoador(String nDoador) {
		this.nDoador = nDoador;
	}

	public String getTf() {
		return tf;
	}

	public void setTf(String tf) {
		this.tf = tf;
	}

	public int getvDoado() {
		return vDoado;
	}

	public void setvDoado(int vDoado) {
		this.vDoado = vDoado;
	}

      
}
