package View;

import Class.CProducto;
import Control.DProducto;
import MFC.util.JLibrary.Message;
import Option.Codigo;
import Option.Opcion;
import Option.TablaRender;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *@author CIRO
 */
public class Producto extends javax.swing.JInternalFrame {
    DefaultTableModel modelo;
    public Producto() {
        initComponents();
        DProducto.CargarPresentacion(cbcategoria);
        lbcodigo.setText(Codigo.idText("P", 5, Opcion.getContador("CODIGO_PRODUCTO")));
        tabla.setDefaultRenderer(Object.class, new TablaRender());
        table();
        columnWidth();
    }
    private void table(){
        String titulo[] = {"N°","Código","Nombre","Precio S/.","Stock"};
        modelo = new DefaultTableModel(null,titulo);
        tabla.setModel(modelo);
        DProducto.showProducto(modelo,"");
    }
    private void columnWidth(){
        tabla.getColumnModel().getColumn(0).setPreferredWidth(27);
        tabla.getColumnModel().getColumn(1).setPreferredWidth(36);
        tabla.getColumnModel().getColumn(2).setPreferredWidth(240);
        tabla.getColumnModel().getColumn(3).setPreferredWidth(64);
        tabla.getColumnModel().getColumn(4).setPreferredWidth(63);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        mbuscar = new javax.swing.JMenuItem();
        mcargar = new javax.swing.JMenuItem();
        meliminar = new javax.swing.JMenuItem();
        DIALOG = new javax.swing.JDialog();
        txbuscar = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cbcategoria = new javax.swing.JComboBox<>();
        bcategoria = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txindicacion = new javax.swing.JEditorPane();
        jLabel2 = new javax.swing.JLabel();
        txnombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txprecioUnitario = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txstock = new javax.swing.JSpinner();
        jLabel6 = new javax.swing.JLabel();
        bguardar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        beliminar = new javax.swing.JButton();
        bactualizar = new javax.swing.JButton();
        bnuevo = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        lbcodigo = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        dchfechaLote = new com.toedter.calendar.JDateChooser();
        jLabel8 = new javax.swing.JLabel();
        txprecioCompra = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();

        mbuscar.setBackground(new java.awt.Color(153, 153, 255));
        mbuscar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        mbuscar.setText("BUSCAR");
        mbuscar.setOpaque(true);
        mbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mbuscarActionPerformed(evt);
            }
        });
        jPopupMenu1.add(mbuscar);

        mcargar.setBackground(new java.awt.Color(153, 153, 255));
        mcargar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        mcargar.setText("MOSTRAR TODO");
        mcargar.setOpaque(true);
        mcargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mcargarActionPerformed(evt);
            }
        });
        jPopupMenu1.add(mcargar);

        meliminar.setBackground(new java.awt.Color(153, 153, 255));
        meliminar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        meliminar.setText("ELIMINAR");
        meliminar.setOpaque(true);
        meliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                meliminarActionPerformed(evt);
            }
        });
        jPopupMenu1.add(meliminar);

        DIALOG.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                DIALOGWindowClosing(evt);
            }
        });

        txbuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txbuscarKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout DIALOGLayout = new javax.swing.GroupLayout(DIALOG.getContentPane());
        DIALOG.getContentPane().setLayout(DIALOGLayout);
        DIALOGLayout.setHorizontalGroup(
            DIALOGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DIALOGLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txbuscar, javax.swing.GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE)
                .addContainerGap())
        );
        DIALOGLayout.setVerticalGroup(
            DIALOGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DIALOGLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        setClosable(true);
        setIconifiable(true);
        setTitle("REGISTRO DE PRODUCTOS");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/producto.png"))); // NOI18N

        jPanel1.setBackground(new java.awt.Color(227, 111, 30));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 204, 51));
        jLabel1.setText("Presentación:");

        cbcategoria.setBackground(new java.awt.Color(255, 153, 0));
        cbcategoria.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cbcategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar" }));

        bcategoria.setFont(new java.awt.Font("Lucida Calligraphy", 1, 12)); // NOI18N
        bcategoria.setForeground(new java.awt.Color(0, 0, 153));
        bcategoria.setText("Registrar Presentación");
        bcategoria.setContentAreaFilled(false);
        bcategoria.setMargin(new java.awt.Insets(2, 2, 2, 2));
        bcategoria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bcategoriaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bcategoriaMouseExited(evt);
            }
        });
        bcategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bcategoriaActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(txindicacion);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 204, 51));
        jLabel2.setText("Nombre del producto:");

        txnombre.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txnombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txnombreMouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 204, 51));
        jLabel3.setText("Precio de compra:");

        txprecioUnitario.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txprecioUnitario.setText("0.00");
        txprecioUnitario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txprecioUnitarioMouseClicked(evt);
            }
        });
        txprecioUnitario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txprecioUnitarioKeyReleased(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 204, 51));
        jLabel4.setText("S/.");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 204, 51));
        jLabel5.setText("Stock:");

        txstock.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 204, 51));
        jLabel6.setText("Indicaciones:");

        bguardar.setBackground(new java.awt.Color(244, 178, 35));
        bguardar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bguardar.setForeground(new java.awt.Color(255, 255, 255));
        bguardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/punto.png"))); // NOI18N
        bguardar.setText("       GUARDAR");
        bguardar.setContentAreaFilled(false);
        bguardar.setOpaque(true);
        bguardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bguardarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bguardarMouseExited(evt);
            }
        });
        bguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bguardarActionPerformed(evt);
            }
        });

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        beliminar.setBackground(new java.awt.Color(244, 178, 35));
        beliminar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        beliminar.setForeground(new java.awt.Color(255, 255, 255));
        beliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/punto.png"))); // NOI18N
        beliminar.setText("      ELIMINAR");
        beliminar.setContentAreaFilled(false);
        beliminar.setEnabled(false);
        beliminar.setOpaque(true);
        beliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                beliminarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                beliminarMouseExited(evt);
            }
        });
        beliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                beliminarActionPerformed(evt);
            }
        });

        bactualizar.setBackground(new java.awt.Color(244, 178, 35));
        bactualizar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bactualizar.setForeground(new java.awt.Color(255, 255, 255));
        bactualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/punto.png"))); // NOI18N
        bactualizar.setText("  ACTUALIZAR");
        bactualizar.setContentAreaFilled(false);
        bactualizar.setEnabled(false);
        bactualizar.setOpaque(true);
        bactualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bactualizarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bactualizarMouseExited(evt);
            }
        });
        bactualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bactualizarActionPerformed(evt);
            }
        });

        bnuevo.setBackground(new java.awt.Color(244, 178, 35));
        bnuevo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bnuevo.setForeground(new java.awt.Color(255, 255, 255));
        bnuevo.setText("NUEVO");
        bnuevo.setContentAreaFilled(false);
        bnuevo.setOpaque(true);
        bnuevo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bnuevoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bnuevoMouseExited(evt);
            }
        });
        bnuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnuevoActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 102, 0));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CÓDIGO DE PRODUCTO", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Calligraphy", 1, 11), new java.awt.Color(0, 102, 0))); // NOI18N

        lbcodigo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbcodigo.setForeground(new java.awt.Color(204, 0, 0));
        lbcodigo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbcodigo.setText("P00001");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(197, 197, 197)
                .addComponent(lbcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbcodigo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null}
            },
            new String [] {
                "N°", "Código", "Nombre", "Precio", "Stock"
            }
        ));
        tabla.setToolTipText("Presione \"Click derecho\" para más opciones");
        tabla.setComponentPopupMenu(jPopupMenu1);
        tabla.setGridColor(new java.awt.Color(153, 153, 153));
        tabla.setRowHeight(20);
        tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabla);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 204, 51));
        jLabel7.setText("Fecha vencimiento:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 204, 51));
        jLabel8.setText("Precio unitario:");

        txprecioCompra.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        txprecioCompra.setText("0.00");
        txprecioCompra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txprecioCompraMouseClicked(evt);
            }
        });
        txprecioCompra.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txprecioCompraKeyReleased(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 204, 51));
        jLabel9.setText("S/.");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(cbcategoria, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txnombre, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel6)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel1)
                                                        .addComponent(jLabel3)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                            .addComponent(txprecioCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                            .addComponent(jLabel4))
                                                        .addComponent(dchfechaLote, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addComponent(jLabel7))
                                                .addGap(42, 42, 42)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel8)
                                                    .addComponent(jLabel5)
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                            .addComponent(txstock, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(txprecioUnitario, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jLabel9)))
                                                .addGap(7, 7, 7)))))
                                .addGap(18, 18, 18)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(5, 5, 5)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(bcategoria, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(bguardar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(bactualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(beliminar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(bnuevo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 551, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel1)
                                .addGap(2, 2, 2)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cbcategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(bcategoria))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel2)
                                        .addGap(2, 2, 2)
                                        .addComponent(txnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel8))
                                        .addGap(2, 2, 2)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(txprecioCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txprecioUnitario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel9)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(90, 90, 90)
                                        .addComponent(bguardar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(bactualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(beliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(18, 18, 18)
                                        .addComponent(bnuevo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(3, 3, 3))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel7)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(dchfechaLote, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel5)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txstock, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel6)
                                        .addGap(0, 0, 0)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(3, 3, 3))))
                    .addComponent(jScrollPane2))
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

    private void bguardarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bguardarMouseEntered
        bguardar.setBackground(new java.awt.Color(255,153,0));
    }//GEN-LAST:event_bguardarMouseEntered

    private void bguardarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bguardarMouseExited
        bguardar.setBackground(new java.awt.Color(244,178,35));
    }//GEN-LAST:event_bguardarMouseExited

    private void beliminarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_beliminarMouseEntered
        beliminar.setBackground(new java.awt.Color(255,153,0));
    }//GEN-LAST:event_beliminarMouseEntered

    private void beliminarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_beliminarMouseExited
        beliminar.setBackground(new java.awt.Color(244,178,35));
    }//GEN-LAST:event_beliminarMouseExited

    private void bactualizarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bactualizarMouseEntered
        bactualizar.setBackground(new java.awt.Color(255,153,0));
    }//GEN-LAST:event_bactualizarMouseEntered

    private void bactualizarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bactualizarMouseExited
        bactualizar.setBackground(new java.awt.Color(244,178,35));
    }//GEN-LAST:event_bactualizarMouseExited

    private void bnuevoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bnuevoMouseEntered
        bnuevo.setBackground(new java.awt.Color(255,153,0));
    }//GEN-LAST:event_bnuevoMouseEntered

    private void bnuevoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bnuevoMouseExited
        bnuevo.setBackground(new java.awt.Color(244,178,35));
    }//GEN-LAST:event_bnuevoMouseExited

    private void bcategoriaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bcategoriaMouseEntered
        bcategoria.setForeground(new java.awt.Color(51, 204, 255));
    }//GEN-LAST:event_bcategoriaMouseEntered

    private void bcategoriaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bcategoriaMouseExited
        bcategoria.setForeground(new java.awt.Color(0, 0, 153));
    }//GEN-LAST:event_bcategoriaMouseExited

    private void bcategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bcategoriaActionPerformed
        String presentacion = JOptionPane.showInputDialog(null, "Ingrese una Presentación");
        try{
            if(presentacion.length()>0){
                DProducto.InsertPresentacion(presentacion);
                cbcategoria.removeAllItems();
                cbcategoria.addItem("Seleccionar");
                DProducto.CargarPresentacion(cbcategoria);
            }else
                JOptionPane.showMessageDialog(rootPane, "Ingrese una presentación correcta");
        }catch(NullPointerException es){}
        
    }//GEN-LAST:event_bcategoriaActionPerformed

    private void bguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bguardarActionPerformed
        if(cbcategoria.getSelectedIndex()>0){
            if(txnombre.getText().length()>0){
                CProducto p = new CProducto();
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                Date fv = dchfechaLote.getDate();
                p.setIdProducto(lbcodigo.getText());
                p.setNombre(txnombre.getText());
                p.setIndicacion(txindicacion.getText());
                p.setPrecioCompra(Double.parseDouble(txprecioCompra.getText()));
                p.setPrecioUnitario(Double.parseDouble(txprecioUnitario.getText()));
                p.setStock(Integer.parseInt(txstock.getValue().toString()));
                p.setFechaVencimiento(sdf.format(fv));
                p.setIdPresentacion(DProducto.getIdPresentacion(cbcategoria.getSelectedItem().toString()));
                DProducto.InsertProducto(p);
                Message m = new Message();
                m.Start(this,"Datos guardados correctamente");
                lbcodigo.setText(Codigo.idText("P", 5, Opcion.getContador("CODIGO_PRODUCTO")));
                while(modelo.getRowCount()!=0){modelo.removeRow(0);}
                DProducto.showProducto(modelo,"");
            }else JOptionPane.showMessageDialog(rootPane, "Ingrese nombre del producto");
        }else JOptionPane.showMessageDialog(rootPane, "Seleccione una presentación");
    }//GEN-LAST:event_bguardarActionPerformed

    private void txnombreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txnombreMouseClicked
        txnombre.selectAll();
    }//GEN-LAST:event_txnombreMouseClicked

    private void txprecioUnitarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txprecioUnitarioMouseClicked
        txprecioUnitario.selectAll();
    }//GEN-LAST:event_txprecioUnitarioMouseClicked

    private void txprecioUnitarioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txprecioUnitarioKeyReleased
        if(txprecioUnitario.getText().length()==0){
            txprecioUnitario.setText("0.00");
            txprecioUnitario.selectAll();
        }
    }//GEN-LAST:event_txprecioUnitarioKeyReleased

    private void bactualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bactualizarActionPerformed
         if(cbcategoria.getSelectedIndex()>0){
            if(txnombre.getText().length()>0){
                CProducto p = new CProducto();
                p.setIdProducto(lbcodigo.getText());
                p.setNombre(txnombre.getText());
                p.setIndicacion(txindicacion.getText());
                p.setPrecioUnitario(Double.parseDouble(txprecioUnitario.getText()));
                p.setStock(Integer.parseInt(txstock.getValue().toString()));
                p.setIdPresentacion(DProducto.getIdPresentacion(cbcategoria.getSelectedItem().toString()));
                DProducto.updateProducto(p);
                Message m = new Message();
                m.Start(this,"Datos actualizados correctamente");
                nuevo();
            }else JOptionPane.showMessageDialog(rootPane, "Ingrese nombre del producto");
        }else JOptionPane.showMessageDialog(rootPane, "Seleccione una presentación");
    }//GEN-LAST:event_bactualizarActionPerformed

    private void tablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMouseClicked
        if(tabla.getSelectedRowCount()>0){
            bactualizar.setEnabled(true);
            beliminar.setEnabled(true);
            bguardar.setEnabled(false);
            lbcodigo.setText(modelo.getValueAt(tabla.getSelectedRow(), 1).toString());
            cbcategoria.setSelectedItem(DProducto.getPresentacion(modelo.getValueAt(tabla.getSelectedRow(), 1).toString()));
            txnombre.setText(modelo.getValueAt(tabla.getSelectedRow(), 2).toString());
            txprecioUnitario.setText(modelo.getValueAt(tabla.getSelectedRow(), 3).toString());
            txstock.setValue(Integer.parseInt(modelo.getValueAt(tabla.getSelectedRow(), 4).toString()));
            txindicacion.setText(DProducto.getIndicacionProducto(modelo.getValueAt(tabla.getSelectedRow(), 1).toString()));
        }
    }//GEN-LAST:event_tablaMouseClicked

    private void mbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mbuscarActionPerformed
        DIALOG.setVisible(true);
        DIALOG.setIconImage(new ImageIcon(getClass().getResource("/Image/buscar.png")).getImage());
        DIALOG.setTitle("BUSCAR");
        DIALOG.setLocationRelativeTo(tabla);
        DIALOG.setSize(220, 80);
    }//GEN-LAST:event_mbuscarActionPerformed

    private void txbuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txbuscarKeyReleased
        while(modelo.getRowCount()!=0){
            modelo.removeRow(0);
        }
        DProducto.showProducto(modelo, txbuscar.getText());
    }//GEN-LAST:event_txbuscarKeyReleased

    private void DIALOGWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_DIALOGWindowClosing
        if(modelo.getRowCount()==0){
            DProducto.showProducto(modelo,"");
        }
    }//GEN-LAST:event_DIALOGWindowClosing

    private void mcargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mcargarActionPerformed
        while(modelo.getRowCount()!=0){modelo.removeRow(0);}
        DProducto.showProducto(modelo,"");
    }//GEN-LAST:event_mcargarActionPerformed

    private void beliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_beliminarActionPerformed
        int si = JOptionPane.showConfirmDialog(rootPane, "Está seguro que desea eliminar el producto?","CONFIRMAR",0,3);
        if(si==0){
            if(tabla.getSelectedRowCount()==1){
                DProducto.DeleteProducto(modelo.getValueAt(tabla.getSelectedRow(), 1).toString());
                while(modelo.getRowCount()!=0){modelo.removeRow(0);}
                DProducto.showProducto(modelo,"");
                nuevo();
            }
        }
    }//GEN-LAST:event_beliminarActionPerformed

    private void bnuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnuevoActionPerformed
        nuevo();
    }//GEN-LAST:event_bnuevoActionPerformed

    private void meliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_meliminarActionPerformed
        int si = JOptionPane.showConfirmDialog(rootPane, "Está seguro que desea eliminar el producto?","CONFIRMAR",0,3);
        if(si==0){
            if(tabla.getSelectedRowCount()==1){
                DProducto.DeleteProducto(modelo.getValueAt(tabla.getSelectedRow(), 1).toString());
                while(modelo.getRowCount()!=0){modelo.removeRow(0);}
                DProducto.showProducto(modelo,"");
                nuevo();
            }else
                JOptionPane.showMessageDialog(rootPane, "Seleccione un registro");
        }
    }//GEN-LAST:event_meliminarActionPerformed

    private void txprecioCompraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txprecioCompraMouseClicked
        txprecioCompra.selectAll();
    }//GEN-LAST:event_txprecioCompraMouseClicked

    private void txprecioCompraKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txprecioCompraKeyReleased
        if(txprecioCompra.getText().length()==0){
            txprecioCompra.setText("0.00");
            txprecioCompra.selectAll();
        }
    }//GEN-LAST:event_txprecioCompraKeyReleased
    
    private void nuevo(){
        lbcodigo.setText(Codigo.idText("P", 5, Opcion.getContador("CODIGO_PRODUCTO")));
        cbcategoria.setSelectedIndex(0);
        txnombre.setText(null);
        txprecioUnitario.setText("0.00");
        txprecioCompra.setText("0.00");
        txstock.setValue(0);
        txindicacion.setText(null);
        while(modelo.getRowCount()!=0){modelo.removeRow(0);}
        DProducto.showProducto(modelo,"");
        bguardar.setEnabled(true);
        beliminar.setEnabled(false);
        bactualizar.setEnabled(false);
        txnombre.requestFocus();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog DIALOG;
    private javax.swing.JButton bactualizar;
    private javax.swing.JButton bcategoria;
    private javax.swing.JButton beliminar;
    private javax.swing.JButton bguardar;
    private javax.swing.JButton bnuevo;
    private javax.swing.JComboBox<String> cbcategoria;
    private com.toedter.calendar.JDateChooser dchfechaLote;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lbcodigo;
    private javax.swing.JMenuItem mbuscar;
    private javax.swing.JMenuItem mcargar;
    private javax.swing.JMenuItem meliminar;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField txbuscar;
    private javax.swing.JEditorPane txindicacion;
    private javax.swing.JTextField txnombre;
    private javax.swing.JTextField txprecioCompra;
    private javax.swing.JTextField txprecioUnitario;
    private javax.swing.JSpinner txstock;
    // End of variables declaration//GEN-END:variables
}
