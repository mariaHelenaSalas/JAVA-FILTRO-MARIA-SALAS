package com.hospital.domain.entity.medico;

public class Medico {
    private int id;
    private String nombre;
    private int especialidadId;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getEspecialidadId() {
        return especialidadId;
    }
    public void setEspecialidadId(int especialidadId) {
        this.especialidadId = especialidadId;
    }
    public String getHorarioInicio() {
        return horarioInicio;
    }
    public void setHorarioInicio(String horarioInicio) {
        this.horarioInicio = horarioInicio;
    }
    public String getHorarioFin() {
        return horarioFin;
    }
    public void setHorarioFin(String horarioFin) {
        this.horarioFin = horarioFin;
    }
    private String horarioInicio;
    private String horarioFin;
}
