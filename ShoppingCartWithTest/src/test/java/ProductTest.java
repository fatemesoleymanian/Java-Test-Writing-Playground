import org.example.Product;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ProductTest {
    @Test
    void testAddInventory(){
        Product product = new Product();
        product.setInventory(3);
        product.addInventory();

        assertEquals(4,product.getInventory());
    }
    @Test
    void testReduceInvenory(){
        Product product = new Product();
        product.setInventory(5);
        product.reduceInventory();

        assertEquals(4,product.getInventory());
    }
    @Test
    void testProductProperties(){
        Product product = new Product();
        product.setName("Laptop");
        product.setId(1);
        product.setPrice(200000);
        product.setInventory(20);

        assertEquals("Laptop", product.getName());
        assertEquals(1, product.getId());
        assertEquals(200000, product.getPrice());
        assertEquals(20, product.getInventory());
    }
}
