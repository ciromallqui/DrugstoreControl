package Control;

import Class.CLogeo;
import MFC.util.JLibrary.EncryptingKey;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *@author CIRO
 */
public class DLogeo {
    private static Statement st;
    private static ResultSet rs;
    public static boolean ingresar(String usuario, String clave){
        boolean estado = false;
        try {
            st = Conexion.Conectar().createStatement();
            rs = st.executeQuery("SELECT EXISTS(SELECT id_usuario FROM t_usuario WHERE nombre_usuario='"+usuario+"' AND clave='"+EncryptingKey.md5(clave)+"')");
            if(rs.next()){
                estado = rs.getBoolean(1);
            }
        } catch (SQLException | NullPointerException e) {
            JOptionPane.showMessageDialog(null, "INICIE SU GESTIÓN DE BASE DE DATOS");
        }
        return estado;
    }
    
    public static void getDatosUsuario(String usuario, String clave){
        try {
            st = Conexion.Conectar().createStatement();
            rs = st.executeQuery("SELECT id_usuario,nombre,tipo_usuario,nombre_usuario,clave FROM t_usuario WHERE nombre_usuario='"+usuario+"' AND clave='"+EncryptingKey.md5(clave)+"'");
            if(rs.next()){
                CLogeo.setIdUsuario(rs.getString(1));
                CLogeo.setNombre(rs.getString(2));
                CLogeo.setTipoUsuario(rs.getString(3));
                CLogeo.setNombreUsuario(rs.getString(4));
                CLogeo.setClave(rs.getString(5));
            }
        } catch (SQLException | NullPointerException e) {}
    }
}
