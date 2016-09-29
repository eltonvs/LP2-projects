package br.imd.ufrn.testes;

import static org.junit.Assert.*;

import org.junit.*;

import br.imd.ufrn.Matematica;

public class MatematicaTest {

	Matematica m;

	@Before
	public void setUp() throws Exception {
		m = new Matematica();
	}

	@Test
	public void testSomar() {
		assertEquals(5, m.somar(2, 3), 0);
	}

	@Test
	public void testSubtrair() {
		assertEquals(1, m.subtrair(3, 2), 0);
	}

	@Test
	public void testMultiplicar() {
		assertEquals(6, m.multiplicar(2, 3), 0);
	}

	@Test
	public void testDividir() {
		assertEquals(3, m.dividir(6, 2), 0);
	}

}
