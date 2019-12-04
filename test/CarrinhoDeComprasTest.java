import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Before;
import org.junit.Test;

import modelo.CarrinhoDeCompras;
import modelo.Item;

public class CarrinhoDeComprasTest {

	public CarrinhoDeComprasBuilder carrinho;
	
	@Before
	public void inicializa() {
		carrinho = new CarrinhoDeComprasBuilder();
	}
	
	@Test
	public void deveAdicionarItens() {
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		
		// garante que o carrinho está vazio
		assertEquals(0, carrinho.getItens().size());
		
		Item item = new Item("Geladeira", 1, 900.0);
		carrinho.adiciona(item);
		assertEquals(1, carrinho.getItens().size());
		assertEquals(item, carrinho.getItens().get(0));
	}
	
	@Test
	public void deveRetornarZeroSeCarrinhoVazio() {
		assertEquals(0.0, carrinho.cria().maiorValor(), 0.00001);
	}
	
	@Test
	public void deveRetornarValorDoItemSeCarrinhoCom1Elemento() {
		assertEquals(900.0,  carrinho.comItens(900.0).cria().maiorValor(), 0.00001);
	}
	
	@Test
	public void deveRetornarMaiorValorSeCarrinhoContemMuitosElementos() {
		assertEquals(1500, carrinho.comItens(900.0, 1500.0, 750.0).cria().maiorValor(), 0.0001);
	}
	
}
