package com.cg.hospitalmanagementsystem.reposistory;

import com.cg.hospitalmanagementsystem.entity.Prescribes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


public interface PrescriptionRepository extends JpaRepository<Prescribes, PrescribesId> {


    @Query("SELECT p FROM Prescribes p WHERE p.physician.employeeId = :physicianId")
    List<Prescribes> getPrescriptionsByPhysicianId(@Param("physicianId") Integer physicianId);
}
