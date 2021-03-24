package test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;

import utils.PrimeiraPalavra;

public class PrimeiraPalavraTest {

	@Test	
	public void testAssertEquals() {
		
		String [] array = {"abacaxi","ma�a","mam�o"};
		
		String expected = "abacaxi";
		PrimeiraPalavra palavra = new PrimeiraPalavra();
		assertEquals(expected,palavra.primeiraPalavra(array));
		
	}
	@Test
	public void testAssertNotEquals() {
		
		String [] array = {"abacaxi","ma�a","mam�o"};
		
		String expected = "abacax";  //PALAVRA NÃO IGUAL  
		PrimeiraPalavra palavra = new PrimeiraPalavra();
		assertNotEquals(expected,palavra.primeiraPalavra(array));
		
	}
	@Test
	public void testAssertEqualsSecond() {
		
		String [] array = {"abacaxi","ma�a","mam�o"};
		
		String expected = "ma�a";
		PrimeiraPalavra palavra = new PrimeiraPalavra();
		assertEquals(expected,palavra.segundaPalavra(array));
		
	}
	
	
}
