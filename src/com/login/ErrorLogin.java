package com.login;

import java.awt.Color;

public class ErrorLogin extends javax.swing.JFrame {

    public ErrorLogin() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BG1 = new javax.swing.JPanel();
        Txt2 = new javax.swing.JLabel();
        Txt1 = new javax.swing.JLabel();
        BG2 = new javax.swing.JPanel();
        BG3 = new javax.swing.JPanel();
        SalirBtn = new javax.swing.JPanel();
        SalirTxt = new javax.swing.JLabel();
        ReintBtn = new javax.swing.JPanel();
        ReintTxt = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        BG1.setBackground(new java.awt.Color(255, 51, 51));
        BG1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Txt2.setFont(new java.awt.Font("Tw Cen MT", 1, 40)); // NOI18N
        Txt2.setForeground(new java.awt.Color(255, 255, 255));
        Txt2.setText("USUARIO O CONTRASEÑA ERRONEOS");
        BG1.add(Txt2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 190, 670, 80));

        Txt1.setFont(new java.awt.Font("Tw Cen MT", 1, 100)); // NOI18N
        Txt1.setText("ERROR LOGIN ");
        BG1.add(Txt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 640, 150));

        BG2.setBackground(new java.awt.Color(204, 0, 0));

        BG3.setBackground(new java.awt.Color(102, 0, 0));

        SalirBtn.setBackground(new java.awt.Color(255, 0, 0));

        SalirTxt.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        SalirTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SalirTxt.setText("Salir");
        SalirTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SalirTxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SalirTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SalirTxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout SalirBtnLayout = new javax.swing.GroupLayout(SalirBtn);
        SalirBtn.setLayout(SalirBtnLayout);
        SalirBtnLayout.setHorizontalGroup(
            SalirBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SalirTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
        );
        SalirBtnLayout.setVerticalGroup(
            SalirBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SalirTxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        ReintBtn.setBackground(new java.awt.Color(255, 0, 0));

        ReintTxt.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        ReintTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ReintTxt.setText("Reintentar");
        ReintTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ReintTxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ReintTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ReintTxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout ReintBtnLayout = new javax.swing.GroupLayout(ReintBtn);
        ReintBtn.setLayout(ReintBtnLayout);
        ReintBtnLayout.setHorizontalGroup(
            ReintBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ReintTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
        );
        ReintBtnLayout.setVerticalGroup(
            ReintBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ReintTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout BG3Layout = new javax.swing.GroupLayout(BG3);
        BG3.setLayout(BG3Layout);
        BG3Layout.setHorizontalGroup(
            BG3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BG3Layout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addComponent(ReintBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(94, 94, 94)
                .addComponent(SalirBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(122, 122, 122))
        );
        BG3Layout.setVerticalGroup(
            BG3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BG3Layout.createSequentialGroup()
                .addContainerGap(151, Short.MAX_VALUE)
                .addGroup(BG3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(ReintBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(SalirBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(67, 67, 67))
        );

        javax.swing.GroupLayout BG2Layout = new javax.swing.GroupLayout(BG2);
        BG2.setLayout(BG2Layout);
        BG2Layout.setHorizontalGroup(
            BG2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BG2Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(BG3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        BG2Layout.setVerticalGroup(
            BG2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BG2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BG3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(90, 90, 90))
        );

        BG1.add(BG2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 800, 300));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BG1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BG1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SalirTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SalirTxtMouseClicked
        System.exit(0);
    }//GEN-LAST:event_SalirTxtMouseClicked

    private void ReintTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReintTxtMouseClicked
        Login nuevo = new Login();
        nuevo.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ReintTxtMouseClicked

    private void ReintTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReintTxtMouseEntered
        ReintBtn.setBackground(Color.white);
    }//GEN-LAST:event_ReintTxtMouseEntered

    private void ReintTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReintTxtMouseExited
        ReintBtn.setBackground(new Color(255,0,0));
    }//GEN-LAST:event_ReintTxtMouseExited

    private void SalirTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SalirTxtMouseEntered
        SalirBtn.setBackground(Color.white);
    }//GEN-LAST:event_SalirTxtMouseEntered

    private void SalirTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SalirTxtMouseExited
        SalirBtn.setBackground(new Color(255,0,0));
    }//GEN-LAST:event_SalirTxtMouseExited

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ErrorLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BG1;
    private javax.swing.JPanel BG2;
    private javax.swing.JPanel BG3;
    private javax.swing.JPanel ReintBtn;
    private javax.swing.JLabel ReintTxt;
    private javax.swing.JPanel SalirBtn;
    private javax.swing.JLabel SalirTxt;
    private javax.swing.JLabel Txt1;
    private javax.swing.JLabel Txt2;
    // End of variables declaration//GEN-END:variables
}
