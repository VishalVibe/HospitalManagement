package com.cg.hospitalmanagementsystem.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.cg.hospitalmanagementsystem.service.StayService;

@RestController
@RequestMapping("/api/stays")
public class StayController {

    private final StayService stayService;

    public StayController(StayService stayService) {
        this.stayService = stayService;
    }

    // GET /api/stays/{id}
    @GetMapping("/{id}")
    public ResponseEntity<?> getStayDetails(@PathVariable Integer id) {
        return ResponseEntity.ok(stayService.getStayDetails(id));
    }

    // GET /api/stays/patient/{patientId}
    @GetMapping("/patient/{patientId}")
    public ResponseEntity<?> getProceduresByPatient(@PathVariable Integer patientId) {
        return ResponseEntity.ok(stayService.getProceduresByPatient(patientId));
    }
}