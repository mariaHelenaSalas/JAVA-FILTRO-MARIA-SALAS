package com.hospital.infrastructure.persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.hospital.domain.entity.order.Paciente.Paciente;

public class PacienteRepositoryImpl {
    private final Connection connection;

    public PacienteRepositoryImpl(Connection connection) {
        this.connection = connection;
    }

    @Override
    public void save(Paciente paciente) {
        String sql = "INSERT INTO paciente (nombre, apellido, fecha_nacimiento, direccion, telefono, email) VALUES (?, ?, ?, ?, ?, ?)";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, paciente.getNombre());
            stmt.setString(2, paciente.getApellido());
            stmt.setDate(3, java.sql.Date.valueOf(paciente.getFechaNacimiento()));
            stmt.setString(4, paciente.getDireccion());
            stmt.setString(5, paciente.getTelefono());
            stmt.setString(6, paciente.getEmail());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


}

@Override
public List<Paciente> findAll() {
    List<Paciente> pacientes = new ArrayList<>();
    String sql = "SELECT * FROM paciente";
    try (PreparedStatement stmt = connection.prepareStatement(sql);
        ResultSet rs = stmt.executeQuery()) {
        while (rs.next()) {
            Paciente paciente = new Paciente(
                rs.getInt("id"),
                rs.getString("nombre"),
                rs.getString("apellido"),
                rs.getDate("fecha_nacimiento").toLocalDate(),
                rs.getString("direccion"),
                rs.getString("telefono"),
                rs.getString("email")
            );
            pacientes.add(paciente);
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return pacientes;
}



