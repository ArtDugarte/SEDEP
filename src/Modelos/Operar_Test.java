package Modelos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Operar_Test {
    
    public ArrayList lista(){

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

                result = bd.consultar("SELECT * FROM `resultado` WHERE borrado = 0");

                while (result.next() == true) {
                    iv = new Modelo();
                    iv.setId_diagnostico(Integer.parseInt(result.getString("id")));
                    iv.setNombre_diagnostico(result.getString("diagnostico"));
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
    
    public ArrayList lista_pd(int id){

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

                result = bd.consultar("SELECT * FROM `pregunta_resultado` WHERE id_resultado = "+ id + " ORDER BY id_pregunta ASC");

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
