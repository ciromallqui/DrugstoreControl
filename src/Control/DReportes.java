package Control;

import MFC.util.JLibrary.DecimalNumber;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class DReportes {
    private static Statement st;
    private static ResultSet rs;
    private static Connection cn;
    public static void CargarReporte1(DefaultTableModel modelo, String fecha, String producto){
        cn = Conexion.Conectar();
        String script = "";
        if(producto.length()!=0){
            script =  " AND p.nombre='"+producto+"'";
        }
        try {
            st = cn.createStatement();
            rs = st.executeQuery("SELECT p.nombre,dv.cantidad,dv.monto-dv.descuento,TIME(v.fechaventa),u.nombre,t.descripcion "
                    + "FROM producto p,venta v,detalleventa dv,usuario u,turno t "
                    + "WHERE p.idproducto=dv.idproducto AND u.idusuario=v.idusuario AND t.idturno=v.idturno AND v.idventa=dv.idventa "
                    + "AND DATE(v.fechaventa)='"+fecha+"' "+script+" ORDER BY p.nombre,t.descripcion ASC");
            int i=1;
            while(rs.next()){
                modelo.addRow(new String[]{i+"",rs.getString(1),rs.getInt(2)+"",DecimalNumber.ReduceDecimal(rs.getDouble(3),2)+"",rs.getString(4),rs.getString(5),rs.getString(6)});
                i++;
            }
        } catch (SQLException ex) {JOptionPane.showMessageDialog(null, ex);}
    }
    
    public static void CargarReporte2(DefaultTableModel modelo, int mes, String producto){
        cn = Conexion.Conectar();
        String script = "";
        if(producto.length()!=0){
            script =  " AND p.nombre='"+producto+"'";
        }
        try {
            st = cn.createStatement();
            rs = st.executeQuery("SELECT p.nombre,SUM(dv.cantidad),SUM(dv.monto-dv.descuento),t.descripcion "
                    + "FROM producto p,venta v,detalleventa dv,turno t "
                    + "WHERE p.idproducto=dv.idproducto AND t.idturno=v.idturno AND v.idventa=dv.idventa "
                    + "AND MONTH(v.fechaventa)="+mes+" "+script+" GROUP BY p.nombre,t.descripcion ORDER BY p.nombre ASC");
            int i=1;
            while(rs.next()){
                modelo.addRow(new String[]{i+"",rs.getString(1),rs.getInt(2)+"",DecimalNumber.ReduceDecimal(rs.getDouble(3),2)+"",rs.getString(4)});
                i++;
            }
        } catch (SQLException ex) {JOptionPane.showMessageDialog(null, ex);}
    }
    
    public static void CargarReporte3(DefaultTableModel modelo, String fecha1, String fecha2, String producto){
        cn = Conexion.Conectar();
        String script = "";
        if(producto.length()!=0){
            script =  " AND p.nombre='"+producto+"'";
        }
        try {
            st = cn.createStatement();
            rs = st.executeQuery("SELECT p.nombre,SUM(dv.cantidad),SUM(dv.monto-dv.descuento),t.descripcion "
                    + "FROM producto p,venta v,detalleventa dv,turno t "
                    + "WHERE p.idproducto=dv.idproducto AND t.idturno=v.idturno AND v.idventa=dv.idventa "
                    + "AND DATE(v.fechaventa) BETWEEN '"+fecha1+"' AND '"+fecha2+"' "+script+" GROUP BY p.nombre,t.descripcion ORDER BY p.nombre ASC");
            int i=1;
            while(rs.next()){
                modelo.addRow(new String[]{i+"",rs.getString(1),rs.getInt(2)+"",DecimalNumber.ReduceDecimal(rs.getDouble(3),2)+"",rs.getString(4)});
                i++;
            }
        } catch (SQLException ex) {JOptionPane.showMessageDialog(null, ex);}
    }
    
    public static void loadProducto(JComboBox cb){
        cn = Conexion.Conectar();
        try {
            st = cn.createStatement();
            rs = st.executeQuery("SELECT nombre FROM producto ORDER BY nombre ASC");
            while(rs.next()){
                cb.addItem(rs.getString(1));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
}
