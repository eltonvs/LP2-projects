import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Callcenter callcenter = new Callcenter();
        String line;

        System.out.println("Bem vindo ao callcenter automatizado!\nQual o seu problema?");
        while (reader.hasNextLine() && !((line = reader.nextLine()).equals("y"))) {
            boolean found = false;
            for (String key : line.split(" "))
                found = found || callcenter.getAnswer(key);
            if (!found)
                System.out.println("Você poderia ser mais específico?");
        }
        System.out.println("Programa encerrado. Até logo!");
    }
}
