/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labtainers.mainui;

import java.awt.Dimension;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

/**
 *
 * @author Daniel Liao
 */
public class NetworkObjPanel extends javax.swing.JPanel {

    /**
     * Creates new form NetworkOnjPanel
     */
    private final MainWindow mainWindow;
    private LabData.NetworkData data;
    public NetworkObjPanel(MainWindow mainWindow, String name) {
        initComponents();
        this.mainWindow = mainWindow;
        this.data = new LabData.NetworkData(name);
        
        this.NetworkLabelName.setText(this.data.name);
        this.RenameNetworkTextfield.setVisible(false);

    }

    NetworkObjPanel(MainWindow mainWindow, LabData.NetworkData data) {
        initComponents();
        this.mainWindow = mainWindow;
        this.data = data;
        
        this.NetworkLabelName.setText(this.data.name);
        this.RenameNetworkTextfield.setVisible(false);
    }

    private void loadDataIntoNetworkPanel(){
        this.NetworkConfigWindow.setTitle("NetworkConfig: "+this.data.name);
        this.NetworkConfigMaskTextfield.setText(this.data.mask);
        this.NetworkConfigGatewayTextField.setText(this.data.gateway);
        this.NetworkConfigIPRangeTextfield.setText(this.data.ip_range);
        this.NetworkConfigMacVLanExtSpinner.setValue(this.data.macvlan_ext);
        this.NetworkConfigMacVLanSpinner.setValue(this.data.macvlan);
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        NetworkConfigWindow = new javax.swing.JDialog();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        NetworkConfigMaskTextfield = new javax.swing.JTextField();
        NetworkConfigGatewayTextField = new javax.swing.JTextField();
        NetworkConfigIPRangeTextfield = new javax.swing.JTextField();
        NetworkConfigCancelButton = new javax.swing.JButton();
        NetworkConfigUpdateButton = new javax.swing.JButton();
        NetworkConfigMacVLanExtSpinner = new javax.swing.JSpinner();
        NetworkConfigMacVLanSpinner = new javax.swing.JSpinner();
        NetworkRightClick = new javax.swing.JPopupMenu();
        renameNetworkOption = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        deleteNetworkOption = new javax.swing.JMenuItem();
        RenameNetworkTextfield = new javax.swing.JTextField();
        NetworkLabelName = new javax.swing.JLabel();

        NetworkConfigWindow.setMinimumSize(new java.awt.Dimension(377, 320));
        NetworkConfigWindow.setResizable(false);
        NetworkConfigWindow.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                NetworkConfigWindowWindowClosing(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("Mask:");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setText("Gateway:");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setText("MACVLAN_EXT:");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setText("MACVLAN:");

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setText("IP_RANGE:");

        NetworkConfigCancelButton.setText("Cancel");
        NetworkConfigCancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NetworkConfigCancelButtonActionPerformed(evt);
            }
        });

        NetworkConfigUpdateButton.setText("Update");
        NetworkConfigUpdateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NetworkConfigUpdateButtonActionPerformed(evt);
            }
        });

        NetworkConfigMacVLanExtSpinner.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        NetworkConfigMacVLanSpinner.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        javax.swing.GroupLayout NetworkConfigWindowLayout = new javax.swing.GroupLayout(NetworkConfigWindow.getContentPane());
        NetworkConfigWindow.getContentPane().setLayout(NetworkConfigWindowLayout);
        NetworkConfigWindowLayout.setHorizontalGroup(
            NetworkConfigWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NetworkConfigWindowLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(NetworkConfigWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(NetworkConfigWindowLayout.createSequentialGroup()
                        .addComponent(NetworkConfigUpdateButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(NetworkConfigCancelButton))
                    .addGroup(NetworkConfigWindowLayout.createSequentialGroup()
                        .addGroup(NetworkConfigWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(NetworkConfigWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NetworkConfigIPRangeTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NetworkConfigMaskTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NetworkConfigGatewayTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NetworkConfigMacVLanSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NetworkConfigMacVLanExtSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        NetworkConfigWindowLayout.setVerticalGroup(
            NetworkConfigWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NetworkConfigWindowLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(NetworkConfigWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NetworkConfigMaskTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(NetworkConfigWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NetworkConfigGatewayTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(16, 16, 16)
                .addGroup(NetworkConfigWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(NetworkConfigMacVLanExtSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(NetworkConfigWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(NetworkConfigWindowLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel5))
                    .addGroup(NetworkConfigWindowLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(NetworkConfigMacVLanSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(NetworkConfigWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NetworkConfigIPRangeTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(NetworkConfigWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NetworkConfigCancelButton)
                    .addComponent(NetworkConfigUpdateButton))
                .addContainerGap(55, Short.MAX_VALUE))
        );

        renameNetworkOption.setText("Rename");
        renameNetworkOption.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                renameNetworkOptionActionPerformed(evt);
            }
        });
        NetworkRightClick.add(renameNetworkOption);
        NetworkRightClick.add(jSeparator1);

        deleteNetworkOption.setText("Delete");
        deleteNetworkOption.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteNetworkOptionActionPerformed(evt);
            }
        });
        NetworkRightClick.add(deleteNetworkOption);

        setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        setMaximumSize(new java.awt.Dimension(340, 51));
        setMinimumSize(new java.awt.Dimension(340, 51));
        setName(""); // NOI18N
        setPreferredSize(new java.awt.Dimension(340, 51));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        RenameNetworkTextfield.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        RenameNetworkTextfield.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        RenameNetworkTextfield.setMinimumSize(new java.awt.Dimension(300, 35));
        RenameNetworkTextfield.setPreferredSize(new java.awt.Dimension(300, 35));
        RenameNetworkTextfield.setRequestFocusEnabled(false);
        RenameNetworkTextfield.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                RenameNetworkTextfieldFocusLost(evt);
            }
        });
        RenameNetworkTextfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RenameNetworkTextfieldActionPerformed(evt);
            }
        });
        add(RenameNetworkTextfield);

        NetworkLabelName.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        NetworkLabelName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        NetworkLabelName.setText("network_name");
        add(NetworkLabelName);
    }// </editor-fold>//GEN-END:initComponents

    private boolean clicked = false;
    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
       if(!clicked){
            if(SwingUtilities.isLeftMouseButton(evt)){
                clicked = true;
                loadDataIntoNetworkPanel();
                NetworkConfigWindow.setVisible(true);  
            }
            else if(SwingUtilities.isRightMouseButton(evt)){
                NetworkRightClick.show(this, evt.getX(), evt.getY());
    }

}
    }//GEN-LAST:event_formMouseClicked

    private void renameNetworkOptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_renameNetworkOptionActionPerformed
        // Make the rename textfield visible, active, and all text inside preselected
        RenameNetworkTextfield.setText(data.name);
        RenameNetworkTextfield.setVisible(true);
        RenameNetworkTextfield.requestFocusInWindow();
        RenameNetworkTextfield.selectAll();

        // Hide the original network label
       NetworkLabelName.setVisible(false);
    }//GEN-LAST:event_renameNetworkOptionActionPerformed

    private void deleteNetworkOptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteNetworkOptionActionPerformed
        int confirm = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete the network '"+data.name+"'?", "Delete Network",  JOptionPane.YES_NO_OPTION);
        if (confirm == JOptionPane.YES_OPTION){
            JPanel networkPanel = (JPanel)this.getParent();

            // delete the network from the list
            networkPanel.remove(this);

            // Shorten the panel height holding all the containers and resize it.
            mainWindow.networkPanePanelLength-=51;
            networkPanel.setPreferredSize(new Dimension(0,mainWindow.networkPanePanelLength));

            // Redraw the panel containing the list of networks
            networkPanel.revalidate();
            networkPanel.repaint(); 
        }
    }//GEN-LAST:event_deleteNetworkOptionActionPerformed

    private void RenameNetworkTextfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RenameNetworkTextfieldActionPerformed
        // Prompt user to confirm their changes
        int confirm = JOptionPane.showConfirmDialog(null, "Are you sure you want to rename the network '"+data.name+"' to '"+RenameNetworkTextfield.getText()+"'?", "Rename Network",  JOptionPane.YES_NO_OPTION);
        if (confirm == JOptionPane.YES_OPTION){
            // Rename the network
            NetworkLabelName.setText(RenameNetworkTextfield.getText());   
            data.name = RenameNetworkTextfield.getText();
            System.out.println("Renamed network to: "+data.name);
        }

        // hide the textfield and show the network label
        RenameNetworkTextfield.setVisible(false);
        NetworkLabelName.setVisible(true);
    }//GEN-LAST:event_RenameNetworkTextfieldActionPerformed

    private void RenameNetworkTextfieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_RenameNetworkTextfieldFocusLost
        // hide the textfield and show the network label
        RenameNetworkTextfield.setVisible(false);
        NetworkLabelName.setVisible(true);
    }//GEN-LAST:event_RenameNetworkTextfieldFocusLost

    private void NetworkConfigWindowWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_NetworkConfigWindowWindowClosing
        System.out.println("Closing Config for: " + data.name);
        clicked = false;
    }//GEN-LAST:event_NetworkConfigWindowWindowClosing

    private void NetworkConfigUpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NetworkConfigUpdateButtonActionPerformed
        // Set the textfield and spinner values into the data Objects
        this.data.mask = this.NetworkConfigMaskTextfield.getText();
        this.data.gateway = this.NetworkConfigGatewayTextField.getText();
        this.data.ip_range = this.NetworkConfigIPRangeTextfield.getText();
        this.data.macvlan_ext = (int) this.NetworkConfigMacVLanExtSpinner.getValue();
        this.data.macvlan = (int) this.NetworkConfigMacVLanSpinner.getValue();
        
        clicked = false;
        NetworkConfigWindow.setVisible(false);
    }//GEN-LAST:event_NetworkConfigUpdateButtonActionPerformed

    private void NetworkConfigCancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NetworkConfigCancelButtonActionPerformed
        clicked = false;
        NetworkConfigWindow.setVisible(false);
    }//GEN-LAST:event_NetworkConfigCancelButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton NetworkConfigCancelButton;
    private javax.swing.JTextField NetworkConfigGatewayTextField;
    private javax.swing.JTextField NetworkConfigIPRangeTextfield;
    private javax.swing.JSpinner NetworkConfigMacVLanExtSpinner;
    private javax.swing.JSpinner NetworkConfigMacVLanSpinner;
    private javax.swing.JTextField NetworkConfigMaskTextfield;
    private javax.swing.JButton NetworkConfigUpdateButton;
    private javax.swing.JDialog NetworkConfigWindow;
    private javax.swing.JLabel NetworkLabelName;
    private javax.swing.JPopupMenu NetworkRightClick;
    private javax.swing.JTextField RenameNetworkTextfield;
    private javax.swing.JMenuItem deleteNetworkOption;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JMenuItem renameNetworkOption;
    // End of variables declaration//GEN-END:variables
}
