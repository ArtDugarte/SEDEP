package Modelos;

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Operar_Usuario {

    public boolean Consultar(String clave, String usuario) {

        ResultSet rs = null;
        boolean resultado = false;

        BD.BDConex bd = new BD.BDConex();

        rs = bd.consultar("SELECT * FROM usuario WHERE Clave='" + clave + "' And Nombre = '" + usuario + "';");

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
        bd.desconectar();
        return resultado;
    }

    public boolean modificar(String clave_vieja, String clave_nueva, String usuario) {

        int op = 0;
        BD.BDConex bd = new BD.BDConex();
        boolean correcto = false;

        op = bd.ejecutar("UPDATE usuario SET clave=\"" + clave_nueva + "\" WHERE clave=\"" + clave_vieja + "\" And Nombre = '" + usuario + "'; ");

        if (op > 0) {
            correcto = true;
            JOptionPane.showMessageDialog(null, "La Contraseña se modificó exitosamente", "¡OPERACIÓN EXITOSA!", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Ocurrio un Error al modificar la Contraseña \n        Intente Nuevamente...", "¡ERROR!", JOptionPane.ERROR_MESSAGE);
        }
        bd.desconectar();
        return correcto;
    }

    public int Crear(String ci) {

        int op = 0;
        BD.BDConex bd = new BD.BDConex();
        Modelo modelo = null;

        op = bd.ejecutar("INSERT INTO `sedep`.`usuario` (`id`, `Nombre`, `Clave`, `Tipo`) "
                + "VALUES (NULL, '" + ci + "', '" + ci + "', '0');");

        return op;
    }

    public int ultimo_id() {

        int id;
        id = 0;

        ResultSet rs = null;

        BD.BDConex bd = new BD.BDConex();

        rs = bd.consultar("SELECT MAX(id) AS id FROM usuario");

        try {
            if (rs.first()) {

                rs.beforeFirst();
                rs.next();
                id = rs.getInt("id");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return id;
    }

    public void modificar(String usuario, String ci) {
        
        int op = 0;
        BD.BDConex bd = new BD.BDConex();
        boolean correcto = false;

        op = bd.ejecutar("UPDATE usuario SET nombre=\"" + usuario + "\" WHERE Nombre = '" + ci + "'; ");
    }
}
