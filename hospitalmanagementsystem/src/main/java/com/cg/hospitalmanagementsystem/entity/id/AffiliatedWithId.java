package com.cg.hospitalmanagementsystem.entity.id;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Embeddable
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class AffiliatedWithId implements Serializable {


    @Column(name = "Physician")
    private Integer physicianId;


    @Column(name = "Department")
    private Integer departmentId;
}

