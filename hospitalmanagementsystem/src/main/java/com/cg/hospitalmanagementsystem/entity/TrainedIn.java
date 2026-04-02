package com.cg.hospitalmanagementsystem.entity;

import com.cg.hospitalmanagementsystem.entity.id.TrainedInId;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Table(name = "trained_in")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TrainedIn {

    @EmbeddedId
    private TrainedInId id;

    @ManyToOne
    @MapsId("physicianId")
    @JoinColumn(name = "Physician", referencedColumnName = "EmployeeID")
    private Physician physician;

    @ManyToOne
    @MapsId("procedureId")
    @JoinColumn(name = "Treatment", referencedColumnName = "Code")
    private Procedure procedure;

    @Column(name = "CertificationDate")
    private LocalDateTime certificationDate;

    @Column(name = "CertificationExpires")
    private LocalDateTime certificationExpires;
}

