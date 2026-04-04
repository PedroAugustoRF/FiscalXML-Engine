package application;

import java.io.File; 
import java.util.Scanner;

import entities.NotaFiscal;
import util.LeitorNFe;

public class AppNFe {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o caminho do arquivo xml da NFe a ser lido: ");
		File caminho = new File(sc.nextLine());
		
		NotaFiscal nfe = LeitorNFe.lerNFe(caminho);
		System.out.println(nfe);
		
		sc.close();
	}
}
// C:\Users\pedro\Downloads\NFe4.xml