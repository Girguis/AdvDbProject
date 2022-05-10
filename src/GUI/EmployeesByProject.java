/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import DBEntites.Department;
import DBEntites.Employee;
import DBEntites.Project;
import static GUI.MainFrame.em;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Girguis
 */
public class EmployeesByProject extends javax.swing.JPanel {
    /**
     * Creates new form EmployeeWithOrWithoutSupervisor
     */
    public EmployeesByProject() {
        initComponents();
        initList();
    }
private void initList()
{
        List<Project> Allprojects = em.createNamedQuery("Project.findAll").getResultList();
        for(Project p: Allprojects)
        {
            projectsList.addItem(p.getPname());
        }

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
        retriveData = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableOfData = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        projectsList = new javax.swing.JComboBox<>();
        title1 = new javax.swing.JLabel();

        title.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        title.setText("Emp By project");

        retriveData.setText("Retrive");
        retriveData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                retriveDataMouseClicked(evt);
            }
        });

        tableOfData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No.", "Employee name", "salary", "project name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tableOfData);
        if (tableOfData.getColumnModel().getColumnCount() > 0) {
            tableOfData.getColumnModel().getColumn(0).setResizable(false);
            tableOfData.getColumnModel().getColumn(1).setResizable(false);
            tableOfData.getColumnModel().getColumn(2).setResizable(false);
            tableOfData.getColumnModel().getColumn(3).setResizable(false);
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 285, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        jLabel1.setText("select project name");

        projectsList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                projectsListActionPerformed(evt);
            }
        });

        title1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        title1.setText("note : his/her salary greater than 3000");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(projectsList, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(title1)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(title))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(retriveData, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(title)
                .addGap(77, 77, 77)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(projectsList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(75, 75, 75)
                .addComponent(retriveData, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                .addComponent(title1)
                .addGap(39, 39, 39))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void retriveDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_retriveDataMouseClicked
       List<Project> projects=em.createNamedQuery("Project.findByPname").setParameter("pname", projectsList.getSelectedItem().toString()).getResultList();
       List<Employee> employees = em.createNamedQuery("Employee.findAll").getResultList();
       DefaultTableModel tableModel= (DefaultTableModel) tableOfData.getModel();
       tableModel.setNumRows(0);
       int i=1;
       for(Project p : projects)
       {
           for (Employee e : employees) {
               if(e.getSalary()>30000 && e.getDno()==p.getDno()) {
                   tableModel.addRow(new Object[]{i,e.getFullName(),e.getSalary(),p.getPname()});
               }
           }
           i++;
       }
    }//GEN-LAST:event_retriveDataMouseClicked

    private void projectsListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_projectsListActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_projectsListActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> projectsList;
    private javax.swing.ButtonGroup radioGroup;
    private javax.swing.JButton retriveData;
    private javax.swing.JTable tableOfData;
    private javax.swing.JLabel title;
    private javax.swing.JLabel title1;
    // End of variables declaration//GEN-END:variables
}