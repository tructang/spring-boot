package training.spring.microservice.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import lombok.Data;




@Entity(name="product")
@Data
public class Product {
    @Id
    @NotNull
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    
    @Column
    private String name;
    
    private String price;

}
