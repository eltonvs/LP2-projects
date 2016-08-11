import java.util.HashMap;

public class Callcenter {
    HashMap<String, String> dictionary;

    public Callcenter() {
        this.dictionary = new HashMap<String, String>();
        this.dictionary.put("tela", "Já tentou reiniciar o monitor?");
        this.dictionary.put("internet", "Você pagou a conta?");
        this.dictionary.put("conexão", "Já tentou reiniciar o roteador?");
        this.dictionary.put("teclado", "Já verificou se o teclado está conectado?");
        this.dictionary.put("mouse", "Já verificou se o mouse está conectado?");
    }

    public boolean getAnswer(String question) {
        if (this.dictionary.get(question) != null) {
            System.out.println(this.dictionary.get(question.toLowerCase()));
            return true;
        } else {
            return false;
        }
    }
}
