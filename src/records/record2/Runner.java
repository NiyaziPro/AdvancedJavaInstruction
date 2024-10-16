package records.record2;

public class Runner {
    public static void main(String[] args) {
        Product product1 = new Product("Macbook",1550.99,11);
        Product product2 = new Product("Ipad",1070.99,6);

        ProductService service = new ProductService();
        service.addProduct(product1);
        service.addProduct(product2);

        System.out.println("Available Products :");
        service.availableProducts();


    }
}
