import modelo.Funcionario;

public class CalculadoraDeSalario {
	
	public double calculaSalario(Funcionario funcionario) {
		if(funcionario.isDesenvolvedor()) {
			if(funcionario.getSalario() > 3000)
				return funcionario.getSalario() * 0.8;
			return funcionario.getSalario() * 0.9;
		}
		return funcionario.getSalario() * 0.85;
	}
	
}
