package Modelos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Operar_Paciente {

    Operar_Usuario usuario = new Operar_Usuario();

    public boolean buscar(String ci) {

        ResultSet rs = null;
        BD.BDConex bd = new BD.BDConex();
        boolean resultado;
        resultado = false;

        rs = bd.consultar("SELECT * FROM `paciente` WHERE `cedula` = \"" + ci + "\"");

        try {
            if (rs.first()) {
                rs.beforeFirst();
                rs.next();
                resultado = true;
            } else {
                resultado = false;
            }
        } catch (SQLException e) {

            e.printStackTrace();
        }
        return resultado;
    }

    public boolean Crear(String ci, String nombre) {

        int op = 0, id;
        id = 0;
        BD.BDConex bd = new BD.BDConex();
        boolean correcto = false;
        Modelo modelo = null;

        if (!buscar(ci)) {

            if (usuario.Crear(ci) > 0) {

                id = usuario.ultimo_id();

                op = bd.ejecutar("INSERT INTO `sedep`.`paciente` (`id`, `nombre`, `cedula`, `id_usuario`) "
                        + "VALUES (NULL, '" + nombre + "', '" + ci + "', '" + id + "');");

                if (op > 0) {

                    correcto = true;
                    JOptionPane.showMessageDialog(null, "     ¡Creación Exitosa!", "¡OPERACIÓN EXITOSA!", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "¡Ocurrio un error en la operación! \n        Intente Nuevamente...", "¡ERROR!", JOptionPane.ERROR_MESSAGE);
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "     ¡Paciente Existente! \n    Intente Nuevamente...", "¡ERROR!", JOptionPane.ERROR_MESSAGE);
        }
        bd.desconectar();
        return correcto;
    }

    public Modelo buscar_paciente(String ci) {

        ResultSet rs = null;
        BD.BDConex bd = new BD.BDConex();
        Modelo m = new Modelo();

        rs = bd.consultar("SELECT * FROM `paciente` WHERE `cedula` = \"" + ci + "\"");

        try {
            if (rs.first()) {
                rs.beforeFirst();
                rs.next();
                m.setCedula(rs.getString("cedula"));
                m.setNombre(rs.getString("nombre"));
                m.setId_p(rs.getInt("id"));
            } else {
                JOptionPane.showMessageDialog(null, "     ¡Paciente no existe! \n    Intente Nuevamente...", "¡ERROR!", JOptionPane.ERROR_MESSAGE);
                m = null;
            }
        } catch (SQLException e) {

            e.printStackTrace();
        }
        return m;
    }

    public boolean modificar(String nombre, String ci) {

        int op = 0;
        BD.BDConex bd = new BD.BDConex();
        boolean correcto = false;

        op = bd.ejecutar("UPDATE paciente SET nombre=\"" + nombre + "\" WHERE cedula = \"" + ci + "\"");

        if (op > 0) {

            correcto = true;
            JOptionPane.showMessageDialog(null, "   ¡Modificaión Exitosa!", "¡OPERACIÓN EXITOSA!", JOptionPane.INFORMATION_MESSAGE);
        } else {

            JOptionPane.showMessageDialog(null, "¡Ocurrio un error en la operación! \n        Intente Nuevamente...", "¡ERROR!", JOptionPane.ERROR_MESSAGE);
        }
        bd.desconectar();
        return correcto;
    }

    public boolean modificar(String nombre, String ci, String ci_v) {

        int op = 0;
        BD.BDConex bd = new BD.BDConex();
        boolean correcto = false;

        if (buscar(ci)) {

            JOptionPane.showMessageDialog(null, "     ¡Paciente Existente! \n    Intente Nuevamente...", "¡ERROR!", JOptionPane.ERROR_MESSAGE);
        } else {

            usuario.modificar(ci, ci_v);
            op = bd.ejecutar("UPDATE paciente SET nombre=\"" + nombre + "\", cedula=\"" + ci + "\" WHERE cedula = \"" + ci_v + "\"");

            if (op > 0) {

                correcto = true;
                JOptionPane.showMessageDialog(null, "   ¡Modificaión Exitosa!", "¡OPERACIÓN EXITOSA!", JOptionPane.INFORMATION_MESSAGE);
            } else {

                JOptionPane.showMessageDialog(null, "¡Ocurrio un error en la operación! \n        Intente Nuevamente...", "¡ERROR!", JOptionPane.ERROR_MESSAGE);
            }
        }
        bd.desconectar();
        return correcto;
    }

    public ArrayList Historial(int id) {

        ArrayList lista = new ArrayList<String>();
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

                result = bd.consultar("SELECT resultado.diagnostico FROM resultado, historial "
                        + "WHERE historial.id_paciente = "+ id + " And historial.id_resultado = resultado.id");

                while (result.next() == true) {
                    
                    lista.add(result.getString("resultado.diagnostico"));
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
