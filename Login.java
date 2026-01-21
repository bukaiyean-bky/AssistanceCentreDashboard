/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package assignment;

import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {

    /**
     * Creates new form login
     */
    public Login() {
        initComponents();
        setResizable(false);
        setIcon();
    }
    
    private void setIcon() {
        try {
            // Provide the direct URL of the icon image
            URL url = new URL("https://th.bing.com/th/id/OIP.NNnB8HbUoQ91zH1Am383AwHaHa?rs=1&pid=ImgDetMain");  // Replace with your actual icon URL
            ImageIcon icon = new ImageIcon(url);

            // Set the icon image for the frame
            setIconImage(icon.getImage());
        } catch (Exception e) {
            // Handle exceptions
            System.err.println("Error setting icon: " + e.getMessage());
        }
    }
    public static void main(String[]args){
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    @SuppressWarnings("unchecked")    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Right = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Left = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        juserID = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jpassword = new javax.swing.JPasswordField();
        blogin = new javax.swing.JButton();
        jcshow = new javax.swing.JCheckBox();
        bchannel = new javax.swing.JButton();
        bcontact = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LOGIN");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setToolTipText("LOGIN");
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 500));
        jPanel1.setLayout(null);

        Right.setBackground(new java.awt.Color(51, 102, 0));
        Right.setMaximumSize(new java.awt.Dimension(400, 500));
        Right.setMinimumSize(new java.awt.Dimension(400, 500));
        Right.setPreferredSize(new java.awt.Dimension(400, 500));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/675073_earth_512x512.png"))); // NOI18N
        jLabel5.setMaximumSize(new java.awt.Dimension(458, 463));
        jLabel5.setMinimumSize(new java.awt.Dimension(458, 463));
        jLabel5.setPreferredSize(new java.awt.Dimension(458, 463));

        jLabel6.setBackground(new java.awt.Color(51, 102, 0));
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("presented by Group 23");

        jLabel7.setBackground(new java.awt.Color(51, 102, 0));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("CLIMATE ACTION");

        javax.swing.GroupLayout RightLayout = new javax.swing.GroupLayout(Right);
        Right.setLayout(RightLayout);
        RightLayout.setHorizontalGroup(
            RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RightLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(125, 125, 125))
            .addGroup(RightLayout.createSequentialGroup()
                .addGroup(RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(RightLayout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jLabel7))
                    .addGroup(RightLayout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addComponent(jLabel6)))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        RightLayout.setVerticalGroup(
            RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RightLayout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 125, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(69, 69, 69))
        );

        jPanel1.add(Right);
        Right.setBounds(0, 0, 400, 510);

        Left.setBackground(new java.awt.Color(255, 255, 255));
        Left.setMaximumSize(new java.awt.Dimension(400, 500));
        Left.setMinimumSize(new java.awt.Dimension(400, 500));
        Left.setPreferredSize(new java.awt.Dimension(400, 500));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 102, 0));
        jLabel1.setText("LOGIN");

        jLabel2.setBackground(new java.awt.Color(153, 153, 153));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("UserID");

        juserID.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        juserID.setForeground(new java.awt.Color(102, 102, 102));
        juserID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                juserIDActionPerformed(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(153, 153, 153));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Password");

        jpassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jpasswordActionPerformed(evt);
            }
        });

        blogin.setBackground(new java.awt.Color(51, 102, 0));
        blogin.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        blogin.setForeground(new java.awt.Color(255, 255, 255));
        blogin.setText("Login");
        blogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bloginActionPerformed(evt);
            }
        });

        jcshow.setText("Show Password");
        jcshow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcshowActionPerformed(evt);
            }
        });

        bchannel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bchannel.setForeground(new java.awt.Color(51, 102, 0));
        bchannel.setText("Emergency Channel");
        bchannel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bchannelActionPerformed(evt);
            }
        });

        bcontact.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bcontact.setForeground(new java.awt.Color(51, 102, 0));
        bcontact.setText("Emergency Contacts");
        bcontact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bcontactActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout LeftLayout = new javax.swing.GroupLayout(Left);
        Left.setLayout(LeftLayout);
        LeftLayout.setHorizontalGroup(
            LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LeftLayout.createSequentialGroup()
                .addGroup(LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(LeftLayout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addComponent(jLabel1))
                    .addGroup(LeftLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jcshow)
                            .addGroup(LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3)
                                .addComponent(jpassword, javax.swing.GroupLayout.DEFAULT_SIZE, 298, Short.MAX_VALUE)
                                .addComponent(juserID))))
                    .addGroup(LeftLayout.createSequentialGroup()
                        .addGap(162, 162, 162)
                        .addComponent(blogin, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(LeftLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(bchannel)
                        .addGap(18, 18, 18)
                        .addComponent(bcontact)))
                .addContainerGap(362, Short.MAX_VALUE))
        );
        LeftLayout.setVerticalGroup(
            LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LeftLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel1)
                .addGap(36, 36, 36)
                .addComponent(jLabel2)
                .addGap(4, 4, 4)
                .addComponent(juserID, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jcshow)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                .addComponent(blogin, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addGroup(LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bchannel)
                    .addComponent(bcontact))
                .addGap(19, 19, 19))
        );

        jPanel1.add(Left);
        Left.setBounds(400, 0, 730, 500);

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
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 506, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel1.getAccessibleContext().setAccessibleName("LOGIN");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void juserIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_juserIDActionPerformed
        
  
 
    }//GEN-LAST:event_juserIDActionPerformed

    private void jpasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jpasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jpasswordActionPerformed

    private void bloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bloginActionPerformed
        if (juserID.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Please fill in username");
        } else if (jpassword.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Please fill in password");
        }  
        else if (juserID.getText().contains("user") && jpassword.getText().contains("user")){
            JOptionPane.showMessageDialog(null, "Login Successful");
            MainPage jf= new MainPage();
            jf.show();
            dispose();
        }
        else if (juserID.getText().contains("admin") && jpassword.getText().contains("admin")){
            JOptionPane.showMessageDialog(null, "Login Successful");
            AdminPage jf= new AdminPage();
            jf.show();
            dispose();
        }
        else{
            JOptionPane.showMessageDialog(null, "Wrong username or password!!","Message",JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_bloginActionPerformed

    private void jcshowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcshowActionPerformed
        if (jcshow.isSelected()){
            jpassword.setEchoChar((char)0);
        }
        else{
            jpassword.setEchoChar((char)'•');
        }
        
    }//GEN-LAST:event_jcshowActionPerformed

    private void bchannelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bchannelActionPerformed
       EmergencyChannelLogin jf= new EmergencyChannelLogin();
       jf.show();
       dispose();
    }//GEN-LAST:event_bchannelActionPerformed

    private void bcontactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bcontactActionPerformed
       EmergencyContactLogin jf= new EmergencyContactLogin();
       jf.show();
       dispose();
    }//GEN-LAST:event_bcontactActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Left;
    private javax.swing.JPanel Right;
    private javax.swing.JButton bchannel;
    private javax.swing.JButton bcontact;
    private javax.swing.JButton blogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JCheckBox jcshow;
    private javax.swing.JPasswordField jpassword;
    private javax.swing.JTextField juserID;
    // End of variables declaration//GEN-END:variables
}
