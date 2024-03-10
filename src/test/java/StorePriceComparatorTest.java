import org.testng.Assert;
import org.testng.annotations.Test;

public class StorePriceComparatorTest {

    @Test  // Olga Safronova
    public void testHappyPathFindMinPrice() {
        String[] storePrices =
                {"Store А: 500 ", "StoreB: 200", "StoreC: 100", "StoreD 175", "StoreE 130"};
        String expected = "StoreC with Minimum Price: 100";
        String actual = StorePriceComparator.findMinimumPriceStore(storePrices);

        Assert.assertEquals(actual, expected);
    }

    @Test  // Olga Safronova
    public void testUnknownStoreNameFindMinPrice() {
        String[] storePrices =
                {" 50 ", "StoreB: 200", "StoreC: 100", "StoreD 175", "StoreE 130"};
        String expected = "Unknown store name with Minimum Price: 50";
        String actual = StorePriceComparator.findMinimumPriceStore(storePrices);

        Assert.assertEquals(actual, expected);
    }

    @Test  // Olga Safronova
    public void testNegativeNull() {
        String[] storePrices =
                {"Store А: null", "StoreB: 200", "StoreC: 100", "StoreD 175", "StoreE 130"};
        String expected = "We have problems. Please try again later";
        String actual = StorePriceComparator.findMinimumPriceStore(storePrices);

        Assert.assertEquals(actual, expected);
    }

    @Test  // Olga Safronova
    public void testEmptyData() {
        String[] storePrices =
                {};
        String expected = "Store prices not found";
        String actual = StorePriceComparator.findMinimumPriceStore(storePrices);

        Assert.assertEquals(actual, expected);
    }

    @Test  // Olga Safronova
    public void testNullDataFromServer() {
        String expected = "Store prices not found";
        String actual = StorePriceComparator.findMinimumPriceStore(null);

        Assert.assertEquals(actual, expected);
    }

    @Test  // Olga Safronova
    public void testHappyPathFindMinPriceIfDouble() {
        String[] storePrices =
                {"Store А: 1.000.000 ", "StoreB: 10.000", "StoreC: 10.00", "StoreD 175", "StoreE 130"};
        String expected = "StoreC with Minimum Price: 10";
        String actual = StorePriceComparator.findMinimumPriceStore(storePrices);

        Assert.assertEquals(actual, expected);
    }
}
