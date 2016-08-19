import java.util.ArrayList;
import java.util.Locale;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Application {
    public static void main(String[] args){
        ArrayList<Product> products = new ArrayList<Product>();

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy").withLocale(new Locale("pt", "BR"));

        products.add(new Product("Feijão", 2.5, LocalDate.parse("04/10/2020", fmt)));
        products.add(new Product("Café", 1.0, LocalDate.parse("01/01/2022", fmt)));
        products.add(new Product("Beterraba", 0.9, LocalDate.parse("12/11/2017", fmt)));

        for (int i = 0; i < products.size(); i++) {
            System.out.printf("%d) %12s %09.2f %s\n", i + 1, products.get(i).getName(), products.get(i).getWeight(), products.get(i).getExpirationDate().format(fmt));
        }
    }
}
