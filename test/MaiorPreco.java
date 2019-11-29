import java.util.Comparator;

import modelo.CarrinhoDeCompras;
import modelo.Item;

public class MaiorPreco {
	public double encontra(CarrinhoDeCompras carrinho) {
		if(carrinho.getItens().isEmpty()) return 0;
		
		return carrinho.getItens().stream()
									.max(Comparator.comparing(Item::getValorTotal))
									.get().getValorTotal();
	}
}
