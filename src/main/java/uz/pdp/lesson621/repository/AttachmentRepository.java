package uz.pdp.lesson621.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import uz.pdp.lesson621.entity.Attachment;
import uz.pdp.lesson621.projection.CustomAttachment;
import uz.pdp.lesson621.projection.CustomCategory;
import uz.pdp.lesson621.projection.CustomMeasurement;

@RepositoryRestResource(path = "attachment",collectionResourceRel = "list", excerptProjection = CustomAttachment.class)
public interface AttachmentRepository extends JpaRepository<Attachment, Integer> {
}
