import java.util.ArrayList;

public class Stock {
    private ArrayList<Product> productsList;
    private ArrayList<StockRequest> solicitationList;

    public Stock() {
        this.productsList = new ArrayList<Product>();
        this.solicitationList = new ArrayList<StockRequest>();
    }

    public void addProduct(Product _product) {
        this.productsList.add(_product);
    }

    public void removeProduct(Product _product) {
        this.productsList.remove(this.productsList.indexOf(_product));
    }

    public void listProducts() {
        System.out.println(">>> Products:");
        for (Product p : productsList) {
            System.out.println("    " + p.getProductCode() + " | " + p.getProductName() + " [" + p.getAmount() + "]" + " - R$" + p.getPrice());
        }
    }
}
