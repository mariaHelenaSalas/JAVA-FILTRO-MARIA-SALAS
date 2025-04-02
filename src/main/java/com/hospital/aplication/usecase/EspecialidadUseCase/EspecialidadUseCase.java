package com.hospital.aplication.usecase.EspecialidadUseCase;

import java.util.List;
import java.util.Optional;

import com.hospital.domain.entity.especialidad.Especialidad;
import com.hospital.domain.repository.EspecialidadRepository;

public class EspecialidadUseCase {

    private final EspecialidadRepository especialidadRepository;

    public EspecialidadUseCase(EspecialidadRepository especialidadRepository) {
        this.especialidadRepository = especialidadRepository;
    }

    public void registrarEspecialidad(Especialidad especialidad) {
        especialidadRepository.guardar(especialidad);
    }

    public List<Especialidad> listarEspecialidades() {
        return especialidadRepository.obtenerTodas();
    }

    public Optional<Especialidad> buscarEspecialidadPorId(int id) {
        return especialidadRepository.obtenerPorId(id);
    }

    public void eliminarEspecialidad(int id) {
        especialidadRepository.eliminar(id);
    }

}
