package training.spring.microservice.respository;



import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import training.spring.microservice.model.Product;

@Repository
public interface ProductDAO extends CrudRepository<Product, Long> {
   


}
