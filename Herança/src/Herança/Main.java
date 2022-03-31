package Herança;

public class Main {

	public static void main(String[] args) {
        
            Aluno a = new Aluno();
            
            a.setNome("walmir");
            System.out.print(a.getNome());
            
            
            Professor b = new Professor();
            b.setNome("hugor");
            b.receberAumento(300);
            
            System.out.print(b.getNome());
            System.out.print(b.getSalario());
            
            Bolsista au = new Bolsista();
            System.out.print("");
            au.setNome("ricardo");
            au.renovarBolsa();
            
            System.out.print(au.getNome() + au.getBolsa());
            
            
            
	}

}
