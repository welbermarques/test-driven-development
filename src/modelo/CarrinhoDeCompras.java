package modelo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CarrinhoDeCompras {
	
	private List<Item> itens;
	
	public CarrinhoDeCompras() {
		this.itens = new ArrayList<Item>();
	}
	
	public void adiciona(Item item) {
		this.itens.add(item);
	}
	
	public List<Item> getItens() {
		return Collections.unmodifiableList(itens);
	}
	
	public double maiorValor() {
		if(getItens().isEmpty()) return 0;
		
		return getItens().stream()
							.max(Comparator.comparing(Item::getValorTotal))
							.get().getValorTotal();
	}

}
