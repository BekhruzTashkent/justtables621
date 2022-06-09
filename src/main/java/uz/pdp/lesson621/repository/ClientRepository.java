package uz.pdp.lesson621.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.lesson621.entity.Client;
import uz.pdp.lesson621.entity.Output;
import uz.pdp.lesson621.projection.CustomClient;
import uz.pdp.lesson621.projection.CustomOutput;

@RepositoryRestResource(path = "client", excerptProjection = CustomClient.class)
public interface ClientRepository extends JpaRepository<Client, Integer> {

   // boolean existsByNameAndCategoryId(String name, Integer category_id);

}
