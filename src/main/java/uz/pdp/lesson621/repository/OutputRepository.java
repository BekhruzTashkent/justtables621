package uz.pdp.lesson621.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.lesson621.entity.Output;
import uz.pdp.lesson621.entity.Product;
import uz.pdp.lesson621.projection.CustomOutput;
import uz.pdp.lesson621.projection.CustomProduct;

@RepositoryRestResource(path = "output", excerptProjection = CustomOutput.class)
public interface OutputRepository extends JpaRepository<Output, Integer> {

   // boolean existsByNameAndCategoryId(String name, Integer category_id);

}
