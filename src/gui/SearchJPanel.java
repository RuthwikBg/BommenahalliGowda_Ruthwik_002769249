/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package gui;

import java.awt.Image;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import model.EmpList;
import model.Employee;

/**
 *
 * @author Rutu
 */
public class SearchJPanel extends javax.swing.JPanel {

    /**
     * Creates new form SearchJPanel
     */
    
    EmpList empList;
    
    public SearchJPanel(EmpList empList) {
        initComponents();
        this.empList = empList;
        populateTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        namesearch_txt = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        empTable = new javax.swing.JTable();
        mailId_txt = new javax.swing.JTextField();
        teamInfo = new javax.swing.JLabel();
        position = new javax.swing.JLabel();
        cellPh = new javax.swing.JLabel();
        email = new javax.swing.JLabel();
        imgDisplay = new javax.swing.JLabel();
        startDate_txt = new javax.swing.JTextField();
        NameLabel = new javax.swing.JLabel();
        empID = new javax.swing.JLabel();
        ageLabel = new javax.swing.JLabel();
        GenderLaabel = new javax.swing.JLabel();
        startdateLabel = new javax.swing.JLabel();
        levelLabel = new javax.swing.JLabel();
        empId_txt = new javax.swing.JTextField();
        name_txt1 = new javax.swing.JTextField();
        teamInfo_txt = new javax.swing.JTextField();
        age_txt = new javax.swing.JTextField();
        gender_txt = new javax.swing.JTextField();
        level_txt = new javax.swing.JTextField();
        pos_txt = new javax.swing.JTextField();
        phNo_txt = new javax.swing.JTextField();
        viewBtn = new javax.swing.JButton();
        searchBtn = new javax.swing.JButton();
        refreshBtn = new javax.swing.JButton();
        searchDropDown = new javax.swing.JComboBox<>();

        namesearch_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namesearch_txtActionPerformed(evt);
            }
        });
        namesearch_txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                namesearch_txtKeyReleased(evt);
            }
        });

        empTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Employee ID", "Name", "Postion Title", "Level"
            }
        ));
        jScrollPane1.setViewportView(empTable);

        mailId_txt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        teamInfo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        teamInfo.setText("Team Info");

        position.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        position.setText("Position title");

        cellPh.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cellPh.setText("Cell phone number");

        email.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        email.setText("Email");

        imgDisplay.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        startDate_txt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        startDate_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startDate_txtActionPerformed(evt);
            }
        });

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

        empId_txt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        name_txt1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        name_txt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                name_txt1ActionPerformed(evt);
            }
        });

        teamInfo_txt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        teamInfo_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teamInfo_txtActionPerformed(evt);
            }
        });

        age_txt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        gender_txt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        level_txt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        level_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                level_txtActionPerformed(evt);
            }
        });

        pos_txt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        pos_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pos_txtActionPerformed(evt);
            }
        });

        phNo_txt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        viewBtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        viewBtn.setText("View");
        viewBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewBtnActionPerformed(evt);
            }
        });

        searchBtn.setText("Search");
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });

        refreshBtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        refreshBtn.setText("Refresh");
        refreshBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshBtnActionPerformed(evt);
            }
        });

        searchDropDown.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Employee Id", "Name", "Position Title" }));
        searchDropDown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchDropDownActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(104, 104, 104)
                                .addComponent(viewBtn))
                            .addComponent(refreshBtn)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 718, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(263, 263, 263)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(ageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(GenderLaabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(NameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addComponent(empID, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(47, 47, 47))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(startdateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(42, 42, 42)))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(startDate_txt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(gender_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(empId_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(age_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(name_txt1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(107, 107, 107)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cellPh)
                                            .addComponent(position, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(teamInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(levelLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(34, 34, 34)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(pos_txt, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(phNo_txt, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(mailId_txt, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(level_txt, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(teamInfo_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(imgDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 310, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(searchDropDown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(namesearch_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(searchBtn)))
                .addContainerGap(71, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {refreshBtn, viewBtn});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(refreshBtn)
                    .addComponent(viewBtn))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(namesearch_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchBtn)
                    .addComponent(searchDropDown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 130, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(NameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(name_txt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(empID, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(empId_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(ageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(age_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(GenderLaabel)
                                    .addComponent(gender_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(teamInfo)
                                    .addComponent(teamInfo_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(pos_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(position))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cellPh)
                                    .addComponent(phNo_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(email)
                                    .addComponent(mailId_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(startdateLabel)
                                .addComponent(startDate_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(levelLabel)
                                .addComponent(level_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(imgDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {refreshBtn, viewBtn});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {namesearch_txt, searchBtn, searchDropDown});

    }// </editor-fold>//GEN-END:initComponents

    private void namesearch_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namesearch_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_namesearch_txtActionPerformed

    private void namesearch_txtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_namesearch_txtKeyReleased
       
    }//GEN-LAST:event_namesearch_txtKeyReleased

    private void startDate_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startDate_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_startDate_txtActionPerformed

    private void name_txt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_name_txt1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_name_txt1ActionPerformed

    private void teamInfo_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teamInfo_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_teamInfo_txtActionPerformed

    private void level_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_level_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_level_txtActionPerformed

    private void pos_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pos_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pos_txtActionPerformed

    private void viewBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewBtnActionPerformed
        int selectRowIndex = empTable.getSelectedRow();
        //rowNum = selectRowIndex;

        if (selectRowIndex < 0){
            JOptionPane.showMessageDialog(this,"Select a row to delete");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) empTable.getModel();
        Employee selectEmp = (Employee)model.getValueAt(selectRowIndex, 0);

        name_txt1.setText(selectEmp.getName());
        empId_txt.setText(selectEmp.getEmpID());
        age_txt.setText(selectEmp.getEmpStartDate());
        gender_txt.setText(selectEmp.getGender());
        startDate_txt.setText(selectEmp.getEmpStartDate());
        teamInfo_txt.setText(selectEmp.getEmpTeamInfo());
        pos_txt.setText(selectEmp.getPositionTitle());
        phNo_txt.setText(selectEmp.getCellPhoneNo());
        mailId_txt.setText(selectEmp.getEmailAddress());
        level_txt.setText(selectEmp.getEmpLevel());

        String filename1 = selectEmp.getImgFilePath();
        //imgDisplay.setText(filename1);
        ImageIcon icon1 = new ImageIcon(new ImageIcon(filename1).getImage().getScaledInstance(imgDisplay.getWidth(), imgDisplay.getHeight(), Image.SCALE_DEFAULT));
        imgDisplay.setIcon(icon1);

    }//GEN-LAST:event_viewBtnActionPerformed

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
        ArrayList<Employee> tempList = new ArrayList();
        String searchTxt = namesearch_txt.getText();
        //String varName = (String)searchDropDown.getSelectedItem();
        String value = searchDropDown.getSelectedItem().toString();
        
        if(value.equals("Name")){
            for(Employee e : empList.getList()){
                if (e.getName().equalsIgnoreCase(searchTxt)){
                    tempList.add(e);
                }            
            }
        }
        
        if(value.equals("Employee Id")){
            for(Employee e : empList.getList()){
                if (e.getEmpID().equalsIgnoreCase(searchTxt)){
                    tempList.add(e);
                }            
            }
        }
        
        if(value.equals("Position Title")){
            for(Employee e : empList.getList()){
                if (e.getPositionTitle().equalsIgnoreCase(searchTxt)){
                    tempList.add(e);
                }            
            }
        }
        
        
        if (tempList.isEmpty()){
            JOptionPane.showMessageDialog(this,"No match");
            return;
        }
        else{
            populateTable(tempList);
        }   
    }//GEN-LAST:event_searchBtnActionPerformed

    private void refreshBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshBtnActionPerformed
        populateTable(empList.getList());
    }//GEN-LAST:event_refreshBtnActionPerformed

    private void searchDropDownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchDropDownActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchDropDownActionPerformed
    
    private void populateTable(ArrayList<Employee> eList) {
        DefaultTableModel model = (DefaultTableModel) empTable.getModel();
        model.setRowCount(0);
        
        for(Employee emp: eList){
            
            Object[] row = new Object[4];
            row[0] = emp;
            row[1] = emp.getName();
            row[2] = emp.getPositionTitle();
            row[3] = emp.getEmpLevel();
            
            model.addRow(row);
            
        }
    }
    
    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) empTable.getModel();
        model.setRowCount(0);
        
        for(Employee emp: empList.getList()){
            
            Object[] row = new Object[4];
            row[0] = emp;
            row[1] = emp.getName();
            row[2] = emp.getPositionTitle();
            row[3] = emp.getEmpLevel();
            
            model.addRow(row);
            
        }
    } 
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel GenderLaabel;
    private javax.swing.JLabel NameLabel;
    private javax.swing.JLabel ageLabel;
    private javax.swing.JTextField age_txt;
    private javax.swing.JLabel cellPh;
    private javax.swing.JLabel email;
    private javax.swing.JLabel empID;
    private javax.swing.JTextField empId_txt;
    private javax.swing.JTable empTable;
    private javax.swing.JTextField gender_txt;
    private javax.swing.JLabel imgDisplay;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel levelLabel;
    private javax.swing.JTextField level_txt;
    private javax.swing.JTextField mailId_txt;
    private javax.swing.JTextField name_txt1;
    private javax.swing.JTextField namesearch_txt;
    private javax.swing.JTextField phNo_txt;
    private javax.swing.JTextField pos_txt;
    private javax.swing.JLabel position;
    private javax.swing.JButton refreshBtn;
    private javax.swing.JButton searchBtn;
    private javax.swing.JComboBox<String> searchDropDown;
    private javax.swing.JTextField startDate_txt;
    private javax.swing.JLabel startdateLabel;
    private javax.swing.JLabel teamInfo;
    private javax.swing.JTextField teamInfo_txt;
    private javax.swing.JButton viewBtn;
    // End of variables declaration//GEN-END:variables

   
 
    
}
