package com.hospital.aplication.usecase.MedicoUseCase;

import java.util.List;
import java.util.Optional;

import com.hospital.domain.entity.medico.Medico;
import com.hospital.domain.repository.MedicoRepository;

public class MedicoUseCase {
    private final MedicoRepository medicoRepository;

    public MedicoUseCase(MedicoRepository medicoRepository) {
        this.medicoRepository = medicoRepository;
    }

    public void registrarMedico(Medico medico) {
        medicoRepository.guardar(medico);
    }

    public List<Medico> listarMedicos() {
        return medicoRepository.obtenerTodos();
    }

    public Optional<Medico> buscarMedicoPorId(int id) {
        return medicoRepository.obtenerPorId(id);
    }

    public void eliminarMedico(int id) {
        medicoRepository.eliminar(id);
    }

}
