package uz.pdp.lesson621.projection;


import org.springframework.data.rest.core.config.Projection;
import uz.pdp.lesson621.entity.Measurement;

@Projection(types = Measurement.class)
public interface CustomMeasurement {

    Integer getId();
    String getName();

}
