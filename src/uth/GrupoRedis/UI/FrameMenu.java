
package uth.GrupoRedis.UI;

import java.util.UUID;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.SpinnerNumberModel;
import javax.swing.table.DefaultTableModel;
import redis.clients.jedis.Jedis;
import uth.GrupoRedis.Entidates.Factura;
import uth.GrupoRedis.Entidates.Producto;
import java.util.Set;



public class FrameMenu extends javax.swing.JFrame {

     
    public FrameMenu() {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrameMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        initComponents();
        
        SpinnerNumberModel value =  
             new SpinnerNumberModel(0, //initial value  
                0, //minimum value  
                20, //maximum value  
                5); //step  
        
        txtDescuento.setModel(value);
        setLocationRelativeTo(null);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
       
        
         String columnas[] = {"N° PRODUCTO", "NOMBRE", "PRECIO", "CANTIDAD", "SUBTOTAL"};
        
        tblProductos.setModel(new DefaultTableModel(null, columnas));
        
        inicializarFormulario();
        
        facturas = Factura.listarObjetosFactura(redis);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNumFactura = new javax.swing.JTextField();
        txtRTN = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        btnEliminarProducto = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtSubtotal = new javax.swing.JTextField();
        txtIsv = new javax.swing.JTextField();
        txtDescuento = new javax.swing.JSpinner();
        txtTotal = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProductos = new javax.swing.JTable();
        btnAProducto1 = new javax.swing.JButton();
        btnCrear = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setFont(new java.awt.Font("AcmeFont", 0, 24)); // NOI18N
        jLabel1.setText("FACTURAS");

        jPanel3.setBackground(new java.awt.Color(249, 193, 85));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel2.setText("NUMERO DE FACTURA");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel3.setText("NOMBRE DEL CLIENTE");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel4.setText("RTN");

        txtNumFactura.setEditable(false);
        txtNumFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumFacturaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                        .addComponent(txtNumFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(58, 58, 58)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtRTN)
                            .addComponent(txtNombre))))
                .addGap(40, 40, 40))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNumFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRTN, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(29, 29, 29))
        );

        txtNumFactura.getAccessibleContext().setAccessibleName("");

        btnEliminarProducto.setBackground(new java.awt.Color(204, 204, 204));
        btnEliminarProducto.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        btnEliminarProducto.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminarProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uth/GrupoRedis/Imagenes/deleteProducto.png"))); // NOI18N
        btnEliminarProducto.setBorderPainted(false);
        btnEliminarProducto.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/uth/GrupoRedis/Imagenes/deleteProducto1.png"))); // NOI18N
        btnEliminarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarProductoActionPerformed(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(249, 193, 85));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel5.setText("SUBTOTAL");
        jLabel5.setToolTipText("");

        jLabel6.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel6.setText("DESCUENTO");

        jLabel7.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel7.setText("ISV");

        jLabel8.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel8.setText("TOTAL A PAGAR");

        txtSubtotal.setEditable(false);
        txtSubtotal.setText("0");

        txtIsv.setEditable(false);
        txtIsv.setText("0");
        txtIsv.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtIsvKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIsvKeyTyped(evt);
            }
        });

        txtDescuento.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                txtDescuentoStateChanged(evt);
            }
        });

        txtTotal.setEditable(false);
        txtTotal.setText("0");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtIsv)
                            .addComponent(txtSubtotal)
                            .addComponent(txtDescuento)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtTotal)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtSubtotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtDescuento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtIsv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29))
        );

        tblProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblProductos);

        btnAProducto1.setBackground(new java.awt.Color(204, 204, 204));
        btnAProducto1.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        btnAProducto1.setForeground(new java.awt.Color(255, 255, 255));
        btnAProducto1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uth/GrupoRedis/Imagenes/agregarproducto.png"))); // NOI18N
        btnAProducto1.setBorderPainted(false);
        btnAProducto1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/uth/GrupoRedis/Imagenes/agregarproducto1.png"))); // NOI18N
        btnAProducto1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAProducto1ActionPerformed(evt);
            }
        });

        btnCrear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uth/GrupoRedis/Imagenes/crear.png"))); // NOI18N
        btnCrear.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/uth/GrupoRedis/Imagenes/crear1.png"))); // NOI18N
        btnCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearActionPerformed(evt);
            }
        });

        btnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uth/GrupoRedis/Imagenes/modificar.png"))); // NOI18N
        btnModificar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/uth/GrupoRedis/Imagenes/modificar1.png"))); // NOI18N
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uth/GrupoRedis/Imagenes/Buscar.png"))); // NOI18N
        btnBuscar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/uth/GrupoRedis/Imagenes/Buscar1.png"))); // NOI18N
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uth/GrupoRedis/Imagenes/eliminar.png"))); // NOI18N
        btnEliminar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/uth/GrupoRedis/Imagenes/eliminar1.png"))); // NOI18N
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnCancelar.setText("LIMPIAR");
        btnCancelar.setEnabled(false);
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAProducto1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEliminarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnCrear, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnCancelar))
                        .addGap(18, 18, 18)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(26, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(280, 280, 280))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnEliminarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnAProducto1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCrear, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNumFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumFacturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumFacturaActionPerformed

    private void btnEliminarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarProductoActionPerformed
        //System.out.println(tblProductos.getSelectedRow());
        
        if(tblProductos.getSelectedRow()== -1){
            
            JOptionPane.showMessageDialog(rootPane, "Seleccione un producto");
        }else{
            
            DefaultTableModel modelo = (DefaultTableModel)tblProductos.getModel();
            modelo.removeRow(tblProductos.getSelectedRow());
            
            txtSubtotal.setText(calculaSubtotal(tblProductos)+"");
            
            calculaTotal();
        }
    }//GEN-LAST:event_btnEliminarProductoActionPerformed

    private void btnAProducto1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAProducto1ActionPerformed
       
        new MenuProductos(this, true).setVisible(true);
    }//GEN-LAST:event_btnAProducto1ActionPerformed

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        
        if(redis.exists("cantidad_producto") && redis.exists("id_Producto")){
            //System.out.println(redis.get("id_Producto")+" "+redis.get("cantidad_producto"));
            
            agregarProductoEnTabla(redis.get("id_Producto"),Integer.parseInt(redis.get("cantidad_producto")), tblProductos);
            
            txtSubtotal.setText(calculaSubtotal(tblProductos)+"");
            
            calculaTotal();
            
            btnCancelar.setEnabled(true);
            
             System.out.println("Existen variables Productos");
        }else if(redis.exists("factura")){
            
            inicializarFormulario();
            ponerDatosFactura(redis.get("factura"));
            btnCancelar.setEnabled(true);
             System.out.println("Existe variable Factura");
        }else{
            System.out.println("No Existen variables");
        }
    }//GEN-LAST:event_formWindowGainedFocus

    private void txtIsvKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIsvKeyTyped
        char letra = evt.getKeyChar();
        
        if (Character.isLetter(letra)){
            evt.consume();
        }
        
        if (letra == '.'){
            evt.consume();
        }
    }//GEN-LAST:event_txtIsvKeyTyped

    private void txtIsvKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIsvKeyReleased
        calculaTotal();
    }//GEN-LAST:event_txtIsvKeyReleased

    private void btnCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearActionPerformed
        try {
            if(redis.exists(txtNumFactura.getText())==false){
                guardarFactura();
            
                facturas = Factura.listarObjetosFactura(redis);
               // System.out.println(tblProductos.getRowCount());
            }else{
                
                JOptionPane.showMessageDialog(rootPane, "Factura ya existe");
            }
            
        } catch (Exception e) {
            System.out.println(e.getCause());
        }
        
    }//GEN-LAST:event_btnCrearActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        new MenuBuscarFactura(this, true).setVisible(true);
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void txtDescuentoStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_txtDescuentoStateChanged
        calculaTotal();
    }//GEN-LAST:event_txtDescuentoStateChanged

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
          try {
            if(redis.exists(txtNumFactura.getText())){
                guardarFactura();
            
                facturas = Factura.listarObjetosFactura(redis);
                
                btnCancelar.setEnabled(false);
               // System.out.println(tblProductos.getRowCount());
            }else{
                
                JOptionPane.showMessageDialog(rootPane, "Factura no existe");
            }
            
        } catch (Exception e) {
            System.out.println(e.getCause());
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
           try {
                if(redis.exists(txtNumFactura.getText())){
                  if(JOptionPane.showConfirmDialog(rootPane, "Quiere eliminar la factura?","CONFIRMACION",JOptionPane.YES_NO_OPTION)==
                          JOptionPane.YES_OPTION){ 
                    for(int i = 0;i<facturas.length;i++){
                        if(facturas[i].getN_factura().equals(txtNumFactura.getText())){
                            redis.del(facturas[i].getN_factura());
                            redis.del(facturas[i].getId_productos());
                            break;
                        }
                    }
                    facturas = Factura.listarObjetosFactura(redis);
                    inicializarFormulario();
                    JOptionPane.showMessageDialog(rootPane, "Eliminado correctamente");
                  }
                }else{

                    JOptionPane.showMessageDialog(rootPane, "Factura no existe");
                }
            
            } catch (Exception e) {
                System.out.println(e.getCause().getMessage());
            }
        
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        inicializarFormulario();
        btnCancelar.setEnabled(false);
    }//GEN-LAST:event_btnCancelarActionPerformed

    ////////////////////////////////////////////////////////////////////////////////////////////////
     /*MAIN*/   
        public static void main(String args[]) {
        
        redis = new Jedis();
        
//        PANTALLAS DE FORMULARIOS
        new FrameMenu().setVisible(true);//DESCOMENTAR ESTE
        
        
        
        //AGREGAR PRODUCTOS A REDIS
//        AgregarProductos.agregarProductos(); DESCOMENTAR ESTE UNA VEZ PARA AGREGAR LOS PRODUCTOS, LUEGO DESCOMENTARLO
        
        
//        ELIMINAR TODOS LOS PRODUCTOS
//            String a[]=Producto.listarCodigosProductos(redis);
//            for(String g:a){
//                redis.del(g);
//            }
        
    }
    ////////////////////////////////////////////////////////////////////////////////////////////////
    
    //-----------------------------------------------------------------------------------------------------------------
    //MIS METODOS
    
    public static String tresPrimerasLetras(String clave){
        
        String aux="";
        
        for(int i=0;i<3;i++){
            
            aux+=clave.charAt(i);
        }
        
        return aux;
    }
    
    public static String quitarPrimerasTresLetras(String codigo){
        String cadena="";
        
        for(int i=0;i<codigo.length();i++){
            if(i>3){
            
                cadena+=codigo.charAt(i);
            }
        }
        
        return cadena;
    }
    
    public static String generarId() {

        return UUID.randomUUID().toString().toUpperCase().substring(0, 4);
    }
    
    public static boolean buscarId(String arr[], String id) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equalsIgnoreCase(id)) {
                return true;
            }
        }
        return false;
    }
    
    public static String[] redefinirString(String []arg){
        String aux[] = new String[arg.length+1];
        
        for(int i = 0; i < arg.length; i++){
            
            aux[i] = arg[i];
        }
        
        return aux;
    }
    
    public static void agregarProductoEnTabla(String codigo, int cantidad,JTable tabla){
        
        DefaultTableModel model ;
        
        model = (DefaultTableModel) tabla.getModel();
        
        String [] filas = new String[5];     
        
        int index = -1;
        
        for(int i = 0; i<tabla.getRowCount();i++){
            if(tabla.getValueAt(i, 0).equals(codigo)){
                index = i;
            }
        }
            
        
        if(index ==-1){
            
            for(Producto x:Producto.listarObjetosProductos(redis)){
                if(x.getNum_producto().equals(codigo)){
                    filas[0] = x.getNum_producto();
                    filas[1] = x.getNombre();
                    filas[2] = x.getPrecio()+"";
                    filas[3] = cantidad+"";
                    filas[4] = (formatoDecimales(cantidad*x.getPrecio(),2))+"";
                    break;
                }
            }         
            model.addRow(filas);
            tabla.setModel(model);
        }else{
            
            cantidad += Integer.parseInt(tabla.getValueAt(index, 3)+"");

            tabla.setValueAt(cantidad, index, 3);
            
            //cantidad *= Integer.parseInt(tabla.getValueAt(index, 2)+"");
            
            tabla.setValueAt(cantidad*Double.parseDouble(tabla.getValueAt(index, 2)+""), index, 4);
        }
        
               
        
    }
    
    public  void ponerDatosFactura(String codigo){
        
        Factura f = new Factura();
        
        for(Factura aux:facturas){
            if(aux.getN_factura().equals(codigo)){
                f = aux;
                break;
            }
        }
               
        txtNumFactura.setText(f.getN_factura());
        
        txtRTN.setText(f.getRtn());
    
        txtNombre.setText(f.getNombreCliente());
        
        txtSubtotal.setText(f.getSubTotal()+"");
    
        txtDescuento.setValue(f.getDescuento());
        
        txtIsv.setText(f.getIsv()+"");
        
        txtTotal.setText(f.getTotal()+"");
        
        Set<String> keys = redis.hkeys(f.getId_productos());
		
	// Print the results
	for (String c: keys) {
		//System.out.println(c + ": " + redis.hget(f.getId_productos(), c));
                
                agregarProductoEnTabla(c, Integer.parseInt(redis.hget(f.getId_productos(), c)), tblProductos);
	}
    }
    
    public double calculaSubtotal(JTable tabla){
        
        double subtotal=0;
        
        for(int i=0;i<tabla.getRowCount();i++){
        
            subtotal+= Double.parseDouble(tabla.getValueAt(i, 4)+"");
        }
        
        return formatoDecimales(subtotal, 2);
    }
    
    public void calculaTotal(){
       double subtotal=0;
       String des="";
       double descuento = 0;
       String is="";
       double isv = 0;
       double total = 0;
               
         subtotal = formatoDecimales(Double.parseDouble(txtSubtotal.getText()),2);
        
         des=txtDescuento.getValue()+"";
         if(des.length()==0){
             des = "0";
         }
         descuento = formatoDecimales(subtotal*((Double.parseDouble(des)/100)), 2);
        
        
        
         
        if(is.length()==0){
             is = "0";
         }
        
        isv = formatoDecimales(subtotal*((Double.parseDouble("15")/100)),2);
        
        txtIsv.setText(isv+"");
        
        total=formatoDecimales(subtotal-descuento+isv,2);
        
        txtTotal.setText(total+"");
    }
    
    public void inicializarFormulario(){
        
        txtNumFactura.setText(Factura.generarCodigo(redis));
        
        txtRTN.setText("");
    
        txtNombre.setText("");
        
        txtSubtotal.setText("0");
    
        txtDescuento.setValue(0);
        
        txtIsv.setText("0");
        
        txtTotal.setText("0");
        
        String columnas[] = {"N° PRODUCTO", "NOMBRE", "PRECIO", "CANTIDAD", "SUBTOTAL"};
        
        tblProductos.setModel(new DefaultTableModel(null, columnas));
        
        
    }
    
    public void guardarFactura(){
        
        Factura f = new Factura();
     
        if(txtRTN.getText().length()>0&&txtNombre.getText().length()>0){
            
            f.setN_factura(txtNumFactura.getText());
            
            f.setRtn(txtRTN.getText());
            
            f.setNombreCliente(txtNombre.getText());
            
            f.setDescuento(Double.parseDouble(txtDescuento.getValue()+""));
            
            f.setIsv(Double.parseDouble(txtIsv.getText()));
            
            f.setId_productos("CDP."+quitarPrimerasTresLetras(txtNumFactura.getText()));
            
            f.setSubTotal(Double.parseDouble(txtSubtotal.getText()));
            
            f.setTotal(Double.parseDouble(txtTotal.getText()));
            
            if(tblProductos.getRowCount()==0){
                JOptionPane.showMessageDialog(rootPane, "La factura debe tener productos");
            }else{
            
                redis.set(f.getN_factura(), f.toString());
                redis.del(f.getId_productos());
                for(int i=0;i<tblProductos.getRowCount();i++){
                    guardarProductoCantidad(f.getId_productos(), tblProductos.getValueAt(i, 0)+"",
                            tblProductos.getValueAt(i, 3)+"");
                }
                
                JOptionPane.showMessageDialog(rootPane, "GUARDADO CORRECTAMENTE");
                inicializarFormulario();
                
                btnCancelar.setEnabled(false);
            }
            
        }else{
            JOptionPane.showMessageDialog(rootPane, "Faltan campos por llenar");
        }
    }
        
    public void guardarProductoCantidad(String codigo, String idProducto, String cantidad){
        
        redis.hset(codigo, idProducto, cantidad);
        
        //System.out.println(codigo+" "+idProducto+" "+cantidad);
    }
    
    public static Double formatoDecimales(Double numero, Integer numeroDecimales) {
        //System.out.println("1. ="+Math.round(numero * Math.pow(10, numeroDecimales)));
        //System.out.println("2. ="+Math.pow(10, numeroDecimales));
        
        return Math.round(numero * Math.pow(10, numeroDecimales)) / Math.pow(10, numeroDecimales);
    }
    //-----------------------------------------------------------------------------------------------------------------
    //MIS VARIABLES
    
    private static Jedis redis;
    private static Factura facturas[];
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAProducto1;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnCrear;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnEliminarProducto;
    private javax.swing.JButton btnModificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblProductos;
    private javax.swing.JSpinner txtDescuento;
    private javax.swing.JTextField txtIsv;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNumFactura;
    private javax.swing.JTextField txtRTN;
    private javax.swing.JTextField txtSubtotal;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
}
