package ss12_java_collection_framework.java_collection_framework_demo;

import java.util.ArrayList;
import java.util.List;

public class ProductManager implements IManager<Product>{

    private List<Product> products;

    public ProductManager() {
        products = new ArrayList<>();
    }
    @Override
    public void add(Product product) {
        products.add(product);
    }

    @Override
    public List<Product> list() {
        return products;
    }
}
