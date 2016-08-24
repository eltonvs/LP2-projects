import java.time.LocalTime;
import java.util.Random;

public class Product {
    private String productCode;
    private String productName;
    private int amount;
    private double price;
    private LocalTime time;

    public Product(int _prodCode, String _prodName, int _amount, double _price, LocalTime _time) {
        Random random_device = new Random();

        this.productCode = "PROD-" + _prodCode + "-" + random_device.nextInt(999);
        this.productName = _prodName;
        this.amount = _amount;
        this.price = _price;
        this.time = _time;
    }

    public String getProductCode() {
        return this.productCode;
    }

    public String getProductName() {
        return this.productName;
    }

    public int getAmount() {
        return this.amount;
    }

    public double getPrice() {
        return this.price;
    }

    public LocalTime getTime() {
        return this.time;
    }

    public void setProductName(String _productName) {
        this.productName = _productName;
    }

    public void setAmount(int _amount) {
        this.amount = _amount;
    }

    public void setPrice(double _price) {
        this.price = _price;
    }
}
