package com.cg.hospitalmanagementsystem.service.imp;

import com.cg.hospitalmanagementsystem.reposistory.UndergoesRepository;
import com.cg.hospitalmanagementsystem.service.UndergoesService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UndergoesServiceImp implements UndergoesService {

    private final UndergoesRepository undergoesRepository;

    public UndergoesServiceImp(UndergoesRepository undergoesRepository) {
        this.undergoesRepository = undergoesRepository;
    }

    @Override
    public List<Object> getProceduresByNurse(Integer nurseId) {
        return undergoesRepository.getProceduresByNurse(nurseId);
    }
}