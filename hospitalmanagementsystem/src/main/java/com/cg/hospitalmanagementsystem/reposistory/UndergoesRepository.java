package com.cg.hospitalmanagementsystem.reposistory;

import com.cg.hospitalmanagementsystem.entity.Undergoes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UndergoesRepository extends JpaRepository<Undergoes, Integer> {

    // GET /api/undergoes/nurse/{nurseId}
    @Query(value = """
            SELECT pr.Name AS procedureName,
                   pa.Name AS patientName,
                   ph.Name AS physicianName,
                   u.DateUndergoes,
                   u.Stay
            FROM undergoes u
            JOIN procedures pr ON u.Procedures = pr.Code
            JOIN patient pa ON u.Patient = pa.SSN
            JOIN physician ph ON u.Physician = ph.EmployeeID
            WHERE u.AssistingNurse = :nurseId
            """, nativeQuery = true)
    List<Object> getProceduresByNurse(@Param("nurseId") Integer nurseId);


    // GET /api/stays/patient/{patientId}
    @Query(value = """
            SELECT pr.Name AS procedureName,
                   u.DateUndergoes,
                   ph.Name AS physicianName,
                   n.Name AS nurseName,
                   u.Stay
            FROM undergoes u
            JOIN procedures pr ON u.Procedures = pr.Code
            JOIN physician ph ON u.Physician = ph.EmployeeID
            JOIN nurse n ON u.AssistingNurse = n.EmployeeID
            WHERE u.Patient = :patientId
            """, nativeQuery = true)
    List<Object> getProceduresByPatient(@Param("patientId") Integer patientId);
}