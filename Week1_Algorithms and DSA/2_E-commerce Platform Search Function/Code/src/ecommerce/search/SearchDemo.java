package ecommerce.search;

import java.util.Arrays;
import java.util.Comparator;

public class SearchDemo {

    public static Product linearSearch(Product[] products, String target) {
        for (Product p : products) {
            if (p.productName.equalsIgnoreCase(target)) {
                return p;
            }
        }
        return null;
    }

    public static Product binarySearch(Product[] products, String target) {
        int left = 0, right = products.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            int compare = products[mid].productName.compareToIgnoreCase(target);

            if (compare == 0) return products[mid];
            else if (compare < 0) left = mid + 1;
            else right = mid - 1;
        }

        return null;
    }

    public static void main(String[] args) {
        Product[] products = {
            new Product(101, "Laptop", "Electronics"),
            new Product(102, "Shoes", "Fashion"),
            new Product(103, "Watch", "Accessories"),
            new Product(104, "Camera", "Electronics"),
            new Product(105, "Shirt", "Fashion")
        };

        
        Product result1 = linearSearch(products, "Camera");
        System.out.println("Linear Search Result: " + (result1 != null ? result1 : "Not Found"));

        Arrays.sort(products, Comparator.comparing(p -> p.productName.toLowerCase()));

        
        Product result2 = binarySearch(products, "Camera");
        System.out.println("Binary Search Result: " + (result2 != null ? result2 : "Not Found"));
    }
}
