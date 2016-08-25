import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;

import java.text.NumberFormat;

import javax.swing.JOptionPane;

public class Stock {
    private ArrayList<Product> productsList;
    private ArrayList<StockRequest> requestsList;

    public Stock() {
        this.productsList = new ArrayList<Product>();
        this.requestsList = new ArrayList<StockRequest>();
    }

    public void addProduct(Product _product) {
        if (_product.getAmount() > 0) {
            this.productsList.add(_product);
        } else {
            JOptionPane.showMessageDialog(null, "Product " + _product.getProductName() + " with invalid amount.", "Add Product", JOptionPane.ERROR_MESSAGE);
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
            JOptionPane.showMessageDialog(null, "Product " + _prod.getProductName() + " doesn't exists on stock or hasn't available stock", "Request Product", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void listProducts() {
        NumberFormat fmt = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
        String text = "";
        for (Product p : productsList) {
            text += p.getProductCode() + " | " + p.getProductName() + " [" + p.getAmount() + "]" + " - " + fmt.format(p.getPrice()) + "\n";
        }
        JOptionPane.showMessageDialog(null, text, "Products", JOptionPane.INFORMATION_MESSAGE);
    }

    public void listRequests() {
        String text = "";
        for (StockRequest r : requestsList) {
            text += r.getProductName() + " - " + r.getRequesterName() + " [" + r.getAmount() + "]\n";
        }
        text += "Total: " + requestsList.size();
        JOptionPane.showMessageDialog(null, text, "Product Requests", JOptionPane.INFORMATION_MESSAGE);
    }

    public void searchProduct(String name) {
        boolean found = false;
        NumberFormat fmt = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));

        for (Iterator<Product> it = productsList.iterator(); it.hasNext() && !found;) {
            Product curr = it.next();
            if (curr.getProductName().equals(name)) {
                JOptionPane.showMessageDialog(null, curr.getProductCode() + " | " + curr.getProductName() + " [" + curr.getAmount() + "] - " + fmt.format(curr.getPrice()), "Product Search", JOptionPane.INFORMATION_MESSAGE);
                found = true;
            }
        }
        if (!found) {
            JOptionPane.showMessageDialog(null, "Product [" + name + "] not found!", "Product Search", JOptionPane.ERROR_MESSAGE);
        }
    }
}
