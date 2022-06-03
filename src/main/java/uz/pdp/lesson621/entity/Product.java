package uz.pdp.lesson621.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import uz.pdp.lesson621.entity.template.AbsEntity;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity

public class Product extends AbsEntity {

  //  @ManyToOne
 //   @JoinColumn(name = "category_id",referencedColumnName = "id")
    //private Category category;

  //  @ManyToOne
 //   @JoinColumn(name = "photo_id",referencedColumnName = "id")
 //   private Attachment photo;

    private String code;

    @ManyToOne

//    @JoinColumn(name = "measurement_id",referencedColumnName = "id")
    private Measurement measurement;
}
