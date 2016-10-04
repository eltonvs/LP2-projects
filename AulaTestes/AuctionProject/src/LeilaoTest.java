import static org.junit.Assert.*;

import org.junit.Test;

public class LeilaoTest {
	@Test
	public void deveReceberUmLance() {
		Leilao l = new Leilao("Notebook");
		assertEquals(0, l.getLances().size());
		l.propoe(new Lance(new Usuario("Ze"), 1000));
		assertEquals(1, l.getLances().size());
		assertEquals(1000, l.getLances().get(0).getValor(), 0);
	}
	
	@Test
	public void deveReceberDoisLances() {
		Leilao l = new Leilao("Notebook");
		assertEquals(0, l.getLances().size());
		l.propoe(new Lance(new Usuario("Ze"), 1000));
		l.propoe(new Lance(new Usuario("Joao"), 2000));
		assertEquals(2, l.getLances().size());
		assertEquals(1000, l.getLances().get(0).getValor(), 0);
		assertEquals(2000, l.getLances().get(1).getValor(), 0);
	}
	
	@Test
	public void deveImpedirDoisLancesSeguidos() {
		Leilao l = new Leilao("Notebook");
		Usuario u = new Usuario("Ze");
		assertEquals(0, l.getLances().size());
		l.propoe(new Lance(u, 1000));
		l.propoe(new Lance(u, 2000));
		assertEquals(1, l.getLances().size());
		assertEquals(1000, l.getLances().get(0).getValor(), 0);
	}
	
	@Test
	public void deveImpedirMaisQueCincoLancesDoMesmoUsuario() {
		Leilao l = new Leilao("Notebook");
		Usuario u1 = new Usuario("Ze");
		Usuario u2 = new Usuario("Joao");
		assertEquals(0, l.getLances().size());
		l.propoe(new Lance(u1, 1000));
		l.propoe(new Lance(u2, 2000));
		l.propoe(new Lance(u1, 3000));
		l.propoe(new Lance(u2, 4000));
		l.propoe(new Lance(u1, 5000));
		l.propoe(new Lance(u2, 6000));
		l.propoe(new Lance(u1, 7000));
		l.propoe(new Lance(u2, 8000));
		l.propoe(new Lance(u1, 9000));
		l.propoe(new Lance(u2, 10000));
		l.propoe(new Lance(u1, 11000));
		assertEquals(10, l.getLances().size());
		assertEquals(10000, l.getLances().get(l.getLances().size() - 1).getValor(), 0);
	}
}
