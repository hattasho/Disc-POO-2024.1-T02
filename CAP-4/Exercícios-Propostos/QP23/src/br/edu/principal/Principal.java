package br.edu.principal;

public class Principal {

	public static void main(String[] args) {
		double valor, valorTotal, desconto;
		System.out.println("Este programa calcula o custo da compra de um produto.");
		funcoes fun = new funcoes();
		valor = fun.CalculaPreco(fun.CalculaValor(fun.RecebeCodigo()),fun.RecebeQuantidade());
		desconto = fun.CalculaDesconto(valor);
		valorTotal = fun.CalculaValorT(desconto, valor);
		System.out.println("Fim de programa.");
	
	}
}