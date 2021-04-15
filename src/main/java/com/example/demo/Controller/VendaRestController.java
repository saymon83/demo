package com.example.demo.Controller;

import java.math.BigDecimal;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.control.ExecuteCalculos;
import com.example.demo.modal.DadosProduto;
import com.example.demo.view.RepositorioSimuladoProduto;

@RestController
@RequestMapping(value = "/")
public class VendaRestController {

	@GetMapping("/primeira-venda")
	private ResponseEntity<Object> primeira(HttpServletRequest request) 
			throws Exception {
	    RepositorioSimuladoProduto valorSimulado =  new RepositorioSimuladoProduto();
		ExecuteCalculos calculo = new ExecuteCalculos();
		ArrayList<DadosProduto> produtos =  new ArrayList<DadosProduto>();
		String descrcao = "";
		int qtd = 0;
		String textoImpresso ="";
		String texto[] = new String[produtos.size()];
		BigDecimal impostoBasico= BigDecimal.ZERO;
		BigDecimal somaImposto = BigDecimal.ZERO;
		BigDecimal valorTotal = BigDecimal.ZERO;
		
		produtos = valorSimulado.getPrimeiraVenda();
		for(int i = 0; i < produtos.size(); i++) {
			descrcao = produtos.get(i).getDescricao();
			qtd = produtos.get(i).getQtd();
			impostoBasico = calculo.getSomaImposto(produtos.get(i).getValorProduto(), produtos.get(i).isImpostoBasico(), produtos.get(i).isImportado());
			valorTotal = valorTotal.add(impostoBasico).add(produtos.get(i).getValorProduto().multiply(new BigDecimal(qtd)));
			somaImposto = somaImposto.add(impostoBasico);
			//o valor é multiplicado pela qtd, porém como a qtd é sempre 1 não será alterado o valor
			textoImpresso += (qtd+" "+descrcao + ": " + calculo.arredondamentoValor(produtos.get(i).getValorProduto().add(impostoBasico).multiply(new BigDecimal(qtd)))) + "<br>";			
		}
		textoImpresso += "Impostos sobre vendas: " + calculo.arredondamentoValor(somaImposto)+"<br>";
		textoImpresso += "Total: "+ calculo.arredondamentoValor(valorTotal)+"<br>";
		return ResponseEntity.ok().body(textoImpresso);
	}
	
	@GetMapping("/segunda-venda")
	private ResponseEntity<Object> segunda(HttpServletRequest request) 
			throws Exception {
	    RepositorioSimuladoProduto valorSimulado =  new RepositorioSimuladoProduto();
		ExecuteCalculos calculo = new ExecuteCalculos();
		ArrayList<DadosProduto> produtos =  new ArrayList<DadosProduto>();
		String descrcao = "";
		int qtd = 0;
		String textoImpresso ="";
		String texto[] = new String[produtos.size()];
		BigDecimal impostoBasico= BigDecimal.ZERO;
		BigDecimal somaImposto = BigDecimal.ZERO;
		BigDecimal valorTotal = BigDecimal.ZERO;
		
		produtos = valorSimulado.getSegundaVenda();
		for(int i = 0; i < produtos.size(); i++) {
			descrcao = produtos.get(i).getDescricao();
			qtd = produtos.get(i).getQtd();
			impostoBasico = calculo.getSomaImposto(produtos.get(i).getValorProduto(), produtos.get(i).isImpostoBasico(), produtos.get(i).isImportado());
			valorTotal = valorTotal.add(impostoBasico).add(produtos.get(i).getValorProduto().multiply(new BigDecimal(qtd)));
			somaImposto = somaImposto.add(impostoBasico);
			//o valor é multiplicado pela qtd, porém como a qtd é sempre 1 não será alterado o valor
			textoImpresso += (qtd+" "+descrcao + ": " + calculo.arredondamentoValor(produtos.get(i).getValorProduto().add(impostoBasico).multiply(new BigDecimal(qtd)))) + "<br>";			
		}
		textoImpresso += "Impostos sobre vendas: " + calculo.arredondamentoValor(somaImposto)+"<br>";
		textoImpresso += "Total: "+ calculo.arredondamentoValor(valorTotal)+"<br>";
		return ResponseEntity.ok().body(textoImpresso);
	}
	
	
	@GetMapping("/terceira-venda")
	private ResponseEntity<Object> terceira(HttpServletRequest request) 
			throws Exception {
	    RepositorioSimuladoProduto valorSimulado =  new RepositorioSimuladoProduto();
		ExecuteCalculos calculo = new ExecuteCalculos();
		ArrayList<DadosProduto> produtos =  new ArrayList<DadosProduto>();
		String descrcao = "";
		int qtd = 0;
		String textoImpresso ="";
		String texto[] = new String[produtos.size()];
		BigDecimal impostoBasico= BigDecimal.ZERO;
		BigDecimal somaImposto = BigDecimal.ZERO;
		BigDecimal valorTotal = BigDecimal.ZERO;
		
		produtos = valorSimulado.getTerceiraVenda();
		for(int i = 0; i < produtos.size(); i++) {
			descrcao = produtos.get(i).getDescricao();
			qtd = produtos.get(i).getQtd();
			impostoBasico = calculo.getSomaImposto(produtos.get(i).getValorProduto(), produtos.get(i).isImpostoBasico(), produtos.get(i).isImportado());
			valorTotal = valorTotal.add(impostoBasico).add(produtos.get(i).getValorProduto().multiply(new BigDecimal(qtd)));
			somaImposto = somaImposto.add(impostoBasico);
			//o valor é multiplicado pela qtd, porém como a qtd é sempre 1 não será alterado o valor
			textoImpresso += (qtd+" "+descrcao + ": " + calculo.arredondamentoValor(produtos.get(i).getValorProduto().add(impostoBasico).multiply(new BigDecimal(qtd)))) + "<br>";			
		}
		textoImpresso += "Impostos sobre vendas: " + calculo.arredondamentoValor(somaImposto)+"<br>";
		textoImpresso += "Total: "+ calculo.arredondamentoValor(valorTotal)+"<br>";
		return ResponseEntity.ok().body(textoImpresso);
	}

}
