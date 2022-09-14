package ss11_JavaCollectionFramework.BT_product.helper;

import ss11_JavaCollectionFramework.BT_product.models.Product;

import java.util.Comparator;

public class SortByPriceHtoL implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        int a = (int) o1.getPrice();
        int b = (int) o2.getPrice();
        return b-a;
    }
}
