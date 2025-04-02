package com.hospital.aplication.usecase.CitaUseCase;

public class CitaUseCase {
    private final CitaRepository citaRepository;

    public CitaUseCase(CitaRepository citaRepository) {
        this.citaRepository = citaRepository;
    }

    public void agendarCita(Cita cita) {
        citaRepository.guardar(cita);
    }

    public List<Cita> listarCitas() {
        return citaRepository.obtenerTodas();
    }

    public Optional<Cita> buscarCitaPorId(int id) {
        return citaRepository.obtenerPorId(id);
    }

    public void cancelarCita(int id) {
        citaRepository.eliminar(id);
    }
}



