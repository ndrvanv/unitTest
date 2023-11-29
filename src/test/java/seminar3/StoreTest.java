package seminar3;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StoreTest {

    private Store store;
    private Product product;
    private Product product2;

    @BeforeEach
    void setUp() {
        product = new Product("cheess", 12.3, 55);
        product2 = new Product("milk", 13.3, 30);
        store = new Store();
    }

    @AfterEach
    void tearDown() {
        product = null;
        product2 = null;
        store = null;
    }

    @Test
    @DisplayName("Проверка сохранения продуктов в Store.inventory")
    void addProductToInventory() {
        store.addProductToInventory(product);
        store.addProductToInventory(product2);
        assertEquals(2, store.getInventory().size());
    }

    @Test
    void removeProductFromInventory() {
        store.addProductToInventory(product);
        store.removeProductFromInventory(product);
        assertEquals(0, store.getInventory().size());
    }

    @Test
    void findProductByName() {
        store.addProductToInventory(product);
        Product findProduct = store.findProductByName("cheess");
        assertEquals("cheess", findProduct.getName());
    }

    @Test
    void createCart() {
        Cart cart = store.createCart();
        assertNotNull(cart);
    }
}