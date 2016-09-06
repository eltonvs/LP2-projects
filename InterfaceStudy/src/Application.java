public class Application {
	public static void main(String[] args) {
		Automobile f = new Ferrari();
		Route route = new Route();

		route.go(f);
	}
}
