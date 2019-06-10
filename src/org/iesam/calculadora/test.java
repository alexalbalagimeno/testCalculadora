package org.iesam.calculadora;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class test {

static Calculadora calcul;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		calcul = new Calculadora();
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testSumar() {
		assertEquals(25, calcul.sumar(15, 10));
	
	}
	@Test
	void testRestar() {
		assertEquals(5, calcul.restar(20, 15));
	}
	@Test
	void testMultiplicar() {
		assertEquals(12, calcul.multiplicar(3, 4));
	}
	
	@Test
	void testDividir() {
		try {
			assertEquals(2, calcul.dividir(10, 5));
		} catch (DivisioZeroException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	void testDividirPerZero() {
		Assertions.assertThrows(DivisioZeroException.class, () -> {
			calcul.dividir(7, 0);
		});
	}

}
