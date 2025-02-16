import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ForgotPassword extends javax.swing.JFrame {

        Connection conn=null;
        PreparedStatement pst=null;
        ResultSet rs=null;
    /**
     * Creates new form ForgotPassword
     */
    public ForgotPassword() {
        initComponents();
        txtsq.setEditable(false);
         try {
            Class.forName("com.mysql.jdbc.Driver");
           conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotels","root","");
    }       catch (SQLException ex) {
                Logger.getLogger(ForgotPassword.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(ForgotPassword.class.getName()).log(Level.SEVERE, null, ex);
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        txtemail = new javax.swing.JTextField();
        txtsq = new javax.swing.JTextField();
        txtanswer = new javax.swing.JTextField();
        txtpassword = new javax.swing.JPasswordField();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("Forgot Password");

        jLabel2.setFont(new java.awt.Font("Lucida Fax", 1, 18)); // NOI18N
        jLabel2.setText("Email ID");

        jLabel3.setFont(new java.awt.Font("Lucida Fax", 1, 18)); // NOI18N
        jLabel3.setText("Security Question");

        jLabel4.setFont(new java.awt.Font("Lucida Fax", 1, 18)); // NOI18N
        jLabel4.setText("Answer");

        jLabel5.setFont(new java.awt.Font("Lucida Fax", 1, 18)); // NOI18N
        jLabel5.setText("New Password");

        jButton1.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 0, 0));
        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 0, 0));
        jButton2.setText("Cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 0, 0));
        jButton3.setText("Back to Login Page");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        txtemail.setFont(new java.awt.Font("Lucida Fax", 1, 18)); // NOI18N

        txtsq.setFont(new java.awt.Font("Lucida Fax", 1, 18)); // NOI18N

        txtanswer.setFont(new java.awt.Font("Lucida Fax", 1, 18)); // NOI18N

        txtpassword.setFont(new java.awt.Font("Lucida Fax", 1, 18)); // NOI18N
        txtpassword.setForeground(new java.awt.Color(255, 0, 0));

        jButton4.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 0, 0));
        jButton4.setText("Search");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton1)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel5)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(114, 114, 114)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtemail, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                                    .addComponent(txtsq)
                                    .addComponent(txtanswer)
                                    .addComponent(txtpassword))
                                .addGap(18, 18, 18)
                                .addComponent(jButton4)
                                .addGap(59, 59, 59))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addComponent(jButton2)
                                .addGap(41, 41, 41)
                                .addComponent(jButton3)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(165, 165, 165)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtsq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtanswer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtpassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton1)
                    .addComponent(jButton3)))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 140, 650, -1));

        jButton5.setFont(new java.awt.Font("Cambria", 1, 36)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 0, 0));
        jButton5.setText("X");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1320, 0, 50, 50));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/jason-leung-Xaanw0s0pMk-unsplash.jpg"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(-224, -158, 1780, 930));

        pack();
    }// </editor-fold>//GEN-END:initComponents

        
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
      new Login().setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      txtemail.setText("");
      txtsq.setText("");
      txtanswer.setText("");
      txtpassword.setText(""); 
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
            try {
                pst=conn.prepareStatement("select sq from login where Email=?");
                pst.setString(1,txtemail.getText());
                rs=pst.executeQuery();
                
                if(rs.next()){
                    txtsq.setText(rs.getString("sq"));
                }
                else{
                    JOptionPane.showMessageDialog(this,"Sorry Record Not Found");
                }
            } catch (SQLException ex) {
                Logger.getLogger(ForgotPassword.class.getName()).log(Level.SEVERE, null, ex);
            }
       
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
            try {
                pst=conn.prepareStatement("select * from login where Email=? and ANS=?");
                pst.setString(1,txtemail.getText());
                pst.setString(2,txtanswer.getText());
                rs=pst.executeQuery();
                
                if(rs.next()){
  
             try {
                pst=conn.prepareStatement("update login set Password=? where Email=? and Password=?");
                pst.setString(1,txtpassword.getText());
                pst.setString(2,txtemail.getText());
                pst.setString(3,txtanswer.getText());
                pst.executeUpdate();
                JOptionPane.showMessageDialog(this,"Reset Successfully\n Login now");
                
            
            } catch (SQLException ex) {
                Logger.getLogger(ForgotPassword.class.getName()).log(Level.SEVERE, null, ex);
            }
            }
                else{
                    JOptionPane.showMessageDialog(this,"Answer Not Matched!!");
                
                }
            }
            catch (SQLException ex) {
                Logger.getLogger(ForgotPassword.class.getName()).log(Level.SEVERE, null, ex);
            }
            
                     
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        int yes=JOptionPane.showConfirmDialog(this,"Are you sure?","Exit",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        if(yes==JOptionPane.YES_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    
    
    
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
            java.util.logging.Logger.getLogger(ForgotPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ForgotPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ForgotPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ForgotPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ForgotPassword().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtanswer;
    private javax.swing.JTextField txtemail;
    private javax.swing.JPasswordField txtpassword;
    private javax.swing.JTextField txtsq;
    // End of variables declaration//GEN-END:variables
}
