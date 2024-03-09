import org.testng.Assert;
import org.testng.annotations.Test;

public class StorePriceComparatorTest {

    @Test  // Olga Safronova
    public void testHappyPathFindMinPrice() {
        String[] storePrices =
                {"Store А: 500 ","StoreB: 200", "StoreC: 100", "StoreD 175", "StoreE 130"};
        String expected = "StoreC with Minimum Price: 100";
        String actual = StorePriceComparator.findMinimumPriceStore(storePrices);

        Assert.assertEquals(actual, expected);
    }
}
