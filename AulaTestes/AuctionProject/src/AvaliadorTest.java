import static org.junit.Assert.*;
import org.junit.*;

public class AvaliadorTest {
	Avaliador a, b;

	@Before
	public void setUp() throws Exception {
		a = new Avaliador();
		Usuario u1 = new Usuario("Usuario 1");
		Leilao l1 = new Leilao("descrição do leilao");

		l1.propoe(new Lance(u1, 250));
		l1.propoe(new Lance(u1, 300));
		l1.propoe(new Lance(u1, 400));
		
		a.avalia(l1);
		
		b = new Avaliador();
		Leilao l2 = new Leilao("descrição do leilao");

		l2.propoe(new Lance(u1, 200));
		
		b.avalia(l2);
	}

	@Test
	public void testGetMaiorDeTodos() {
		assertEquals(400, a.getMaiorDeTodos(), 0);
		assertEquals(200, b.getMaiorDeTodos(), 0);
	}

	@Test
	public void testGetMenorDeTodos() {
		assertEquals(250, a.getMenorDeTodos(), 0);
		assertEquals(200, b.getMenorDeTodos(), 0);
	}
}
