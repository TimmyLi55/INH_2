import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class ProductRepositoryTest {

    ProductRepository repo = new ProductRepository();
    ProductManager manager = new ProductManager(repo);
    Product book = new Book(1, "Книга", 355, "Гарри Поттер и филосовский камень", "Джоан Роулинг");
    Product book2 = new Book(2, "Книга", 500, "Зов кукушки", "Роберт Гэлбрейт");
    Product smart1 = new Smartphone(3, "Смартфон", 2500, "Xiaomi Mi11Pro", "Кинай");
    Product smart2 = new Smartphone(4, "Смартфон", 6000, "Apple Iphone 12", "США");

    @Test
    public void productRepositoryDelForIdTest() {
        manager.addProduct(smart1);
        manager.addProduct(smart2);
        manager.addProduct(book);
        manager.addProduct(book2);

        repo.removeById(smart2.getId());

        Product[] expected = {smart1, book, book2};
        Product[] actual = repo.getProducts();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public  void productRepositoryDelForIdWithException (){
        manager.addProduct(smart1);
        manager.addProduct(smart2);
        manager.addProduct(book);
        manager.addProduct(book2);

        Assertions.assertThrows(NotFoundException.class, () -> {
           repo.removeById(5);
        });


    }
}
