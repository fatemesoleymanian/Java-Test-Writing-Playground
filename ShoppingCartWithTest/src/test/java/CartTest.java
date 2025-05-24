import org.example.Cart;
import org.example.CartItem;
import org.example.Product;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CartTest {
    @Test
    void testAddToCart() {
        Product product = new Product();
        product.setInventory(2);
        CartItem item = new CartItem();
        item.setProduct(product);
        item.setId(1);

        Cart cart = new Cart();
        cart.addToCart(item);

        assertEquals(1, cart.getItems().size());
        assertEquals(1, product.getInventory());
    }

    @Test
    void testRemoveFromCart() {
        Product product = new Product();
        product.setInventory(1);
        CartItem item = new CartItem();
        item.setProduct(product);
        item.setId(1);

        Cart cart = new Cart();
        cart.addToCart(item);
        cart.removeFromCart(0);

        assertEquals(0, cart.getItems().size());
        assertEquals(1, product.getInventory()); // چون دوباره addInventory شده
    }

    @Test
    void testAddItemCount() {
        Product product = new Product();
        product.setInventory(3);
        CartItem item = new CartItem();
        item.setProduct(product);
        item.setId(1);
        item.setCount(1);

        Cart cart = new Cart();
        cart.addToCart(item);
        cart.addItemCount(1);

        assertEquals(2, item.getCount());
        assertEquals(1, product.getInventory());
    }
}
