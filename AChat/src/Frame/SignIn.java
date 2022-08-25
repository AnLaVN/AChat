package Frame;
// Make By Bình An || AnLaVN || KatoVN

import Object.User;
import Processing.LData;
import static Processing.LData.*;
import static Processing.DData.*;
import java.sql.*;
import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.LookAndFeel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class SignIn extends javax.swing.JFrame {

    public SignIn() {
        initComponents();
        showTheme();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Background = new javax.swing.JPanel();
        SignIn = new javax.swing.JLabel();
        lblUsername = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        lblWUN = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        lblWPS = new javax.swing.JLabel();
        chkRememberMe = new javax.swing.JCheckBox();
        chkSeePassword = new javax.swing.JCheckBox();
        btnSignIn = new com.k33ptoo.components.KButton();
        lblDHAA = new javax.swing.JLabel();
        lblSignUp = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sign In Form");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        SignIn.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        SignIn.setForeground(new java.awt.Color(102, 102, 255));
        SignIn.setText("Sign In");

        lblUsername.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblUsername.setText("Username");

        txtUsername.setBackground(new Color(0, 0, 0, 0));
        txtUsername.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtUsername.setToolTipText("Enter Your Username");
        txtUsername.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(150, 150, 150)));
        txtUsername.addKeyListener( new KeyAdapter() {public void keyTyped(KeyEvent e) {
            char c = e.getKeyChar();
            if (((c < '0') || (c > '9')) && ((c < 'A') || (c > 'Z')) && ((c < 'a') || (c > 'z')) && (c != KeyEvent.VK_BACK_SPACE)) { e.consume();}
            if(txtUsername.getText().matches("[a-zA-Z0-9]{1,}")){ lblWUN.setVisible(false);}
            else{lblWUN.setVisible(true);}
        }});

        lblWUN.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        lblWUN.setForeground(new java.awt.Color(255, 0, 0));
        lblWUN.setText("*Invalid Username");

        lblPassword.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblPassword.setText("Password");

        txtPassword.setBackground(new Color(0, 0, 0, 0));
        txtPassword.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtPassword.setToolTipText("Enter Your Password");
        txtPassword.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(150, 150, 150)));
        txtPassword.addKeyListener( new KeyAdapter() {public void keyTyped(KeyEvent e) {
            if(String.valueOf(txtPassword.getPassword()).equals("")){lblWPS.setVisible(true);}
            else{lblWPS.setVisible(false);}
        }});

        lblWPS.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        lblWPS.setForeground(new java.awt.Color(255, 0, 0));
        lblWPS.setText("*Invalid Password");

        chkRememberMe.setText("Remember me ?");
        chkRememberMe.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        chkSeePassword.setText("See Password ?");
        chkSeePassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkSeePasswordActionPerformed(evt);
            }
        });

        btnSignIn.setText("Sign in");
        btnSignIn.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnSignIn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSignIn.setkBorderRadius(20);
        btnSignIn.setkEndColor(new java.awt.Color(0, 188, 212));
        btnSignIn.setkHoverEndColor(new Color(0, 188, 212, 155));
        btnSignIn.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        btnSignIn.setkHoverStartColor(new Color(224, 64, 251, 155));
        btnSignIn.setkSelectedColor(new java.awt.Color(255, 0, 0));
        btnSignIn.setkStartColor(new java.awt.Color(224, 64, 251));
        btnSignIn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSignIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignInActionPerformed(evt);
            }
        });

        lblDHAA.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        lblDHAA.setText("Don't have an account ?");

        lblSignUp.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        lblSignUp.setForeground(new java.awt.Color(51, 153, 255));
        lblSignUp.setText("Sign Up");
        lblSignUp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblSignUp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblSignUpMousePressed(evt);
            }
        });

        javax.swing.GroupLayout BackgroundLayout = new javax.swing.GroupLayout(Background);
        Background.setLayout(BackgroundLayout);
        BackgroundLayout.setHorizontalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtPassword, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtUsername)
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addComponent(lblUsername)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblWUN, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addComponent(lblPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblWPS, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackgroundLayout.createSequentialGroup()
                        .addComponent(chkRememberMe)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(chkSeePassword)))
                .addGap(15, 15, 15))
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addComponent(SignIn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackgroundLayout.createSequentialGroup()
                .addContainerGap(43, Short.MAX_VALUE)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackgroundLayout.createSequentialGroup()
                        .addComponent(lblDHAA, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackgroundLayout.createSequentialGroup()
                        .addComponent(btnSignIn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(87, 87, 87))))
        );
        BackgroundLayout.setVerticalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(SignIn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblWUN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(10, 10, 10)
                .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblWPS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(10, 10, 10)
                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chkSeePassword)
                    .addComponent(chkRememberMe))
                .addGap(30, 30, 30)
                .addComponent(btnSignIn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDHAA, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        System.out.println("Theme: " + (Theme ? "Dark" : "Light"));
        try{ con = connectDB(); }
        catch(Exception e){
            WOptionPaneM("Error establishing a database connection.\nCheck your connection and try again.");
            System.exit(0);
        }
        try{
            localUser = readLocalUser();    //Read value of Local user
            String Username = localUser.getUsername();
            if( SignIn(Username, localUser.getPassword()) ){    AChat("Auto SignIn");   dispose();   }
            else{System.out.println("!!! Auto SignIn Failed. !!!\n\tUser doesn't matches.");}
        }catch(Exception e){System.out.println("!!! Error try to read User from 'LocalUser.dat'. !!!\n\tCan't Auto SignIn. Please SignIn manually.");}
    }//GEN-LAST:event_formWindowOpened

    private void lblSignUpMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSignUpMousePressed
        new SignUp().setVisible(true);
        dispose();
    }//GEN-LAST:event_lblSignUpMousePressed

    private void btnSignInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignInActionPerformed
        String Username = SHA256(txtUsername.getText());
        String Password = SHA256(String.valueOf(txtPassword.getPassword()));
        if(SignIn(Username, Password)){ AChat("SignIn");    dispose();    }
        else{System.out.println("SignIn Failed.");  WOptionPaneM("Invalid username or password. !!!");   }
    }//GEN-LAST:event_btnSignInActionPerformed

    private void chkSeePasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkSeePasswordActionPerformed
        if(chkSeePassword.isSelected()){    txtPassword.setEchoChar((char) 0);  }
        else{                               txtPassword.setEchoChar('*');       }
    }//GEN-LAST:event_chkSeePasswordActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new SignIn().setVisible(true);
        });
    } 
    
    private static User localUser;
    public static Connection con;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private javax.swing.JLabel SignIn;
    private com.k33ptoo.components.KButton btnSignIn;
    private javax.swing.JCheckBox chkRememberMe;
    private javax.swing.JCheckBox chkSeePassword;
    private javax.swing.JLabel lblDHAA;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblSignUp;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JLabel lblWPS;
    private javax.swing.JLabel lblWUN;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
    
    private boolean SignIn(String Username, String Password){
        System.out.println("SignIn with: \n\tUsername: "+Username+"\n\tPassword: "+Password);
        try{    User user = selectUS(Username);
            if(user != null && user.getPassword().equals(Password)){
                if (chkRememberMe.isSelected()) {
                    writeLocalUser(new User(Username, Password, "", "", ""));                 
                    System.out.println("Save User as 'LocalUser.dat'.");
                }
                USERNAME = Username; readAvatar();
                return true;
            }
        }catch(Exception e){    System.out.println("That account does not exist. !!!"); }
        return false;
    }
    private void showTheme() {
        LData.setTheme(Background);  //Data.setTheme(SignIn);
        LData.setTheme(lblUsername); setTheme(txtUsername);
        LData.setTheme(lblPassword); txtPassword.setForeground(   Color.decode(Theme ? "#F0F0F0" : "#2C3338") );
        LData.setTheme(chkRememberMe);
        LData.setTheme(chkSeePassword);
        LData.setTheme(lblDHAA);
    }
    private void WOptionPaneM(String Message){
        LookAndFeel previousLF = UIManager.getLookAndFeel();
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            JOptionPane.showMessageDialog(this, Message, "Message", 2);
            UIManager.setLookAndFeel(previousLF);
        } catch (IllegalAccessException | UnsupportedLookAndFeelException | InstantiationException | ClassNotFoundException e) {System.out.println("!!! Error try to change Look and Feel MessageDialog. !!!");}
    }//Windows Look and Feel of JOptionPane MessageDialog
}