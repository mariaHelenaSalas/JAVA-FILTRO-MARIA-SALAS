package com.hospital.domain.repository;

import java.util.List;
import java.util.Optional;

import com.hospital.domain.entity.medico.Medico;

public interface MedicoRepository {
    public interface MedicoRepository {
        void guardar(Medico medico);
        List<Medico> obtenerTodos();
        Optional<Medico> obtenerPorId(int id);
        void eliminar(int id);
    }
}