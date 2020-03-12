package training.spring.microservice.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import training.spring.microservice.model.Product;
import training.spring.microservice.respository.ProductDAO;

@Service
public class ProductServiceImpl implements ProductService {
    
    @Autowired
    ProductDAO productDao;

    @Override
    public List<Product> getProudcts() {
        // TODO Auto-generated method stub
        List<Product> products = (List<Product>) productDao.findAll();
        
        if(products.size() > 0) {
            return products;
        } else {
            return new ArrayList<Product>();
        }
        
    }

    @Override
    public void addProduct() {
        Product product = new Product();
        product.setPrice("20");
        product.setName("book");
        
        productDao.save(product);

    }

    @Override
    public void removeProduct(Long id) {
        Optional<Product> product = productDao.findById(id);
        if(product.isPresent()) {
            productDao.deleteById(id);
        }
      

    }

    @Override
    public void updateProduct(Long Id) {
        Optional<Product> product = productDao.findById(Id);
        if(product.isPresent()) {
            Product entity = product.get();
            entity.setName(entity.getName() + "update");
            productDao.save(entity);
        }
        
    }

}
