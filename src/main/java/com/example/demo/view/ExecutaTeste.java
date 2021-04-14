package com.example.demo.view;

import java.math.BigDecimal;
import java.util.ArrayList;

import com.example.demo.control.ExecuteCalculos;
import com.example.demo.modal.DadosProduto;

//classe responsavel por simular a tela com os valores de entranda
public class ExecutaTeste {
	static RepositorioSimuladoProduto valorSimulado = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExecuteCalculos calculo = new ExecuteCalculos();
		ArrayList<DadosProduto> produtos =  new ArrayList<DadosProduto>();
		String descrcao = "";
		int qtd = 0;
		BigDecimal impostoBasico= BigDecimal.ZERO;
		BigDecimal somaImposto = BigDecimal.ZERO;
		BigDecimal valorTotal = BigDecimal.ZERO;
		
		if(valorSimulado == null) {
			valorSimulado = new RepositorioSimuladoProduto();
			
		}
		// simula os valores de entrada, podendo ser descomentado a linha que deseja realizar o teste
		
		//produtos = valorSimulado.getPrimeiraVenda();
		
		//produtos = valorSimulado.getSegundaVenda();
		
		produtos = valorSimulado.getTerceiraVenda();
		
		for(int i = 0; i < produtos.size(); i++) {
			descrcao = produtos.get(i).getDescricao();
			qtd = produtos.get(i).getQtd();
			impostoBasico = calculo.getSomaImposto(produtos.get(i).getValorProduto(), produtos.get(i).isImpostoBasico(), produtos.get(i).isImportado());
			valorTotal = valorTotal.add(impostoBasico).add(produtos.get(i).getValorProduto().multiply(new BigDecimal(qtd)));
			somaImposto = somaImposto.add(impostoBasico);
			//o valor é multiplicado pela qtd, porém como a qtd é sempre 1 não será alterado o valor
			System.out.println(qtd+" "+descrcao + ": " + calculo.arredondamentoValor(produtos.get(i).getValorProduto().add(impostoBasico).multiply(new BigDecimal(qtd))));
			
		}
		    System.out.println("Impostos sobre vendas: " + calculo.arredondamentoValor(somaImposto));
		    System.out.println("Total: "+ calculo.arredondamentoValor(valorTotal));
		

	}

}
