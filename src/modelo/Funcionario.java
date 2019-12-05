package modelo;

public class Funcionario {

	private String nome;
	private double salario;
	private Cargo cargo;

	private Funcionario(String nome, double salario, Cargo cargo) {
		this.nome = nome;
		this.salario = salario;
		this.cargo = cargo;
	}
	
	public static Funcionario de(Cargo cargo, Double salario) {
		return new Funcionario("Funcionario", salario, cargo);
	}
	
	public Funcionario() {
	}

	public String getNome() {
		return nome;
	}

	public double getSalario() {
		return salario;
	}

	public Cargo getCargo() {
		return cargo;
	}
	
	public boolean isDesenvolvedor() {
		return cargo.equals(Cargo.DESENVOLVEDOR);
	}
}
