package uz.pdp.lesson621.projection;


import org.springframework.data.rest.core.config.Projection;
import uz.pdp.lesson621.entity.Category;

@Projection(types = Category.class)
public interface CustomCategory {
    Integer getId();
    String getName();
}
