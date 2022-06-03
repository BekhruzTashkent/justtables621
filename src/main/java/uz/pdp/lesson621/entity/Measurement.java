package uz.pdp.lesson621.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import uz.pdp.lesson621.entity.template.AbsEntity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.*;

@EqualsAndHashCode(callSuper = true)// we need this because in AbsEntity there such methods and we should implement them here
@Data
//remove allArg and noArg
@Entity
@Table(name = "measurement" )
public class Measurement extends AbsEntity {

//all data field in AbsEntity

}
