package com.cg.hospitalmanagementsystem.entity.id;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Embeddable
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PrescribesId implements Serializable {


    @Column(name = "Physician")
    private Integer physicianId;


    @Column(name = "Patient")
    private Integer patientId;


    @Column(name = "Medication")
    private Integer medicationId;
}

