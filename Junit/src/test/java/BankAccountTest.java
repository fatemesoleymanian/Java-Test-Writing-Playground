package src.test;

import org.example.BankAccount;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class BankAccountTest {
    @BeforeEach
    void sayHi(){
        System.out.println("Hiiii");
    }
    @Disabled
    @AfterEach
    void sayBye(){
        System.out.println("Byee");
    }
    @BeforeAll
   static void sayToAll(){
        System.out.println("Hello all");
    }
    @AfterAll
    static void afterAll(){
        System.out.println("Bye all");
    }
    @Test
    void testDeposit(){
        BankAccount account = new BankAccount(100);
        account.deposit(50);
        assertEquals(150, account.getBalance());
    }
    @Test
    void testWithdraw(){
        BankAccount account = new BankAccount(200);
        account.withdraw(100);
        assertEquals(100,account.getBalance());
    }
    @Test
    void testWithdrawWithInsufficientFunds(){
        BankAccount account = new BankAccount(50);
        assertThrows(IllegalArgumentException.class,()->{
            account.withdraw(100);
        });
    }
    @Test
    void testAssertions() {
        assertEquals(4, 2 + 2);
        assertTrue("hello".startsWith("h"));
        assertThrows(IllegalArgumentException.class, () -> {
            throw new IllegalArgumentException();
        });
    }
    @ParameterizedTest
    @ValueSource(strings = {"apple","banan","cherry"})
    void testWithStrings(String fruit){
        assertNotNull(fruit);
    }


}
