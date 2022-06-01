package uz.pdp.lesson621.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import uz.pdp.lesson621.entity.Measurement;
import uz.pdp.lesson621.projection.CustomMeasurement;
import uz.pdp.lesson621.projection.CustomProduct;

@RepositoryRestResource(path = "measurement", excerptProjection = CustomMeasurement.class)
public interface MeasurementRepository extends JpaRepository<Measurement, Integer> {

boolean existsByName(String name);

}
