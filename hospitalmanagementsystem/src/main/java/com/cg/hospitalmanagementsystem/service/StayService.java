package com.cg.hospitalmanagementsystem.service;

public interface StayService {
    Object getStayDetails(Integer id);
    Object getProceduresByPatient(Integer patientId);
}