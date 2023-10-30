package repo;

import java.util.ArrayList;
import java.util.List;

class ProductRepository implements Repository<Product> {
    private List<Product> products = new ArrayList<>();
    
    @Override
    public void add(Product item) {
        products.add(item);
        System.out.println("Added product: " + item.getName());
    }

    @Override
    public Product get(int id) {
        return null; 
    }

    @Override
    public void update(Product item) {
        System.out.println("Updated product: " + item.getName());
    }

    @Override
    public void delete(int id) {
        System.out.println("Deleted product with ID: " + id);
    }
}
