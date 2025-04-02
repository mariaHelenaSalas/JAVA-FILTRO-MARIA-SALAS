package com.hospital.domain.repository;

import java.util.List;
import java.util.Optional;

import com.hospital.domain.entity.cita.Cita;

public interface CitaRepository {
    void save(Cita cita);

    List<Cita> findAll();

    Optional<Cita> findById(int id);

    void delete(int id);

}
