package uz.pdp.lesson621.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import uz.pdp.lesson621.entity.Product;
import uz.pdp.lesson621.projection.CustomAttachment;
import uz.pdp.lesson621.projection.CustomProduct;

@RepositoryRestResource(path = "product", excerptProjection = CustomProduct.class)
public interface ProductRepository extends JpaRepository<Product, Integer> {

   // boolean existsByNameAndCategoryId(String name, Integer category_id);

}
