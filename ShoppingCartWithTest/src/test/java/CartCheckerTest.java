import org.example.CartChecker;
import org.example.InventoryService;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class CartCheckerTest {

    @Test
    void testCanAddToCart_WhenEnoughStock() {
        InventoryService mockService = mock(InventoryService.class);
        when(mockService.getStockForProduct(100)).thenReturn(5);

        CartChecker checker = new CartChecker(mockService);
        boolean result = checker.canAddToCart(100, 3);

        assertTrue(result);
        verify(mockService).getStockForProduct(100);
    }

    @Test
    void testCanAddToCart_WhenNotEnoughStock() {
        InventoryService mockService = mock(InventoryService.class);
        when(mockService.getStockForProduct(100)).thenReturn(2);

        CartChecker checker = new CartChecker(mockService);
        boolean result = checker.canAddToCart(100, 5);

        assertFalse(result);
    }
}
