package Control;

import Class.CLogeo;
import Class.CUsuario;
import MFC.util.JLibrary.EncryptingKey;
import Option.Codigo;
import Option.Opcion;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class DUsuario {
    private static ResultSet rs;
    private static Statement st;
    public static void insertEncargado(CUsuario e){
        try {
            st = Conexion.Conectar().createStatement();
            st.executeUpdate("INSERT INTO usuario VALUES('"+Codigo.id(3, Opcion.getContador("usuario"))+"','"+e.getNombre()+"','"+e.getTipousuario()+"','"+e.getDni()+"','"+EncryptingKey.md5(e.getClave())+"')");
            st.executeUpdate("UPDATE codigo SET contador="+Opcion.getContador("usuario")+" WHERE tabla='usuario'");
            JOptionPane.showMessageDialog(null, "Cuenta "+e.getNombre()+" creada con éxito");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    
    public static void updateUsuarioA(CUsuario e){
        try {
            st = Conexion.Conectar().createStatement();
            st.executeUpdate("UPDATE usuario SET nombre='"+e.getNombre()+"',nombreusuario='"+e.getDni()+"',clave='"+EncryptingKey.md5(e.getClave())+"' WHERE idusuario='001'");
            JOptionPane.showMessageDialog(null, "La cuenta del administrador se actualizó con éxito");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
     public static void updatePassword(String newpassword){
        try {
            st = Conexion.Conectar().createStatement();
            st.executeUpdate("UPDATE usuario SET clave='"+EncryptingKey.md5(newpassword)+"' WHERE idusuario='"+CLogeo.getIdUsuario()+"'");
            JOptionPane.showMessageDialog(null, "Su contraseña se actualizó correctamente");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    
    public static void deleteUsuario(String id){
        try {
            st = Conexion.Conectar().createStatement();
            st.executeUpdate("DELETE FROM usuario WHERE idusuario='"+id+"'");
            JOptionPane.showMessageDialog(null, "La cuenta se a eliminado");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    
    public static void getUsuario(DefaultTableModel modelo){
        try {
            st = Conexion.Conectar().createStatement();
            rs = st.executeQuery("SELECT idusuario,nombre FROM usuario WHERE tipousuario='empleado'");
            int i=1;
            while(rs.next()){
                modelo.addRow(new String[]{i+"",rs.getString(2),rs.getString(1)});
                i++;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
}
