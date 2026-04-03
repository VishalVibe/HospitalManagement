package com.cg.hospitalmanagementsystem.reposistory;

import com.cg.hospitalmanagementsystem.entity.Stay;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;



public interface StayRepository extends JpaRepository<Stay, Integer> {

    // GET /api/stays/{id}
    @Query(value = """
            SELECT s.StayID,
                   p.Name AS patientName,
                   r.RoomNumber,
                   r.BlockFloor,
                   r.BlockCode,
                   s.StayStart,
                   s.StayEnd
            FROM stay s
            JOIN patient p ON s.Patient = p.SSN
            JOIN room r ON s.Room = r.RoomNumber
            WHERE s.StayID = :id
            """, nativeQuery = true)
    Object getStayDetails(@Param("id") Integer id);
}