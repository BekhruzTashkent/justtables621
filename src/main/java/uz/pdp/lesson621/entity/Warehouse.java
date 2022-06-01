package uz.pdp.lesson621.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import uz.pdp.lesson621.entity.template.AbsEntity;

import javax.persistence.Entity;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity

public class Warehouse extends AbsEntity {



}
