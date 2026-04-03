package com.cg.hospitalmanagementsystem.service;

import java.util.List;

public interface UndergoesService {
    List<Object> getProceduresByNurse(Integer nurseId);
}