import javax.swing.JOptionPane;

public class Application {
    public static void main(String[] args) {
        // Create Users
        User[] users = new User[2];
        users[0] = new User("Elton Viana", "987.654.321-00");
        users[1] = new User("John Doe", "123.456.789-00");

        // Show users information
        String usr_lst = "";
        for (User u : users) {
            usr_lst += "Name: " + u.getName() + " - CPF: " + u.getCPF() + "\n";
        }

        JOptionPane.showMessageDialog(null, usr_lst, "Users List", JOptionPane.INFORMATION_MESSAGE);

        // Create Products
        Product[] products = new Product[5];
        products[0] = new Product("NB00173", "Notebook", 23, 27499.53);
        products[1] = new Product("CP00352", "Cellphone", 0, 1049.99);
        products[2] = new Product("KB01961", "Keyboard", 112, 9.87);
        products[3] = new Product("TS02874", "Tomato Sauce", 49, 2.62);
        products[4] = new Product("LP07134", "Laser Printer", 1, 349.70);

        // Create Inventory
        Stock tech_store = new Stock();
        tech_store.addProduct(products[0]);
        tech_store.addProduct(products[1]);
        tech_store.addProduct(products[2]);
        tech_store.addProduct(products[4]);

        // List Products
        tech_store.listProducts();

        // Remove product
        tech_store.removeProduct(products[4]);

        // Requesting Products
        tech_store.requestProduct(users[0], products[0], 1);
        tech_store.requestProduct(users[0], products[3], 3);
        tech_store.requestProduct(users[1], products[1], 2);
        tech_store.requestProduct(users[1], products[2], 12);
        tech_store.requestProduct(users[1], products[4], 3);

        // List Products (after requests)
        tech_store.listProducts();

        // List requests
        tech_store.listRequests();

        // Search Products by name
        tech_store.searchProduct("Tomato Sauce");
        tech_store.searchProduct("Keyboard");
    }
}
