import java.time.LocalTime;

public class StockRequest {
    private User requester;
    private Product product;
    private int amount;
    private LocalTime requestTime;

    public StockRequest(User _requester, Product _product, int _amount, LocalTime _requestTime) {
        this.requester = _requester;
        this.product = _product;
        this.amount = _amount;
        this.requestTime = _requestTime;
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

    public LocalTime getRequestTime() {
        return this.requestTime;
    }
}
