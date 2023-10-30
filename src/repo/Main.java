package repo;

public class Main {
    public static void main(String[] args) {
        Repository<Product> productRepository = new ProductRepository();
        Repository<Product> loggingRepository = new LoggingRepositoryDecorator<>(productRepository);

        Product newProduct = new Product(0, "Example Product", 0, null);
        loggingRepository.add(newProduct);
        loggingRepository.get(1);
        loggingRepository.update(newProduct);
        loggingRepository.delete(1);
    }
}

