package Modelos;

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Operar_Pregunta {

    public boolean buscar(String pregunta) {

        ResultSet rs = null;
        BD.BDConex bd = new BD.BDConex();
        boolean resultado;
        resultado = false;

        rs = bd.consultar("SELECT * FROM `pregunta` WHERE `pregunta` = \"" + pregunta + "\"");

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

    public boolean Crear(String pregunta) {

        int op = 0;
        BD.BDConex bd = new BD.BDConex();
        boolean correcto = false;

        if (!buscar(pregunta)) {

            op = bd.ejecutar("INSERT INTO `sedep`.`pregunta` (`id`, `pregunta`) "
                    + "VALUES (NULL, '" + pregunta + "');");

            if (op > 0) {

                correcto = true;
                JOptionPane.showMessageDialog(null, "     ¡Creación Exitosa!", "¡OPERACIÓN EXITOSA!", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "¡Ocurrio un error en la operación! \n        Intente Nuevamente...", "¡ERROR!", JOptionPane.ERROR_MESSAGE);
            }

        } else {
            JOptionPane.showMessageDialog(null, "     ¡Pregunta Existente! \n    Intente Nuevamente...", "¡ERROR!", JOptionPane.ERROR_MESSAGE);
        }
        bd.desconectar();
        return correcto;
    }

    public boolean modificar(String pregunta, int id) {

        int op = 0;
        BD.BDConex bd = new BD.BDConex();
        boolean correcto = false;

        if (!buscar(pregunta)) {

            op = bd.ejecutar("UPDATE pregunta SET pregunta=\"" + pregunta + "\" WHERE id = " + id);

            if (op > 0) {

                correcto = true;
                JOptionPane.showMessageDialog(null, "   ¡Modificaión Exitosa!", "¡OPERACIÓN EXITOSA!", JOptionPane.INFORMATION_MESSAGE);
            } else {

                JOptionPane.showMessageDialog(null, "¡Ocurrio un error en la operación! \n        Intente Nuevamente...", "¡ERROR!", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "     ¡Registro Existente! \n    Intente Nuevamente...", "¡ERROR!", JOptionPane.ERROR_MESSAGE);
        }

        bd.desconectar();
        return correcto;
    }
}
