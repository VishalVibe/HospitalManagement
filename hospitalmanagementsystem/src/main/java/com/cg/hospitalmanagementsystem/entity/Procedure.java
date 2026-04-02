package com.cg.hospitalmanagementsystem.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Table(name = "procedures")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Procedure {

    @Id
    @Column(name = "Code")
    private Integer code;

    @Column(name = "Name")
    private String name;

    @Column(name = "Cost")
    private Double cost;
}

