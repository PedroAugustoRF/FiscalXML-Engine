package util;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import entities.NotaFiscal;
import entities.Produto;
import entities.Vendedor;

public class LeitorNFe {
	public static NotaFiscal lerNFe(File caminho) {
		Vendedor vendedor = null;
		Produto produto = null;
		List<Produto> lista = new ArrayList<>();
		
		try {
			XmlMapper xmlMapper = new XmlMapper();
			JsonNode node = xmlMapper.readTree(caminho);
			JsonNode detNode = node.path("infNFe").path("det");
			
			int numeroNFe = node.path("infNFe").path("ide").path("nNF").asInt();
			String nome = node.path("infNFe").path("emit").path("xNome").asText();
			String cnpj = node.path("infNFe").path("emit").path("CNPJ").asText();
			
			vendedor = new Vendedor(numeroNFe, nome, cnpj);
			
			if (detNode.isArray()) {
				for (JsonNode det : detNode) {
					int codigo = det.path("prod").path("cProd").asInt();
					String item = det.path("prod").path("xProd").asText();
					double preco = det.path("prod").path("vProd").asDouble();
					double qtd = det.path("prod").path("qCom").asDouble();
					
					produto = new Produto(codigo, item, preco, qtd);
					lista.add(produto);
				}
			}
			else {
				int codigo = detNode.path("prod").path("cProd").asInt();
				String item = detNode.path("prod").path("xProd").asText();
				double preco = detNode.path("prod").path("vProd").asDouble();
				double qtd = detNode.path("prod").path("qCom").asDouble();
				
				produto = new Produto(codigo, item, preco, qtd);
				lista.add(produto);
			}
		} catch (Exception ioe) {
			System.out.println(ioe.getMessage());
		}
		return new NotaFiscal(vendedor, lista);
	}
}
