package multithreading.inventoryManagement;

import java.util.concurrent.ConcurrentHashMap;

public class InventoryManager {
    private ConcurrentHashMap<String, ConcurrentHashMap<String, Integer>> inventory; // we can use AtomicInteger here instead of Integer
    InventoryManager() {
        inventory = new ConcurrentHashMap<>();
    }
    public void addInventory(String sellerId, String productId, int delta) {
        if(!inventory.containsKey(sellerId)) {
            inventory.put(sellerId, new ConcurrentHashMap<>());
        }     
        if(!inventory.get(sellerId).containsKey(productId)) {
            inventory.get(sellerId).put(productId, 0);
        }
        inventory.get(sellerId).put(productId, inventory.get(sellerId).get(productId) + delta);
    }

    public int getInventory(String sellerId, String productId) {
        return inventory.get(sellerId).getOrDefault(productId, 0);
    }
}
