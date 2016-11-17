package ufrn.imd;

/**
 *
 * @author elton
 */
public class TemperatureClassAdapter extends Temperature {

    @Override
    public double getValue() {
        return (super.getValue() - 32) / 1.8;
    }

    @Override
    public void setValue(double value) {
        super.setValue(value * 1.8 + 32);
    }

    public double getValueFahrenheit() {
        return super.getValue();
    }

}
