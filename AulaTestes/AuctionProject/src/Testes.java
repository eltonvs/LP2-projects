public class Testes {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Usuario u1 = new Usuario("Usuario 1");
		Usuario u2 = new Usuario("Usuario 2");
		Usuario u3 = new Usuario("Usuario 3");
		
		Leilao l = new Leilao("descrição do leilao");

		l.propoe(new Lance(u3, 250));
		l.propoe(new Lance(u1, 300));
		l.propoe(new Lance(u2, 400));
		
		Avaliador a = new Avaliador();
		a.avalia(l);
		
		System.out.println("Maior Lance: " + a.getMaiorDeTodos());
		System.out.println("Menor Lance: " + a.getMenorDeTodos());
	}
}
