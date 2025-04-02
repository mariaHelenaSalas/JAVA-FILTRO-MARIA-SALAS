package com.hospital.domain.repository;

import java.util.List;
import java.util.Optional;

import com.hospital.domain.entity.order.Paciente.Paciente;

public interface PacienteRepository {
    void save(Paciente paciente);
    List<Paciente> findAll();
    Optional<Paciente> findById(int id);
    void delete(int id);


}
