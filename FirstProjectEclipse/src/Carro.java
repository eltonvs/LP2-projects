public class Carro extends Veiculo {
	
	private boolean quatroPortas;
	private int chassi;

	public Carro(String marca) {
		super(marca);
		// TODO Auto-generated constructor stub
	}

	public boolean isQuatroPortas() {
		return quatroPortas;
	}

	public void setQuatroPortas(boolean quatroPortas) {
		this.quatroPortas = quatroPortas;
	}

	public int getChassi() {
		return chassi;
	}

	public void setChassi(int chassi) {
		this.chassi = chassi;
	}

	@Override
	public void imprimirDados() {
		super.imprimirDados();
		System.out.println("É 4 portas? " + (isQuatroPortas() ? "Sim" : "Não"));
	}
	
	@Override
	public String toString() {
		return this.modelo;
	}
	
}
