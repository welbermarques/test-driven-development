import static modelo.Cargo.DBA;
import static modelo.Cargo.DESENVOLVEDOR;
import static modelo.Funcionario.de;

import modelo.Funcionario;

public class FuncionarioBuilder {
	
	public Funcionario desenvolvedorCom(double salario) {
		return de(DESENVOLVEDOR, salario);
	}
	
	public Funcionario dbaCom(double salario) {
		return de(DBA, salario);
	}	
}
