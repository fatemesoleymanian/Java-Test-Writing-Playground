package org.example;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<CartItem> items = new ArrayList<>();

    public List<CartItem> getItems() {
        return items;
    }

    public void addToCart(CartItem cartItem){
        cartItem.getProduct().reduceInventory();
        items.add(cartItem);
    }
    public void removeFromCart(int index){
        CartItem item = items.get(index);
        item.getProduct().addInventory();
        items.remove(index);
    }
    public void addItemCount(int id){
        for (CartItem cartItem : items) {
            if (cartItem.getId() == id) {
                if (cartItem.getProduct().getInventory() > 1) {
                    cartItem.setCount(cartItem.getCount() + 1);
                    cartItem.getProduct().reduceInventory();
                }
            }
        }
    }
    public double calculateTotal(){
        double total = 0;
        for (CartItem cartItem : items) {
            total += (double) (cartItem.getCount() * cartItem.getProduct().getPrice());
        }
        return total;
    }
}
