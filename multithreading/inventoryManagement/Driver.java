package multithreading.inventoryManagement;

import java.util.List;

// init(helper, 10) : helper is initialized.
// createSeller(seller-0, [110001, 560092, 452001, 700001], [netbanking, cash, upi])
// createSeller(seller-1, [400050, 110001, 600032, 560092], [netbanking, cash, upi])
// addInventory(0, seller-1, 52) returned "inventory added"
// addInventory(0, seller-0, 32) returned "inventory added"
// createOrder(order-1, 400050, seller-1, 0, 5, upi) returned "order placed"
// getInventory(0, seller-1) returned 47
// createOrder(order-2, 560092, seller-0, 0, 1, upi) returned "order placed"
// getInventory(0, seller-0) returned 31
public class Driver {
    public static void main(String[] args) {
        Seller seller1 = new Seller("Ravi", "seller1", List.of("110001", "560092", "452001", "700001"), List.of("netbanking", "cash", "upi"));
        Seller seller2 = new Seller("Suraj", "seller2", List.of("110001", "560092", "452004", "800001"), List.of("netbanking", "cash", "upi"));
        SellerManager sellerManager = new SellerManager();
        sellerManager.addSeller(seller1);
        sellerManager.addSeller(seller2);

        System.out.println("Sellers created" + sellerManager.getSellers());

        InventoryManager inventoryManager = new InventoryManager();
        inventoryManager.addInventory("seller1", "macbook-air", 5);
        inventoryManager.addInventory("seller1", "ipad", 10);

        inventoryManager.addInventory("seller2", "macbook-air", 15);
        inventoryManager.addInventory("seller2", "ipad", 5);

        System.out.println("Seller1 macbook-air quantity " + inventoryManager.getInventory("seller1", "macbook-air"));
        System.out.println("Seller2 macbook-air quantity " + inventoryManager.getInventory("seller2", "macbook-air"));

        OrderService orderService = new OrderService(inventoryManager);
        orderService.createOrder("110001", "seller1", "macbook-air", 1, "upi");
        orderService.createOrder("110001", "seller2", "macbook-air", 2, "upi");
        orderService.createOrder("110001", "seller2", "ipad", 2, "upi");
        orderService.createOrder("110001", "seller1", "ipad", 2, "upi");

        System.out.println("Seller1 macbook-air quantity " + inventoryManager.getInventory("seller1", "macbook-air"));
        System.out.println("Seller2 macbook-air quantity " +inventoryManager.getInventory("seller2", "macbook-air"));
        System.out.println("Seller1 ipad quantity " + inventoryManager.getInventory("seller1", "ipad"));
        System.out.println("Seller2 ipad quantity " +inventoryManager.getInventory("seller2", "ipad"));

    }
}
