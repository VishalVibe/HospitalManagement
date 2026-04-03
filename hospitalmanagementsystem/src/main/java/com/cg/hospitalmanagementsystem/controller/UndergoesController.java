package com.cg.hospitalmanagementsystem.controller;

import com.cg.hospitalmanagementsystem.service.UndergoesService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/undergoes")
public class UndergoesController {

    private final UndergoesService undergoesService;

    public UndergoesController(UndergoesService undergoesService) {
        this.undergoesService = undergoesService;
    }

    // GET /api/undergoes/nurse/{nurseId}
    @GetMapping("/nurse/{nurseId}")
    public ResponseEntity<?> getProceduresByNurse(@PathVariable Integer nurseId) {
        return ResponseEntity.ok(undergoesService.getProceduresByNurse(nurseId));
    }
}