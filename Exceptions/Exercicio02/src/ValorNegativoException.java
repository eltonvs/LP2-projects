public class ValorNegativoException extends Exception {
	private double value;

	public ValorNegativoException(double value) {
		this.value = value;
	}

	public double getValue() {
		return value;
	}
}
