package Modelos;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Operar_Login {

    public Modelo Ingresar(String usuario, String clave) {

        ResultSet rs = null;
        Modelo m = new Modelo();

        BD.BDConex bd = new BD.BDConex();

        rs = bd.consultar("SELECT * FROM usuario WHERE Nombre='" + usuario + "' AND Clave='" + clave + "';");

        try {
            if (rs.first()) {

                rs.beforeFirst();
                rs.next();
                m.setAdmin(rs.getBoolean("Tipo"));

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
