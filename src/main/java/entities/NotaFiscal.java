package entities;

import java.util.List;

public class NotaFiscal {
	private Vendedor vendedor;
	private List<Produto> produtos;

	public NotaFiscal(Vendedor vendedor, List<Produto> produtos) {
		this.vendedor = vendedor;
		this.produtos = produtos;
	}

	public Vendedor getVendedor() {
		return vendedor;
	}

	public List<Produto> getProdutos() {
		return produtos;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();

		sb.append(vendedor).append("\n");
		
		for (Produto produto : produtos) {
			sb.append(produto).append("\n");
		}

		return sb.toString();
	}

}
