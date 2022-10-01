/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package gui;

import java.awt.Image;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;

/**
 *
 * @author Rutu
 */
public class CreateJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateJPanel
     */
    public CreateJPanel() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        NameLabel = new javax.swing.JLabel();
        empID = new javax.swing.JLabel();
        ageLabel = new javax.swing.JLabel();
        GenderLaabel = new javax.swing.JLabel();
        startdateLabel = new javax.swing.JLabel();
        levelLabel = new javax.swing.JLabel();
        teamInfo = new javax.swing.JLabel();
        title = new javax.swing.JLabel();
        position = new javax.swing.JLabel();
        cellPh = new javax.swing.JLabel();
        email = new javax.swing.JLabel();
        image = new javax.swing.JLabel();
        name_txt = new javax.swing.JTextField();
        empId_txt = new javax.swing.JTextField();
        age_txt = new javax.swing.JTextField();
        gender_txt = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        startDate_txt = new javax.swing.JTextField();
        level_txt = new javax.swing.JTextField();
        teamInfo_txt = new javax.swing.JTextField();
        title_txt = new javax.swing.JTextField();
        pos_txt = new javax.swing.JTextField();
        phNo_txt = new javax.swing.JTextField();
        mailId_txt = new javax.swing.JTextField();
        ImgUpload = new javax.swing.JButton();
        img_view_label = new javax.swing.JLabel();

        NameLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        NameLabel.setText("Name");

        empID.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        empID.setText("Employee ID");
        empID.setMinimumSize(new java.awt.Dimension(66, 24));

        ageLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ageLabel.setText("Age");

        GenderLaabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        GenderLaabel.setText("Gender");

        startdateLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        startdateLabel.setText("Start Date");

        levelLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        levelLabel.setText("Level");

        teamInfo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        teamInfo.setText("Team Info");

        title.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        title.setText("Title");

        position.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        position.setText("Position title");

        cellPh.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cellPh.setText("Cell phone number");

        email.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        email.setText("Email");

        image.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        image.setText("Image");

        name_txt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        name_txt.setMinimumSize(new java.awt.Dimension(64, 24));

        empId_txt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        age_txt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        gender_txt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel12.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel12.setText("Enter Employee Details");

        startDate_txt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        level_txt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        level_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                level_txtActionPerformed(evt);
            }
        });

        teamInfo_txt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        teamInfo_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teamInfo_txtActionPerformed(evt);
            }
        });

        title_txt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        pos_txt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        pos_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pos_txtActionPerformed(evt);
            }
        });

        phNo_txt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        mailId_txt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        ImgUpload.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ImgUpload.setText("Upload");
        ImgUpload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ImgUploadActionPerformed(evt);
            }
        });

        img_view_label.setText("jLabel1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 436, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                        .addComponent(title_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(position, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(ageLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(startdateLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(teamInfo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
                                            .addComponent(GenderLaabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(levelLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(NameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addComponent(empID, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(74, 74, 74))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cellPh)
                                .addGap(43, 43, 43)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(phNo_txt, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                            .addComponent(name_txt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(age_txt)
                            .addComponent(empId_txt)
                            .addComponent(startDate_txt)
                            .addComponent(gender_txt)
                            .addComponent(level_txt)
                            .addComponent(teamInfo_txt)
                            .addComponent(pos_txt)
                            .addComponent(mailId_txt))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 176, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(img_view_label, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(image, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(78, 78, 78)
                        .addComponent(ImgUpload)))
                .addGap(42, 42, 42))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(name_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(empID, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(empId_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(age_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(GenderLaabel)
                            .addComponent(gender_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(img_view_label, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(startdateLabel)
                    .addComponent(startDate_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(title)
                            .addComponent(title_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(image, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ImgUpload))))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(levelLabel)
                    .addComponent(level_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(position)
                    .addComponent(pos_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cellPh)
                    .addComponent(phNo_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(email)
                    .addComponent(mailId_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(teamInfo)
                    .addComponent(teamInfo_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(113, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void teamInfo_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teamInfo_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_teamInfo_txtActionPerformed

    private void ImgUploadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ImgUploadActionPerformed
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f1 = chooser.getSelectedFile();
        String filename = f1.getAbsolutePath();
        //img.setText(filename);
        //Image getAbsolutePath = null;
        ImageIcon icon = new ImageIcon(filename);
        //Image image = icon.getImage().getScaledInstance(imgLabel.getWidth(),imgLabel.getHeight(),Image.SCALE_SMOOTH);
        img_view_label.setIcon(icon);
    }//GEN-LAST:event_ImgUploadActionPerformed

    private void pos_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pos_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pos_txtActionPerformed

    private void level_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_level_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_level_txtActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel GenderLaabel;
    private javax.swing.JButton ImgUpload;
    private javax.swing.JLabel NameLabel;
    private javax.swing.JLabel ageLabel;
    private javax.swing.JTextField age_txt;
    private javax.swing.JLabel cellPh;
    private javax.swing.JLabel email;
    private javax.swing.JLabel empID;
    private javax.swing.JTextField empId_txt;
    private javax.swing.JTextField gender_txt;
    private javax.swing.JLabel image;
    private javax.swing.JLabel img_view_label;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel levelLabel;
    private javax.swing.JTextField level_txt;
    private javax.swing.JTextField mailId_txt;
    private javax.swing.JTextField name_txt;
    private javax.swing.JTextField phNo_txt;
    private javax.swing.JTextField pos_txt;
    private javax.swing.JLabel position;
    private javax.swing.JTextField startDate_txt;
    private javax.swing.JLabel startdateLabel;
    private javax.swing.JLabel teamInfo;
    private javax.swing.JTextField teamInfo_txt;
    private javax.swing.JLabel title;
    private javax.swing.JTextField title_txt;
    // End of variables declaration//GEN-END:variables
}
