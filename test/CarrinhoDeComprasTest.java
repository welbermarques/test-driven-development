import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Before;
import org.junit.Test;

import modelo.CarrinhoDeCompras;
import modelo.Item;

public class CarrinhoDeComprasTest {

	private CarrinhoDeCompras carrinho;
	
	@Before
	public void inicializa() {
		this.carrinho = new CarrinhoDeCompras();
	}
	
	@Test
	public void deveAdicionarItens() {
		// garante que o carrinho está vazio
		assertEquals(0, carrinho.getItens().size());
		
		Item item = new Item("Geladeira", 1, 900.0);
		carrinho.adiciona(item);
		
		assertEquals(1, carrinho.getItens().size());
		assertEquals(item, carrinho.getItens().get(0));
	}
	
	@Test
	public void deveRetornarZeroSeCarrinhoVazio() {
		assertEquals(0.0, carrinho.maiorValor(), 0.00001);
	}
	
	@Test
	public void deveRetornarValorDoItemSeCarrinhoCom1Elemento() {
		carrinho.adiciona(new Item("Geladeira", 1, 900.0));
		
		assertEquals(900.0,  carrinho.maiorValor(), 0.00001);
	}
	
	@Test
	public void deveRetornarMaiorValorSeCarrinhoContemMuitosElementos() {
		carrinho.adiciona(new Item("Geladeira", 1, 900.0));
		carrinho.adiciona(new Item("Fogão", 1, 1500.0));
		carrinho.adiciona(new Item("Máquina de Lavar", 1, 750.0));
		
		assertEquals(1500, carrinho.maiorValor(), 0.0001);
	}
	
}
