package View;

import Control.DProducto;
import Control.DVenta;
import MFC.util.JLibrary.DecimalNumber;
import Option.Archivos;
import Option.TablaRender;
import static View.Main.dtpanel;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *@author CIRO
 */
public class Venta extends javax.swing.JInternalFrame {
    JTextField e;
    public static DefaultTableModel modelo;
    public Venta() {
        initComponents();
        tabla.setShowHorizontalLines(true);
        tabla.setShowVerticalLines(true);
        txbuscar.requestFocus();
//        Hora h = new Hora();
        this.fecha();
        this.table();
        tabla.setDefaultRenderer(Object.class, new TablaRender());
        lbitems.setText(modelo.getRowCount()+"");
        
    }
    private void fecha(){
        Date d = new Date();
        String fecha = d.getDate()+"/"+(d.getMonth()+1)+"/"+(d.getYear()+1900);
        DateTimeFormatter stf = DateTimeFormatter.ofPattern("d/M/yyyy");
        LocalDate ld = LocalDate.parse(fecha,stf);
        stf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        lbfecha.setText(stf.format(ld));
        lbmonto.setText(DecimalNumber.ReduceDecimal(DVenta.ventaDia((d.getYear()+1900)+"-"+(d.getMonth()+1)+"-"+d.getDate()),2)+" S/.");
    }
    private void table(){
        String titulo[] = {"N°","Código","Presentación","Producto","Precio Unt.","Stock","E.Stock"};
        modelo = new DefaultTableModel(null,titulo){
            @Override
            public boolean isCellEditable(int row, int column){
                return false;
            }
        };
        tabla.setModel(modelo);
        tabla.getColumnModel().getColumn(0).setMaxWidth(60);
        tabla.getColumnModel().getColumn(0).setMinWidth(60);
        tabla.getColumnModel().getColumn(1).setMaxWidth(60);
        tabla.getColumnModel().getColumn(1).setMinWidth(60);
        tabla.getColumnModel().getColumn(4).setMaxWidth(80);
        tabla.getColumnModel().getColumn(4).setMinWidth(80);
        tabla.getColumnModel().getColumn(5).setMaxWidth(70);
        tabla.getColumnModel().getColumn(5).setMinWidth(70);
        tabla.getColumnModel().getColumn(6).setMaxWidth(60);
        DVenta.showProducto(modelo, "", "");
        cbpresentacion.addItem("Seleccionar Presentacion");
        DProducto.CargarPresentacion(cbpresentacion);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lbitems = new javax.swing.JLabel();
        lbmonto = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        pnuevaVenta = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        preporte = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel6 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        cbpresentacion = new javax.swing.JComboBox<>();
        txbuscar = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        lbfecha = new javax.swing.JLabel();
        lbturno = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("VENTAS DEL DÍA");
        setMinimumSize(new java.awt.Dimension(800, 200));
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameClosed(evt);
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        jPanel2.setBackground(new java.awt.Color(227, 111, 30));

        jLabel1.setFont(new java.awt.Font("Lucida Calligraphy", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/add1.png"))); // NOI18N
        jLabel1.setText("Productos");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(229, 229, 247));
        jLabel2.setText("Total de Items           :");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(229, 229, 247));
        jLabel3.setText("Total de Ventas        :");

        lbitems.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbitems.setForeground(new java.awt.Color(229, 229, 247));
        lbitems.setText("000000");

        lbmonto.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbmonto.setForeground(new java.awt.Color(229, 229, 247));
        lbmonto.setText("999923.00 S/. ");

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        pnuevaVenta.setBackground(new java.awt.Color(227, 111, 30));
        pnuevaVenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnuevaVentaMouseClicked(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/mas.png"))); // NOI18N

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(229, 229, 247));
        jLabel7.setText("Nueva Venta");

        javax.swing.GroupLayout pnuevaVentaLayout = new javax.swing.GroupLayout(pnuevaVenta);
        pnuevaVenta.setLayout(pnuevaVentaLayout);
        pnuevaVentaLayout.setHorizontalGroup(
            pnuevaVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnuevaVentaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnuevaVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addGroup(pnuevaVentaLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel6)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnuevaVentaLayout.setVerticalGroup(
            pnuevaVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnuevaVentaLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel6)
                .addGap(3, 3, 3)
                .addComponent(jLabel7)
                .addGap(15, 15, 15))
        );

        preporte.setBackground(new java.awt.Color(227, 111, 30));
        preporte.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                preporteMouseClicked(evt);
            }
        });

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/estadistica.png"))); // NOI18N

        jLabel9.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(229, 229, 247));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Reportes");

        javax.swing.GroupLayout preporteLayout = new javax.swing.GroupLayout(preporte);
        preporte.setLayout(preporteLayout);
        preporteLayout.setHorizontalGroup(
            preporteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(preporteLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel8)
                .addContainerGap(21, Short.MAX_VALUE))
            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        preporteLayout.setVerticalGroup(
            preporteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, preporteLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel8)
                .addGap(3, 3, 3)
                .addComponent(jLabel9))
        );

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jPanel6.setBackground(new java.awt.Color(227, 111, 30));
        jPanel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel6MouseClicked(evt);
            }
        });

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/refrescar.png"))); // NOI18N

        jLabel11.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(229, 229, 247));
        jLabel11.setText("Refrescar");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel10)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel10)
                .addGap(3, 3, 3)
                .addComponent(jLabel11)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);

        cbpresentacion.setBackground(new java.awt.Color(255, 153, 0));
        cbpresentacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbpresentacionActionPerformed(evt);
            }
        });

        txbuscar.setBackground(new java.awt.Color(244, 178, 35));
        txbuscar.setForeground(new java.awt.Color(255, 51, 0));
        txbuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txbuscarKeyReleased(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Arial", 1, 9)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(229, 229, 247));
        jLabel12.setText("<html>F<br>I<br>L<br>T<br>R<br>O<br>S");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbitems, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbmonto, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnuevaVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(preporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 156, Short.MAX_VALUE)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 7, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbpresentacion, 0, 231, Short.MAX_VALUE)
                    .addComponent(txbuscar))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3))
            .addComponent(jSeparator1)
            .addComponent(jSeparator2)
            .addComponent(jSeparator3)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(lbitems))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(lbmonto)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(cbpresentacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pnuevaVenta, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(preporte, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(227, 111, 30));

        lbfecha.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbfecha.setForeground(new java.awt.Color(0, 102, 0));
        lbfecha.setText("00/00/0000");

        lbturno.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbturno.setForeground(new java.awt.Color(0, 102, 0));
        lbturno.setText("mañana");

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(204, 204, 204));
        jLabel15.setText("  Turno:");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/calendario.png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbturno)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbfecha)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbfecha)
                    .addComponent(lbturno)
                    .addComponent(jLabel15)
                    .addComponent(jLabel4))
                .addContainerGap())
        );

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "N°", "Código", "Categoría", "Producto", "Precio Und.", "Stock", "Estado Stock"
            }
        ));
        tabla.setGridColor(new java.awt.Color(153, 153, 153));
        tabla.setRowHeight(20);
        jScrollPane1.setViewportView(tabla);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 302, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pnuevaVentaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnuevaVentaMouseClicked
        DetalleVenta v = new DetalleVenta();
        Main.dtpanel.add(v);
        v.setVisible(true);
    }//GEN-LAST:event_pnuevaVentaMouseClicked

    private void preporteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_preporteMouseClicked
        Reportes re = new Reportes();
        Main.dtpanel.add(re);
        re.setVisible(true);
        
    }//GEN-LAST:event_preporteMouseClicked

    private void jPanel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel6MouseClicked
        this.table();
        while(cbpresentacion.getItemCount()>1)
            cbpresentacion.removeItemAt(1);
        cbpresentacion.addItem("Seleccionar Presentacion");
        DProducto.CargarPresentacion(cbpresentacion);
        lbitems.setText(modelo.getRowCount()+"");
        txbuscar.setText(null);
        cbpresentacion.removeItemAt(1);
    }//GEN-LAST:event_jPanel6MouseClicked

    private void formInternalFrameClosed(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosed
        Main.jMenuItem2.setEnabled(true);
    }//GEN-LAST:event_formInternalFrameClosed

    private void cbpresentacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbpresentacionActionPerformed
        while(modelo.getRowCount()!=0){modelo.removeRow(0);}
        if(cbpresentacion.getSelectedIndex()!=0)
            DVenta.showProducto(modelo, cbpresentacion.getSelectedItem().toString(), "");
        else
            DVenta.showProducto(modelo, "", "");
        txbuscar.setText(null);
        txbuscar.requestFocus();
    }//GEN-LAST:event_cbpresentacionActionPerformed

    private void txbuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txbuscarKeyReleased
        while(modelo.getRowCount()!=0){modelo.removeRow(0);}
        if(cbpresentacion.getSelectedIndex()>0){
            DVenta.showProducto(modelo, cbpresentacion.getSelectedItem().toString(), txbuscar.getText());
        }else{
            DVenta.showProducto(modelo, "", txbuscar.getText());
        }
        
    }//GEN-LAST:event_txbuscarKeyReleased

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        Producto p = new Producto();
        dtpanel.add(p);
        p.setVisible(true);
    }//GEN-LAST:event_jLabel1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbpresentacion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    public static javax.swing.JLabel lbfecha;
    private javax.swing.JLabel lbitems;
    public static javax.swing.JLabel lbmonto;
    public static javax.swing.JLabel lbturno;
    public static javax.swing.JPanel pnuevaVenta;
    private javax.swing.JPanel preporte;
    public static javax.swing.JTable tabla;
    private javax.swing.JTextField txbuscar;
    // End of variables declaration//GEN-END:variables
}
class Hora implements Runnable{
    String hora,minutos,segundos,ampm;
    Thread h1;
    javax.swing.JLabel lbhora = new javax.swing.JLabel();
    public Hora(){
        h1 = new Thread(this);
        h1.start();
    }
    @Override
    public void run() {
        Thread ct = Thread.currentThread();
        while(ct == h1) {
            calcula();
            //Venta.lbfecha.setText(hora + ":" + minutos + ":" + segundos + " "+ampm);
            ComparaHora(hora + ":" + minutos + ":");
            try {
                Thread.sleep(1000);
            }catch(InterruptedException e) {}
        }
    }
    public void calcula () {        
    Calendar calendario = new GregorianCalendar();
    Date fechaHoraActual = new Date();
    calendario.setTime(fechaHoraActual);
    ampm = calendario.get(Calendar.AM_PM)==Calendar.AM?"AM":"PM";
    
    if(ampm.equals("PM")){
     int h = calendario.get(Calendar.HOUR_OF_DAY);
     hora = h>9?""+h:"0"+h;
    }else{
     hora = calendario.get(Calendar.HOUR_OF_DAY)>9?""+calendario.get(Calendar.HOUR_OF_DAY):"0"+calendario.get(Calendar.HOUR_OF_DAY);            
    }
    minutos = calendario.get(Calendar.MINUTE)>9?""+calendario.get(Calendar.MINUTE):"0"+calendario.get(Calendar.MINUTE);
    segundos = calendario.get(Calendar.SECOND)>9?""+calendario.get(Calendar.SECOND):"0"+calendario.get(Calendar.SECOND); 
    }
    static void ComparaHora(String time){ 
        SimpleDateFormat formatter = new SimpleDateFormat("kk:mm");  
        try{  
            String turno = Archivos.getTurno();
            Date tme = formatter.parse(turno);
            Date t = formatter.parse(time);
              
            if(t.getTime() < tme.getTime()){  
                Venta.lbturno.setText("mañana");
            }  
            else{  
                Venta.lbturno.setText("tarde");
            }  
        }  
        catch(Exception e){  
            System.out.println(e);  
        }  
          
    }
}