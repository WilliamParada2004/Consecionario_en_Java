package com.login;

import java.awt.Color;
import java.util.InputMismatchException;
import javax.swing.JOptionPane;

public class MenuPrincipal extends javax.swing.JFrame {
    int xMouse, yMouse, choice;
    int km,estado,precio,kv,salida;
    String tracc, opc;
    String marca, color,codigo,modelo; 
    Carro nuevo;
    Motocicleta nueva;
    Admin main = new Admin();
    
    public void Bloque(){
        Reportaje.setText("");
        modelo = JOptionPane.showInputDialog("Digite el modelo del vehiculo").toUpperCase();
        if(Carro.isSelected()){
            Reportaje.setText(main.busquedaAutos(modelo));
        }else if(Moto.isSelected()){
            Reportaje.setText(main.busquedaMotos(modelo));
        }else{
            JOptionPane.showMessageDialog(null, "Es necesario seleccionar el tipo"
                    +"\nde vehiculo con el que interactuar"); 
        }
    }
    
    public void Bloque2(){
        Reportaje.setText("");
        if(Carro.isSelected()){
            tracc = JOptionPane.showInputDialog("Digite la traccion del carro").toUpperCase();
            Reportaje.setText(main.busquedaAutos2(tracc));
        }else if(Moto.isSelected()){
            kv = Integer.parseInt(JOptionPane.showInputDialog("Digite la traccion del carro"));
            Reportaje.setText(main.busquedaMotos2(kv));
        }else{
            JOptionPane.showMessageDialog(null, "Es necesario seleccionar el tipo"
                    +"\nde vehiculo con el que interactuar"); 
        }
    }
    
    public MenuPrincipal() {
        initComponents();
        this.setLocationRelativeTo(null);
        
        Eleccion.add(Carro);
        Eleccion.add(Moto);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Eleccion = new javax.swing.ButtonGroup();
        Bg = new javax.swing.JPanel();
        exitBtn = new javax.swing.JPanel();
        exitTxt = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Reportaje = new javax.swing.JTextArea();
        Titulo = new javax.swing.JPanel();
        tituloTxt = new javax.swing.JLabel();
        Carro = new javax.swing.JRadioButton();
        Moto = new javax.swing.JRadioButton();
        ConsBtn = new javax.swing.JPanel();
        ConsTxt = new javax.swing.JLabel();
        AñadBtn = new javax.swing.JPanel();
        AñadTxt = new javax.swing.JLabel();
        VntBtn = new javax.swing.JPanel();
        VntTxt = new javax.swing.JLabel();
        PintBtn = new javax.swing.JPanel();
        PintTxt = new javax.swing.JLabel();
        PrbBtn = new javax.swing.JPanel();
        PrbTxt = new javax.swing.JLabel();
        RepBtn = new javax.swing.JPanel();
        RepTxt = new javax.swing.JLabel();
        ConsBtn1 = new javax.swing.JPanel();
        ConsTxt1 = new javax.swing.JLabel();
        Txtbg = new javax.swing.JLabel();
        Bg2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        Bg.setBackground(new java.awt.Color(204, 204, 204));
        Bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        exitBtn.setBackground(new java.awt.Color(102, 102, 102));

        exitTxt.setBackground(new java.awt.Color(102, 102, 102));
        exitTxt.setFont(new java.awt.Font("Tw Cen MT", 0, 36)); // NOI18N
        exitTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exitTxt.setText("X");
        exitTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitTxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exitTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitTxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout exitBtnLayout = new javax.swing.GroupLayout(exitBtn);
        exitBtn.setLayout(exitBtnLayout);
        exitBtnLayout.setHorizontalGroup(
            exitBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exitTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );
        exitBtnLayout.setVerticalGroup(
            exitBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, exitBtnLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(exitTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        Bg.add(exitBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 40));

        jScrollPane1.setToolTipText("");

        Reportaje.setColumns(20);
        Reportaje.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        Reportaje.setRows(5);
        Reportaje.setText("AQUI SE IMPRIME LA INFORMACION BUSCADA\n:3");
        Reportaje.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createCompoundBorder(), javax.swing.BorderFactory.createCompoundBorder()));
        jScrollPane1.setViewportView(Reportaje);

        Bg.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 60, 580, 320));

        Titulo.setBackground(new java.awt.Color(102, 102, 102));
        Titulo.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                TituloMouseDragged(evt);
            }
        });
        Titulo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TituloMousePressed(evt);
            }
        });

        tituloTxt.setFont(new java.awt.Font("Tw Cen MT", 1, 36)); // NOI18N
        tituloTxt.setText("MENU PRINCIPAL");

        javax.swing.GroupLayout TituloLayout = new javax.swing.GroupLayout(Titulo);
        Titulo.setLayout(TituloLayout);
        TituloLayout.setHorizontalGroup(
            TituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TituloLayout.createSequentialGroup()
                .addContainerGap(309, Short.MAX_VALUE)
                .addComponent(tituloTxt)
                .addGap(273, 273, 273))
        );
        TituloLayout.setVerticalGroup(
            TituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tituloTxt, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        Bg.add(Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 40));

        Carro.setBackground(new java.awt.Color(204, 204, 204));
        Carro.setFont(new java.awt.Font("Tw Cen MT", 0, 36)); // NOI18N
        Carro.setText("Carro");
        Carro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CarroActionPerformed(evt);
            }
        });
        Bg.add(Carro, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 400, -1, -1));

        Moto.setBackground(new java.awt.Color(204, 204, 204));
        Moto.setFont(new java.awt.Font("Tw Cen MT", 0, 36)); // NOI18N
        Moto.setText("Motocicleta");
        Moto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MotoActionPerformed(evt);
            }
        });
        Bg.add(Moto, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 440, 200, 50));

        ConsTxt.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        ConsTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ConsTxt.setText("CONSULTAR (MODELO)");
        ConsTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ConsTxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ConsTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ConsTxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout ConsBtnLayout = new javax.swing.GroupLayout(ConsBtn);
        ConsBtn.setLayout(ConsBtnLayout);
        ConsBtnLayout.setHorizontalGroup(
            ConsBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ConsBtnLayout.createSequentialGroup()
                .addComponent(ConsTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        ConsBtnLayout.setVerticalGroup(
            ConsBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ConsBtnLayout.createSequentialGroup()
                .addComponent(ConsTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        Bg.add(ConsBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, 210, 50));

        AñadTxt.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        AñadTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AñadTxt.setText("AÑADIR VEHICULO");
        AñadTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AñadTxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AñadTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AñadTxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout AñadBtnLayout = new javax.swing.GroupLayout(AñadBtn);
        AñadBtn.setLayout(AñadBtnLayout);
        AñadBtnLayout.setHorizontalGroup(
            AñadBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AñadBtnLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(AñadTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        AñadBtnLayout.setVerticalGroup(
            AñadBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AñadBtnLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(AñadTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        Bg.add(AñadBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 210, 50));

        VntTxt.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        VntTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        VntTxt.setText("VENTA VEHICULO");
        VntTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                VntTxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                VntTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                VntTxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout VntBtnLayout = new javax.swing.GroupLayout(VntBtn);
        VntBtn.setLayout(VntBtnLayout);
        VntBtnLayout.setHorizontalGroup(
            VntBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(VntTxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
        );
        VntBtnLayout.setVerticalGroup(
            VntBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(VntTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        Bg.add(VntBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 210, 50));

        PintTxt.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        PintTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PintTxt.setText("PINTAR VEHICULO");
        PintTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PintTxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                PintTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                PintTxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout PintBtnLayout = new javax.swing.GroupLayout(PintBtn);
        PintBtn.setLayout(PintBtnLayout);
        PintBtnLayout.setHorizontalGroup(
            PintBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 210, Short.MAX_VALUE)
            .addGroup(PintBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(PintTxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE))
        );
        PintBtnLayout.setVerticalGroup(
            PintBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
            .addGroup(PintBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(PintTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))
        );

        Bg.add(PintBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 210, 50));

        PrbTxt.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        PrbTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PrbTxt.setText("PRUEBA VEHICULO");
        PrbTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PrbTxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                PrbTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                PrbTxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout PrbBtnLayout = new javax.swing.GroupLayout(PrbBtn);
        PrbBtn.setLayout(PrbBtnLayout);
        PrbBtnLayout.setHorizontalGroup(
            PrbBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 210, Short.MAX_VALUE)
            .addGroup(PrbBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(PrbTxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE))
        );
        PrbBtnLayout.setVerticalGroup(
            PrbBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
            .addGroup(PrbBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(PrbTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))
        );

        Bg.add(PrbBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, -1, 50));

        RepTxt.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        RepTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        RepTxt.setText("REPARACIÓN VEHICULO");
        RepTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RepTxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                RepTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                RepTxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout RepBtnLayout = new javax.swing.GroupLayout(RepBtn);
        RepBtn.setLayout(RepBtnLayout);
        RepBtnLayout.setHorizontalGroup(
            RepBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 210, Short.MAX_VALUE)
            .addGroup(RepBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(RepTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE))
        );
        RepBtnLayout.setVerticalGroup(
            RepBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
            .addGroup(RepBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(RepTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))
        );

        Bg.add(RepBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 210, 50));

        ConsTxt1.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        ConsTxt1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ConsTxt1.setText("CONSULTAR (TRACC/KV)");
        ConsTxt1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ConsTxt1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ConsTxt1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ConsTxt1MouseExited(evt);
            }
        });

        javax.swing.GroupLayout ConsBtn1Layout = new javax.swing.GroupLayout(ConsBtn1);
        ConsBtn1.setLayout(ConsBtn1Layout);
        ConsBtn1Layout.setHorizontalGroup(
            ConsBtn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ConsBtn1Layout.createSequentialGroup()
                .addComponent(ConsTxt1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        ConsBtn1Layout.setVerticalGroup(
            ConsBtn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ConsBtn1Layout.createSequentialGroup()
                .addComponent(ConsTxt1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        Bg.add(ConsBtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 420, 210, 50));

        Txtbg.setBackground(new java.awt.Color(204, 204, 204));
        Txtbg.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        Txtbg.setForeground(new java.awt.Color(255, 0, 0));
        Txtbg.setText("Selecciona el tipo de vehiculo:");
        Bg.add(Txtbg, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 400, 300, 40));

        Bg2.setFont(new java.awt.Font("Tw Cen MT", 0, 48)); // NOI18N
        Bg2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/car-g99e9fb209_1280.png"))); // NOI18N
        Bg.add(Bg2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 36, 850, 460));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxtMouseEntered
        exitBtn.setBackground(Color.red);
        exitTxt.setForeground(Color.white);
    }//GEN-LAST:event_exitTxtMouseEntered

    private void exitTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxtMouseClicked
        System.exit(0);
    }//GEN-LAST:event_exitTxtMouseClicked

    private void exitTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxtMouseExited
        exitBtn.setBackground(new Color(102,102,102));
        exitTxt.setForeground(Color.black);
    }//GEN-LAST:event_exitTxtMouseExited

    private void TituloMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TituloMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_TituloMousePressed

    private void TituloMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TituloMouseDragged
        int xx = evt.getXOnScreen();
        int yy = evt.getYOnScreen();
        this.setLocation(xx-xMouse, yy-yMouse);
    }//GEN-LAST:event_TituloMouseDragged

    private void CarroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CarroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CarroActionPerformed

    private void AñadTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AñadTxtMouseEntered
        AñadBtn.setBackground(Color.red);
    }//GEN-LAST:event_AñadTxtMouseEntered

    private void AñadTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AñadTxtMouseExited
        AñadBtn.setBackground(Color.white);
    }//GEN-LAST:event_AñadTxtMouseExited

    private void VntTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VntTxtMouseEntered
        VntBtn.setBackground(Color.red);
    }//GEN-LAST:event_VntTxtMouseEntered

    private void VntTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VntTxtMouseExited
        VntBtn.setBackground(Color.white);
    }//GEN-LAST:event_VntTxtMouseExited

    private void PintTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PintTxtMouseEntered
        PintBtn.setBackground(Color.red);
    }//GEN-LAST:event_PintTxtMouseEntered

    private void PintTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PintTxtMouseExited
        PintBtn.setBackground(Color.white);
    }//GEN-LAST:event_PintTxtMouseExited

    private void PrbTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PrbTxtMouseEntered
        PrbBtn.setBackground(Color.red);
    }//GEN-LAST:event_PrbTxtMouseEntered

    private void PrbTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PrbTxtMouseExited
        PrbBtn.setBackground(Color.white);
    }//GEN-LAST:event_PrbTxtMouseExited

    private void RepTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RepTxtMouseEntered
        RepBtn.setBackground(Color.red);
    }//GEN-LAST:event_RepTxtMouseEntered

    private void RepTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RepTxtMouseExited
        RepBtn.setBackground(Color.white);
    }//GEN-LAST:event_RepTxtMouseExited

    private void AñadTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AñadTxtMouseClicked
        if(Carro.isSelected()){
            while(true){
                try{
                    km = Integer.parseInt(JOptionPane.showInputDialog("Digite el kilometraje (0 si es nuevo)"));
                    marca = JOptionPane.showInputDialog("Digite la marca del vehiculo").toUpperCase();
                    modelo = JOptionPane.showInputDialog("Digite el modelo del carro").toUpperCase();
                    tracc = JOptionPane.showInputDialog("Digite la traccion del vehiculo").toUpperCase();
                    color = JOptionPane.showInputDialog("Digite el color del vehiculo").toUpperCase();
                    codigo = JOptionPane.showInputDialog("Digite el codigo del vehiculo (placa si es usado):").toUpperCase();
                    estado = Integer.parseInt(JOptionPane.showInputDialog("Del 1 al 10 digite el estado del vehiculo"));
                    precio = Integer.parseInt(JOptionPane.showInputDialog("Digite el precio del auto"));
                    nuevo = new Carro(tracc,km,precio,estado,codigo,marca,color,modelo);
                    break;
                }catch(InputMismatchException ex){
                    JOptionPane.showMessageDialog(null,"Ingrese los datos nuevamente de la forma solicitada.");
                }
            }
            
            main.AñadirAuto(nuevo);
            JOptionPane.showMessageDialog(null, "Automovil añadido correctamente");
        }else if(Moto.isSelected()){
           while(true){
                try{
                    km = Integer.parseInt(JOptionPane.showInputDialog("Digite el kilometraje (0 si es nuevo)"));
                    marca = JOptionPane.showInputDialog("Digite la marca del vehiculo").toUpperCase();
                    modelo = JOptionPane.showInputDialog("Digite el modelo de la moto").toUpperCase();
                    kv = Integer.parseInt(JOptionPane.showInputDialog("Digite los kilovatios de la moto"));
                    color = JOptionPane.showInputDialog("Digite el color del vehiculo").toUpperCase();
                    codigo = JOptionPane.showInputDialog("Digite el codigo del vehiculo (placa si es usado):").toUpperCase();
                    estado = Integer.parseInt(JOptionPane.showInputDialog("Del 1 al 10 digite el estado del vehiculo"));
                    precio = Integer.parseInt(JOptionPane.showInputDialog("Digite el precio del auto"));
                    nueva = new Motocicleta(kv,km,precio,estado,codigo,marca,color,modelo);
                    break;
                }catch(InputMismatchException ex){
                    JOptionPane.showMessageDialog(null,"Ingrese los datos nuevamente de la forma solicitada.");
                }
            }
            
            main.AñadirMoto(nueva);
            JOptionPane.showMessageDialog(null, "Motocicleta añadida correctamente");
        }else{
            JOptionPane.showMessageDialog(null, "Es necesario seleccionar el tipo"
                    +"\nde vehiculo con el que interactuar"); 
        }
    }//GEN-LAST:event_AñadTxtMouseClicked

    private void MotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MotoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MotoActionPerformed

    private void PintTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PintTxtMouseClicked
        Bloque();
        
        if(Reportaje.getText().equals("")){
            JOptionPane.showMessageDialog(null, "No hay vehiculos con esos datos");
        }else{
            choice = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero del vehiculo a pintar:"));
            opc = JOptionPane.showInputDialog("Digite el nuevo color del vehiculo").toUpperCase();

            if(Carro.isSelected()){
                main.pintarAuto((choice-1), opc);
            }else if(Moto.isSelected()){
                main.pintarMoto((choice-1), opc);
            }
            JOptionPane.showMessageDialog(null, "Nuevo color establecido \n100k añadidos al precio total.");
        }
    }//GEN-LAST:event_PintTxtMouseClicked

    private void RepTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RepTxtMouseClicked
        Bloque();
        
        if(Reportaje.getText().equals("")){
            JOptionPane.showMessageDialog(null, "No hay vehiculos con esos datos");
        }else{
            choice = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero del vehiculo a reparar:"));

            if(Carro.isSelected()){
                main.RepararAuto(choice-1);
            }else if(Moto.isSelected()){
                main.RepararMoto(choice-1);
            }
        }
    }//GEN-LAST:event_RepTxtMouseClicked

    private void PrbTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PrbTxtMouseClicked
        Bloque();
        
        if(Reportaje.getText().equals("")){
            JOptionPane.showMessageDialog(null, "No hay vehiculos con esos datos");
        }else{
            choice = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero del vehiculo a probar:"));

            if(Carro.isSelected()){
                main.ProbarAuto(choice-1);
            }else if(Moto.isSelected()){
                main.ProbarMoto(choice-1);
            }
        }
    }//GEN-LAST:event_PrbTxtMouseClicked

    private void VntTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VntTxtMouseClicked
        Bloque();
        
        if(Reportaje.getText().equals("")){
            JOptionPane.showMessageDialog(null, "No hay vehiculos con esos datos");
        }else{
            choice = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero del vehiculo a vender:"));

            if(Carro.isSelected()){
                main.DineroAuto(choice-1);
                salida=JOptionPane.showConfirmDialog(null, "Seguro quieres vender este auto?");
                if(salida==0){
                    main.QuitarAuto(choice-1);
                    JOptionPane.showMessageDialog(null, "Ok, vehiculo vendido y removido de la lista");
                }else{
                    JOptionPane.showMessageDialog(null, "No hay problema");
                }
            }else if(Moto.isSelected()){
                main.DineroMoto(choice-1);
                salida=JOptionPane.showConfirmDialog(null, "Seguro quieres vender este auto?");
                if(salida==0){
                    main.QuitarMoto(choice-1);
                    JOptionPane.showMessageDialog(null, "Ok, vehiculo vendido y removido de la lista");
                }else{
                    JOptionPane.showMessageDialog(null, "No hay problema");
                }
            }
        }
    }//GEN-LAST:event_VntTxtMouseClicked

    private void ConsTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ConsTxtMouseExited
        ConsBtn.setBackground(Color.white);
    }//GEN-LAST:event_ConsTxtMouseExited

    private void ConsTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ConsTxtMouseEntered
        ConsBtn.setBackground(Color.red);
    }//GEN-LAST:event_ConsTxtMouseEntered

    private void ConsTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ConsTxtMouseClicked
        Bloque();
    }//GEN-LAST:event_ConsTxtMouseClicked

    private void ConsTxt1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ConsTxt1MouseClicked
        Bloque2();
    }//GEN-LAST:event_ConsTxt1MouseClicked

    private void ConsTxt1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ConsTxt1MouseEntered
        ConsBtn1.setBackground(Color.red);
    }//GEN-LAST:event_ConsTxt1MouseEntered

    private void ConsTxt1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ConsTxt1MouseExited
        ConsBtn1.setBackground(Color.white);
    }//GEN-LAST:event_ConsTxt1MouseExited

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AñadBtn;
    private javax.swing.JLabel AñadTxt;
    private javax.swing.JPanel Bg;
    private javax.swing.JLabel Bg2;
    private javax.swing.JRadioButton Carro;
    private javax.swing.JPanel ConsBtn;
    private javax.swing.JPanel ConsBtn1;
    private javax.swing.JLabel ConsTxt;
    private javax.swing.JLabel ConsTxt1;
    private javax.swing.ButtonGroup Eleccion;
    private javax.swing.JRadioButton Moto;
    private javax.swing.JPanel PintBtn;
    private javax.swing.JLabel PintTxt;
    private javax.swing.JPanel PrbBtn;
    private javax.swing.JLabel PrbTxt;
    private javax.swing.JPanel RepBtn;
    private javax.swing.JLabel RepTxt;
    private javax.swing.JTextArea Reportaje;
    private javax.swing.JPanel Titulo;
    private javax.swing.JLabel Txtbg;
    private javax.swing.JPanel VntBtn;
    private javax.swing.JLabel VntTxt;
    private javax.swing.JPanel exitBtn;
    private javax.swing.JLabel exitTxt;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel tituloTxt;
    // End of variables declaration//GEN-END:variables
}
