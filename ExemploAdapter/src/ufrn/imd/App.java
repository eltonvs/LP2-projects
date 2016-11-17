package ufrn.imd;

/**
 *
 * @author elton
 */
public class App {

    public static void main(String[] args) {
        // Without Adapter
        Temperature t = new Temperature();
        t.setValue(30);
        System.out.println(t.getValue());

        // With Adapter
        TemperatureClassAdapter ta = new TemperatureClassAdapter();
        ta.setValue(30);
        System.out.println(ta.getValue());
        System.out.println(ta.getValueFahrenheit());
    }
}
