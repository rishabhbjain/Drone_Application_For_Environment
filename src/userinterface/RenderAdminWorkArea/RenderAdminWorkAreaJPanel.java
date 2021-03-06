/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.RenderAdminWorkArea;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.RenderOrganization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author Administrator
 */
public class RenderAdminWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form RenderAdminWorkAreaJPanel
     */
    private JPanel container;
    private UserAccount account;
    private RenderOrganization organization;
    private Enterprise enterprise;
    private EcoSystem business;

    public RenderAdminWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, RenderOrganization organization, Enterprise enterprise, EcoSystem business) {
        initComponents();
        this.container = userProcessContainer;
        this.account =account;
        this.organization = organization;
        this.enterprise=enterprise;
        this.business = business;
        System.out.println("ORGNAME"+organization);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnManageRequest = new javax.swing.JButton();
        btnRequestSupplier = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel1.setText("Render");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 70, -1, -1));

        btnManageRequest.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        btnManageRequest.setText("Manage Inventory Request");
        btnManageRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageRequestActionPerformed(evt);
            }
        });
        add(btnManageRequest, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 150, -1, -1));

        btnRequestSupplier.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        btnRequestSupplier.setText("Request Supplier");
        btnRequestSupplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRequestSupplierActionPerformed(evt);
            }
        });
        add(btnRequestSupplier, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 220, 200, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/background2.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 700));
    }// </editor-fold>//GEN-END:initComponents

    private void btnManageRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageRequestActionPerformed
        // TODO add your handling code here:
        ManageInventoryRequestJPanel mirjp = new ManageInventoryRequestJPanel(container,account,organization,enterprise,business);
        container.add("ManageInventoryRequestJPanel", mirjp);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.next(container);
    }//GEN-LAST:event_btnManageRequestActionPerformed

    private void btnRequestSupplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRequestSupplierActionPerformed
        // TODO add your handling code here:
        RequestSupplierJPanel requestsupplier = new RequestSupplierJPanel(container,account,organization,enterprise,business);
        container.add("RequestSupplierJPanel", requestsupplier);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.next(container);
    }//GEN-LAST:event_btnRequestSupplierActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnManageRequest;
    private javax.swing.JButton btnRequestSupplier;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
