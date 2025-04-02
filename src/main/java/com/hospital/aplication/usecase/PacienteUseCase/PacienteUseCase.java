package com.hospital.aplication.usecase.PacienteUseCase;

import java.util.List;
import java.util.Optional;

import com.hospital.domain.entity.order.Paciente.Paciente;
import com.hospital.domain.repository.PacienteRepository;

public class PacienteUseCase {
    private final PacienteRepository pacienteRepository;

    public PacienteUseCase(PacienteRepository pacienteRepository) {
        this.pacienteRepository = pacienteRepository;
    }

    public void registrarPaciente(Paciente paciente) {
        pacienteRepository.guardar(paciente);
    }

    public List<Paciente> listarPacientes() {
        return pacienteRepository.obtenerTodos();
    }

    public Optional<Paciente> buscarPacientePorId(int id) {
        return pacienteRepository.obtenerPorId(id);
    }

    public void eliminarPaciente(int id) {
        pacienteRepository.eliminar(id);
    }

}
