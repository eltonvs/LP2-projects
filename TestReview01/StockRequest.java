import java.time.LocalDateTime;

public class StockRequest {
    private User requester;
    private Product product;
    private int amount;
    private LocalDateTime requestTime;

    public StockRequest(User _requester, Product _product, int _amount) {
        this.requester = _requester;
        this.product = _product;
        this.amount = _amount;
        this.requestTime = LocalDateTime.now();
    }

    public String getProductName() {
        return this.product.getProductName();
    }

    public String getRequesterName() {
        return this.requester.getName();
    }

    public int getAmount() {
        return this.amount;
    }

    public LocalDateTime getRequestTime() {
        return this.requestTime;
    }
}
