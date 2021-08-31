package Control;

import Class.CProducto;
import Option.Codigo;
import Option.Opcion;
import com.mxrck.autocompleter.TextAutoCompleter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class DProducto {
    private static Statement st;
    private static ResultSet rs;
    private static Connection cn;
    public static void InsertPresentacion(String present){
        cn = Conexion.Conectar();
//        int contador = Opcion.getContador("presentacion");
        try {
            st = cn.createStatement();
            st.executeUpdate("INSERT INTO t_presentacion VALUES(null,'"+present+"')");
//            st.executeUpdate("UPDATE codigo SET contador="+contador+" WHERE tabla='presentacion'");
        } catch (SQLException ex) {JOptionPane.showMessageDialog(null, ex);}
    }
    
    public static void UpdatePresentacion(String id,String present){
        cn = Conexion.Conectar();
        try {
            st = cn.createStatement();
            st.executeUpdate("UPDATE t_presentacion SET descripcion='"+present+"' WHERE id_presentacion='"+id+"'");
        } catch (SQLException ex) {JOptionPane.showMessageDialog(null, ex);}
    }
    
    public static void DeletePresentacion(String id){
        cn = Conexion.Conectar();
        try {
            st = cn.createStatement();
            st.executeUpdate("DELETE FROM t_presentacion WHERE id_presentacion='"+id+"'");
        } catch (SQLException ex) {JOptionPane.showMessageDialog(null, ex);}
    }
    
    public static void CargarPresentacion(JComboBox cb){
        cn = Conexion.Conectar();
        try {
            st = cn.createStatement();
            rs = st.executeQuery("SELECT descripcion FROM t_presentacion ORDER BY descripcion ASC");
            while(rs.next()){
                cb.addItem(rs.getString(1));
            }
        } catch (SQLException ex) {}
    }
    
    public static String getIdPresentacion(String present){
        String id="";
        cn = Conexion.Conectar();
        try {
            st = cn.createStatement();
            rs = st.executeQuery("SELECT id_presentacion FROM t_presentacion WHERE descripcion='"+present+"'");
            while(rs.next()){
                id = rs.getString(1);
            }
        } catch (SQLException ex) {}
        return id;
    }
    
    public static String getIndicacion(String idProducto){
        String indicacion="";
        cn = Conexion.Conectar();
        try {
            st = cn.createStatement();
            rs = st.executeQuery("SELECT indicacion FROM t_producto WHERE id_producto='"+idProducto+"'");
            while(rs.next()){
                indicacion = rs.getString(1);
            }
        } catch (SQLException ex) {}
        return indicacion;
    }
    
    public static void loadProducto(TextAutoCompleter completer){
        cn = Conexion.Conectar();
        try {
            st = cn.createStatement();
            rs = st.executeQuery("SELECT nombre FROM t_producto ORDER BY nombre ASC");
            while(rs.next()){
                completer.addItem(rs.getString(1));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    
    public static double getPrecio(String id){
        double precio=0.00;
        cn = Conexion.Conectar();
        try {
            st = cn.createStatement();
            rs = st.executeQuery("SELECT precio_unitario FROM t_producto WHERE id_producto='"+id+"'");
            while(rs.next()){
                precio=rs.getDouble(1);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        return precio;
    }
    public static double getPrecioN(String nombre){
        double precio=0.00;
        cn = Conexion.Conectar();
        try {
            st = cn.createStatement();
            rs = st.executeQuery("SELECT precio_unitario FROM t_producto WHERE nombre='"+nombre+"'");
            while(rs.next()){
                precio=rs.getDouble(1);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        return precio;
    }
    public static String getId(String nombre){
        String id="";
        cn = Conexion.Conectar();
        try {
            st = cn.createStatement();
            rs = st.executeQuery("SELECT id_producto FROM t_producto WHERE nombre='"+nombre+"'");
            while(rs.next()){
                id=rs.getString(1);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        return id;
    }
    
    public static void InsertProducto(CProducto p){
        cn = Conexion.Conectar();
        try {
            st = cn.createStatement();
            st.executeUpdate("INSERT INTO t_producto (id_producto,nombre,indicacion,fecha_vencimiento,precio_compra,precio_unitario,stock,id_presentacion)"+
                    " VALUES('"+p.getIdProducto()+"','"+p.getNombre()+"','"+p.getIndicacion()+"','"+p.getFechaVencimiento()+"',"+p.getPrecioCompra()+","+p.getPrecioUnitario()+","+p.getStock()+",'"+p.getIdPresentacion()+"')");
            st.executeUpdate("UPDATE t_parametro SET codigo="+Opcion.getContador("CODIGO_PRODUCTO")+" WHERE id_parametro='CODIGO_PRODUCTO'");
        } catch (SQLException ex) {JOptionPane.showMessageDialog(null, ex);}
    }
    
    public static void addProducto(DefaultTableModel modelo, String like){
        cn = Conexion.Conectar();
        try {
            st = cn.createStatement();
            rs = st.executeQuery("SELECT * FROM t_producto WHERE nombre LIKE '%"+like+"%' ORDER BY nombre ASC");
            int i=1;
            while(rs.next()){
                modelo.addRow(new String[]{""+(i++),rs.getString(1),rs.getString(2),rs.getString(5)});
            }
        } catch (SQLException ex) {}
    }
    
    public static void addProductoP(DefaultTableModel modelo, String like){
        cn = Conexion.Conectar();
        try {
            st = cn.createStatement();
            rs = st.executeQuery("SELECT * FROM producto WHERE nombre LIKE '%"+like+"%' ORDER BY nombre ASC");
            int i=1;
            while(rs.next()){
                modelo.addRow(new String[]{""+(i++),rs.getString(1),rs.getString(2),rs.getString(4)});
            }
        } catch (SQLException ex) {}
    }
    public static void showProducto(DefaultTableModel modelo, String like){
        cn = Conexion.Conectar();
        try {
            st = cn.createStatement();
            rs = st.executeQuery("SELECT id_producto,nombre,precio_unitario,stock FROM t_producto WHERE nombre LIKE '"+like+"%' ORDER BY nombre ASC");
            int i=1;
            while(rs.next()){
                modelo.addRow(new String[]{""+(i++),rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4)});
            }
        } catch (SQLException ex) {}
    }
    
    public static void showProductoVenta(DefaultTableModel modelo, String like){
        cn = Conexion.Conectar();
        try {
            st = cn.createStatement();
            rs = st.executeQuery("SELECT id_producto,nombre,fecha_vencimiento,precio_unitario,stock FROM t_producto WHERE nombre LIKE '"+like+"%' ORDER BY nombre ASC");
            int i=1;
            while(rs.next()){
                modelo.addRow(new String[]{""+(i++),rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5)});
            }
        } catch (SQLException ex) {}
    }
    
    public static void showProductForPresent(DefaultTableModel modelo, String presentacion, String like){
        cn = Conexion.Conectar();
        try {
            st = cn.createStatement();
            rs = st.executeQuery("SELECT pr.* FROM producto pr, presentacion p WHERE p.idpresentacion=pr.idpresentacion "
                    + "AND p.descripcion='"+presentacion+"' AND pr.nombre LIKE '"+like+"%' ORDER BY pr.nombre ASC");
            int i=1;
            while(rs.next()){
                modelo.addRow(new String[]{""+(i++),rs.getString(1),rs.getString(2),rs.getString(4),rs.getString(5)});
            }
        } catch (SQLException ex) {JOptionPane.showMessageDialog(null, ex);}
    }
    
    public static int getStock(String idProducto){
        int stock=0;
        cn = Conexion.Conectar();
        try {
            st = cn.createStatement();
            rs = st.executeQuery("SELECT stock FROM producto WHERE idproducto='"+idProducto+"'");
            while(rs.next()){
                stock = rs.getInt(1);
            }
        } catch (SQLException ex) {}
        return stock;
    }
    public static String getIndicacionProducto(String idProducto){
        String indicacion="";
        cn = Conexion.Conectar();
        try {
            st = cn.createStatement();
            rs = st.executeQuery("SELECT indicacion FROM producto WHERE idproducto='"+idProducto+"'");
            while(rs.next()){
                indicacion = rs.getString(1);
            }
        } catch (SQLException ex) {}
        return indicacion;
    }
    public static String getPresentacion(String idProducto){
        String presentacion ="";
        cn = Conexion.Conectar();
        try {
            st = cn.createStatement();
            rs = st.executeQuery("SELECT p.descripcion FROM t_producto pr,t_presentacion p WHERE p.id_presentacion=pr.id_presentacion"
                    + " AND pr.id_producto='"+idProducto+"'");
            while(rs.next()){
                presentacion = rs.getString(1);
            }
        } catch (SQLException ex) {JOptionPane.showMessageDialog(null, ex);}
        return presentacion;
    }
    
    public static void getPresentacion(DefaultTableModel modelo){
        cn = Conexion.Conectar();
        int i=1;
        try {
            st = cn.createStatement();
            rs = st.executeQuery("SELECT * FROM t_presentacion ORDER BY descripcion");
            while(rs.next()){
                modelo.addRow(new String[]{i+"",rs.getString(2),rs.getString(1)});
                i++;
            }
        } catch (SQLException ex) {JOptionPane.showMessageDialog(null, ex);}
    }
    
    public static void DeleteProducto(String idProducto){
        cn = Conexion.Conectar();
        try {
            st = cn.createStatement();
            st.executeUpdate("DELETE FROM t_producto WHERE id_producto='"+idProducto+"'");
            
        } catch (SQLException ex) {JOptionPane.showMessageDialog(null, ex);}
    }
    
    public static void updateProducto(CProducto p){
        cn = Conexion.Conectar();
        try {
            st = cn.createStatement();
            st.executeUpdate("UPDATE producto SET nombre='"+p.getNombre()+"',indicacion='"+p.getIndicacion()+"',presiounitario="+p.getPrecioUnitario()+",stock="+p.getStock()+",idpresentacion='"+p.getIdPresentacion()+"' WHERE idproducto='"+p.getIdProducto()+"'");
        } catch (SQLException ex) {JOptionPane.showMessageDialog(null, ex);}
    }
    
    public static void updateStock(String codigo, int cantidad){
        cn = Conexion.Conectar();
        try {
            st = cn.createStatement();
            st.executeUpdate("UPDATE producto SET stock=stock+"+cantidad+" WHERE idproducto='"+codigo+"'");
            
        } catch (SQLException ex) {JOptionPane.showMessageDialog(null, ex);}
    }
    
    public static void updatePrecio(String codigo, double cantidad){
        cn = Conexion.Conectar();
        try {
            st = cn.createStatement();
            st.executeUpdate("UPDATE producto SET presiounitario="+cantidad+" WHERE idproducto='"+codigo+"'");
            
        } catch (SQLException ex) {JOptionPane.showMessageDialog(null, ex);}
    }
}
