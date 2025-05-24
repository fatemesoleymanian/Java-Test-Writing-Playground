import org.example.Cart;
import org.example.CartItem;
import org.example.Product;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CartItemTest {
    @Test
    void testCartItemInitialization() {
        Product product = new Product();
        product.setName("Phone");

        CartItem item = new CartItem();
        item.setId(1);
        item.setProduct(product);
        item.setCount(2);

        assertEquals(1, item.getId());
        assertEquals("Phone", item.getProduct().getName());
        assertEquals(2, item.getCount());
    }
    @Test
    void testCalculateTotalPrice() {
        Product p1 = new Product();
        p1.setPrice(10);
        p1.setInventory(5);

        Product p2 = new Product();
        p2.setPrice(20);
        p2.setInventory(5);

        CartItem item1 = new CartItem();
        item1.setProduct(p1);
        item1.setCount(2); // مجموع 20

        CartItem item2 = new CartItem();
        item2.setProduct(p2);
        item2.setCount(1); // مجموع 20

        Cart cart = new Cart();
        cart.addToCart(item1);
        cart.addToCart(item2);

        double total = cart.calculateTotal();

        assertEquals(40.0, total);
    }

}
