package Herança;

public class Bolsista extends Aluno{
 public boolean getBolsa() {
		return bolsa;
	}

	public void setBolsa(boolean bolsa) {
		this.bolsa = bolsa;
	}

private boolean bolsa = false;
 
 public void renovarBolsa() {
	 System.out.print("renovando bolsa de " + this.getNome());
	 this.bolsa = true;
 }

}
