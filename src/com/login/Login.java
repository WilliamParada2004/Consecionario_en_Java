package com.login;

import java.awt.Color;

public class Login extends javax.swing.JFrame {
    int Xmouse, Ymouse;
    
    public Login() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        Logo = new javax.swing.JLabel();
        LogoName = new javax.swing.JLabel();
        citybg = new javax.swing.JLabel();
        PassLabel = new javax.swing.JLabel();
        Title = new javax.swing.JLabel();
        UserLabel = new javax.swing.JLabel();
        PassTxt = new javax.swing.JPasswordField();
        UserTxt1 = new javax.swing.JTextField();
        loginBtn = new javax.swing.JPanel();
        loginBtnTxt = new javax.swing.JLabel();
        Header = new javax.swing.JPanel();
        ExitBtn = new javax.swing.JPanel();
        ExitTxt = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        bg.setBackground(new java.awt.Color(153, 153, 153));
        bg.setForeground(new java.awt.Color(255, 255, 255));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/recortd-removebg-preview (3).png"))); // NOI18N
        bg.add(Logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 40, 300, -1));

        LogoName.setBackground(new java.awt.Color(255, 255, 255));
        LogoName.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        LogoName.setForeground(new java.awt.Color(255, 255, 255));
        LogoName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LogoName.setText("Evans & Rogers");
        bg.add(LogoName, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 270, 300, -1));

        citybg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/wallpaper.jpeg"))); // NOI18N
        bg.add(citybg, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 0, 300, 500));

        PassLabel.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        PassLabel.setForeground(new java.awt.Color(255, 255, 255));
        PassLabel.setText("CONTRASEÑA");
        bg.add(PassLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, -1, 30));

        Title.setFont(new java.awt.Font("Tw Cen MT", 1, 36)); // NOI18N
        Title.setForeground(new java.awt.Color(255, 255, 255));
        Title.setText("INICIAR SESIÓN");
        bg.add(Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, -1, -1));

        UserLabel.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        UserLabel.setForeground(new java.awt.Color(255, 255, 255));
        UserLabel.setText("USUARIO");
        bg.add(UserLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, -1, -1));

        PassTxt.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        PassTxt.setForeground(new java.awt.Color(204, 204, 204));
        PassTxt.setText("*******");
        PassTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                PassTxtMousePressed(evt);
            }
        });
        bg.add(PassTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, 420, 30));

        UserTxt1.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        UserTxt1.setForeground(new java.awt.Color(204, 204, 204));
        UserTxt1.setText("Ingrese su nombre de usuario");
        UserTxt1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UserTxt1MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                UserTxt1MousePressed(evt);
            }
        });
        bg.add(UserTxt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 420, 30));

        loginBtn.setBackground(new java.awt.Color(0, 0, 0));
        loginBtn.setForeground(new java.awt.Color(255, 255, 255));

        loginBtnTxt.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        loginBtnTxt.setForeground(new java.awt.Color(255, 255, 255));
        loginBtnTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        loginBtnTxt.setText("ENTRAR");
        loginBtnTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        loginBtnTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginBtnTxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                loginBtnTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                loginBtnTxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout loginBtnLayout = new javax.swing.GroupLayout(loginBtn);
        loginBtn.setLayout(loginBtnLayout);
        loginBtnLayout.setHorizontalGroup(
            loginBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loginBtnTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        loginBtnLayout.setVerticalGroup(
            loginBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loginBtnTxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        bg.add(loginBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 410, 400, 50));

        Header.setBackground(new java.awt.Color(102, 102, 102));
        Header.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                HeaderMouseDragged(evt);
            }
        });
        Header.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                HeaderMousePressed(evt);
            }
        });

        ExitBtn.setBackground(new java.awt.Color(102, 102, 102));

        ExitTxt.setFont(new java.awt.Font("Tw Cen MT", 0, 36)); // NOI18N
        ExitTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ExitTxt.setText("X");
        ExitTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ExitTxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ExitTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ExitTxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout ExitBtnLayout = new javax.swing.GroupLayout(ExitBtn);
        ExitBtn.setLayout(ExitBtnLayout);
        ExitBtnLayout.setHorizontalGroup(
            ExitBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ExitTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
        );
        ExitBtnLayout.setVerticalGroup(
            ExitBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ExitBtnLayout.createSequentialGroup()
                .addComponent(ExitTxt)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout HeaderLayout = new javax.swing.GroupLayout(Header);
        Header.setLayout(HeaderLayout);
        HeaderLayout.setHorizontalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderLayout.createSequentialGroup()
                .addComponent(ExitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 767, Short.MAX_VALUE))
        );
        HeaderLayout.setVerticalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderLayout.createSequentialGroup()
                .addComponent(ExitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 2, Short.MAX_VALUE))
        );

        bg.add(Header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/car-g99e9fb209_1280.png"))); // NOI18N
        bg.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 36, 800, 460));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, 802, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void HeaderMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HeaderMousePressed
        Xmouse = evt.getX();
        Ymouse = evt.getY();
    }//GEN-LAST:event_HeaderMousePressed

    private void HeaderMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HeaderMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x-Xmouse, y-Ymouse);
    }//GEN-LAST:event_HeaderMouseDragged

    private void ExitTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitTxtMouseClicked
        System.exit(0);
    }//GEN-LAST:event_ExitTxtMouseClicked

    private void ExitTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitTxtMouseEntered
        ExitBtn.setBackground(Color.red);
        ExitTxt.setForeground(Color.white);
    }//GEN-LAST:event_ExitTxtMouseEntered

    private void ExitTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitTxtMouseExited
        ExitBtn.setBackground(new Color(102,102,102));
        ExitTxt.setForeground(Color.black);
    }//GEN-LAST:event_ExitTxtMouseExited

    private void loginBtnTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginBtnTxtMouseEntered
        loginBtn.setBackground(Color.white);
        loginBtnTxt.setForeground(Color.black);
    }//GEN-LAST:event_loginBtnTxtMouseEntered

    private void loginBtnTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginBtnTxtMouseExited
        loginBtn.setBackground(Color.black);
        loginBtnTxt.setForeground(Color.white);
    }//GEN-LAST:event_loginBtnTxtMouseExited

    private void UserTxt1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UserTxt1MousePressed
        if(UserTxt1.getText().equals("Ingrese su nombre de usuario")){
            UserTxt1.setText("");
            UserTxt1.setForeground(Color.black);
        }
        if(String.valueOf(PassTxt.getPassword()).isEmpty()){
            PassTxt.setText("*******");
            PassTxt.setForeground(Color.gray);
        }
    }//GEN-LAST:event_UserTxt1MousePressed

    private void PassTxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PassTxtMousePressed
        if(String.valueOf(PassTxt.getPassword()).equals("*******")){
            PassTxt.setText("");
            PassTxt.setForeground(Color.black);
        }
        if(UserTxt1.getText().isEmpty()){
            UserTxt1.setText("Ingrese su nombre de usuario");
            UserTxt1.setForeground(Color.gray);
        }
        
    }//GEN-LAST:event_PassTxtMousePressed

    private void UserTxt1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UserTxt1MouseClicked
        
    }//GEN-LAST:event_UserTxt1MouseClicked

    private void loginBtnTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginBtnTxtMouseClicked
        if(String.valueOf(PassTxt.getPassword()).equals("12345") && UserTxt1.getText().equals("Administrador6")){    
            MenuPrincipal menu = new MenuPrincipal();
            menu.setVisible(true);
            this.dispose();
        }else{
            ErrorLogin error = new ErrorLogin();
            error.setVisible(true);
            this.dispose();
        }
    // javax.swing.JOptionPane.showMessageDialog(this, "Intento de login con los datos: \nUsuario: "+ UserTxt1.getText() + "\nContraseña: "+String.valueOf(PassTxt.getPassword()),"LOGIN",javax.swing.JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_loginBtnTxtMouseClicked

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ExitBtn;
    private javax.swing.JLabel ExitTxt;
    private javax.swing.JPanel Header;
    private javax.swing.JLabel Logo;
    private javax.swing.JLabel LogoName;
    private javax.swing.JLabel PassLabel;
    private javax.swing.JPasswordField PassTxt;
    private javax.swing.JLabel Title;
    private javax.swing.JLabel UserLabel;
    private javax.swing.JTextField UserTxt1;
    private javax.swing.JPanel bg;
    private javax.swing.JLabel citybg;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel loginBtn;
    private javax.swing.JLabel loginBtnTxt;
    // End of variables declaration//GEN-END:variables
}
