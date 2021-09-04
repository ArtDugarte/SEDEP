package Modelos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Desplegable_Pregunta {
    
    public ArrayList Desplegable() {

        ArrayList lista = new ArrayList<>();
        int op = 0;
        BD.BDConex bd = new BD.BDConex();
        boolean correcto = false;
        PreparedStatement statement = null;
        ResultSet result = null;
        Connection connection;

        Modelo iv;
        connection = bd.getConexion();

        try {

            if (connection != null) {

                result = bd.consultar("SELECT * FROM `pregunta` ORDER BY id");

                while (result.next() == true) {
                    iv = new Modelo();
                    iv.setPregunta(result.getString("pregunta"));
                    iv.setId_pregunta(Integer.parseInt(result.getString("id")));
                    lista.add(iv);
                }
            }
        } catch (SQLException e) {

            System.out.println(e);

        } finally {

            try {

                connection.close();
                bd.desconectar();

            } catch (SQLException e) {

                e.printStackTrace();
            }
        }
        return lista;
    }
}
