package uz.pdp.lesson621.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import uz.pdp.lesson621.entity.template.AbsEntity;

import javax.persistence.*;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity

public class Product extends AbsEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

   @OneToOne(cascade = CascadeType.PERSIST)
   private Category category;

   @OneToOne(cascade = CascadeType.PERSIST)
   private Attachment photo;

    private String code;

 //   @OneToOne
  //  private Measurement measurement;

    public void setCategory(Category category){
        category.setName(String.valueOf(this));
        this.category = category;
    }

    public void setPhoto(Attachment photo){
        photo.setName(String.valueOf(this));
        photo.setContentType(String.valueOf(this));
        photo.setSize(String.valueOf(this));

        this.photo=photo;
    }

//    public void setMeasurement(Measurement measurement){
//        measurement.setName(String.valueOf(this));
//
//        this.measurement=measurement;
//    }
}
