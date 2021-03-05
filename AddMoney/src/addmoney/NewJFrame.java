/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package addmoney;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.*;

/**
 *
 * @author swast
 */
public class NewJFrame extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    private BankDetailsManager mgr;
    public NewJFrame(BankDetailsManager mgr) 
    {
        this.mgr  = mgr;
        initComponents();
        mgr.init("Database1.csv");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        AddMoney = new javax.swing.JLabel();
        AccNo = new javax.swing.JLabel();
        BankBox = new javax.swing.JComboBox<>();
        SelectBank = new javax.swing.JLabel();
        AccField = new javax.swing.JTextField();
        Amount = new javax.swing.JLabel();
        AmtField = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        AMBtn = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("9_Swastika_Saha");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(7, 57, 123));

        jLabel3.setBackground(new java.awt.Color(7, 57, 123));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("    Vineeta Jain");

        jLabel4.setBackground(new java.awt.Color(7, 57, 123));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("samplemail@gmai.com");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(121, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, 110));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        AddMoney.setBackground(new java.awt.Color(255, 0, 102));
        AddMoney.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        AddMoney.setText("   Add Money");

        AccNo.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        AccNo.setText("Account Number");

        BankBox.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BankBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "HDFC BANK", "IDBI ", "ICICI BANK", "SBI ", "AXIS BANK", "BANK OF BARODA", "PUNJAB NATIONAL BANK", "UNION BANK", "ALLAHABAD BANK", "YES BANK", "CITI BANK", " ", " " }));

        SelectBank.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        SelectBank.setText("Select Bank");

        AccField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AccFieldActionPerformed(evt);
            }
        });
        AccField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                AccFieldKeyPressed(evt);
            }
        });

        Amount.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        Amount.setText("Amount");

        AmtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AmtFieldActionPerformed(evt);
            }
        });
        AmtField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                AmtFieldKeyPressed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/applogotrans.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel8)
                .addGap(0, 372, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addContainerGap(55, Short.MAX_VALUE))
        );

        AMBtn.setBackground(new java.awt.Color(7, 57, 123));
        AMBtn.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        AMBtn.setForeground(new java.awt.Color(255, 255, 255));
        AMBtn.setText("Add Money");
        AMBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AMBtnActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(7, 57, 123));
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setForeground(new java.awt.Color(204, 0, 0));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setForeground(new java.awt.Color(204, 0, 0));
        jLabel6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jLabel6KeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(AMBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(AddMoney, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(132, 132, 132))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(SelectBank)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(AccNo)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(BankBox, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Amount, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(AccField)
                            .addComponent(AmtField)))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(AddMoney, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))))
                .addGap(26, 26, 26)
                .addComponent(SelectBank)
                .addGap(18, 18, 18)
                .addComponent(BankBox, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(AccNo)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(AccField, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Amount, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addComponent(AmtField, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(AMBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 430, 640));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        JFrame f2 = new JFrame();
        JDialog d = new JDialog(f2, "Exit");
        JLabel l2 = new JLabel(" REDIRECTING TO PREVIOUS SCREEN!");

        d.add(l2);

        d.setSize(300,300);
        d.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void AMBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AMBtnActionPerformed
        // TODO add your handling code here:
        //System.out.println(AccField.getText().toString());
     
        String s= AccField.getText();
        String z=AmtField.getText();
        int f1=1;
        int f2=1;
        if(s.length()==0 || z.length()==0)
        {
            f1=0;
        }
        if(s.length()!=14)
        {
            f2=0;
        }
        if(f1==0)
        {
            JFrame f10 = new JFrame();
            JDialog d1 = new JDialog(f10, "Empty Fields");
            JLabel l3 = new JLabel("Input Fields Cannot be Empty! ");

            d1.add(l3);

            d1.setSize(300,300);
            d1.setVisible(true);
            
        }
        else if(f2==0)
        {
            JFrame f11 = new JFrame();
            JDialog d2 = new JDialog(f11, "ERROR! ");
            JLabel l4 = new JLabel("Enter valid Account number! ");

            d2.add(l4);

            d2.setSize(300,300);
            d2.setVisible(true);
        }
        else 
        {
        JFrame f5 = new JFrame();
        
        JDialog d = new JDialog(f5, "Payment Successful");
        JLabel l2 = new JLabel("Your money has been added! ");
        String bank = (String) BankBox.getSelectedItem();
        mgr.setAccount("Database1.csv", s, bank, z);
        d.add(l2);

        d.setSize(300,300);
        d.setVisible(true);
        }
        

    }//GEN-LAST:event_AMBtnActionPerformed

    private void AccFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AccFieldActionPerformed
        // TODO add your handling code here:
        String p = AmtField.getText();
        if(p.length()!=14)
        {
            JFrame f2 = new JFrame();
            JDialog d = new JDialog(f2, "Invalid Amount");
            JLabel l2 = new JLabel("Enter 14 digit Account Number ");

            d.add(l2);

            d.setSize(300,300);
            d.setVisible(true);
        }

    }//GEN-LAST:event_AccFieldActionPerformed

    private void jLabel6KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLabel6KeyPressed
        // TODO add your handling code here:
        
        
        
    }//GEN-LAST:event_jLabel6KeyPressed

    private void AccFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_AccFieldKeyPressed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_AccFieldKeyPressed

    private void AmtFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_AmtFieldKeyPressed
        // TODO add your handling code here:
                char c= evt.getKeyChar();
                if(Character.isLetter(c))
                {
                        AmtField.setEditable(false);
                        jLabel2.setText("Your amount should be number Only!");
                    }
                else
                {
                        AmtField.setEditable(true);
                    }
    }//GEN-LAST:event_AmtFieldKeyPressed

    private void AmtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AmtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AmtFieldActionPerformed
         
    /**
     * @param args the command line arguments
     */
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AMBtn;
    private javax.swing.JTextField AccField;
    private javax.swing.JLabel AccNo;
    private javax.swing.JLabel AddMoney;
    private javax.swing.JLabel Amount;
    private javax.swing.JTextField AmtField;
    private javax.swing.JComboBox<String> BankBox;
    private javax.swing.JLabel SelectBank;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
