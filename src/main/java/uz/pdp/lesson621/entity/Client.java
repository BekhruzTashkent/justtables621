package uz.pdp.lesson621.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import uz.pdp.lesson621.entity.template.AbsEntity;

import javax.persistence.Column;
import javax.persistence.Entity;

@EqualsAndHashCode(callSuper = true) //its because we extend AbsEntity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity

public class Client extends AbsEntity {

    @Column(nullable = false, unique = true)
    private String phoneNumber;

}




