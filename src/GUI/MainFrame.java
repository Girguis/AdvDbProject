/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;

/**
 *
 * @author Girguis
 */
public class MainFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
        em = Persistence.createEntityManagerFactory("AdvDatabaseProjectPU").createEntityManager();
        initComponents();
//        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
//        setBounds(0, 0, screenSize.width, screenSize.height);
//        setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        departmentWithAvgSalaries1 = new GUI.DepartmentWithAvgSalaries();
        employeeByCountry1 = new GUI.EmployeeByCountry();
        employeeWithOrWithoutSupervisor1 = new GUI.EmployeeWithOrWithoutSupervisor();
        employeesWithMinMaxSalary1 = new GUI.EmployeesWithMinMaxSalary();
        getAllEmployees1 = new GUI.GetAllEmployees();
        empCountByDep1 = new GUI.EmpCountByDep();
        salaryIncrease1 = new GUI.SalaryIncrease();
        employeesByDepAndProject1 = new GUI.EmployeesByDepAndProject();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.addTab("DepartmentWithAvgSalaries", departmentWithAvgSalaries1);
        jTabbedPane1.addTab("EmployeeByCountry", employeeByCountry1);
        jTabbedPane1.addTab("EmployeeWithOrWithoutSupervisor", employeeWithOrWithoutSupervisor1);
        jTabbedPane1.addTab("EmployeesWithMinMaxSalary", employeesWithMinMaxSalary1);
        jTabbedPane1.addTab("GetAllEmployees", getAllEmployees1);
        jTabbedPane1.addTab("Emp count by dep", empCountByDep1);
        jTabbedPane1.addTab("Increase salary", salaryIncrease1);
        jTabbedPane1.addTab("Employees by dep and project", employeesByDepAndProject1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1495, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 617, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }
    public static EntityManager em;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private GUI.DepartmentWithAvgSalaries departmentWithAvgSalaries1;
    private GUI.EmpCountByDep empCountByDep1;
    private GUI.EmployeeByCountry employeeByCountry1;
    private GUI.EmployeeWithOrWithoutSupervisor employeeWithOrWithoutSupervisor1;
    private GUI.EmployeesByDepAndProject employeesByDepAndProject1;
    private GUI.EmployeesWithMinMaxSalary employeesWithMinMaxSalary1;
    private GUI.GetAllEmployees getAllEmployees1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private GUI.SalaryIncrease salaryIncrease1;
    // End of variables declaration//GEN-END:variables
}
