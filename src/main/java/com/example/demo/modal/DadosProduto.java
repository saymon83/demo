package com.example.demo.modal;

import java.math.BigDecimal;

import javax.persistence.Entity;

//classe que ira representar os valores de cada venda

public class DadosProduto {
	
	private String descricao;
	private int qtd;
	private boolean importado;
	private boolean impostoBasico;
	private BigDecimal valorProduto;

	public DadosProduto() {
		// TODO Auto-generated constructor stub
		
		
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getQtd() {
		return qtd;
	}

	public void setQtd(int qtd) {
		this.qtd = qtd;
	}

	public boolean isImportado() {
		return importado;
	}

	public void setImportado(boolean importado) {
		this.importado = importado;
	}

	public boolean isImpostoBasico() {
		return impostoBasico;
	}

	public void setImpostoBasico(boolean impostoBasico) {
		this.impostoBasico = impostoBasico;
	}

	public BigDecimal getValorProduto() {
		return valorProduto;
	}

	public void setValorProduto(BigDecimal valorProduto) {
		this.valorProduto = valorProduto;
	}

	
}
