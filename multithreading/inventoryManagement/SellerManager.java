package multithreading.inventoryManagement;


import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

public class SellerManager {
    private ConcurrentHashMap<String, Seller> sellers;
    SellerManager() {
        sellers = new ConcurrentHashMap<>();
    }

    void addSeller(Seller seller) {
        sellers.put(seller.getSellerId(), seller);
    }

    List<String> getSellers() {
        return new ArrayList<>(this.sellers.keySet());
    }


}
