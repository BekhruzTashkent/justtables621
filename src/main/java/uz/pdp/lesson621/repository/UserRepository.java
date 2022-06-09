package uz.pdp.lesson621.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.lesson621.entity.Output;
import uz.pdp.lesson621.entity.User;
import uz.pdp.lesson621.projection.CustomOutput;
import uz.pdp.lesson621.projection.CustomUser;

@RepositoryRestResource(path = "user", excerptProjection = CustomUser.class)
public interface UserRepository extends JpaRepository<User, Integer> {

   // boolean existsByNameAndCategoryId(String name, Integer category_id);

}
