package com.example.demo.modal;

import java.math.BigDecimal;
import java.util.ArrayList;

//classe que guarda valores de cada venda
public class RepositorioSimuladoProduto {

	public RepositorioSimuladoProduto() {
		// TODO Auto-generated constructor stub
	}
	
	public ArrayList<DadosProduto> getPrimeiraVenda(){
		ArrayList<DadosProduto> produtos =  new ArrayList<DadosProduto>();
		DadosProduto dadosProdutos1 = new DadosProduto();
		dadosProdutos1.setDescricao("livro");
		dadosProdutos1.setQtd(1);
		dadosProdutos1.setImportado(false);
		dadosProdutos1.setImpostoBasico(false);
		dadosProdutos1.setValorProduto(new BigDecimal(12.49));
		produtos.add(dadosProdutos1);
		
		DadosProduto dadosProdutos2 = new DadosProduto();
		dadosProdutos2.setDescricao("CD de música");
		dadosProdutos2.setQtd(1);
		dadosProdutos2.setImportado(false);
		dadosProdutos2.setImpostoBasico(true);
		dadosProdutos2.setValorProduto(new BigDecimal(14.99));
		produtos.add(dadosProdutos2);
		
		DadosProduto dadosProdutos3 = new DadosProduto();
		dadosProdutos3.setDescricao("barra de chocolate");
		dadosProdutos3.setQtd(1);
		dadosProdutos3.setImportado(false);
		dadosProdutos3.setImpostoBasico(false);
		dadosProdutos3.setValorProduto(new BigDecimal(0.85));
		produtos.add(dadosProdutos3);
		
		return produtos;
		
	}
	
	public ArrayList<DadosProduto> getSegundaVenda(){
		ArrayList<DadosProduto> produtos =  new ArrayList<DadosProduto>();
		DadosProduto dadosProdutos1 = new DadosProduto();
		dadosProdutos1.setDescricao("caixa de chocolates importada");
		dadosProdutos1.setQtd(1);
		dadosProdutos1.setImportado(true);
		dadosProdutos1.setImpostoBasico(false);
		dadosProdutos1.setValorProduto(new BigDecimal(10.00));
		produtos.add(dadosProdutos1);
		
		DadosProduto dadosProdutos2 = new DadosProduto();
		dadosProdutos2.setDescricao("frasco de perfume importado ");
		dadosProdutos2.setQtd(1);
		dadosProdutos2.setImportado(true);
		dadosProdutos2.setImpostoBasico(true);
		dadosProdutos2.setValorProduto(new BigDecimal(47.50));
		produtos.add(dadosProdutos2);
		
		
		return produtos;
		
	}
	
	public ArrayList<DadosProduto> getTerceiraVenda(){
		ArrayList<DadosProduto> produtos =  new ArrayList<DadosProduto>();
		DadosProduto dadosProdutos1 = new DadosProduto();
		dadosProdutos1.setDescricao("frasco de perfume importado");
		dadosProdutos1.setQtd(1);
		dadosProdutos1.setImportado(true);
		dadosProdutos1.setImpostoBasico(true);
		dadosProdutos1.setValorProduto(new BigDecimal(27.99));
		produtos.add(dadosProdutos1);
		
		DadosProduto dadosProdutos2 = new DadosProduto();
		dadosProdutos2.setDescricao("frasco de perfume");
		dadosProdutos2.setQtd(1);
		dadosProdutos2.setImportado(false);	
		dadosProdutos2.setImpostoBasico(true);
		dadosProdutos2.setValorProduto(new BigDecimal(18.99));
		produtos.add(dadosProdutos2);
		
		DadosProduto dadosProdutos3 = new DadosProduto();
		dadosProdutos3.setDescricao("pacote de comprimidos");
		dadosProdutos3.setQtd(1);
		dadosProdutos3.setImportado(false);
		dadosProdutos3.setImpostoBasico(false);
		dadosProdutos3.setValorProduto(new BigDecimal(9.75));
		produtos.add(dadosProdutos3);
		
		DadosProduto dadosProdutos4 = new DadosProduto();
		dadosProdutos4.setDescricao("caixa de chocolates importada");
		dadosProdutos4.setQtd(1);
		dadosProdutos4.setImportado(true);
		dadosProdutos4.setImpostoBasico(false);
		dadosProdutos4.setValorProduto(new BigDecimal(11.25));
		produtos.add(dadosProdutos4);
		
		return produtos;
		
	}
	
	

}
