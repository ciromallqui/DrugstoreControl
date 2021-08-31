package Control;

import Class.CVenta;
import Option.Opcion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class DVenta {
    private static Statement st;
    private static ResultSet rs;
    private static Connection cn;
    public static void InsertVenta(CVenta v){
        cn = Conexion.Conectar();
        try {
            st = cn.createStatement();
            st.executeUpdate("INSERT INTO venta VALUES('"+v.getIdVenta()+"','"+v.getFechaVenta()+"',"+v.getMontoTotal()+",'"+v.getIdUsuario()+"','"+v.getIdTurno()+"')");
            st.executeUpdate("UPDATE codigo SET contador="+Opcion.getContador("venta")+" WHERE tabla='venta'");
            
        } catch (SQLException ex) {JOptionPane.showMessageDialog(null, ex);}
    }
    public static void InsertDetalleVenta(CVenta v){
        cn = Conexion.Conectar();
        try {
            st = cn.createStatement();
            st.executeUpdate("INSERT INTO detalleventa VALUES('"+v.getIdVenta()+"','"+v.getIdProducto()+"',"+v.getCantidad()+","+v.getMonto()+","+v.getDescuento()+")");
            st.executeUpdate("UPDATE producto SET stock=stock-"+v.getCantidad()+" WHERE idproducto='"+v.getIdProducto()+"'");
        } catch (SQLException ex) {JOptionPane.showMessageDialog(null, ex);}
    }
    
    public static void showProducto(DefaultTableModel modelo, String presentacion, String like){
        cn = Conexion.Conectar();
        String script = "";
        if(presentacion.length()!=0){
            script =  " AND pr.descripcion='"+presentacion+"'";
        }
        try {
            st = cn.createStatement();
            rs = st.executeQuery("SELECT p.id_producto,pr.descripcion,p.nombre,p.precio_unitario,p.stock "
                    + "FROM t_producto p, t_presentacion pr WHERE p.id_presentacion=pr.id_presentacion"+script+" AND p.nombre LIKE '"+like+"%' ORDER BY p.nombre ASC");
            int i=1;
            while(rs.next()){
                modelo.addRow(new String[]{""+(i++),rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5)});
            }
        } catch (SQLException ex) {}
    }
    
    public static double ventaDia(String fecha){
        cn = Conexion.Conectar();
        double venta=0.00;
        try {
            st = cn.createStatement();
            rs = st.executeQuery("SELECT SUM(montototal) FROM venta WHERE DATE(fechaventa)='"+fecha+"'");
            int i=1;
            if(rs.next()){
                venta = rs.getDouble(1);
            }
        } catch (SQLException ex) {}
        return venta;
    }
}
