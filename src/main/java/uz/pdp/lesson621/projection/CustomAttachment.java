package uz.pdp.lesson621.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.lesson621.entity.Attachment;

@Projection(types = Attachment.class)
public interface CustomAttachment {

   Integer   getId();
   String  getName();
   Integer getSize();
   String getContentType();

}
