package contactmanagement;
public class ViewContact extends javax.swing.JFrame {
    Controller ctrl = StartPage.ctrl;
    Node curr;
    public ViewContact(Node n) {
        curr = n;
        initComponents();
        nameValueLabel.setText(((curr.name).equals("="))?"":curr.name);
        phone1ValueLabel.setText(((curr.contact1).equals("="))?"":curr.contact1);
        phone2ValueLabel.setText(((curr.contact2).equals("="))?"":curr.contact2);
        emailValueLabel.setText(((curr.email).equals("="))?"":curr.email);
        addrValueArea.setText(((curr.address.replace("`","\n").replace("$",","))
                .equals("="))?"":(curr.address.replace("`","\n").replace("$",",")));
        startListeners();
    }
    public void startListeners(){
        this.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent evt){
                StartPage s = new StartPage();
                s.setVisible(true);
            }
        });
    }
    public ViewContact() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        detailsPanel = new javax.swing.JPanel();
        nameLabel = new javax.swing.JLabel();
        phone1Label = new javax.swing.JLabel();
        phone2Label = new javax.swing.JLabel();
        emailLabel = new javax.swing.JLabel();
        addrLabel = new javax.swing.JLabel();
        nameValueLabel = new javax.swing.JLabel();
        phone1ValueLabel = new javax.swing.JLabel();
        phone2ValueLabel = new javax.swing.JLabel();
        emailValueLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        addrValueArea = new javax.swing.JTextArea();
        buttonPanel = new javax.swing.JPanel();
        editButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        detailsPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Contact Details"));

        nameLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        nameLabel.setText("Name             :");

        phone1Label.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        phone1Label.setText("Phone1          :");

        phone2Label.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        phone2Label.setText("Phone2          :");

        emailLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        emailLabel.setText("Email              :");

        addrLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        addrLabel.setText("Address         :");

        nameValueLabel.setText("Name");

        phone1ValueLabel.setText("Phone1");

        phone2ValueLabel.setText("Phone2");

        emailValueLabel.setText("Email");

        addrValueArea.setEditable(false);
        addrValueArea.setBackground(new java.awt.Color(240, 240, 240));
        addrValueArea.setColumns(20);
        addrValueArea.setRows(5);
        addrValueArea.setBorder(null);
        jScrollPane1.setViewportView(addrValueArea);

        javax.swing.GroupLayout detailsPanelLayout = new javax.swing.GroupLayout(detailsPanel);
        detailsPanel.setLayout(detailsPanelLayout);
        detailsPanelLayout.setHorizontalGroup(
            detailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(detailsPanelLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(detailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nameLabel)
                    .addComponent(phone1Label)
                    .addComponent(emailLabel)
                    .addComponent(phone2Label)
                    .addComponent(addrLabel))
                .addGap(33, 33, 33)
                .addGroup(detailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(nameValueLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 284, Short.MAX_VALUE)
                    .addComponent(phone1ValueLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(phone2ValueLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(emailValueLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        detailsPanelLayout.setVerticalGroup(
            detailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(detailsPanelLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(detailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameLabel)
                    .addComponent(nameValueLabel))
                .addGap(18, 18, 18)
                .addGroup(detailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(phone1Label)
                    .addComponent(phone1ValueLabel))
                .addGap(18, 18, 18)
                .addGroup(detailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(phone2Label)
                    .addComponent(phone2ValueLabel))
                .addGap(18, 18, 18)
                .addGroup(detailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailLabel)
                    .addComponent(emailValueLabel))
                .addGap(18, 18, 18)
                .addGroup(detailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(detailsPanelLayout.createSequentialGroup()
                        .addComponent(addrLabel)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(detailsPanelLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        buttonPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        editButton.setText("Edit");
        editButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editButtonActionPerformed(evt);
            }
        });

        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        deleteButton.setText("Delete");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout buttonPanelLayout = new javax.swing.GroupLayout(buttonPanel);
        buttonPanel.setLayout(buttonPanelLayout);
        buttonPanelLayout.setHorizontalGroup(
            buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(103, 103, 103)
                .addComponent(editButton, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 110, Short.MAX_VALUE)
                .addComponent(deleteButton)
                .addContainerGap())
        );
        buttonPanelLayout.setVerticalGroup(
            buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editButton)
                    .addComponent(backButton)
                    .addComponent(deleteButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(detailsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(detailsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButtonActionPerformed
        EditContact e = new EditContact(curr);
        e.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_editButtonActionPerformed
    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        StartPage s = new StartPage();
        s.setVisible(true);
        ViewContact.this.setVisible(false);
    }//GEN-LAST:event_backButtonActionPerformed
 
    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        ctrl.delete(curr);
        ctrl.writeToFileOverwrite("default.csv");
        StartPage v = new StartPage();
        v.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_deleteButtonActionPerformed
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(ViewContact.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewContact.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewContact.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewContact.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewContact().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addrLabel;
    private javax.swing.JTextArea addrValueArea;
    private javax.swing.JButton backButton;
    private javax.swing.JPanel buttonPanel;
    private javax.swing.JButton deleteButton;
    private javax.swing.JPanel detailsPanel;
    private javax.swing.JButton editButton;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JLabel emailValueLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JLabel nameValueLabel;
    private javax.swing.JLabel phone1Label;
    private javax.swing.JLabel phone1ValueLabel;
    private javax.swing.JLabel phone2Label;
    private javax.swing.JLabel phone2ValueLabel;
    // End of variables declaration//GEN-END:variables
}
