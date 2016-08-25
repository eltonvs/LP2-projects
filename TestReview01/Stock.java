import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;

import java.text.NumberFormat;

public class Stock {
    private ArrayList<Product> productsList;
    private ArrayList<StockRequest> requestsList;

    public Stock() {
        this.productsList = new ArrayList<Product>();
        this.requestsList = new ArrayList<StockRequest>();
    }

    public void addProduct(Product _product) {
        if (_product.getAmount() > 0) {
            // Add product to list
            this.productsList.add(_product);
        } else {
            System.out.println("[addProduct()]: Product " + _product.getProductName() + " with invalid amount.");
        }
    }

    public void removeProduct(Product _product) {
        int idx = this.productsList.indexOf(_product);
        if (idx >= 0) {
            this.productsList.remove(idx);
        }
    }

    public void requestProduct(User _user, Product _prod, int _amount) {
        int idx = this.productsList.indexOf(_prod);
        if (idx >= 0 && _amount > 0) {
            requestsList.add(new StockRequest(_user, _prod, _amount));
            productsList.get(idx).setAmount(productsList.get(idx).getAmount() - _amount);
        } else {
            System.out.println("[requestProduct()]: Product " + _prod.getProductName() + " doesn't exists on stock or hasn't available stock");
        }
    }

    public void listProducts() {
        NumberFormat fmt = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
        System.out.println(">>> Products:");
        for (Product p : productsList) {
            System.out.println("    " + p.getProductCode() + " | " + p.getProductName() + " [" + p.getAmount() + "]" + " - " + fmt.format(p.getPrice()));
        }
    }

    public void listRequests() {
        System.out.println(">>> Products Requests:");
        for (StockRequest r : requestsList) {
            System.out.println("    " + r.getProductName() + " - " + r.getRequesterName() + " [" + r.getAmount() + "]");
        }
        System.out.println("Total: " + requestsList.size());
    }

    public void searchProduct(String name) {
        boolean found = false;
        NumberFormat fmt = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
        for (Iterator<Product> it = productsList.iterator(); it.hasNext() && !found;) {
            Product curr = it.next();
            if (curr.getProductName().equals(name)) {
                System.out.println(curr.getProductCode() + " | " + curr.getProductName() + " [" + curr.getAmount() + "] - " + fmt.format(curr.getPrice()));
                found = true;
            }
        }
        if (!found) {
            System.out.println("Product [" + name + "] not found!");
        }
    }
}
