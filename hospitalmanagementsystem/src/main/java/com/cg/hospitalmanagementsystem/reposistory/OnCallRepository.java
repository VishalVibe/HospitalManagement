package com.cg.hospitalmanagementsystem.reposistory;

import com.cg.hospitalmanagementsystem.entity.OnCall;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


public interface OnCallRepository extends JpaRepository<OnCall, OnCallId> {


    @Query("SELECT c FROM OnCall c WHERE c.nurse.employeeId = :nurseId")
    List<OnCall> allCallsByNurseId(@Param("nurseId") Integer nurseId);
}

