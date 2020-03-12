package training.spring.microservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import training.spring.microservice.model.Product;
import training.spring.microservice.service.impl.ProductService;

@RestController
@RequestMapping(value="product")
public class ProductController {
    
    @Autowired
    ProductService productService;
    
    @RequestMapping(value="/list")
    public List<Product> getProducts() {
        return productService.getProudcts();
        
    }
    
    @RequestMapping(value="/remove/{id}")
    public void removeProuduct(@PathVariable("id") Long id) 
    {
        productService.removeProduct(id);
        
    }
    
    @RequestMapping(value="/add")
    public void addProduct() {
        productService.addProduct();
    }
    
    @RequestMapping(value="/update/{id}")
    public void updateProduct(@PathVariable("id") Long id) 
    {
        productService.updateProduct(id);
    }

}
