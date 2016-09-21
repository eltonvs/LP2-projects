public class Aplicacao {
	public static void main(String[] args) {
		ContatoPF c1 = new ContatoPF();

		c1.setNome("José");
		c1.setCpf("000.123.345-89");

		c1.getEndereco().setRua("R. Xavier");
		c1.getEndereco().setNumero("100");
		c1.getEndereco().setCidade("Natal");
		c1.getEndereco().setEstado("RN");
	}
}
