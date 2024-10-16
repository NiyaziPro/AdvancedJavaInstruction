package records.record2;

import java.util.ArrayList;
import java.util.List;

/*
Product related operations
 */
public class ProductService {

    List<Product> products = new ArrayList<>();


    public void addProduct(Product product) {
        this.products.add(product);
    }

    public void removeProduct(Product product) {
        this.products.remove(product);
    }

    public void allProducts() {
        for (Product p : this.products) {
            System.out.println("Product name: " + p.name() + "- Price: " + p.price() + "- Stock: " + p.stock());
        }
    }

    public void availableProducts() {
        for (Product p : this.products) {
            if (p.stock() > 0)
                System.out.println("Product name: " + p.name() + "- Price: " + p.price() + "- Stock: " + p.stock());
        }
    }
}
