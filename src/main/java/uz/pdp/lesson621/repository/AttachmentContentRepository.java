package uz.pdp.lesson621.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.lesson621.entity.AttachmentContent;
import uz.pdp.lesson621.projection.CustomAttachment;

@RepositoryRestResource(path = "zero", excerptProjection = CustomAttachment.class)
public interface AttachmentContentRepository extends JpaRepository<AttachmentContent, Integer> {
}
