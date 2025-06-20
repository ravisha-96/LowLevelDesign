package multithreading.inventoryManagement;

public class Order {
    String orderId;
    String destPincode;
    String sellerId;
    String productId;
    Integer productCount;
    String paymentMode;

    Order(String orderId, String destPincode, String sellerId, String productId, Integer productCount, String paymentMode) {
        this.orderId = orderId;
        this.destPincode = destPincode;
        this.sellerId = sellerId;
        this.productId = productId;
        this.productCount = productCount;
        this.paymentMode = paymentMode;
    }
}
