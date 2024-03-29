/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import DBEntites.Employee;
import static GUI.MainFrame.em;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Giovanni
 */
public class EmployeeWithOrWithoutSupervisor extends javax.swing.JPanel {

    /**
     * Creates new form EmployeeWithOrWithoutSupervisor
     */
    public EmployeeWithOrWithoutSupervisor() {
        initComponents();
        tableModel = (DefaultTableModel) tableOfData.getModel();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        radioGroup = new javax.swing.ButtonGroup();
        title = new javax.swing.JLabel();
        withRadioBtn = new javax.swing.JRadioButton();
        withoutRadioBtn = new javax.swing.JRadioButton();
        retrieveData = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableOfData = new javax.swing.JTable();

        title.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        title.setText("With or Without supervisor");

        radioGroup.add(withRadioBtn);
        withRadioBtn.setSelected(true);
        withRadioBtn.setText("With supervisor");

        radioGroup.add(withoutRadioBtn);
        withoutRadioBtn.setText("without supervisor");

        retrieveData.setText("Retrieve");
        retrieveData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                retrieveDataMouseClicked(evt);
            }
        });

        tableOfData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No.", "Employee name", "Supervisor name"
            }
        ));
        jScrollPane1.setViewportView(tableOfData);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 953, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(title))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(withRadioBtn)
                        .addGap(18, 18, 18)
                        .addComponent(withoutRadioBtn))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(retrieveData, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(33, 33, 33)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(title)
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(withRadioBtn)
                    .addComponent(withoutRadioBtn))
                .addGap(26, 26, 26)
                .addComponent(retrieveData, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(200, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void retrieveDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_retrieveDataMouseClicked
        List<Employee> employees = em.createNamedQuery("Employee.findAll").getResultList();
        tableModel.setNumRows(0);
        int i = 1;
        for (Employee e : employees) {
            if (withRadioBtn.isSelected() && e.getSuperssn() != null) {
                tableModel.addRow(new Object[]{i, e.getFullName(), e.getSuperssn().getFullName()});
                i++;
            } else if (withoutRadioBtn.isSelected() && e.getSuperssn() == null) {
                tableModel.addRow(new Object[]{i, e.getFullName()});
                i++;
            }
        }
    }//GEN-LAST:event_retrieveDataMouseClicked

    private DefaultTableModel tableModel;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.ButtonGroup radioGroup;
    private javax.swing.JButton retrieveData;
    private javax.swing.JTable tableOfData;
    private javax.swing.JLabel title;
    private javax.swing.JRadioButton withRadioBtn;
    private javax.swing.JRadioButton withoutRadioBtn;
    // End of variables declaration//GEN-END:variables
}
