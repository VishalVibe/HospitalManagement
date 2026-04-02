package com.cg.hospitalmanagementsystem.entity.id;


import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.*;

import java.io.Serializable;

@Data
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class TrainedInId implements Serializable {


    @Column(name = "Physician")
    private Integer physicianId;


    @Column(name = "Treatment")
    private Integer procedureId;
}
