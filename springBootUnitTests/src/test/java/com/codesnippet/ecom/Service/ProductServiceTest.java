package com.codesnippet.ecom.Service;

import com.codesnippet.ecom.Entity.Product;
import com.codesnippet.ecom.Repository.ProductRepository;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import static org.junit.jupiter.api.Assertions.*;
@ExtendWith(MockitoExtension.class)
class ProductServiceTest {
    @InjectMocks
    ProductService service;
    @Mock
    ProductRepository repository;

    private static Product product = null;

    @BeforeAll
    public static void init(){
        System.out.println("before all"); //it runs before all tests
        product = new Product();
        product.setId(1);
        product.setDescription("harry potter book is a novel");
        product.setStock(100);
        product.setPrice(10);
    }
    @BeforeEach
    public void initEachTest(){
        System.out.println("before each test"); //it runs before all tests
    }

    @Test
    void addProductShouldAddSuccessfullyAndIsNotNull(){
        product.setName("harry potter book");

        Mockito.when(repository.save(product))
                .thenReturn(product);
        Product savedProduct = service.addProduct(product);

        assertEquals(product.getId(),savedProduct.getId());
        assertNotNull(savedProduct);
    }

    @Test
    void addProductShouldThrowExceptionForInvalidName(){

        product.setName("");

        RuntimeException runtimeException = assertThrows(RuntimeException.class, () -> {
            service.addProduct(product);
        });

        assertEquals("Invalid Name Of Product",runtimeException.getMessage());
        Mockito.verify(repository,Mockito.never()).save(Mockito.any(Product.class));//because the name is invalid save method is never called
    }

    @Test
    void deleteProductShouldDeleteProductSuccessfully(){
        Mockito.doNothing().when(repository).deleteById(1);

        service.deleteProduct(1);//this doesn't return anything should to test and mockit it next line can work

        Mockito.verify(repository,Mockito.times(1)).deleteById(1);//does deleteById method runs from repository once? verify it plz
    }

    @Test
    void testPrivateMethod_validateProductName() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method validateProductName = ProductService.class.getDeclaredMethod("validateProductName",String.class);
        validateProductName.setAccessible(true);
        Boolean validation =  (Boolean) validateProductName.invoke(service,"harry potter book");

       assertTrue(validation);
    }

    @Test
    void testPrivateMethod_validateProductNameIfNameIsInvalid() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method validateProductName = ProductService.class.getDeclaredMethod("validateProductName",String.class);
        validateProductName.setAccessible(true);
        Boolean validation =  (Boolean) validateProductName.invoke(service,"");

        assertFalse(validation);
    }

    @Test
    void dummyTest(){
        System.out.println("dummy test");
    }

    @AfterAll
    public static void destroy(){
        System.out.println("after all"); //it runs after all tests
    }
    @AfterEach
    public void cleanup(){
        System.out.println("after each test"); //it runs asfter all tests
    }

    //test life cycle:
    // before all -> before each -> test -> after each -> after all
}