package entities;

public class Vendedor {
	private Integer numeroNFe;
	private String nome;
	private String cnpj;
	
	public Vendedor(Integer numeroNFe, String nome, String cnpj) {
		this.numeroNFe = numeroNFe;
		this.nome = nome;
		this.cnpj = cnpj;
	}

	public Integer getNumeroNFe() {
		return numeroNFe;
	}
	
	public String getNome() {
		return nome;
	}

	public String getCnpj() {
		return cnpj;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		sb.append("\n-------------------------");
		sb.append("\nNúmero da Nota Fiscal: " + numeroNFe);
		sb.append("\nVendedor: " + nome);
		sb.append("\nCNPJ: " + cnpj);
		sb.append("\n-------------------------");
		
		return sb.toString();
	}
}