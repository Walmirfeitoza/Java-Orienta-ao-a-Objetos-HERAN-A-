package Herança;

public class Professor extends Pessoa {
private String expecialidade;
private double salario;
public String getExpecialidade() {
	return expecialidade;
}
public void setExpecialidade(String expecialidade) {
	this.expecialidade = expecialidade;
}
public double getSalario() {
	return salario;
}
public void setSalario(double salario) {
	this.salario = salario;
}
public void receberAumento(int aumento) {
	this.salario += aumento;
}

}
