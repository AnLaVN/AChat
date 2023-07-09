package Frame;
// Make By Bình An || AnLaVN || KatoVN

import ObjectClass.User;
import static Processing.DData.*;
import static Processing.LData.*;
import java.awt.Color;
import java.awt.event.*;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*;

public class SignIn extends javax.swing.JFrame {

    public SignIn() {
        getLang(UserSetting.getLang());
        initComponents();
        try { setIconImage(ImageIO.read(getClass().getResource("/Data/Picture/Logo.png"))); } 
        catch (IOException ex) {System.out.println(ex);}
        showMode();
        System.out.println("\nLanguages: "+UserSetting.getLang());
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Background = new javax.swing.JPanel();
        SignInLayer = new javax.swing.JLayeredPane();
        SignIn = new javax.swing.JLabel();
        lblUsername = new javax.swing.JLabel();
        lblWUN = new javax.swing.JLabel();
        Username = new javax.swing.JPanel();
        icoUser = new com.AnLa.IcoPanel();
        txtUsername = new javax.swing.JTextField();
        lblPassword = new javax.swing.JLabel();
        lblWPS = new javax.swing.JLabel();
        Password = new javax.swing.JPanel();
        txtPassword = new javax.swing.JPasswordField();
        icoPass = new com.AnLa.IcoPanel();
        SeePass = new com.AnLa.IcoPanel();
        chkRememberMe = new javax.swing.JCheckBox();
        lblSignUp = new javax.swing.JLabel();
        lblDHAA = new javax.swing.JLabel();
        btnSignIn = new com.k33ptoo.components.KButton();
        lblForgotPass = new javax.swing.JLabel();
        Setting = new com.AnLa.IcoPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sign In");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        SignIn.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        SignIn.setForeground(new java.awt.Color(102, 102, 255));
        SignIn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SignIn.setText(Lang.getString("SignIn"));

        lblUsername.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblUsername.setText(Lang.getString("Username"));

        lblWUN.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        lblWUN.setForeground(new java.awt.Color(255, 0, 0));
        lblWUN.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblWUN.setText(Lang.getString("IvaUN"));

        Username.setBackground(new java.awt.Color(0, 0, 255));
        Username.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(150, 150, 150)));

        icoUser.setPic(Theme+"User.png");
        icoUser.setBackground(new java.awt.Color(153, 255, 255));

        javax.swing.GroupLayout icoUserLayout = new javax.swing.GroupLayout(icoUser);
        icoUser.setLayout(icoUserLayout);
        icoUserLayout.setHorizontalGroup(
            icoUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 45, Short.MAX_VALUE)
        );
        icoUserLayout.setVerticalGroup(
            icoUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        txtUsername.setBackground(new Color(0, 0, 0, 0));
        txtUsername.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtUsername.setToolTipText("Enter Your Username");
        txtUsername.setBorder(null);
        txtUsername.addKeyListener( new KeyAdapter() {public void keyTyped(KeyEvent e) {
            char c = e.getKeyChar();
            if (((c < '0') || (c > '9')) && ((c < 'A') || (c > 'Z')) && ((c < 'a') || (c > 'z')) && (c != KeyEvent.VK_BACK_SPACE)) { e.consume();}
            if(txtUsername.getText().matches("[a-zA-Z0-9]{1,}")){ lblWUN.setVisible(false);}
            else{lblWUN.setVisible(true);}
        }});

        javax.swing.GroupLayout UsernameLayout = new javax.swing.GroupLayout(Username);
        Username.setLayout(UsernameLayout);
        UsernameLayout.setHorizontalGroup(
            UsernameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, UsernameLayout.createSequentialGroup()
                .addComponent(icoUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(txtUsername, javax.swing.GroupLayout.DEFAULT_SIZE, 325, Short.MAX_VALUE))
        );
        UsernameLayout.setVerticalGroup(
            UsernameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UsernameLayout.createSequentialGroup()
                .addGroup(UsernameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtUsername, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                    .addComponent(icoUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lblPassword.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblPassword.setText(Lang.getString("Password"));

        lblWPS.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        lblWPS.setForeground(new java.awt.Color(255, 0, 0));
        lblWPS.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblWPS.setText(Lang.getString("IvaPW"));

        Password.setBackground(new java.awt.Color(0, 0, 255));
        Password.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(150, 150, 150)));

        txtPassword.setBackground(new Color(0, 0, 0, 0));
        txtPassword.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtPassword.setToolTipText("Enter Your Password");
        txtPassword.setBorder(null);
        txtPassword.addKeyListener( new KeyAdapter() {public void keyTyped(KeyEvent e) {
            if(String.valueOf(txtPassword.getPassword()).equals("")){lblWPS.setVisible(true);}
            else{lblWPS.setVisible(false);}
        }});

        icoPass.setPic(Theme+"Password.png");
        icoPass.setBackground(new java.awt.Color(153, 255, 255));

        javax.swing.GroupLayout icoPassLayout = new javax.swing.GroupLayout(icoPass);
        icoPass.setLayout(icoPassLayout);
        icoPassLayout.setHorizontalGroup(
            icoPassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 45, Short.MAX_VALUE)
        );
        icoPassLayout.setVerticalGroup(
            icoPassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 45, Short.MAX_VALUE)
        );

        SeePass.setPic(Theme+"Eyen't.png");
        SeePass.setBackground(new java.awt.Color(153, 255, 255));
        SeePass.setToolTipText("Check to see your Password");
        SeePass.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SeePass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                SeePassMousePressed(evt);
            }
        });

        javax.swing.GroupLayout SeePassLayout = new javax.swing.GroupLayout(SeePass);
        SeePass.setLayout(SeePassLayout);
        SeePassLayout.setHorizontalGroup(
            SeePassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 45, Short.MAX_VALUE)
        );
        SeePassLayout.setVerticalGroup(
            SeePassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 45, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout PasswordLayout = new javax.swing.GroupLayout(Password);
        Password.setLayout(PasswordLayout);
        PasswordLayout.setHorizontalGroup(
            PasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PasswordLayout.createSequentialGroup()
                .addComponent(icoPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(txtPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
                .addGap(5, 5, 5)
                .addComponent(SeePass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        PasswordLayout.setVerticalGroup(
            PasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PasswordLayout.createSequentialGroup()
                .addGroup(PasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(icoPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SeePass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        chkRememberMe.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        chkRememberMe.setText(Lang.getString("RM"));
        chkRememberMe.setBorder(null);
        chkRememberMe.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        chkRememberMe.setFocusPainted(false);
        chkRememberMe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Data/Icon/Default/CheckBoxNull.png")));
        chkRememberMe.setPreferredSize(new java.awt.Dimension(180, 35));
        chkRememberMe.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Data/Icon/Default/CheckBox.png")));

        lblSignUp.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        lblSignUp.setForeground(new java.awt.Color(51, 153, 255));
        lblSignUp.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblSignUp.setText(Lang.getString("SignUp"));
        lblSignUp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblSignUp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblSignUpMousePressed(evt);
            }
        });

        lblDHAA.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        lblDHAA.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDHAA.setText(Lang.getString("DHAA"));

        btnSignIn.setText(Lang.getString("SignIn"));
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

        lblForgotPass.setBackground(new Color(0,0,0,0));
        lblForgotPass.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        lblForgotPass.setForeground(new java.awt.Color(51, 153, 255));
        lblForgotPass.setText(Lang.getString("ForgotPW"));
        lblForgotPass.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblForgotPass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblForgotPassMousePressed(evt);
            }
        });

        Setting.setPic(Theme+"Setting.png");
        Setting.setBackground(new java.awt.Color(153, 255, 255));
        Setting.setToolTipText(Lang.getString("Setting")
        );
        Setting.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Setting.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                SettingMousePressed(evt);
            }
        });

        javax.swing.GroupLayout SettingLayout = new javax.swing.GroupLayout(Setting);
        Setting.setLayout(SettingLayout);
        SettingLayout.setHorizontalGroup(
            SettingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        SettingLayout.setVerticalGroup(
            SettingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        SignInLayer.setLayer(SignIn, javax.swing.JLayeredPane.DEFAULT_LAYER);
        SignInLayer.setLayer(lblUsername, javax.swing.JLayeredPane.DEFAULT_LAYER);
        SignInLayer.setLayer(lblWUN, javax.swing.JLayeredPane.DEFAULT_LAYER);
        SignInLayer.setLayer(Username, javax.swing.JLayeredPane.DEFAULT_LAYER);
        SignInLayer.setLayer(lblPassword, javax.swing.JLayeredPane.DEFAULT_LAYER);
        SignInLayer.setLayer(lblWPS, javax.swing.JLayeredPane.DEFAULT_LAYER);
        SignInLayer.setLayer(Password, javax.swing.JLayeredPane.DEFAULT_LAYER);
        SignInLayer.setLayer(chkRememberMe, javax.swing.JLayeredPane.DEFAULT_LAYER);
        SignInLayer.setLayer(lblSignUp, javax.swing.JLayeredPane.DEFAULT_LAYER);
        SignInLayer.setLayer(lblDHAA, javax.swing.JLayeredPane.DEFAULT_LAYER);
        SignInLayer.setLayer(btnSignIn, javax.swing.JLayeredPane.DEFAULT_LAYER);
        SignInLayer.setLayer(lblForgotPass, javax.swing.JLayeredPane.DEFAULT_LAYER);
        SignInLayer.setLayer(Setting, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout SignInLayerLayout = new javax.swing.GroupLayout(SignInLayer);
        SignInLayer.setLayout(SignInLayerLayout);
        SignInLayerLayout.setHorizontalGroup(
            SignInLayerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SignInLayerLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSignIn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(147, 147, 147))
            .addGroup(SignInLayerLayout.createSequentialGroup()
                .addGroup(SignInLayerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(SignInLayerLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(SignInLayerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(SignInLayerLayout.createSequentialGroup()
                                .addGroup(SignInLayerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblUsername, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblPassword, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, 0)
                                .addGroup(SignInLayerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblWUN, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblWPS, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(Password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SignInLayerLayout.createSequentialGroup()
                                .addComponent(chkRememberMe, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50)
                                .addComponent(lblForgotPass, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(SignInLayerLayout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(lblDHAA, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(SignInLayerLayout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(SignIn, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Setting, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        SignInLayerLayout.setVerticalGroup(
            SignInLayerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SignInLayerLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(SignInLayerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(SignIn, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(Setting, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(100, 100, 100)
                .addGroup(SignInLayerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblWUN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(15, 15, 15)
                .addComponent(Username, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(SignInLayerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblWPS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(15, 15, 15)
                .addComponent(Password, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(SignInLayerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(chkRememberMe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblForgotPass, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 110, Short.MAX_VALUE)
                .addComponent(btnSignIn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(SignInLayerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDHAA, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout BackgroundLayout = new javax.swing.GroupLayout(Background);
        Background.setLayout(BackgroundLayout);
        BackgroundLayout.setHorizontalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addComponent(SignInLayer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        BackgroundLayout.setVerticalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addComponent(SignInLayer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        new Thread(){@Override public void run() {
            if(con == null){
                try{PopupOn("/Data/Gif/Load.gif", Lang.getString("CTS"));    connectDB();  PopupOff(); }
                catch(Exception e){    WOptionPaneM(P,"Error establishing a database connection.\nCheck your connection and try again.");   }
            }
            try{
                localUser = readLocalUser();    //Read value of Local user
                String localUsername = localUser.getUsername();
                if (localUsername != null) {
                    if (SignIn(localUsername, localUser.getPassword())) { AChat("Auto SignIn"); dispose();  }
                    else {  System.out.println("\n!   Auto SignIn Failed.   !\n\tUser doesn't matches."); }
                }else {  System.out.println("\n!   Auto SignIn Failed.   !\n\tDoesn't have any Users."); }
            }catch(Exception e){System.out.println("!   Can't read Local User.   !\n\tMaybe 'LocalUser.dat' doesn't exists or contains wrong value.\n\tAuto SignIn Failed. Please SignIn manually.");}
        }}.start();
    }//GEN-LAST:event_formWindowOpened

    private void SeePassMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SeePassMousePressed
        seePass = !seePass;
        if(seePass) {   txtPassword.setEchoChar((char) 0);  SeePass.setPic(Theme+"Eye.png");}
        else        {   txtPassword.setEchoChar('*');       SeePass.setPic(Theme+"Eyen't.png");}
    }//GEN-LAST:event_SeePassMousePressed

    private void lblSignUpMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSignUpMousePressed
        new SignUp().setVisible(true);  dispose();
    }//GEN-LAST:event_lblSignUpMousePressed

    private void btnSignInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignInActionPerformed
        new Thread(){@Override public void run() {
            String username = SHA256(txtUsername.getText());
            String password = SHA256(String.valueOf(txtPassword.getPassword()));
            if(SignIn(username, password)){ AChat("SignIn"); dispose(); }
            else{System.out.println("\nSignIn Failed.");  WOptionPaneM(P,Lang.getString("IvaUP"));   }
        }}.start();
    }//GEN-LAST:event_btnSignInActionPerformed

    private void lblForgotPassMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblForgotPassMousePressed
        new ResetPass().setVisible(true);
        dispose();
    }//GEN-LAST:event_lblForgotPassMousePressed

    private void SettingMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SettingMousePressed
        Settings frame = new Settings();
        frame.setVisible(true);
        frame.addWindowListener(new WindowAdapter() {
            @Override public void windowClosed(WindowEvent e) {
                new SignIn().setVisible(true);
                dispose();
            }
        });
    }//GEN-LAST:event_SettingMousePressed

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
        java.awt.EventQueue.invokeLater(() -> {
            new SignIn().setVisible(true);
        });
    }
    
    private final JComponent P = super.getRootPane();   //parent component
    private static User localUser;
    private static boolean seePass = false;
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private javax.swing.JPanel Password;
    private com.AnLa.IcoPanel SeePass;
    private com.AnLa.IcoPanel Setting;
    private javax.swing.JLabel SignIn;
    private javax.swing.JLayeredPane SignInLayer;
    private javax.swing.JPanel Username;
    private com.k33ptoo.components.KButton btnSignIn;
    private javax.swing.JCheckBox chkRememberMe;
    private com.AnLa.IcoPanel icoPass;
    private com.AnLa.IcoPanel icoUser;
    private javax.swing.JLabel lblDHAA;
    private javax.swing.JLabel lblForgotPass;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblSignUp;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JLabel lblWPS;
    private javax.swing.JLabel lblWUN;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
    
    private boolean SignIn(String Username, String Password){
        System.out.println("\nSignIn with: \n\tUsername: "+Username+"\n\tPassword: "+Password);
        try{    User user = selectUS(Username);
            if(user != null && user.getPassword().equals(Password)){
                if (chkRememberMe.isSelected()) {
                    writeLocalUser(new User(Username, Password, "", "", ""));                 
                    System.out.println("\tSave User as 'LocalUser.dat'.");
                }
                PopupOn("/Data/Gif/Down.gif",Lang.getString("DYI"));
                USERNAME = Username; AVATAR = "src\\Data\\Picture\\"+USERNAME+".png";
                readAvatar();
                PopupOff();
                return true;
            }
        }catch(Exception e){    System.out.println("\tThat account doesn't exist. !"); }
        return false;
    }
    private void showMode() {
        setMode(Background);    setMode(Setting);
        setMode(lblUsername);   setMode(Username);  setMode(icoUser);   setMode(txtUsername);
        setMode(lblPassword);   setMode(Password);  setMode(icoPass);   setMode(SeePass);  txtPassword.setForeground(   Color.decode(Mode ? "#F0F0F0" : "#2C3338") );
        setMode(chkRememberMe);
        setMode(lblDHAA);
    }
    private void PopupOn(String file, String text) {
        popup.setLocationRelativeTo(null);
        popup.icon.setIcon(new javax.swing.ImageIcon(getClass().getResource(file)));
        popup.txtNotifi.setText(text);
        popup.setVisible(true);
    }
    private void PopupOff(){    popup.dispose();    }
}