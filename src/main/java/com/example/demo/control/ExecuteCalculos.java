package com.example.demo.control;

import java.math.BigDecimal;
import java.math.RoundingMode;

// classe responsavel de realizar os calculos quando solicitado
public class ExecuteCalculos {
	BigDecimal impostoAplicado = BigDecimal.ZERO;
	
	public ExecuteCalculos() {
		// TODO Auto-generated constructor stub
	}

	
	public BigDecimal getSomaImposto(BigDecimal valor, boolean impostoBasico, boolean impostoImportado) {
		BigDecimal impostoBse = BigDecimal.ZERO;
		BigDecimal impostoImportacao = BigDecimal.ZERO;
		BigDecimal impostoTotal = BigDecimal.ZERO;

		if (valor != null && valor.compareTo(BigDecimal.ZERO) > 0 && impostoBasico) {
			impostoBse = (valor.multiply(BigDecimal.TEN).divide(new BigDecimal("100")));
		}
		//o calculo do imposto importação é arrendondado para 0,05 mais próximo
		if (valor != null && valor.compareTo(BigDecimal.ZERO) > 0 && impostoImportado) {
			impostoImportacao = arredondamentoImpostoImportacao(
					(valor.multiply(new BigDecimal("5")).divide(new BigDecimal("100"))));

		}

		impostoTotal = impostoBse.add((impostoImportacao));
		return impostoTotal;

	}
	
	
	public BigDecimal arredondamentoValor(BigDecimal valor) {
		return valor.setScale(2, RoundingMode.HALF_UP);
	}
	
	public BigDecimal arredondamentoImpostoImportacao(BigDecimal valor) {
		return valor.setScale(1, RoundingMode.HALF_UP).setScale(2, RoundingMode.HALF_EVEN);
	}
}
