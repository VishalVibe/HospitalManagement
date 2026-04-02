package com.cg.hospitalmanagementsystem.entity;

import com.cg.hospitalmanagementsystem.entity.id.UndergoesId;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "undergoes")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Undergoes {

    @EmbeddedId
    private UndergoesId id;

    @ManyToOne
    @MapsId("patientId")
    @JoinColumn(name = "Patient", referencedColumnName = "SSN")
    private Patient patient;

    @ManyToOne
    @MapsId("procedureId")
    @JoinColumn(name = "Procedures", referencedColumnName = "Code")
    private Procedure procedure;

    @ManyToOne
    @MapsId("stayId")
    @JoinColumn(name = "Stay", referencedColumnName = "StayID")
    private Stay stay;

    @ManyToOne
    @JoinColumn(name = "Physician", referencedColumnName = "EmployeeID")
    private Physician physician;

    @ManyToOne
    @JoinColumn(name = "AssistingNurse",referencedColumnName = "EmployeeID")
    private Nurse assistingNurse;


}


