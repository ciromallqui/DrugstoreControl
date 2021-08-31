package Option;

import Control.Conexion;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 * jp'@author CIRO MF
 */
public class Opcion {
    private static ResultSet rs;
    private static Statement st;
    public static int getContador(String tableName){
        int cont=0;
        try {
            st = Conexion.Conectar().createStatement();
            rs = st.executeQuery("SELECT codigo FROM t_parametro WHERE id_parametro='"+tableName+"'");
            while(rs.next()){
                cont = rs.getInt(1)+1;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        return cont;
    }
    public static void UpdateContador(String tableName, int contador){
        try {
            st = Conexion.Conectar().createStatement();
            st.executeUpdate("UPDATE t_parametro SET codigo="+contador+" WHERE id_parametro='"+tableName+"'");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
}
