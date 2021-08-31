package View;

import Control.DReportes;
import MFC.util.JLibrary.DecimalNumber;
import Option.TablaRender1;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableModel;

/**
 *@author CIRO
 */
public class Reportes extends javax.swing.JInternalFrame {
    DefaultTableModel modelo;
    public Reportes() {
        initComponents();
        modelo = new DefaultTableModel(null, new String[]{"N°","Producto","Cantidad","Monto","Hora","Encargado","Turno"});
        tabla.setModel(modelo);
        
        String date = new SimpleDateFormat("dd/MM/yyyy").format(new java.util.Date());
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try {
            dfecha.setDate(sdf.parse(date));
            dfechai.setDate(sdf.parse(date));
            dfechaf.setDate(sdf.parse(date));
        } catch (ParseException ex) {}
        
        String fecha = new SimpleDateFormat("yyyy-MM-dd").format(new java.util.Date());
        DReportes.CargarReporte1(modelo,fecha,"");
        DReportes.loadProducto(cbproducto1);
        DReportes.loadProducto(cbproducto2);
        DReportes.loadProducto(cbproducto3);
        precios(lbmanana1,lbtarde1,lbtotal1,6);
        
        tabla.getColumnModel().getColumn(0).setMaxWidth(60);
        tabla.getColumnModel().getColumn(2).setMaxWidth(65);
        tabla.getColumnModel().getColumn(3).setMaxWidth(44);
        tabla.getColumnModel().getColumn(4).setMaxWidth(63);
        tabla.getColumnModel().getColumn(6).setMaxWidth(65);
        tabla.setDefaultRenderer(Object.class, new TablaRender1());
        tabla.setShowHorizontalLines(true);
        tabla.setShowVerticalLines(true);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        tp = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        dfecha = new com.toedter.calendar.JDateChooser();
        cbproducto1 = new javax.swing.JComboBox<>();
        jPanel6 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        lbmanana1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        lbtarde1 = new javax.swing.JLabel();
        lbtotal1 = new javax.swing.JLabel();
        bactualizar1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        mes = new com.toedter.calendar.JMonthChooser();
        cbproducto2 = new javax.swing.JComboBox<>();
        jPanel9 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        lbmanana2 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        lbtarde2 = new javax.swing.JLabel();
        lbtotal2 = new javax.swing.JLabel();
        bactualizar2 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        lbmanana3 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        lbtarde3 = new javax.swing.JLabel();
        lbtotal3 = new javax.swing.JLabel();
        dfechai = new com.toedter.calendar.JDateChooser();
        dfechaf = new com.toedter.calendar.JDateChooser();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        cbproducto3 = new javax.swing.JComboBox<>();
        bactualizar3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("REPORTE DE VENTAS");

        jPanel1.setBackground(new java.awt.Color(47, 102, 139));

        tp.setBackground(new java.awt.Color(0, 153, 102));
        tp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tpMouseClicked(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));

        cbproducto1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar producto" }));
        cbproducto1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbproducto1ActionPerformed(evt);
            }
        });

        jPanel6.setBackground(new java.awt.Color(0, 153, 153));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("MAÑANA");

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        lbmanana1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbmanana1.setForeground(new java.awt.Color(204, 255, 204));
        lbmanana1.setText("9999.00 S/.");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("TARDE");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("TOTAL");

        lbtarde1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbtarde1.setForeground(new java.awt.Color(204, 255, 204));
        lbtarde1.setText("999.00 S/.");

        lbtotal1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbtotal1.setForeground(new java.awt.Color(204, 255, 204));
        lbtotal1.setText("999.00 S/.");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbmanana1, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
                    .addComponent(lbtarde1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbtotal1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel2))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbmanana1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lbtarde1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(lbtotal1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        bactualizar1.setBackground(new java.awt.Color(0, 102, 102));
        bactualizar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/boton-actualizar.png"))); // NOI18N
        bactualizar1.setContentAreaFilled(false);
        bactualizar1.setOpaque(true);
        bactualizar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bactualizar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(dfecha, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cbproducto1, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bactualizar1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 126, Short.MAX_VALUE)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cbproducto1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(bactualizar1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(dfecha, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        tp.addTab("Reporte diario", jPanel2);

        jPanel3.setBackground(new java.awt.Color(0, 153, 153));

        cbproducto2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar producto" }));

        jPanel9.setBackground(new java.awt.Color(0, 153, 153));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("MAÑANA");

        jSeparator4.setOrientation(javax.swing.SwingConstants.VERTICAL);

        lbmanana2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbmanana2.setForeground(new java.awt.Color(204, 255, 204));
        lbmanana2.setText("9999.00 S/.");

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("TARDE");

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("TOTAL");

        lbtarde2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbtarde2.setForeground(new java.awt.Color(204, 255, 204));
        lbtarde2.setText("999.00 S/.");

        lbtotal2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbtotal2.setForeground(new java.awt.Color(204, 255, 204));
        lbtotal2.setText("999.00 S/.");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbmanana2, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
                    .addComponent(lbtarde2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbtotal2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator4)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel15))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbmanana2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(lbtarde2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18)
                    .addComponent(lbtotal2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        bactualizar2.setBackground(new java.awt.Color(0, 102, 102));
        bactualizar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/boton-actualizar.png"))); // NOI18N
        bactualizar2.setContentAreaFilled(false);
        bactualizar2.setOpaque(true);
        bactualizar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bactualizar2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mes, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cbproducto2, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bactualizar2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 209, Short.MAX_VALUE)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bactualizar2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbproducto2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mes, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tp.addTab("Reportes mensuales", jPanel3);

        jPanel4.setBackground(new java.awt.Color(0, 153, 153));

        jPanel10.setBackground(new java.awt.Color(0, 153, 153));

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("MAÑANA");

        jSeparator5.setOrientation(javax.swing.SwingConstants.VERTICAL);

        lbmanana3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbmanana3.setForeground(new java.awt.Color(204, 255, 204));
        lbmanana3.setText("9999.00 S/.");

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("TARDE");

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("TOTAL");

        lbtarde3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbtarde3.setForeground(new java.awt.Color(204, 255, 204));
        lbtarde3.setText("999.00 S/.");

        lbtotal3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbtotal3.setForeground(new java.awt.Color(204, 255, 204));
        lbtotal3.setText("999.00 S/.");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel23, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbmanana3, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
                    .addComponent(lbtarde3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbtotal3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator5)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel21))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbmanana3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(lbtarde3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel24)
                    .addComponent(lbtotal3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("Fecha inicial");

        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("Fecha final");

        cbproducto3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar producto" }));

        bactualizar3.setBackground(new java.awt.Color(0, 102, 102));
        bactualizar3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/boton-actualizar.png"))); // NOI18N
        bactualizar3.setContentAreaFilled(false);
        bactualizar3.setOpaque(true);
        bactualizar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bactualizar3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dfechai, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel27))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel28)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(dfechaf, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cbproducto3, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bactualizar3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cbproducto3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel27)
                            .addComponent(jLabel28))
                        .addGap(2, 2, 2)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(dfechaf, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dfechai, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(bactualizar3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tp.addTab("Otros reportes", jPanel4);

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tabla.setGridColor(new java.awt.Color(204, 204, 204));
        tabla.setRowHeight(20);
        jScrollPane1.setViewportView(tabla);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tp)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(tp, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 273, Short.MAX_VALUE)
                .addContainerGap())
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

    private void tpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tpMouseClicked
        if(tp.getSelectedIndex()==0){
            modelo = new DefaultTableModel(null, new String[]{"N°","Producto","Cantidad","Monto","Hora","Encargado","Turno"});
            tabla.setModel(modelo);

            String date = new SimpleDateFormat("dd/MM/yyyy").format(new java.util.Date());
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            try {
                dfecha.setDate(sdf.parse(date));
            } catch (ParseException ex) {}

            String fecha = new SimpleDateFormat("yyyy-MM-dd").format(new java.util.Date());
            DReportes.CargarReporte1(modelo,fecha,"");
            cbproducto1.setSelectedIndex(0);
            precios(lbmanana1,lbtarde1,lbtotal1,6);
        }
        if(tp.getSelectedIndex()==1){
            modelo = new DefaultTableModel(null, new String[]{"N°","Producto","Cantidad","Monto","Turno"});
            tabla.setModel(modelo);
            String fecha = new SimpleDateFormat("M").format(new java.util.Date());
            mes.setMonth(Integer.parseInt(fecha)-1);
            DReportes.CargarReporte2(modelo,1,"");
            cbproducto2.setSelectedIndex(0);
            precios(lbmanana2,lbtarde2,lbtotal2,4);
        }
        if(tp.getSelectedIndex()==2){
            modelo = new DefaultTableModel(null, new String[]{"N°","Producto","Cantidad","Monto","Turno"});
            tabla.setModel(modelo);
            
            String date = new SimpleDateFormat("dd/MM/yyyy").format(new java.util.Date());
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            try {
                dfechai.setDate(sdf.parse(date));
                dfechaf.setDate(sdf.parse(date));
            } catch (ParseException ex) {}
            String fecha = new SimpleDateFormat("yyyy-MM-dd").format(new java.util.Date());
            DReportes.CargarReporte3(modelo,fecha,fecha,"");
            cbproducto3.setSelectedIndex(0);
            precios(lbmanana3,lbtarde3,lbtotal3,4);
        }
    }//GEN-LAST:event_tpMouseClicked

    private void bactualizar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bactualizar1ActionPerformed
        while(modelo.getRowCount()!=0){modelo.removeRow(0);}
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = dfecha.getDate();
        if(cbproducto1.getSelectedIndex()==0)
            DReportes.CargarReporte1(modelo, sdf.format(date), "");
        else
            DReportes.CargarReporte1(modelo, sdf.format(date), cbproducto1.getSelectedItem().toString());
        precios(lbmanana1,lbtarde1,lbtotal1,6);
    }//GEN-LAST:event_bactualizar1ActionPerformed

    private void bactualizar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bactualizar2ActionPerformed
        while(modelo.getRowCount()!=0){modelo.removeRow(0);}
        if(cbproducto2.getSelectedIndex()==0)
            DReportes.CargarReporte2(modelo, mes.getMonth()+1, "");
        else
            DReportes.CargarReporte2(modelo, mes.getMonth()+1, cbproducto2.getSelectedItem().toString());
        precios(lbmanana2,lbtarde2,lbtotal2,4);
    }//GEN-LAST:event_bactualizar2ActionPerformed

    private void bactualizar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bactualizar3ActionPerformed
        while(modelo.getRowCount()!=0){modelo.removeRow(0);}
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date1 = dfechai.getDate();
        Date date2 = dfechaf.getDate();
        if(cbproducto3.getSelectedIndex()==0)
            DReportes.CargarReporte3(modelo,sdf.format(date1),sdf.format(date2),"");
        else
            DReportes.CargarReporte3(modelo,sdf.format(date1),sdf.format(date2), cbproducto3.getSelectedItem().toString());
        precios(lbmanana3,lbtarde3,lbtotal3,4);
    }//GEN-LAST:event_bactualizar3ActionPerformed

    private void cbproducto1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbproducto1ActionPerformed
        for (int i = 0; i < 7; i++) {
            System.err.println("tabla.getColumnModel().getColumn("+i+").setMaxWidth("+tabla.getColumnModel().getColumn(i).getPreferredWidth()+");");
        }
    }//GEN-LAST:event_cbproducto1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bactualizar1;
    private javax.swing.JButton bactualizar2;
    private javax.swing.JButton bactualizar3;
    private javax.swing.JComboBox<String> cbproducto1;
    private javax.swing.JComboBox<String> cbproducto2;
    private javax.swing.JComboBox<String> cbproducto3;
    private com.toedter.calendar.JDateChooser dfecha;
    private com.toedter.calendar.JDateChooser dfechaf;
    private com.toedter.calendar.JDateChooser dfechai;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JLabel lbmanana1;
    private javax.swing.JLabel lbmanana2;
    private javax.swing.JLabel lbmanana3;
    private javax.swing.JLabel lbtarde1;
    private javax.swing.JLabel lbtarde2;
    private javax.swing.JLabel lbtarde3;
    private javax.swing.JLabel lbtotal1;
    private javax.swing.JLabel lbtotal2;
    private javax.swing.JLabel lbtotal3;
    private com.toedter.calendar.JMonthChooser mes;
    private javax.swing.JTable tabla;
    private javax.swing.JTabbedPane tp;
    // End of variables declaration//GEN-END:variables
    private void precios(JLabel lb1, JLabel lb2, JLabel lb3, int turnoColumn){
        int i=0;
        double manana=0.0,tarde=0.0;
        while(i!=modelo.getRowCount()){
            if(modelo.getValueAt(i, turnoColumn).equals("mañana")){
                manana=manana+Double.parseDouble(modelo.getValueAt(i, 3).toString());
            }
            else{
                tarde=tarde+Double.parseDouble(modelo.getValueAt(i, 3).toString());
            }
            i++;
        }
        lb1.setText(DecimalNumber.ReduceDecimal(manana, 2)+" S/.");
        lb2.setText(DecimalNumber.ReduceDecimal(tarde, 2)+" S/.");
        lb3.setText(DecimalNumber.ReduceDecimal(manana+tarde, 2)+" S/.");
    }
}
