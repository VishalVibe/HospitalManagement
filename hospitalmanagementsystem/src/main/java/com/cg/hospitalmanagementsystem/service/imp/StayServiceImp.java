package com.cg.hospitalmanagementsystem.service.imp;

import com.cg.hospitalmanagementsystem.reposistory.StayRepository;
import com.cg.hospitalmanagementsystem.reposistory.UndergoesRepository;
import com.cg.hospitalmanagementsystem.service.StayService;
import org.springframework.stereotype.Service;

@Service
public class StayServiceImp implements StayService {

    private final StayRepository stayRepository;
    private final UndergoesRepository undergoesRepository;

    public StayServiceImp(StayRepository stayRepository,
                          UndergoesRepository undergoesRepository) {
        this.stayRepository = stayRepository;
        this.undergoesRepository = undergoesRepository;
    }

    // GET /api/stays/{id}
    @Override
    public Object getStayDetails(Integer id) {
        return stayRepository.getStayDetails(id);
    }

    // GET /api/stays/patient/{patientId}
    @Override
    public Object getProceduresByPatient(Integer patientId) {
        return undergoesRepository.getProceduresByPatient(patientId);
    }
}