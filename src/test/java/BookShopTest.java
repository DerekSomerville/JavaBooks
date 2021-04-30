import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BookShopTest {
    BookShop bookShop = new BookShop();

    @Test
    void bookInfo() {
        String[] book = {"Title","Author"};
        assertEquals("Title, Author",bookShop.bookInfo(book));
    }
}
