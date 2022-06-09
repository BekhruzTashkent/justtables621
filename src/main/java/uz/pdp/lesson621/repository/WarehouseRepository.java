package uz.pdp.lesson621.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.lesson621.entity.Output;
import uz.pdp.lesson621.entity.Warehouse;
import uz.pdp.lesson621.projection.CustomOutput;
import uz.pdp.lesson621.projection.CustomWarehouse;

@RepositoryRestResource(path = "warehouse", excerptProjection = CustomWarehouse.class)
public interface WarehouseRepository extends JpaRepository<Warehouse, Integer> {

   // boolean existsByNameAndCategoryId(String name, Integer category_id);

}
