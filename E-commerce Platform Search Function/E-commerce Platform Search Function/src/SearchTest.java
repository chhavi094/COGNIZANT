import java.util.Arrays;

public class SearchTest {
    public static void main(String[] args) {
        Product[] products = {
            new Product(101, "Laptop", "Electronics"),
            new Product(205, "Shoes", "Footwear"),
            new Product(150, "Watch", "Accessories"),
            new Product(123, "Phone", "Electronics"),
            new Product(180, "Book", "Stationery")
        };

        // Linear search (unsorted array)
        Product result1 = ProductSearch.linearSearch(products, 123);
        System.out.println("Linear Search Found: " + result1);

        // Sort array for binary search
        Arrays.sort(products);

        // Binary search (sorted array)
        Product result2 = ProductSearch.binarySearch(products, 123);
        System.out.println("Binary Search Found: " + result2);
    }
}
