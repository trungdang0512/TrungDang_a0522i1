package ss00_review.service;

import ss00_review.modal.Product;
import ss00_review.repository.IProductRepository;
import ss00_review.repository.ProductRepositoryImpl;

import java.util.List;

public class ProductServiceImpl implements IProductService{
    private IProductRepository repository = new ProductRepositoryImpl();

    @Override
    public void addProduct(Product product) {
        repository.addProduct(product);
    }

    @Override
    public void removeProduct(int id) {
        repository.removeProduct(id);
    }

    @Override
    public List<Product> findAll() {
        return repository.findAll();
    }
}
