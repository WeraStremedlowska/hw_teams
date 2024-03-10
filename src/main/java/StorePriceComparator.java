public class StorePriceComparator {
    ///Example: String[] storePrices = {"Store А: 500 ", "StoreB: 200", "StoreC: 100", "StoreD 175", "StoreE 130"};

    public static String findMinimumPriceStore(String[] storePrices) {
        if (storePrices == null || storePrices.length == 0) {
            return "Store prices not found";
        }

        String minPriceStore = "";
        int minPrice = Integer.MAX_VALUE;

        for (String storePrice : storePrices) {
            storePrice = storePrice.trim();
            Integer price = extractPrice(storePrice);
            if (price == null) {
                return "We have problems. Please try again later";
            } else if (price < minPrice) {
                minPrice = price;
                minPriceStore = storePrice;
            }
        }

        String storeName = extractStoreName(minPriceStore);
        if (storeName == null || storeName.isEmpty()) {
            storeName = "Unknown store name";
        }
        return storeName + " with Minimum Price: " + minPrice;
    }

    private static Integer extractPrice(String storePrice) {
        try {
            // First, remove all non-digit and non-dot characters to clean the input.
            String cleanedPrice = storePrice.replaceAll("[^0-9.]+", "");
            // Check if the price contains a decimal point.
            if (cleanedPrice.contains(".")) {
                // Count the number of digits after the decimal point.
                int digitsAfterDecimal = cleanedPrice.length() - cleanedPrice.indexOf('.') - 1;
                if (digitsAfterDecimal >= 3) {
                    // Remove the dot for thousands.
                    cleanedPrice = cleanedPrice.replaceAll("\\.", "");
                    return Integer.parseInt(cleanedPrice);
                } else {
                    // For other cases, parse as double and convert to integer (removing any decimal part).
                    double price = Double.parseDouble(cleanedPrice);

                    return (int) price;
                }
            } else {

                return Integer.parseInt(cleanedPrice);
            }
        } catch (NumberFormatException e) {
            return null;
        }
    }


    private static String extractStoreName(String storePrice) {
        // Split by space or colon, then rejoin parts excluding the last (price) part
        String[] parts = storePrice.split(" |:");
        StringBuilder storeNameBuilder = new StringBuilder();
        for (int i = 0; i < parts.length - 1; i++) {
            if (i > 0) storeNameBuilder.append(" ");
            storeNameBuilder.append(parts[i]);
        }
        return storeNameBuilder.toString().trim();
    }
}
