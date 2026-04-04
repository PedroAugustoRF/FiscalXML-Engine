package entities;

public class Produto {
	private Integer codigo;
	private String produto;
	private Double preco;
	private Double qtd;
	
	public Produto(Integer codigo, String produto, Double preco, Double qtd) {
		this.codigo = codigo;
		this.produto = produto;
		this.preco = preco;
		this.qtd = qtd;
	}
	public Integer getCodigo() {
		return codigo;
	}

	public String getProduto() {
		return produto;
	}

	public Double getPreco() {
		return preco;
	}

	public Double getQtd() {
		return qtd;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		sb.append("\n-------------------------");
		sb.append("\nCódigo produto: " + codigo);
		sb.append("\nProduto: " + produto);
		sb.append("\nPreço: " + String.format("%.2f", preco));
		sb.append("\nQuantidade: " + String.format("%.2f", qtd));
		sb.append("\n-------------------------");
		
		return sb.toString();
	}
}