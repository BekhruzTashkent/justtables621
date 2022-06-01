package uz.pdp.lesson621.projection;


import org.springframework.data.rest.core.config.Projection;
import uz.pdp.lesson621.entity.Product;

@Projection(types = Product.class)
public interface CustomProduct {

    Integer getId();
    String getName();
    String getCode();

}
