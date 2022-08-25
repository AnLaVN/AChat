package Frame;
// Make By Bình An || AnLaVN || KatoVN

import static Frame.SignIn.con;
import Object.*;
import static Processing.LData.*;
import static Processing.DData.*;
import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.LookAndFeel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class SignUp extends javax.swing.JFrame {

    public SignUp() {
        initComponents();
        showTheme();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Background = new javax.swing.JPanel();
        SignUp = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        lblUsername = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        lblEmaill = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        lblWE = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        chkSeePassword = new javax.swing.JCheckBox();
        txtPassword = new javax.swing.JPasswordField();
        btnSignUp = new com.k33ptoo.components.KButton();
        lblSignIn = new javax.swing.JLabel();
        lblHAA = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sign Up Form");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        SignUp.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        SignUp.setForeground(new java.awt.Color(102, 102, 255));
        SignUp.setText("Sign Up");

        lblName.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblName.setText("Your Name");

        txtName.setBackground(new Color(0, 0, 0, 0));
        txtName.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtName.setToolTipText("Enter Your Name");
        txtName.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(150, 150, 150)));

        lblUsername.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblUsername.setText("Username");

        txtUsername.setBackground(new Color(0, 0, 0, 0));
        txtUsername.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtUsername.setToolTipText("Enter Your Username");
        txtUsername.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(150, 150, 150)));
        txtUsername.addKeyListener( new KeyAdapter() {public void keyTyped(KeyEvent e) {
            char c = e.getKeyChar();
            if (((c < '0') || (c > '9')) && ((c < 'A') || (c > 'Z')) && ((c < 'a') || (c > 'z')) && (c != KeyEvent.VK_BACK_SPACE)) { e.consume();}
        }});

        lblEmaill.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblEmaill.setText("Contact Email");

        txtEmail.setBackground(new Color(0, 0, 0, 0));
        txtEmail.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtEmail.setToolTipText("Enter Your Email Address");
        txtEmail.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(150, 150, 150)));
        txtEmail.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                String email = txtEmail.getText();
                Matcher m = Pattern.compile(EMAIL).matcher(email);
                if (m.find() && !email.equals("")){ lblWE.setVisible(false); }
                else{ lblWE.setVisible(true); }
            }});

            lblWE.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
            lblWE.setForeground(new java.awt.Color(255, 0, 0));
            lblWE.setText("*Invalid Email");

            lblPassword.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
            lblPassword.setText("Password");

            chkSeePassword.setText("See Password ?");
            chkSeePassword.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    chkSeePasswordActionPerformed(evt);
                }
            });

            txtPassword.setBackground(new Color(0, 0, 0, 0));
            txtPassword.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
            txtPassword.setToolTipText("Enter Your Password");
            txtPassword.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(150, 150, 150)));

            btnSignUp.setText("Sign up");
            btnSignUp.setToolTipText("");
            btnSignUp.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
            btnSignUp.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
            btnSignUp.setkBorderRadius(20);
            btnSignUp.setkEndColor(new java.awt.Color(0, 188, 212));
            btnSignUp.setkHoverEndColor(new Color(0, 188, 212, 155));
            btnSignUp.setkHoverForeGround(new java.awt.Color(255, 255, 255));
            btnSignUp.setkHoverStartColor(new Color(224, 64, 251, 155));
            btnSignUp.setkSelectedColor(new java.awt.Color(255, 0, 0));
            btnSignUp.setkStartColor(new java.awt.Color(224, 64, 251));
            btnSignUp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
            btnSignUp.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnSignUpActionPerformed(evt);
                }
            });

            lblSignIn.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
            lblSignIn.setForeground(new java.awt.Color(51, 102, 255));
            lblSignIn.setText("Sign In");
            lblSignIn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
            lblSignIn.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mousePressed(java.awt.event.MouseEvent evt) {
                    lblSignInMousePressed(evt);
                }
            });

            lblHAA.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
            lblHAA.setText("Have an account ?");

            javax.swing.GroupLayout BackgroundLayout = new javax.swing.GroupLayout(Background);
            Background.setLayout(BackgroundLayout);
            BackgroundLayout.setHorizontalGroup(
                BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(BackgroundLayout.createSequentialGroup()
                    .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(BackgroundLayout.createSequentialGroup()
                            .addGap(110, 110, 110)
                            .addComponent(SignUp)
                            .addGap(0, 0, Short.MAX_VALUE))
                        .addGroup(BackgroundLayout.createSequentialGroup()
                            .addGap(15, 15, 15)
                            .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtEmail, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackgroundLayout.createSequentialGroup()
                                    .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblName))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblUsername)))
                                .addGroup(BackgroundLayout.createSequentialGroup()
                                    .addComponent(lblPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(chkSeePassword))
                                .addGroup(BackgroundLayout.createSequentialGroup()
                                    .addComponent(lblEmaill)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblWE, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(txtPassword))))
                    .addGap(15, 15, 15))
                .addGroup(BackgroundLayout.createSequentialGroup()
                    .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(BackgroundLayout.createSequentialGroup()
                            .addGap(87, 87, 87)
                            .addComponent(btnSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(BackgroundLayout.createSequentialGroup()
                            .addGap(66, 66, 66)
                            .addComponent(lblHAA, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(lblSignIn, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap(58, Short.MAX_VALUE))
            );
            BackgroundLayout.setVerticalGroup(
                BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(BackgroundLayout.createSequentialGroup()
                    .addGap(15, 15, 15)
                    .addComponent(SignUp, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(35, 35, 35)
                    .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 0, 0)
                    .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(20, 20, 20)
                    .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblEmaill, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblWE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGap(0, 0, 0)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(20, 20, 20)
                    .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(chkSeePassword))
                    .addGap(0, 0, 0)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(30, 30, 30)
                    .addComponent(btnSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(15, 15, 15)
                    .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblHAA, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblSignIn))
                    .addGap(15, 15, 15))
            );

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            );
            layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            );

            pack();
            setLocationRelativeTo(null);
        }// </editor-fold>//GEN-END:initComponents

    private void chkSeePasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkSeePasswordActionPerformed
        if(chkSeePassword.isSelected()){    txtPassword.setEchoChar((char) 0);  }
        else{                               txtPassword.setEchoChar('*');       }
    }//GEN-LAST:event_chkSeePasswordActionPerformed

    private void btnSignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignUpActionPerformed
        if(Validate()){
            String Username = SHA256(txtUsername.getText());
            String Password = SHA256(String.valueOf(txtPassword.getPassword()));
            insertUS(new User(Username, Password, txtName.getText(), txtEmail.getText(), ""));
            if(WOptionPaneC("Sign Up successfully !\nSign In with this account ?") == JOptionPane.YES_OPTION){
                System.out.println("SignUp Successfully.");
                USERNAME = Username;    readAvatar();
                AChat("SignIn from SignUp");
                dispose();
            }
            txtUsername.setText("");
            txtPassword.setText("");    chkSeePassword.setSelected(false);
            txtName.setText("");
            txtEmail.setText("");
        }
    }//GEN-LAST:event_btnSignUpActionPerformed

    private void lblSignInMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSignInMousePressed
        new SignIn().setVisible(true);
        dispose();
    }//GEN-LAST:event_lblSignInMousePressed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        try{ con = connectDB(); }
        catch(Exception e){
            WOptionPaneM("Error establishing a database connection.\nCheck your connection and try again.");
            System.exit(0);
        }
    }//GEN-LAST:event_formWindowOpened

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        java.awt.EventQueue.invokeLater(() -> {
            new SignUp().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private javax.swing.JLabel SignUp;
    private com.k33ptoo.components.KButton btnSignUp;
    private javax.swing.JCheckBox chkSeePassword;
    private javax.swing.JLabel lblEmaill;
    private javax.swing.JLabel lblHAA;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblSignIn;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JLabel lblWE;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtName;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables

    private void showTheme() {
        setTheme(Background);   //setTheme(SignUp);
        setTheme(lblName);      setTheme(txtName);
        setTheme(lblUsername);  setTheme(txtUsername);
        setTheme(lblEmaill);    setTheme(txtEmail);     setTheme(chkSeePassword);
        setTheme(lblPassword);  txtPassword.setForeground(   Color.decode(Theme ? "#F0F0F0" : "#2C3338") );
        setTheme(lblHAA);
    }
    private boolean Validate(){
        String Username = txtUsername.getText();
        String Password = String.valueOf(txtPassword.getPassword());
        String Name     = txtName.getText();
        String Email    = txtEmail.getText();
        if(Name.equals("")){            showError("Name cannot be blank. !!!", txtName);        return false;   }else{deleError(txtName);}
        if(Username.equals("")){        showError("Username cannot be blank. !!!", txtUsername);return false;   }else{deleError(txtUsername);}
        try{selectUS(SHA256(Username)); showError("Username is already taken. !!!",txtUsername);return false;   }catch(Exception e){deleError(txtUsername);}
        if(Email.equals("")){           showError("Email cannot be blank. !!!", txtEmail);      return false;   }else{deleError(txtEmail);}
        if(!Email.matches(EMAIL)){      showError("Email address is not valid. !!!",txtEmail);  return false;   }else{deleError(txtEmail);}
        if(Password.equals("")){        showError("Password cannot be blank. !!!",txtPassword); return false;   }else{deleError(txtPassword);}
        return true;
    }
    private void showError(String text, JComponent t){
        t.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, Color.red));
        t.requestFocus();
        WOptionPaneM(text);
    }
    private void deleError(JComponent t){
        t.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(150, 150, 150)));
    }
    private void WOptionPaneM(String Message){
        LookAndFeel previousLF = UIManager.getLookAndFeel();
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            JOptionPane.showMessageDialog(this, Message, "Message", 2);
            UIManager.setLookAndFeel(previousLF);
        } catch (IllegalAccessException | UnsupportedLookAndFeelException | InstantiationException | ClassNotFoundException e) {System.out.println("!!! Error try to change Look and Feel MessageDialog. !!!");}
    }//Windows Look and Feel of JOptionPane MessageDialog
    private int WOptionPaneC(String Message){
        LookAndFeel previousLF = UIManager.getLookAndFeel();
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            int ConfirmDialog = JOptionPane.showConfirmDialog(this, Message, "Confirm", JOptionPane.YES_OPTION);
            UIManager.setLookAndFeel(previousLF);
            return ConfirmDialog;
        } catch (IllegalAccessException | UnsupportedLookAndFeelException | InstantiationException | ClassNotFoundException e) {
            System.out.println("!!! Error try to change Look and Feel ConfirmDialog. !!!");
            throw new RuntimeException(e);
        }
    }//Windows Look and Feel of JOptionPane ConfirmDialog
}