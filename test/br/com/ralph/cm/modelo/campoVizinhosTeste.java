package br.com.ralph.cm.modelo;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class campoVizinhosTeste 
{
	private Campo campo;
	
	int linha = 3;
	int coluna = 3;
	
	@BeforeEach
	void iniciarCampo()
	{
		campo = new Campo(linha, coluna);
	}
	
	@Test
	void testeVizinhoFalso()
	{
		Campo vizinho = new Campo(5, 5);
		boolean resultado = campo.adicionarVizinho(vizinho);
		assertFalse(resultado);
	}
	
	@Test
	void testeVizinhoRealDistancia()
	{
		for(int l = 2; l <= 4; l++)
		{
			for(int c = 2; c <= 4; c++)
			{
				Campo vizinho = new Campo(l, c);
				boolean resultado = campo.adicionarVizinho(vizinho);
				if(l == linha && c == coluna)
					assertFalse(resultado);
				else
					assertTrue(resultado);
			}
		}
	}
		
//	@Test
//	void testeVizinhoRealDistancia1()
//	{
//		Campo vizinhoEsquerda = new Campo(3, 2);
//		boolean resultadoEsquerda = campo.adicionarVizinho(vizinhoEsquerda);
//		assertTrue(resultadoEsquerda);
//		
//		Campo vizinhoDireita = new Campo(3, 4);
//		boolean resultadoDireita = campo.adicionarVizinho(vizinhoDireita);
//		assertTrue(resultadoDireita);
//		
//		Campo vizinhoCima = new Campo(2, 3);
//		boolean resultadoCima = campo.adicionarVizinho(vizinhoCima);
//		assertTrue(resultadoCima);
//		
//		Campo vizinhoBaixo = new Campo(4, 3);
//		boolean resultadoBaixo = campo.adicionarVizinho(vizinhoBaixo);
//		assertTrue(resultadoBaixo);
//	}
//	
//	@Test
//	void testeVizinhoRealDistancia2()
//	{
//		Campo vizinho = new Campo(2, 2);
//		boolean resultado = campo.adicionarVizinho(vizinho);
//		assertTrue(resultado);
//	}
}
