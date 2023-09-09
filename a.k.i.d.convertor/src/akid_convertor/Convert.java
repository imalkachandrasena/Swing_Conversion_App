/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package akid_convertor;

import javax.swing.plaf.basic.BasicInternalFrameUI;

/**
 *
 * @author Imalka_c
 */
public class Convert extends javax.swing.JInternalFrame {

    /**
     * Creates new form Convert
     */
    Dashboard dashboard;
    public Convert(Dashboard dashboard) {
        initComponents();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI ui = (BasicInternalFrameUI)this.getUI();
        ui.setNorthPane(null);
        this.dashboard = dashboard;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnSpeed = new javax.swing.JButton();
        btnTemp = new javax.swing.JButton();
        btnCapacity = new javax.swing.JButton();
        btnLength = new javax.swing.JButton();
        btnVolume = new javax.swing.JButton();
        btnCurrency = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(462, 322));

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        btnSpeed.setBackground(new java.awt.Color(255, 204, 0));
        btnSpeed.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
        btnSpeed.setForeground(new java.awt.Color(51, 51, 51));
        btnSpeed.setText("Speed Conversions");
        btnSpeed.setBorder(null);
        btnSpeed.setBorderPainted(false);
        btnSpeed.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSpeed.setFocusPainted(false);
        btnSpeed.setFocusable(false);
        btnSpeed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSpeedActionPerformed(evt);
            }
        });

        btnTemp.setBackground(new java.awt.Color(255, 204, 0));
        btnTemp.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
        btnTemp.setForeground(new java.awt.Color(51, 51, 51));
        btnTemp.setText("Temperature Conversions");
        btnTemp.setBorder(null);
        btnTemp.setBorderPainted(false);
        btnTemp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTemp.setFocusPainted(false);
        btnTemp.setFocusable(false);
        btnTemp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTempActionPerformed(evt);
            }
        });

        btnCapacity.setBackground(new java.awt.Color(255, 204, 0));
        btnCapacity.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
        btnCapacity.setForeground(new java.awt.Color(51, 51, 51));
        btnCapacity.setText("Capacity Conversions");
        btnCapacity.setBorder(null);
        btnCapacity.setBorderPainted(false);
        btnCapacity.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCapacity.setFocusPainted(false);
        btnCapacity.setFocusable(false);
        btnCapacity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCapacityActionPerformed(evt);
            }
        });

        btnLength.setBackground(new java.awt.Color(255, 204, 0));
        btnLength.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
        btnLength.setForeground(new java.awt.Color(51, 51, 51));
        btnLength.setText("Length Conversions");
        btnLength.setBorder(null);
        btnLength.setBorderPainted(false);
        btnLength.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLength.setFocusPainted(false);
        btnLength.setFocusable(false);
        btnLength.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLengthActionPerformed(evt);
            }
        });

        btnVolume.setBackground(new java.awt.Color(255, 204, 0));
        btnVolume.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
        btnVolume.setForeground(new java.awt.Color(51, 51, 51));
        btnVolume.setText("Volume Conversions");
        btnVolume.setBorder(null);
        btnVolume.setBorderPainted(false);
        btnVolume.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVolume.setFocusPainted(false);
        btnVolume.setFocusable(false);
        btnVolume.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolumeActionPerformed(evt);
            }
        });

        btnCurrency.setBackground(new java.awt.Color(255, 204, 0));
        btnCurrency.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
        btnCurrency.setForeground(new java.awt.Color(51, 51, 51));
        btnCurrency.setText("Currency Conversions");
        btnCurrency.setBorder(null);
        btnCurrency.setBorderPainted(false);
        btnCurrency.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCurrency.setFocusPainted(false);
        btnCurrency.setFocusable(false);
        btnCurrency.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCurrencyActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(66, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnVolume, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCurrency, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnLength, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnCapacity, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnTemp, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnSpeed, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(39, 39, 39))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(btnSpeed, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnTemp, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCapacity, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnLength, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnVolume, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addComponent(btnCurrency, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSpeedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSpeedActionPerformed
        Speedx speed = new Speedx(this.dashboard);
        dashboard.smallDesktop.removeAll();
        dashboard.smallDesktop.add(speed).setVisible(true);
    }//GEN-LAST:event_btnSpeedActionPerformed

    private void btnTempActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTempActionPerformed
        Temp temp = new Temp(this.dashboard);
        dashboard.smallDesktop.removeAll();
        dashboard.smallDesktop.add(temp).setVisible(true);
    }//GEN-LAST:event_btnTempActionPerformed

    private void btnCapacityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCapacityActionPerformed
        Capacity capacity = new Capacity(this.dashboard);
        dashboard.smallDesktop.removeAll();
        dashboard.smallDesktop.add(capacity).setVisible(true);
    }//GEN-LAST:event_btnCapacityActionPerformed

    private void btnLengthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLengthActionPerformed
        Length length = new Length(this.dashboard);
        dashboard.smallDesktop.removeAll();
        dashboard.smallDesktop.add(length).setVisible(true);
    }//GEN-LAST:event_btnLengthActionPerformed

    private void btnVolumeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolumeActionPerformed
        Volume volume = new Volume(this.dashboard);
        dashboard.smallDesktop.removeAll();
        dashboard.smallDesktop.add(volume).setVisible(true);
    }//GEN-LAST:event_btnVolumeActionPerformed

    private void btnCurrencyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCurrencyActionPerformed
        Currency currency = new Currency(this.dashboard);
        dashboard.smallDesktop.removeAll();
        dashboard.smallDesktop.add(currency).setVisible(true);
    }//GEN-LAST:event_btnCurrencyActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCapacity;
    private javax.swing.JButton btnCurrency;
    private javax.swing.JButton btnLength;
    private javax.swing.JButton btnSpeed;
    private javax.swing.JButton btnTemp;
    private javax.swing.JButton btnVolume;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
