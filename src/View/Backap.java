package View;

import Option.Validar;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Calendar;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/*
  *@author CIRO MF
 */
public class Backap extends javax.swing.JDialog {
    private String path;
    public Backap(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        setIconImage(new ImageIcon(getClass().getResource("/Image/base-de-datosseg.png")).getImage());
        lbdb.setText(Validar.NombreDB());
        bdb.setVisible(false);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        txruta = new javax.swing.JTextField();
        barchivo = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lbdb = new javax.swing.JLabel();
        lbmsg = new javax.swing.JLabel();
        bdb = new javax.swing.JButton();
        rbbackap = new javax.swing.JRadioButton();
        rbrestaurar = new javax.swing.JRadioButton();
        bcancelar = new javax.swing.JButton();
        baceptar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("CONTROL DE BASE DE DATOS");

        jPanel1.setBackground(new java.awt.Color(0, 102, 51));

        jPanel2.setBackground(new java.awt.Color(0, 102, 51));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txruta.setBackground(new java.awt.Color(204, 204, 204));
        txruta.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txruta.setEnabled(false);

        barchivo.setBackground(new java.awt.Color(51, 204, 0));
        barchivo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/carpeta.png"))); // NOI18N
        barchivo.setContentAreaFilled(false);
        barchivo.setEnabled(false);
        barchivo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                barchivoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                barchivoMouseExited(evt);
            }
        });
        barchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                barchivoActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 0));
        jLabel1.setText("Base de datos:");

        lbdb.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbdb.setForeground(new java.awt.Color(0, 153, 255));
        lbdb.setText("nameDB");

        lbmsg.setForeground(new java.awt.Color(204, 204, 204));

        bdb.setBackground(new java.awt.Color(51, 204, 0));
        bdb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/base-de-datos.png"))); // NOI18N
        bdb.setContentAreaFilled(false);
        bdb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bdbMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bdbMouseExited(evt);
            }
        });
        bdb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bdbActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txruta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(barchivo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbdb)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bdb, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lbmsg)
                        .addGap(0, 388, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(lbdb))
                    .addComponent(bdb, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbmsg)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(barchivo)
                    .addComponent(txruta, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59))
        );

        buttonGroup1.add(rbbackap);
        rbbackap.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        rbbackap.setForeground(new java.awt.Color(255, 153, 51));
        rbbackap.setText("Generar backup de base de datos");
        rbbackap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbbackapActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbrestaurar);
        rbrestaurar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        rbrestaurar.setForeground(new java.awt.Color(255, 153, 51));
        rbrestaurar.setText("Restaurar base de datos");
        rbrestaurar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbrestaurarActionPerformed(evt);
            }
        });

        bcancelar.setBackground(new java.awt.Color(51, 153, 0));
        bcancelar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bcancelar.setText("Cancelar");
        bcancelar.setContentAreaFilled(false);
        bcancelar.setOpaque(true);
        bcancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bcancelarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bcancelarMouseExited(evt);
            }
        });
        bcancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bcancelarActionPerformed(evt);
            }
        });

        baceptar.setBackground(new java.awt.Color(51, 153, 0));
        baceptar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        baceptar.setText("Aceptar");
        baceptar.setContentAreaFilled(false);
        baceptar.setEnabled(false);
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(rbbackap)
                        .addGap(18, 18, 18)
                        .addComponent(rbrestaurar)
                        .addGap(0, 2, Short.MAX_VALUE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(baceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bcancelar)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbbackap)
                    .addComponent(rbrestaurar))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bcancelar)
                    .addComponent(baceptar))
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

    private void barchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_barchivoActionPerformed
        try {
            JFileChooser fc = new JFileChooser();
            fc.showOpenDialog(this);
            File f = fc.getSelectedFile();
            path = f.getAbsolutePath();
            path = path.replace('\\', '/');
            if(rbbackap.isSelected()){
                Calendar c=Calendar.getInstance();
                String fecha=String.valueOf(c.get(Calendar.DATE));
                fecha=fecha+"-"+String.valueOf(c.get(Calendar.MONTH));
                fecha=fecha+"-"+String.valueOf(c.get(Calendar.YEAR));
                path = path+"_"+fecha+".sql";
            }
            txruta.setText(path);
        } catch (NullPointerException | IndexOutOfBoundsException e) {JOptionPane.showMessageDialog(rootPane, "tenga más cuidado al seleccionar el archivo");}
    }//GEN-LAST:event_barchivoActionPerformed

    private void baceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_baceptarActionPerformed
        if(rbbackap.isSelected()){
            GenerarBackupMySQL();
        }
        else{
            RestaurarBackapMySql();
        }
    }//GEN-LAST:event_baceptarActionPerformed

    private void bcancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bcancelarActionPerformed
        dispose();
    }//GEN-LAST:event_bcancelarActionPerformed

    private void rbbackapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbbackapActionPerformed
        baceptar.setEnabled(true);
        barchivo.setEnabled(true);
        bdb.setVisible(false);
        lbmsg.setText("El backup se creará con este nombre de base de datos");
    }//GEN-LAST:event_rbbackapActionPerformed

    private void barchivoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barchivoMouseEntered
        barchivo.setOpaque(true);
    }//GEN-LAST:event_barchivoMouseEntered

    private void barchivoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barchivoMouseExited
        barchivo.setOpaque(false);
    }//GEN-LAST:event_barchivoMouseExited

    private void rbrestaurarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbrestaurarActionPerformed
        baceptar.setEnabled(true);
        barchivo.setEnabled(true);
        bdb.setVisible(true);
        lbmsg.setText("Asegúrese de que el backup de la base de datos tenga este nombre");
    }//GEN-LAST:event_rbrestaurarActionPerformed

    private void bdbMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bdbMouseEntered
        bdb.setOpaque(true);
    }//GEN-LAST:event_bdbMouseEntered

    private void bdbMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bdbMouseExited
        bdb.setOpaque(false);
    }//GEN-LAST:event_bdbMouseExited

    private void bdbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bdbActionPerformed
        String name = JOptionPane.showInputDialog("Ingrse el nuevo nombre de base de datos");
        if(name!=null){
            CambiarNombre(name);
            lbdb.setText(Validar.NombreDB());
        }
    }//GEN-LAST:event_bdbActionPerformed

    private void baceptarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_baceptarMouseExited
        baceptar.setBackground(new java.awt.Color(51, 153, 0));
    }//GEN-LAST:event_baceptarMouseExited

    private void baceptarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_baceptarMouseEntered
        baceptar.setBackground(new java.awt.Color(51, 204, 0));
    }//GEN-LAST:event_baceptarMouseEntered

    private void bcancelarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bcancelarMouseEntered
        bcancelar.setBackground(new java.awt.Color(51, 204, 0));
    }//GEN-LAST:event_bcancelarMouseEntered

    private void bcancelarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bcancelarMouseExited
        bcancelar.setBackground(new java.awt.Color(51, 153, 0));
    }//GEN-LAST:event_bcancelarMouseExited

//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(Backap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Backap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Backap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Backap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the dialog */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                Backap dialog = new Backap(new javax.swing.JFrame(), true);
//                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
//                    @Override
//                    public void windowClosing(java.awt.event.WindowEvent e) {
//                        System.exit(0);
//                    }
//                });
//                dialog.setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton baceptar;
    private javax.swing.JButton barchivo;
    private javax.swing.JButton bcancelar;
    private javax.swing.JButton bdb;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbdb;
    private javax.swing.JLabel lbmsg;
    private javax.swing.JRadioButton rbbackap;
    private javax.swing.JRadioButton rbrestaurar;
    private javax.swing.JTextField txruta;
    // End of variables declaration//GEN-END:variables
    void GenerarBackupMySQL(){
        try{
            Runtime runtime = Runtime.getRuntime();
            FileWriter fw = new FileWriter(path);
            Process child = runtime.exec("C:/xampp/mysql/bin/mysqldump.exe --opt --password="+Validar.ClaveDB()+" --user=root "
                    + "--databases "+Validar.NombreDB()+" -R"); 
            InputStreamReader irs = new InputStreamReader(child.getInputStream());
            BufferedReader br = new BufferedReader(irs);

            String line;
            while( (line=br.readLine()) != null ) {
                fw.write(line + "\n");
            }
            fw.close();
            irs.close();
            br.close();

        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error no se genero el archivo por el siguiente motivo:"+e.getMessage(), "Verificar",JOptionPane.ERROR_MESSAGE);
        }
        JOptionPane.showMessageDialog(null, "Archivo generado con éxito","Verificar",JOptionPane.INFORMATION_MESSAGE);
    }
    private void RestaurarBackapMySql(){
        String restoreCmd = "C:/xampp/mysql/bin/mysql --user=root --password="+Validar.ClaveDB()+" --host=localhost -e \"source " + path;
        Process runtimProcess;
        try {
            runtimProcess = Runtime.getRuntime().exec(restoreCmd);
            int proceCom = runtimProcess.waitFor();
            
            if (proceCom==0) {
                JOptionPane.showMessageDialog(null,"Restauración de base de datos con éxito");
            }else{
                JOptionPane.showMessageDialog(null,"Restauración fallida");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }
    }
    private void CambiarNombre(String name){
        String clave = Validar.ClaveDB();
        String barra = File.separator;
        String ruta = System.getProperty("user.dir")+barra+"registro"+barra;
        try (FileWriter escribir = new FileWriter(ruta+"user.dat")) {
            PrintWriter guardar = new PrintWriter(escribir);
            guardar.println("dbname="+name);
            guardar.println("password="+clave);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(rootPane, ex);
        }
    }
}