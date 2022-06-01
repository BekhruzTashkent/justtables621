package uz.pdp.lesson621.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import uz.pdp.lesson621.entity.template.AbsEntity;

import javax.persistence.Entity;

@EqualsAndHashCode(callSuper = true) // as in other class
@Data
@Entity

public class Currency extends AbsEntity {

//all in AbsEntity

}
