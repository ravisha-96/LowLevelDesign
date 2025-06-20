package multithreading.inventoryManagement;

import java.util.ArrayList;
import java.util.List;

public class Seller {
    private String name;
    private String sellerId;
    private List<String> deliveryPincodes;
    private List<String> paymentModes;

    Seller(String name, String sellerId, List<String> deliveryPincodes, List<String> paymentModes) {
        this.name = name;
        this.sellerId = sellerId;
        this.deliveryPincodes = new ArrayList<>(deliveryPincodes);
        this.paymentModes = new ArrayList<>(paymentModes);
    }

    public String getSellerId() {
        return this.sellerId;
    }

    public String getName() {
        return this.name;
    }

    public List<String> getDeliveryPincodes() {
        return this.deliveryPincodes;
    }

    public List<String> getPaymentModes() {
        return this.paymentModes;
    }
}
