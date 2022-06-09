package uz.pdp.lesson621.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.lesson621.entity.Output;
import uz.pdp.lesson621.entity.Supplier;
import uz.pdp.lesson621.projection.CustomOutput;
import uz.pdp.lesson621.projection.CustomSupplier;

@RepositoryRestResource(path = "supplier", excerptProjection = CustomSupplier.class)
public interface SupplierRepository extends JpaRepository<Supplier, Integer> {

   // boolean existsByNameAndCategoryId(String name, Integer category_id);

}
