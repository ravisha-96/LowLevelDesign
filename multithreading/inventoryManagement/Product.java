package multithreading.inventoryManagement;

public class Product {
    private String productId;
    private String productName;
    private Double price;

    Product(String productId, String productName, Double price) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
    }

    public String getProductId() {
        return this.productId;
    }

    public String getProductName() {
        return this.productName;
    }

    public Double getPrice() {
        return this.price;
    }
}
