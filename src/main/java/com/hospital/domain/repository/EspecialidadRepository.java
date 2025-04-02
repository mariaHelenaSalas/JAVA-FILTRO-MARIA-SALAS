package com.hospital.domain.repository;

import java.util.List;
import java.util.Optional;

import com.hospital.domain.entity.especialidad.Especialidad;

public interface EspecialidadRepository {
    void save(Especialidad especialidad);
    List<Especialidad> findAll();
    Optional<Especialidad> findById(int id);
    void delete(int id);


}
