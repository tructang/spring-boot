package training.spring.microservice.service.impl;

import java.util.List;

import training.spring.microservice.model.Product;


public interface ProductService {
    public List<Product> getProudcts();
    public void addProduct();
    public void removeProduct(Long Id);
    public void updateProduct(Long Id);
    

}
