package Modelos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Desplegable_Diagnostico {
   
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

                result = bd.consultar("SELECT * FROM `resultado` Where borrado = 0 ORDER BY id");

                while (result.next() == true) {
                    iv = new Modelo();
                    iv.setDiagnostico(result.getString("diagnostico"));
                    iv.setId_diagnostico(Integer.parseInt(result.getString("id")));
                    iv.setRecomendacion(result.getString("recomendacion"));
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
    
    public ArrayList Preguntas(int id) {

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

                result = bd.consultar("SELECT * FROM `pregunta_resultado` Where id_resultado = '"+ id +"'");

                while (result.next() == true) {
                    iv = new Modelo();
                    iv.setId_pregunta(Integer.parseInt(result.getString("id_pregunta")));
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
