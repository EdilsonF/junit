package test;


import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import junit.framework.TestCase;
import model.Valores;

public class ValoresTest extends TestCase {

	Valores val = new Valores();
	
	@Before
	public void setUp() throws Exception {
		
		val = new Valores();
		
		val.ins(7);
		val.ins(3);
	}

	
	
	@Test
	public void testIns() {
		
		// Metodo que testa o tamanho do array apos inserir.
		assertEquals(2, val.size());
		
		//
		//assertEquals(0, val.del(7));
		
		
	}
	
	@Test
	public void testDel() {
		
		//Testa quando deleta um indice no array 
		assertEquals(0, val.del(7));
		
		
	}

	@Test
	public void testGreater() {
		
		//Verifica o maior valor do array
		assertEquals(7, val.greater());
		
		
	}

	@Test
	public void testLower() {
		
		//Verifica o menor valor do array
		assertEquals(0, val.lower());
		
		
	}


}