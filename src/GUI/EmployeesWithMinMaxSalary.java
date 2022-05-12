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
 * @author Girguis
 */
public class EmployeesWithMinMaxSalary extends javax.swing.JPanel {

    /**
     * Creates new form EmpWithMinSalary
     */
    public EmployeesWithMinMaxSalary() {
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
        retrieveData = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableOfData = new javax.swing.JTable();
        minSal = new javax.swing.JRadioButton();
        maxSal = new javax.swing.JRadioButton();

        title.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        title.setText("<html>Employees with<br>mininum or maximum<br>salary");

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
                "No.", "Name", "Salary", "Phone number"
            }
        ));
        jScrollPane1.setViewportView(tableOfData);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 746, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 483, Short.MAX_VALUE)
        );

        radioGroup.add(minSal);
        minSal.setSelected(true);
        minSal.setText("Min salary");

        radioGroup.add(maxSal);
        maxSal.setText("Max salary");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(minSal)
                        .addGap(18, 18, 18)
                        .addComponent(maxSal))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(retrieveData, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(76, 76, 76)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(minSal)
                    .addComponent(maxSal))
                .addGap(18, 18, 18)
                .addComponent(retrieveData)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void retrieveDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_retrieveDataMouseClicked
        List<Employee> employees = em.createNamedQuery("Employee.findAll").getResultList();
        double sal = employees.get(0).getSalary();
        if (minSal.isSelected()) {
            for (Employee e : employees) {
                if (e.getSalary() < sal) {
                    sal = e.getSalary();
                }
            }
        } else {
            for (Employee e : employees) {
                if (e.getSalary() > sal) {
                    sal = e.getSalary();
                }
            }
        }
        tableModel.setNumRows(0);
        int i = 1;
        for (Employee e : employees) {
            if (e.getSalary() == sal) {
                tableModel.addRow(new Object[]{i, e.getFullName(), e.getSalary(), e.getPhonenumber()});
                i++;
            }
        }
//        List<Employee> employees;
//        if(minSal.isSelected())
//            employees = em.createNamedQuery("Employee.findByMinSalary").getResultList();
//        else
//            employees = em.createNamedQuery("Employee.findByMaxSalary").getResultList();
//        DefaultTableModel tableModel = (DefaultTableModel) tableOfData.getModel();
//        tableModel.setNumRows(0);
//        int i=1;
//        for(Employee e : employees)
//        {
//            tableModel.addRow(new Object[]{i,e.getFullName(),e.getSalary(),e.getPhonenumber()});
//            i++;
//        }
    }//GEN-LAST:event_retrieveDataMouseClicked

    private DefaultTableModel tableModel;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton maxSal;
    private javax.swing.JRadioButton minSal;
    private javax.swing.ButtonGroup radioGroup;
    private javax.swing.JButton retrieveData;
    private javax.swing.JTable tableOfData;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
