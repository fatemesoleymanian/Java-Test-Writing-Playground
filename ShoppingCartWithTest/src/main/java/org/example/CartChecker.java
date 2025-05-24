package org.example;
public class CartChecker {
    private InventoryService service;

    public CartChecker(InventoryService service) {
        this.service = service;
    }

    public boolean canAddToCart(int productId, int requestedCount) {
        int stock = service.getStockForProduct(productId);
        return requestedCount <= stock;
    }
}

