package multithreading.inventoryManagement;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class OrderService {
    private List<Order> orderList;
    private InventoryManager inventoryManager;

    OrderService(InventoryManager inventoryManager) {
        orderList = new ArrayList<>();
        this.inventoryManager = inventoryManager;
    }

    public void createOrder(String destPincode, String sellerId, String productId, Integer productCount, String paymentMode) {
        Order order = new Order(String.valueOf(new Random().nextInt(100)), destPincode, sellerId, productId, productCount, paymentMode);
        orderList.add(order);

        //decrease the count in product
        inventoryManager.addInventory(sellerId, productId, -1 * productCount);
    }

    

}
