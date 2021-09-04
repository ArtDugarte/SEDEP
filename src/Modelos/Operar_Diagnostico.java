package Modelos;

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Operar_Diagnostico {

    public boolean buscar(String diagnostico) {

        ResultSet rs = null;
        BD.BDConex bd = new BD.BDConex();
        boolean resultado;
        resultado = false;

        rs = bd.consultar("SELECT * FROM `resultado` WHERE `diagnostico` = \"" + diagnostico + "\" And borrado = 0");

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

    public boolean Crear(String diagnostico, String recomendacion) {

        int op = 0;
        BD.BDConex bd = new BD.BDConex();
        boolean correcto = false;

        if (!buscar(diagnostico)) {

            op = bd.ejecutar("INSERT INTO `sedep`.`resultado` (`id`, `diagnostico`, `recomendacion`,`borrado`) "
                    + "VALUES (NULL, '" + diagnostico + "', '" + recomendacion + "', 0);");

            if (op > 0) {

                correcto = true;
            } else {
                JOptionPane.showMessageDialog(null, "¡Ocurrio un error en la operación! \n        Intente Nuevamente...", "¡ERROR!", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "     ¡Registro Existente! \n    Intente Nuevamente...", "¡ERROR!", JOptionPane.ERROR_MESSAGE);
        }
        bd.desconectar();
        return correcto;
    }

    public boolean agregar_pregunta(int id_p) {

        int op = 0;
        int id_r = ultimo_resultado();
        BD.BDConex bd = new BD.BDConex();
        boolean correcto = false;

        op = bd.ejecutar("INSERT INTO `sedep`.`pregunta_resultado` (`id_pregunta`, `id_resultado`) "
                + "VALUES ('" + id_p + "', '" + id_r + "');");

        if (op > 0) {

            correcto = true;
        }

        bd.desconectar();
        return correcto;
    }

    public int ultimo_resultado() {

        ResultSet rs = null;
        BD.BDConex bd = new BD.BDConex();
        int resultado;
        resultado = 0;

        rs = bd.consultar("SELECT MAX(id) AS id FROM resultado");

        try {
            if (rs.first()) {
                rs.beforeFirst();
                rs.next();
                resultado = Integer.parseInt(rs.getString("id"));
            }
        } catch (SQLException e) {

            e.printStackTrace();
        }
        return resultado;
    }

    public boolean borrar(int id) {

        int op = 0;
        BD.BDConex bd = new BD.BDConex();
        boolean correcto = false;

        op = bd.ejecutar("UPDATE resultado SET borrado = 1 WHERE id = " + id);

        if (op > 0) {

            correcto = true;
            JOptionPane.showMessageDialog(null, "   ¡Borrado Exitoso!", "¡OPERACIÓN EXITOSA!", JOptionPane.INFORMATION_MESSAGE);
        } else {

            JOptionPane.showMessageDialog(null, "¡Ocurrio un error en la operación! \n        Intente Nuevamente...", "¡ERROR!", JOptionPane.ERROR_MESSAGE);
        }
        bd.desconectar();
        return correcto;
    }
}
