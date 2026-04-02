package com.cg.hospitalmanagementsystem.entity.id;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Objects;

@Embeddable
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UndergoesId implements Serializable {


    @Column(name = "Patient")
    private Integer patientId;


    @Column(name = "Procedures")
    private Integer procedureId;


    @Column(name = "Stay")
    private Integer stayId;


    @Column(name = "DateUndergoes")
    private LocalDateTime dateUndergoes;
}
