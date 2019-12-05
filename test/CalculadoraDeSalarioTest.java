import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Before;
import org.junit.Test;

import modelo.CalculadoraDeSalario;

public class CalculadoraDeSalarioTest {

	private CalculadoraDeSalario calculadora;
	private FuncionarioBuilder funcionario;
	
	@Before
	public void inicializa() {
		calculadora = new CalculadoraDeSalario();
		funcionario = new FuncionarioBuilder();
	}
	
	@Test
	public void deveCalcularSalarioParaDesenvolvedoresComSalarioAbaixoDoLimite() {		
		double salario = calculadora.calculaSalario(funcionario.desenvolvedorCom(1500.0));
		
		assertEquals(1500 * 0.9, salario, 0.00001);
	}
	
	@Test
	public void deveCalcularSalarioParaDesenvolvedoresComSalarioAcimaDoLimite() {
		double salario = calculadora.calculaSalario(funcionario.desenvolvedorCom(4000.0));
		
		assertEquals(4000.0 * 0.8, salario, 0.00001);
	}
	
	@Test
	public void deveCalcularSalarioParaDBAsComSalarioAbaixoDoLimite() {
		double salario = calculadora.calculaSalario(funcionario.dbaCom(1500.0));
		
		assertEquals(1500.0 * 0.85, salario, 0.00001);
	}
	
	@Test
	public void deveCalcularSalarioParaDBAsComSalarioAcimaDoLimite() {
		double salario = calculadora.calculaSalario(funcionario.dbaCom(4500.0));
		
		assertEquals(4500.0 * 0.75, salario, 0.00001);
	}
}
