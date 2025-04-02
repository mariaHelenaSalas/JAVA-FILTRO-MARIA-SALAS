package com.hospital.infrastructure.database;

import java.sql.Connection;
import java.sql.DriverManager;
import com.hospital.Config.HexaSingleton;
import java.sql.SQLException;

public class ConnMySql implements ConnectionDb {

    @Override
    public Connection getConexion() throws SQLException {
        HexaSingleton config = HexaSingleton.INSTANCIA;

        String url = config.get("db.url");
        String user = config.get("db.user");
        String password = config.get("db.password");

        // System.out.println("Conectando a la base de datos..." + user);
        return DriverManager.getConnection(url, user, password);

    }

}
