package Modelos;

import java.sql.Connection;
import java.sql.*;
import java.sql.SQLException;


public class Mostrar_Historial {

    public Modelo Comparar(String MiUs) {
        Modelo m = new Modelo();
        ResultSet rs = null;
        BD.BDConex bd = new BD.BDConex();

        rs = bd.consultar("SELECT id FROM usuario WHERE Nombre='" + MiUs + "';");

        try {
            if (rs.first()) {

                rs.beforeFirst();
                rs.next();
                m.setId_usuario(rs.getString("id"));
                ResultSet res;
                
                String id_t = m.getId_usuario();

                res = bd.consultar("SELECT id FROM paciente WHERE id_usuario ='" + id_t + "';");

                try {
                    if (res.first()) {

                        res.beforeFirst();
                        res.next();
                        m.setId_paciente(res.getString("id"));
                        
                    } else {
                        m = null;
                    }
                System.out.println(res.getString("id"));
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                bd.desconectar();
                return m;

            } else {
                m = null;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        bd.desconectar();
        return m;
    }
}
