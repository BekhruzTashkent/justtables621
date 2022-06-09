package uz.pdp.lesson621.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.lesson621.entity.Input;
import uz.pdp.lesson621.entity.Output;
import uz.pdp.lesson621.projection.CustomInput;
import uz.pdp.lesson621.projection.CustomOutput;

@RepositoryRestResource(path = "input", excerptProjection = CustomInput.class)
public interface inputRepository extends JpaRepository<Input, Integer> {

   // boolean existsByNameAndCategoryId(String name, Integer category_id);

}
