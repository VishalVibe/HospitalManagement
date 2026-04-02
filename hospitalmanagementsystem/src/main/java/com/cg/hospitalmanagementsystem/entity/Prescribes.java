package com.cg.hospitalmanagementsystem.entity;

import com.cg.hospitalmanagementsystem.entity.id.PrescribesId;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "prescribes")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Prescribes {


    @EmbeddedId
    private PrescribesId id;


    @ManyToOne
    @MapsId("physicianId")
    @JoinColumn(name = "Physician", referencedColumnName = "EmployeeID")
    private Physician physician;


    @ManyToOne
    @MapsId("patientId")
    @JoinColumn(name = "Patient", referencedColumnName = "SSN")
    private Patient patient;


    @ManyToOne
    @MapsId("medicationId")
    @JoinColumn(name = "Medication", referencedColumnName = "Code")
    private Medication medication;


    @ManyToOne
    @JoinColumn(name = "Appointment", referencedColumnName = "AppointmentID")
    private Appointment appointment;


    @Column(name="Dose")
    private String dose;


    @Column(name = "Date")
    private LocalDateTime dateTime;
}
