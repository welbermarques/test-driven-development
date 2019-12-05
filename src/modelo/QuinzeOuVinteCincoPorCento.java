package modelo;
public class QuinzeOuVinteCincoPorCento implements RegraDeCalculo{

	@Override
	public double calcula(Funcionario funcionario) {
		if(funcionario.getSalario() < 2500) {
			return funcionario.getSalario() * 0.85;
		}
		return funcionario.getSalario() * 0.75;
	}

}
