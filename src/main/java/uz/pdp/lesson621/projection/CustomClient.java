package uz.pdp.lesson621.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.lesson621.entity.Output;

import java.util.Date;

@Projection(types = Output.class)
public interface CustomClient {

   Integer   getId();
   String  getName();
   String getPhone_number();

}
