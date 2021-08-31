package View;

import Class.CLogeo;
import Class.CVenta;
import Control.DProducto;
import Control.DVenta;
import MFC.util.JLibrary.DecimalNumber;
import Option.Codigo;
import Option.Opcion;
import com.mxrck.autocompleter.TextAutoCompleter;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import javax.swing.DefaultCellEditor;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableColumn;
import MFC.util.JLibrary.Message;
import Option.TablaRender;
import Option.TableRowColor;

/**
 * @author CIRO
 */
public class DetalleVenta extends javax.swing.JInternalFrame {
    DefaultTableModel modelod;
    DefaultTableModel modelop;
    JTextField txproducto;
    JTextField txdescuento;
    JTextField txunidad;
    public DetalleVenta() {
        initComponents();
        JTableHeader th = tdetalle.getTableHeader();
        th.setBackground(Color.ORANGE);
        tdetalle.setDefaultRenderer(Object.class, new TableRowColor());
        tdetalle.setShowHorizontalLines(true);
        tdetalle.setShowVerticalLines(true);
        Date d = new Date();
        String fecha = d.getDate()+"/"+(d.getMonth()+1)+"/"+(d.getYear()+1900);
        DateTimeFormatter stf = DateTimeFormatter.ofPattern("d/M/yyyy");
        LocalDate ld = LocalDate.parse(fecha,stf);
        stf = DateTimeFormatter.ofPattern("EEEE d 'de' MMMM 'del' YYYY");
        lbfecha.setText(stf.format(ld));
        tableDetalle();
        DProducto.CargarPresentacion(cbcategoria);
        lbnumero.setText("N° "+Codigo.id(8,Opcion.getContador("venta")));
        
        txproducto = new JTextField();
        TableColumn tc = tdetalle.getColumnModel().getColumn(1);
        TableCellEditor tce = new DefaultCellEditor(txproducto);
        tc.setCellEditor(tce);
        
        txproducto.addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txproductoKeyTyped(evt);
            }
        });
        
        txdescuento = new JTextField();
        tc = tdetalle.getColumnModel().getColumn(4);
        tce = new DefaultCellEditor(txdescuento);
        tc.setCellEditor(tce);
        
        txdescuento.addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txdescuentoKeyReleased(evt);
            }
        });
        txdescuento.addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txdescuentoKeyTyped(evt);
            }
        });
        
        txunidad = new JTextField();
        tc = tdetalle.getColumnModel().getColumn(2);
        tce = new DefaultCellEditor(txunidad);
        tc.setCellEditor(tce);
        txunidad.addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txunidadKeyReleased(evt);
            }
        });
        txunidad.addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txunidadKeyTyped(evt);
            }
        });
        
        TextAutoCompleter tac = new TextAutoCompleter(txproducto);
        DProducto.loadProducto(tac);
    }
    private void tableDetalle(){
        String titulo[] = {"N°","Producto","Cantidad","Monto S/.","Descuento S/.",""};
        modelod = new DefaultTableModel(null,titulo){
            @Override
            public boolean isCellEditable(int row, int column) {
                return column !=0 && column !=3 && column !=5;
            }
        };
        tdetalle.setModel(modelod);
        tdetalle.getColumnModel().getColumn(0).setPreferredWidth(27);
        tdetalle.getColumnModel().getColumn(1).setPreferredWidth(300);
        tdetalle.getColumnModel().getColumn(2).setPreferredWidth(50);
        tdetalle.getColumnModel().getColumn(5).setMaxWidth(0);
    }
    private void tableProducto(){
        String titulop[] = {"N°","Código","Nombre","Fecha Lote","Precio","Stock"};
        modelop = new DefaultTableModel(null,titulop){
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        tproducto.setModel(modelop);
        tproducto.getColumnModel().getColumn(0).setPreferredWidth(37);
        tproducto.getColumnModel().getColumn(1).setPreferredWidth(44);
        tproducto.getColumnModel().getColumn(3).setPreferredWidth(80);
        tproducto.getColumnModel().getColumn(4).setPreferredWidth(60);
        tproducto.getColumnModel().getColumn(5).setPreferredWidth(39);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        eliminar = new javax.swing.JMenuItem();
        Producto = new javax.swing.JDialog();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tproducto = new javax.swing.JTable();
        cbcategoria = new javax.swing.JComboBox<>();
        txbuscar = new javax.swing.JTextField();
        bexportar = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        txdescripcion = new javax.swing.JEditorPane();
        jPopupMenu2 = new javax.swing.JPopupMenu();
        exportar = new javax.swing.JMenuItem();
        Seleccion = new javax.swing.JDialog();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txcantidad = new javax.swing.JTextField();
        baceptar = new javax.swing.JButton();
        lbproducto = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        bbuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tdetalle = new javax.swing.JTable();
        lbfecha = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        lbmonto = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        txefectivo = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        lbvuelto = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel3 = new javax.swing.JPanel();
        beliminar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lbnumero = new javax.swing.JLabel();
        bguardar = new javax.swing.JButton();
        bnuevo = new javax.swing.JButton();
        bagregar = new javax.swing.JButton();

        eliminar.setMnemonic('X');
        eliminar.setText("ELIMINAR");
        eliminar.setToolTipText("");
        eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActionPerformed(evt);
            }
        });
        jPopupMenu1.add(eliminar);

        Producto.setTitle("DETALLES DEL PRODUCTO");
        Producto.setBounds(new java.awt.Rectangle(0, 0, 550, 360));
        Producto.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Producto.setMinimumSize(new java.awt.Dimension(550, 360));
        Producto.setModalityType(java.awt.Dialog.ModalityType.APPLICATION_MODAL);
        Producto.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                ProductoWindowClosing(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(47, 102, 139));

        tproducto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null}
            },
            new String [] {
                "N°", "Código", "Producto", "Precio", "Stock"
            }
        ));
        tproducto.setComponentPopupMenu(jPopupMenu2);
        tproducto.setRowHeight(20);
        tproducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tproductoMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tproducto);

        cbcategoria.setMaximumRowCount(15);
        cbcategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una presentación" }));
        cbcategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbcategoriaActionPerformed(evt);
            }
        });

        txbuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txbuscarMouseClicked(evt);
            }
        });
        txbuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txbuscarKeyReleased(evt);
            }
        });

        bexportar.setBackground(new java.awt.Color(0, 153, 153));
        bexportar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        bexportar.setText("EXPORTAR");
        bexportar.setContentAreaFilled(false);
        bexportar.setEnabled(false);
        bexportar.setOpaque(true);
        bexportar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bexportarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bexportarMouseExited(evt);
            }
        });
        bexportar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bexportarActionPerformed(evt);
            }
        });

        jScrollPane3.setViewportView(txdescripcion);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(cbcategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 165, Short.MAX_VALUE)
                        .addComponent(txbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 440, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bexportar)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbcategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
                    .addComponent(bexportar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout ProductoLayout = new javax.swing.GroupLayout(Producto.getContentPane());
        Producto.getContentPane().setLayout(ProductoLayout);
        ProductoLayout.setHorizontalGroup(
            ProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        ProductoLayout.setVerticalGroup(
            ProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        exportar.setText("EXPORTAR");
        exportar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exportarActionPerformed(evt);
            }
        });
        jPopupMenu2.add(exportar);

        Seleccion.setTitle(" INGRESO");
        Seleccion.setMinimumSize(new java.awt.Dimension(230, 150));
        Seleccion.setModalityType(java.awt.Dialog.ModalityType.APPLICATION_MODAL);
        Seleccion.setResizable(false);

        jPanel5.setBackground(new java.awt.Color(0, 51, 51));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 204, 255));
        jLabel1.setText("Cantidad de producto: ");

        txcantidad.setText("1");
        txcantidad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txcantidadMouseClicked(evt);
            }
        });
        txcantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txcantidadKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txcantidadKeyTyped(evt);
            }
        });

        baceptar.setBackground(new java.awt.Color(0, 153, 153));
        baceptar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        baceptar.setText("ACEPTAR");
        baceptar.setContentAreaFilled(false);
        baceptar.setOpaque(true);
        baceptar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                baceptarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                baceptarMouseExited(evt);
            }
        });
        baceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                baceptarActionPerformed(evt);
            }
        });

        lbproducto.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbproducto.setForeground(new java.awt.Color(255, 102, 0));
        lbproducto.setText("producto");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(baceptar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txcantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)))
                        .addGap(0, 6, Short.MAX_VALUE))
                    .addComponent(lbproducto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbproducto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txcantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(baceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout SeleccionLayout = new javax.swing.GroupLayout(Seleccion.getContentPane());
        Seleccion.getContentPane().setLayout(SeleccionLayout);
        SeleccionLayout.setHorizontalGroup(
            SeleccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        SeleccionLayout.setVerticalGroup(
            SeleccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setClosable(true);
        setIconifiable(true);
        setTitle("MÓDULO DE VENTAS");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/bienes.png"))); // NOI18N
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameClosing(evt);
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(227, 111, 30));

        bbuscar.setBackground(new java.awt.Color(244, 178, 35));
        bbuscar.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 12)); // NOI18N
        bbuscar.setForeground(new java.awt.Color(255, 255, 255));
        bbuscar.setMnemonic('B');
        bbuscar.setText("BUSCAR PRODUCTO");
        bbuscar.setToolTipText("Precione Alt + B");
        bbuscar.setContentAreaFilled(false);
        bbuscar.setMargin(new java.awt.Insets(2, 4, 2, 4));
        bbuscar.setOpaque(true);
        bbuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bbuscarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bbuscarMouseExited(evt);
            }
        });
        bbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bbuscarActionPerformed(evt);
            }
        });

        tdetalle.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "N°", "Producto", "Cantidad", "Monto", "descuento", "Código"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, true, true, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tdetalle.setToolTipText("Para realizar cualquier ingreso, dar doble click en la casilla requerida");
        tdetalle.setComponentPopupMenu(jPopupMenu1);
        tdetalle.setGridColor(new java.awt.Color(153, 153, 153));
        tdetalle.setRowHeight(22);
        tdetalle.getTableHeader().setReorderingAllowed(false);
        tdetalle.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tdetalleKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tdetalleKeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(tdetalle);
        tdetalle.getAccessibleContext().setAccessibleDescription("");

        lbfecha.setFont(new java.awt.Font("Lucida Calligraphy", 1, 20)); // NOI18N
        lbfecha.setForeground(new java.awt.Color(244, 178, 35));
        lbfecha.setText("19 de Julio del 2018");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(244, 178, 35));
        jLabel7.setText(" Monto total:");
        jLabel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPanel6.setBackground(new java.awt.Color(244, 178, 35));
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lbmonto.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbmonto.setForeground(new java.awt.Color(255, 51, 0));
        lbmonto.setText("0.00");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 51, 0));
        jLabel8.setText("S/. ");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(lbmonto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbmonto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(244, 178, 35));
        jLabel14.setText(" Paga Con: ");
        jLabel14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPanel8.setBackground(new java.awt.Color(244, 178, 35));
        jPanel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 51, 0));
        jLabel18.setText("S/.");

        txefectivo.setBackground(new java.awt.Color(244, 178, 35));
        txefectivo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txefectivo.setForeground(new java.awt.Color(255, 51, 0));
        txefectivo.setText("0.00");
        txefectivo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txefectivoMouseClicked(evt);
            }
        });
        txefectivo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txefectivoKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addComponent(txefectivo, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel18)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txefectivo)
            .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(244, 178, 35));
        jLabel17.setText(" Vuelto: ");
        jLabel17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPanel9.setBackground(new java.awt.Color(244, 178, 35));
        jPanel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lbvuelto.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbvuelto.setForeground(new java.awt.Color(255, 51, 0));
        lbvuelto.setText("0.00");

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 51, 0));
        jLabel20.setText("S/. ");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(lbvuelto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(5, 5, 5)
                .addComponent(jLabel20))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(lbvuelto, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(244, 178, 35));

        beliminar.setBackground(new java.awt.Color(227, 111, 30));
        beliminar.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 14)); // NOI18N
        beliminar.setForeground(new java.awt.Color(255, 255, 255));
        beliminar.setMnemonic('E');
        beliminar.setText("ELIMINAR REGISTRO");
        beliminar.setToolTipText("Precione Alt + E");
        beliminar.setContentAreaFilled(false);
        beliminar.setMargin(new java.awt.Insets(2, 4, 2, 4));
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

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setBackground(new java.awt.Color(255, 102, 0));
        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("R.U.C. 88888888888");
        jLabel2.setOpaque(true);

        jLabel3.setBackground(new java.awt.Color(227, 111, 30));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("CÓDIGO DE VENTA");
        jLabel3.setOpaque(true);

        lbnumero.setBackground(new java.awt.Color(255, 102, 0));
        lbnumero.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbnumero.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbnumero.setText("N° 00000003");
        lbnumero.setOpaque(true);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lbnumero, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(lbnumero, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE))
        );

        bguardar.setBackground(new java.awt.Color(227, 111, 30));
        bguardar.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 14)); // NOI18N
        bguardar.setForeground(new java.awt.Color(255, 255, 255));
        bguardar.setMnemonic('G');
        bguardar.setText("GUARDAR VENTA");
        bguardar.setToolTipText("Precione Alt + G");
        bguardar.setContentAreaFilled(false);
        bguardar.setMargin(new java.awt.Insets(2, 4, 2, 4));
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

        bnuevo.setBackground(new java.awt.Color(227, 111, 30));
        bnuevo.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 14)); // NOI18N
        bnuevo.setForeground(new java.awt.Color(255, 255, 255));
        bnuevo.setMnemonic('N');
        bnuevo.setText("NUEVA VENTA");
        bnuevo.setToolTipText("Precione Alt + N");
        bnuevo.setContentAreaFilled(false);
        bnuevo.setMargin(new java.awt.Insets(2, 4, 2, 4));
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

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(beliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bnuevo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bguardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bguardar, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bnuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(beliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        bagregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/add.png"))); // NOI18N
        bagregar.setMnemonic('A');
        bagregar.setToolTipText("Agregar (Alt + A)");
        bagregar.setContentAreaFilled(false);
        bagregar.setMargin(new java.awt.Insets(2, 2, 2, 2));
        bagregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bagregarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 617, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lbfecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bagregar)
                                .addGap(0, 0, 0)
                                .addComponent(bbuscar)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(0, 0, 0)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel14)
                        .addGap(0, 0, 0)
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel17)
                        .addGap(0, 0, 0)
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 256, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bagregar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbfecha, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bbuscarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bbuscarMouseEntered
        bbuscar.setBackground(new java.awt.Color(255,153,0));
    }//GEN-LAST:event_bbuscarMouseEntered

    private void bbuscarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bbuscarMouseExited
        bbuscar.setBackground(new java.awt.Color(244,178,35));
    }//GEN-LAST:event_bbuscarMouseExited

    private void bguardarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bguardarMouseEntered
        bguardar.setBackground(new java.awt.Color(255,102,0));
    }//GEN-LAST:event_bguardarMouseEntered

    private void bguardarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bguardarMouseExited
        bguardar.setBackground(new java.awt.Color(227,111,30));
    }//GEN-LAST:event_bguardarMouseExited

    private void bnuevoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bnuevoMouseEntered
        bnuevo.setBackground(new java.awt.Color(255,102,0));
    }//GEN-LAST:event_bnuevoMouseEntered

    private void bnuevoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bnuevoMouseExited
        bnuevo.setBackground(new java.awt.Color(227,111,30));
    }//GEN-LAST:event_bnuevoMouseExited

    private void beliminarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_beliminarMouseEntered
        beliminar.setBackground(new java.awt.Color(255,102,0));
    }//GEN-LAST:event_beliminarMouseEntered

    private void beliminarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_beliminarMouseExited
        beliminar.setBackground(new java.awt.Color(227,111,30));
    }//GEN-LAST:event_beliminarMouseExited

    private void bexportarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bexportarMouseEntered
        bexportar.setBackground(new java.awt.Color(0, 153, 102));
    }//GEN-LAST:event_bexportarMouseEntered

    private void bexportarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bexportarMouseExited
        bexportar.setBackground(new java.awt.Color(0, 153, 153));
    }//GEN-LAST:event_bexportarMouseExited

    private void bbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bbuscarActionPerformed
        tableProducto();
        tproducto.setDefaultRenderer(Object.class, new TableRowColor());
        DProducto.showProducto(modelop, "");
        cbcategoria.setSelectedIndex(0);
        txbuscar.setText(null);
        txdescripcion.setText(null);
        Producto.setLocationRelativeTo(null);
        Producto.setResizable(false);
        Producto.setVisible(true);
    }//GEN-LAST:event_bbuscarActionPerformed

    private void bexportarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bexportarActionPerformed
        Seleccion.setLocationRelativeTo(null);
        Seleccion.setVisible(true);
        bexportar.setEnabled(false);
        txcantidad.setText("1");
        txcantidad.requestFocus();
        txcantidad.selectAll();
    }//GEN-LAST:event_bexportarActionPerformed

    private void baceptarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_baceptarMouseEntered
        baceptar.setBackground(new java.awt.Color(0, 153, 102));
    }//GEN-LAST:event_baceptarMouseEntered

    private void baceptarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_baceptarMouseExited
        baceptar.setBackground(new java.awt.Color(0, 153, 153));
    }//GEN-LAST:event_baceptarMouseExited

    private void baceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_baceptarActionPerformed
        try{
            int cantidad = Integer.parseInt(txcantidad.getText());
            int stock = Integer.parseInt(modelop.getValueAt(tproducto.getSelectedRow(), 5).toString());
            if(cantidad<=stock){
                if(modelod.getRowCount()==0){
                    modelod.addRow(new String[]{"",modelop.getValueAt(tproducto.getSelectedRow(), 2).toString(),txcantidad.getText(),DecimalNumber.ReduceDecimal((cantidad*DProducto.getPrecio(modelop.getValueAt(tproducto.getSelectedRow(), 1).toString())),2)+"","0.00",modelop.getValueAt(tproducto.getSelectedRow(), 1).toString()});
                }else{
                    int i;
                    for (i = 0; i < modelod.getRowCount(); i++) {
                        if(modelod.getValueAt(i, 1).equals(modelop.getValueAt(tproducto.getSelectedRow(), 2))){
                            cantidad = cantidad + Integer.parseInt(modelod.getValueAt(i, 2).toString());
                            if(cantidad<=stock){
                                modelod.setValueAt(cantidad, i, 2);
                                modelod.setValueAt(DecimalNumber.ReduceDecimal((Integer.parseInt(modelod.getValueAt(i,2).toString())*DProducto.getPrecio(modelop.getValueAt(tproducto.getSelectedRow(), 1).toString())),2)+"", i, 3);
                            }else JOptionPane.showMessageDialog(rootPane, "La cantidad seleccionada es mayor que el stock del producto");
                            break;
                        }
                    }
                    if(modelod.getRowCount()==i){
                        modelod.addRow(new String[]{"",modelop.getValueAt(tproducto.getSelectedRow(), 2).toString(),txcantidad.getText(),DecimalNumber.ReduceDecimal((cantidad*DProducto.getPrecio(modelop.getValueAt(tproducto.getSelectedRow(), 1).toString())),2)+"","0.00",modelop.getValueAt(tproducto.getSelectedRow(), 1).toString()});
                    }
                }
                for (int i = 0; i < modelod.getRowCount(); i++) {
                    modelod.setValueAt(i+1, i, 0);
                }
                double monto=0.00,descuento=0.00;
                for (int i = 0; i < modelod.getRowCount(); i++) {
                    monto = monto + Double.parseDouble(modelod.getValueAt(i, 3).toString());
                    descuento = descuento + Double.parseDouble(modelod.getValueAt(i, 4).toString());
                }
                lbmonto.setText(String.valueOf(DecimalNumber.ReduceDecimal(monto-descuento, 2)));
                if(cantidad<=stock){
                    Seleccion.hide();
                    Producto.hide();
                }
            }else JOptionPane.showMessageDialog(rootPane, "La cantidad ingresado es mayor que el stock del producto");
        }catch(NullPointerException ex){JOptionPane.showMessageDialog(rootPane, ex);};
    }//GEN-LAST:event_baceptarActionPerformed

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        Main.jMenuItem4.setEnabled(false);
        Venta.pnuevaVenta.setVisible(false);
    }//GEN-LAST:event_formInternalFrameOpened

    private void cbcategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbcategoriaActionPerformed
        while(modelop.getRowCount()!=0){modelop.removeRow(0);}
        if(cbcategoria.getSelectedIndex()==0){
            DProducto.showProducto(modelop, "");
        }else{
            DProducto.showProductForPresent(modelop, cbcategoria.getSelectedItem().toString(), "");
        }
        txbuscar.setText(null);
        bexportar.setEnabled(false);
        txbuscar.requestFocus();
    }//GEN-LAST:event_cbcategoriaActionPerformed

    private void txbuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txbuscarKeyReleased
        while(modelop.getRowCount()!=0){modelop.removeRow(0);}
        if(cbcategoria.getSelectedIndex()==0){
            DProducto.showProducto(modelop, txbuscar.getText());
        }else{
            DProducto.showProductForPresent(modelop, cbcategoria.getSelectedItem().toString(), txbuscar.getText());
        }
        bexportar.setEnabled(false);
    }//GEN-LAST:event_txbuscarKeyReleased

    private void txbuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txbuscarMouseClicked
        txbuscar.selectAll();
    }//GEN-LAST:event_txbuscarMouseClicked

    private void txcantidadKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txcantidadKeyReleased
        if(txcantidad.getText().length()==0){
            txcantidad.setText("1");
            txcantidad.selectAll();
        }
        if(txcantidad.getText().equals("0")){
            txcantidad.setText("1");
            txcantidad.selectAll();
        }
    }//GEN-LAST:event_txcantidadKeyReleased

    private void txcantidadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txcantidadMouseClicked
        txcantidad.selectAll();
    }//GEN-LAST:event_txcantidadMouseClicked

    private void txcantidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txcantidadKeyTyped
        if(evt.getKeyChar()>'9' || evt.getKeyChar()<'0'){
            evt.consume();
        }
        if(evt.getKeyChar()==KeyEvent.VK_ENTER){
            baceptar.doClick();
        }
    }//GEN-LAST:event_txcantidadKeyTyped

    private void ProductoWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_ProductoWindowClosing
        // TODO add your handling code here:
    }//GEN-LAST:event_ProductoWindowClosing

    private void tproductoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tproductoMouseClicked
        if(tproducto.getSelectedRowCount()==1){
            txdescripcion.setText(DProducto.getIndicacion(modelop.getValueAt(tproducto.getSelectedRow(), 1).toString()));
            bexportar.setEnabled(true);
        }
    }//GEN-LAST:event_tproductoMouseClicked

    private void tdetalleKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tdetalleKeyReleased
        try{
            if(modelod.getValueAt(tdetalle.getSelectedRow(), 4).toString().length()==0){
               modelod.setValueAt("0.00",tdetalle.getSelectedRow(), 4); 
            }
            if(evt.getKeyChar()==KeyEvent.VK_ENTER){
                if(tdetalle.getSelectedColumn()==2){
                    int stock = DProducto.getStock(modelod.getValueAt(tdetalle.getSelectedRow(), 5).toString());
                    double precio = DProducto.getPrecioN(modelod.getValueAt(tdetalle.getSelectedRow(), 1).toString());
                    if(modelod.getValueAt(tdetalle.getSelectedRow(), 2).toString().length()==0){
                        modelod.setValueAt(1, tdetalle.getSelectedRow(), 2);
                    }
                    int cantidad = Integer.parseInt(modelod.getValueAt(tdetalle.getSelectedRow(), 2).toString());
                    if(cantidad <= stock){
                        modelod.setValueAt(DecimalNumber.ReduceDecimal(cantidad*precio,2), tdetalle.getSelectedRow(), 3);
                    }else{
                        JOptionPane.showMessageDialog(rootPane, "La cantidad ingresado es mayor que el stock del producto");
                        modelod.setValueAt(stock, tdetalle.getSelectedRow(), 2);
                        modelod.setValueAt(DecimalNumber.ReduceDecimal(stock*precio,2), tdetalle.getSelectedRow(), 3);
                    }
                }
                double monto=0.00, descuento=0.00;
                for (int i = 0; i < modelod.getRowCount(); i++) {
                    monto = monto + Double.parseDouble(modelod.getValueAt(i, 3).toString());
                    descuento = descuento + Double.parseDouble(modelod.getValueAt(i, 4).toString());
                }
                lbmonto.setText(String.valueOf(DecimalNumber.ReduceDecimal(monto-descuento, 2)));
            }
        }catch(NullPointerException | NumberFormatException ex){}
    }//GEN-LAST:event_tdetalleKeyReleased

    private void tdetalleKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tdetalleKeyTyped
        if(tdetalle.getSelectedColumn()==2 || tdetalle.getSelectedColumn()==4){
            if(evt.getKeyChar()>='9' || evt.getKeyChar()<'9'){
                evt.consume();
            }
//            int cantidad = Integer.parseInt(modelod.getValueAt(tdetalle.getSelectedRow(), 2).toString());
//            double precio = DProducto.getPrecioN(modelod.getValueAt(tdetalle.getSelectedRow(), 1).toString());
//            modelod.setValueAt(cantidad*precio, tdetalle.getSelectedRow(), 3);
//            System.out.println(modelod.getValueAt(tdetalle.getSelectedRow(), 1));
        }
    }//GEN-LAST:event_tdetalleKeyTyped

    private void bagregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bagregarActionPerformed
        modelod.addRow(new String[]{});
        for (int i = 0; i < modelod.getRowCount(); i++) {
            modelod.setValueAt(i+1, i, 0);
        }
    }//GEN-LAST:event_bagregarActionPerformed

    private void txefectivoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txefectivoMouseClicked
        txefectivo.selectAll();
    }//GEN-LAST:event_txefectivoMouseClicked

    private void txefectivoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txefectivoKeyReleased
        if(txefectivo.getText().length()==0){
            txefectivo.setText("0.00");
            lbvuelto.setText("0.00");
            txefectivo.selectAll();
        }else
            lbvuelto.setText(String.valueOf(DecimalNumber.ReduceDecimal(Double.parseDouble(txefectivo.getText())-Double.parseDouble(lbmonto.getText()),2)));
    }//GEN-LAST:event_txefectivoKeyReleased

    private void bguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bguardarActionPerformed
        try{
            if(modelod.getRowCount()>0 && !lbmonto.getText().equals("0.00")){
                Date d = new Date();
                String fecha = (d.getYear()+1900)+"-"+(d.getMonth()+1)+"-"+d.getDate()+" "+d.getHours()+":"+d.getMinutes()+":"+d.getSeconds();
                CVenta v = new CVenta();
                v.setIdVenta(Codigo.id(8, Opcion.getContador("venta")));
                v.setFechaVenta(fecha);
                v.setMontoTotal(Double.parseDouble(lbmonto.getText()));
                System.out.println(CLogeo.getIdUsuario());
                System.out.println(Venta.lbturno.getText());
                v.setIdUsuario(CLogeo.getIdUsuario());
                if(Venta.lbturno.getText().equals("mañana")) v.setIdTurno("01");
                else v.setIdTurno("02");
                DVenta.InsertVenta(v);

                lbnumero.setText("N° "+Codigo.id(8,Opcion.getContador("venta")));
                for (int i = 0; i < modelod.getRowCount(); i++) {
                    v.setIdProducto(modelod.getValueAt(i, 5).toString());
                    v.setCantidad(Integer.parseInt(modelod.getValueAt(i, 2).toString()));
                    v.setMonto(Double.parseDouble(modelod.getValueAt(i, 3).toString()));
                    v.setDescuento(Double.parseDouble(modelod.getValueAt(i, 4).toString()));
                    DVenta.InsertDetalleVenta(v);
                    bguardar.setEnabled(false);
                    bbuscar.setEnabled(false);
                    bagregar.setEnabled(false);
                    
                    if(Main.v.isVisible()){
                        for (int j = 0; j < Venta.modelo.getRowCount(); j++) {
                            if(Venta.modelo.getValueAt(j, 1).toString().equals(modelod.getValueAt(i, 5).toString())){
                                int stock = Integer.parseInt(Venta.modelo.getValueAt(j, 5).toString());
                                int cant = Integer.parseInt(modelod.getValueAt(i, 2).toString());
                                Venta.modelo.setValueAt(""+(stock-cant), j, 5);
                                Venta.tabla.setDefaultRenderer(Object.class, new TablaRender());
                                break;
                            }
                        }
                        Venta.lbmonto.setText(DecimalNumber.ReduceDecimal(DVenta.ventaDia((d.getYear()+1900)+"-"+(d.getMonth()+1)+"-"+d.getDate()),2)+" S/.");
                    }
                }
                Message m = new Message();
                m.Start(this, "Venta realizada exitosamente");
            }else
                JOptionPane.showMessageDialog(rootPane, "No hay ningún producto agregado para la venta");
        }catch(NumberFormatException | NullPointerException ex){JOptionPane.showMessageDialog(rootPane, "Venta no registrada\nIngrese los datos correctos");}
    }//GEN-LAST:event_bguardarActionPerformed

    private void beliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_beliminarActionPerformed
        try{
            if(tdetalle.getSelectedRowCount()==1){
                int si=JOptionPane.showConfirmDialog(rootPane, "Está seguro que desea eliminar?", "CONFIRMAR", 0, 3);
                if(si==0){
                    modelod.removeRow(tdetalle.getSelectedRow());
                    double monto=0.00;
                    for (int i = 0; i < modelod.getRowCount(); i++) {
                        monto = monto + Double.parseDouble(modelod.getValueAt(i, 3).toString());
                    }
                    lbmonto.setText(String.valueOf(DecimalNumber.ReduceDecimal(monto, 2)));
                    for (int i = 0; i < modelod.getRowCount(); i++) {modelod.setValueAt(i+1, i, 0);}
                }
            }else
                JOptionPane.showMessageDialog(rootPane, "Seleccione la fila que desea eliminar");
            }catch(NullPointerException ex){
                for (int i = 0; i < modelod.getRowCount(); i++) {modelod.setValueAt(i+1, i, 0);}
        }
    }//GEN-LAST:event_beliminarActionPerformed

    private void bnuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnuevoActionPerformed
        while(modelod.getRowCount()>0){modelod.removeRow(0);}
        lbmonto.setText("0.00");
        txefectivo.setText("0.00");
        lbvuelto.setText("0.00");
        bguardar.setEnabled(true);
        bbuscar.setEnabled(true);
        bagregar.setEnabled(true);
    }//GEN-LAST:event_bnuevoActionPerformed

    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed
        try{
            if(tdetalle.getSelectedRowCount()==1){
                int si=JOptionPane.showConfirmDialog(rootPane, "Está seguro de querer eliminar?", "CONFIRMAR", 0, 3);
                if(si==0){
                    modelod.removeRow(tdetalle.getSelectedRow());
                    double monto=0.00;
                    for (int i = 0; i < modelod.getRowCount(); i++) {
                        monto = monto + Double.parseDouble(modelod.getValueAt(i, 3).toString());
                    }
                    lbmonto.setText(String.valueOf(DecimalNumber.ReduceDecimal(monto, 2)));
                    for (int i = 0; i < modelod.getRowCount(); i++) {modelod.setValueAt(i+1, i, 0);}
                }
            }else
                JOptionPane.showMessageDialog(rootPane, "Seleccione la fila que desea eliminar");
            }catch(NullPointerException ex){
                for (int i = 0; i < modelod.getRowCount(); i++) {modelod.setValueAt(i+1, i, 0);}
        }
    }//GEN-LAST:event_eliminarActionPerformed

    private void exportarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exportarActionPerformed
        Seleccion.setLocationRelativeTo(null);
        Seleccion.setVisible(true);
        bexportar.setEnabled(false);
        txcantidad.setText("1");
        txcantidad.requestFocus();
        txcantidad.selectAll();
    }//GEN-LAST:event_exportarActionPerformed

    private void formInternalFrameClosing(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosing
        Main.jMenuItem4.setEnabled(true);
        Venta.pnuevaVenta.setVisible(true);
    }//GEN-LAST:event_formInternalFrameClosing


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog Producto;
    private javax.swing.JDialog Seleccion;
    private javax.swing.JButton baceptar;
    private javax.swing.JButton bagregar;
    private javax.swing.JButton bbuscar;
    private javax.swing.JButton beliminar;
    private javax.swing.JButton bexportar;
    private javax.swing.JButton bguardar;
    private javax.swing.JButton bnuevo;
    private javax.swing.JComboBox<String> cbcategoria;
    private javax.swing.JMenuItem eliminar;
    private javax.swing.JMenuItem exportar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JPopupMenu jPopupMenu2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lbfecha;
    private javax.swing.JLabel lbmonto;
    private javax.swing.JLabel lbnumero;
    private javax.swing.JLabel lbproducto;
    private javax.swing.JLabel lbvuelto;
    private javax.swing.JTable tdetalle;
    private javax.swing.JTable tproducto;
    private javax.swing.JTextField txbuscar;
    private javax.swing.JTextField txcantidad;
    private javax.swing.JEditorPane txdescripcion;
    private javax.swing.JTextField txefectivo;
    // End of variables declaration//GEN-END:variables
    private void txproductoKeyTyped(java.awt.event.KeyEvent evt) {
        if(evt.getKeyChar()==KeyEvent.VK_ENTER){
            if(tdetalle.getSelectedColumn()==1){
                modelod.setValueAt(DProducto.getId(txproducto.getText()), tdetalle.getSelectedRow(), 5);
                modelod.setValueAt("", tdetalle.getSelectedRow(), 2);
                modelod.setValueAt("", tdetalle.getSelectedRow(), 3);
                modelod.setValueAt("0.00", tdetalle.getSelectedRow(), 4);
            }
        }
    }
    
    private void txdescuentoKeyReleased(java.awt.event.KeyEvent evt) {
        
    }
    private void txdescuentoKeyTyped(java.awt.event.KeyEvent evt) {
        if(evt.getKeyChar()<'0' || evt.getKeyChar()>'9'){
            if(evt.getKeyChar()!='.')
                evt.consume();
        }
    }
    
    private void txunidadKeyReleased(java.awt.event.KeyEvent evt) {
        
    }
    private void txunidadKeyTyped(java.awt.event.KeyEvent evt) {
        if(evt.getKeyChar()<'0' || evt.getKeyChar()>'9'){
            evt.consume();
        }
    }
}