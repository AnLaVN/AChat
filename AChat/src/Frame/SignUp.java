package Frame;
// Make By Bình An || AnLaVN || KatoVN

import Object.*;
import static Processing.LData.*;
import static Processing.DData.*;
import java.awt.Color;
import java.awt.event.*;
import java.util.regex.*;
import javax.swing.*;

public class SignUp extends javax.swing.JFrame {

    public SignUp() {
        initComponents();
        showTheme();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Background = new javax.swing.JPanel();
        SignUpLayer = new javax.swing.JLayeredPane();
        SignUp = new javax.swing.JLabel();
        Toggle = new com.AnLa.IcoPanel();
        lblName = new javax.swing.JLabel();
        Name = new javax.swing.JPanel();
        icoName = new com.AnLa.IcoPanel();
        txtName = new javax.swing.JTextField();
        lblEmaill = new javax.swing.JLabel();
        lblWE = new javax.swing.JLabel();
        Email = new javax.swing.JPanel();
        icoMail = new com.AnLa.IcoPanel();
        txtEmail = new javax.swing.JTextField();
        lblUsername = new javax.swing.JLabel();
        Username = new javax.swing.JPanel();
        icoUsername = new com.AnLa.IcoPanel();
        txtUsername = new javax.swing.JTextField();
        lblPassword = new javax.swing.JLabel();
        Password = new javax.swing.JPanel();
        icoPassword = new com.AnLa.IcoPanel();
        txtPassword = new javax.swing.JPasswordField();
        SeePass = new com.AnLa.IcoPanel();
        btnSignUp = new com.k33ptoo.components.KButton();
        lblHAA = new javax.swing.JLabel();
        lblSignIn = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sign Up");
        setResizable(false);

        SignUp.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        SignUp.setForeground(new java.awt.Color(102, 102, 255));
        SignUp.setText("Sign Up");

        Toggle.setPic(Theme ? "/Data/Icon/ToggleOn.png" : "/Data/Icon/ToggleOff.png");
        Toggle.setBackground(new java.awt.Color(153, 255, 255));
        Toggle.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Toggle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ToggleMousePressed(evt);
            }
        });

        javax.swing.GroupLayout ToggleLayout = new javax.swing.GroupLayout(Toggle);
        Toggle.setLayout(ToggleLayout);
        ToggleLayout.setHorizontalGroup(
            ToggleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        ToggleLayout.setVerticalGroup(
            ToggleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        lblName.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblName.setText("Your Name");

        Name.setBackground(new java.awt.Color(0, 0, 255));
        Name.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(150, 150, 150)));

        icoName.setPic("/Data/Icon/NameUser.png");
        icoName.setBackground(new java.awt.Color(153, 255, 255));

        javax.swing.GroupLayout icoNameLayout = new javax.swing.GroupLayout(icoName);
        icoName.setLayout(icoNameLayout);
        icoNameLayout.setHorizontalGroup(
            icoNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 45, Short.MAX_VALUE)
        );
        icoNameLayout.setVerticalGroup(
            icoNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 45, Short.MAX_VALUE)
        );

        txtName.setBackground(new Color(0, 0, 0, 0));
        txtName.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtName.setToolTipText("Enter Your Name");
        txtName.setBorder(null);

        javax.swing.GroupLayout NameLayout = new javax.swing.GroupLayout(Name);
        Name.setLayout(NameLayout);
        NameLayout.setHorizontalGroup(
            NameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NameLayout.createSequentialGroup()
                .addComponent(icoName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(txtName, javax.swing.GroupLayout.DEFAULT_SIZE, 370, Short.MAX_VALUE))
        );
        NameLayout.setVerticalGroup(
            NameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NameLayout.createSequentialGroup()
                .addGroup(NameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(icoName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lblEmaill.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblEmaill.setText("Contact Email");

        lblWE.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        lblWE.setForeground(new java.awt.Color(255, 0, 0));
        lblWE.setText("*Invalid Email");

        Email.setBackground(new java.awt.Color(0, 0, 255));
        Email.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(150, 150, 150)));

        icoMail.setPic("/Data/Icon/MailNew.png");
        icoMail.setBackground(new java.awt.Color(153, 255, 255));

        javax.swing.GroupLayout icoMailLayout = new javax.swing.GroupLayout(icoMail);
        icoMail.setLayout(icoMailLayout);
        icoMailLayout.setHorizontalGroup(
            icoMailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 45, Short.MAX_VALUE)
        );
        icoMailLayout.setVerticalGroup(
            icoMailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        txtEmail.setBackground(new Color(0, 0, 0, 0));
        txtEmail.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtEmail.setToolTipText("Enter Your Email Address");
        txtEmail.setBorder(null);
        txtEmail.setName(""); // NOI18N
        txtEmail.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                String email = txtEmail.getText();
                Matcher m = Pattern.compile(EMAIL).matcher(email);
                if (m.find() && !email.equals("")){ lblWE.setVisible(false); }
                else{ lblWE.setVisible(true); }
            }});

            javax.swing.GroupLayout EmailLayout = new javax.swing.GroupLayout(Email);
            Email.setLayout(EmailLayout);
            EmailLayout.setHorizontalGroup(
                EmailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(EmailLayout.createSequentialGroup()
                    .addComponent(icoMail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(10, 10, 10)
                    .addComponent(txtEmail))
            );
            EmailLayout.setVerticalGroup(
                EmailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(EmailLayout.createSequentialGroup()
                    .addGroup(EmailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(icoMail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );

            lblUsername.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
            lblUsername.setText("Username");

            Username.setBackground(new java.awt.Color(0, 0, 255));
            Username.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(150, 150, 150)));

            icoUsername.setPic("/Data/Icon/User.png");
            icoUsername.setBackground(new java.awt.Color(153, 255, 255));

            javax.swing.GroupLayout icoUsernameLayout = new javax.swing.GroupLayout(icoUsername);
            icoUsername.setLayout(icoUsernameLayout);
            icoUsernameLayout.setHorizontalGroup(
                icoUsernameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGap(0, 45, Short.MAX_VALUE)
            );
            icoUsernameLayout.setVerticalGroup(
                icoUsernameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGap(0, 45, Short.MAX_VALUE)
            );

            txtUsername.setBackground(new Color(0, 0, 0, 0));
            txtUsername.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
            txtUsername.setToolTipText("Enter Your Username");
            txtUsername.setBorder(null);
            txtUsername.addKeyListener( new KeyAdapter() {public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (((c < '0') || (c > '9')) && ((c < 'A') || (c > 'Z')) && ((c < 'a') || (c > 'z')) && (c != KeyEvent.VK_BACK_SPACE)) { e.consume();}
            }});

            javax.swing.GroupLayout UsernameLayout = new javax.swing.GroupLayout(Username);
            Username.setLayout(UsernameLayout);
            UsernameLayout.setHorizontalGroup(
                UsernameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(UsernameLayout.createSequentialGroup()
                    .addComponent(icoUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(10, 10, 10)
                    .addComponent(txtUsername))
            );
            UsernameLayout.setVerticalGroup(
                UsernameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(UsernameLayout.createSequentialGroup()
                    .addGroup(UsernameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(icoUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );

            lblPassword.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
            lblPassword.setText("Password");

            Password.setBackground(new java.awt.Color(0, 0, 255));
            Password.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(150, 150, 150)));

            icoPassword.setPic("/Data/Icon/Password.png");
            icoPassword.setBackground(new java.awt.Color(153, 255, 255));

            javax.swing.GroupLayout icoPasswordLayout = new javax.swing.GroupLayout(icoPassword);
            icoPassword.setLayout(icoPasswordLayout);
            icoPasswordLayout.setHorizontalGroup(
                icoPasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGap(0, 45, Short.MAX_VALUE)
            );
            icoPasswordLayout.setVerticalGroup(
                icoPasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGap(0, 45, Short.MAX_VALUE)
            );

            txtPassword.setBackground(new Color(0, 0, 0, 0));
            txtPassword.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
            txtPassword.setToolTipText("Enter Your Password");
            txtPassword.setBorder(null);

            SeePass.setPic("/Data/Icon/Eyen't.png");
            SeePass.setBackground(new java.awt.Color(153, 255, 255));
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
                .addGroup(PasswordLayout.createSequentialGroup()
                    .addComponent(icoPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(10, 10, 10)
                    .addComponent(txtPassword)
                    .addGap(10, 10, 10)
                    .addComponent(SeePass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, 0))
            );
            PasswordLayout.setVerticalGroup(
                PasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PasswordLayout.createSequentialGroup()
                    .addGroup(PasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(icoPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(SeePass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );

            btnSignUp.setText("Sign Up");
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

            lblHAA.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
            lblHAA.setText("Have an account ?");

            lblSignIn.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
            lblSignIn.setForeground(new java.awt.Color(51, 153, 255));
            lblSignIn.setText("Sign In");
            lblSignIn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
            lblSignIn.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mousePressed(java.awt.event.MouseEvent evt) {
                    lblSignInMousePressed(evt);
                }
            });

            SignUpLayer.setLayer(SignUp, javax.swing.JLayeredPane.DEFAULT_LAYER);
            SignUpLayer.setLayer(Toggle, javax.swing.JLayeredPane.DEFAULT_LAYER);
            SignUpLayer.setLayer(lblName, javax.swing.JLayeredPane.DEFAULT_LAYER);
            SignUpLayer.setLayer(Name, javax.swing.JLayeredPane.DEFAULT_LAYER);
            SignUpLayer.setLayer(lblEmaill, javax.swing.JLayeredPane.DEFAULT_LAYER);
            SignUpLayer.setLayer(lblWE, javax.swing.JLayeredPane.DEFAULT_LAYER);
            SignUpLayer.setLayer(Email, javax.swing.JLayeredPane.DEFAULT_LAYER);
            SignUpLayer.setLayer(lblUsername, javax.swing.JLayeredPane.DEFAULT_LAYER);
            SignUpLayer.setLayer(Username, javax.swing.JLayeredPane.DEFAULT_LAYER);
            SignUpLayer.setLayer(lblPassword, javax.swing.JLayeredPane.DEFAULT_LAYER);
            SignUpLayer.setLayer(Password, javax.swing.JLayeredPane.DEFAULT_LAYER);
            SignUpLayer.setLayer(btnSignUp, javax.swing.JLayeredPane.DEFAULT_LAYER);
            SignUpLayer.setLayer(lblHAA, javax.swing.JLayeredPane.DEFAULT_LAYER);
            SignUpLayer.setLayer(lblSignIn, javax.swing.JLayeredPane.DEFAULT_LAYER);

            javax.swing.GroupLayout SignUpLayerLayout = new javax.swing.GroupLayout(SignUpLayer);
            SignUpLayer.setLayout(SignUpLayerLayout);
            SignUpLayerLayout.setHorizontalGroup(
                SignUpLayerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SignUpLayerLayout.createSequentialGroup()
                    .addGap(122, 122, 122)
                    .addComponent(lblHAA, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(lblSignIn, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(122, 122, 122))
                .addGroup(SignUpLayerLayout.createSequentialGroup()
                    .addGroup(SignUpLayerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(SignUpLayerLayout.createSequentialGroup()
                            .addGap(30, 30, 30)
                            .addGroup(SignUpLayerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(SignUpLayerLayout.createSequentialGroup()
                                    .addComponent(Toggle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(89, 89, 89)
                                    .addComponent(SignUp))
                                .addComponent(lblName)
                                .addComponent(lblUsername)
                                .addComponent(lblPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(SignUpLayerLayout.createSequentialGroup()
                                    .addComponent(lblEmaill)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblWE, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Email, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Username, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Password, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(SignUpLayerLayout.createSequentialGroup()
                            .addGap(148, 148, 148)
                            .addComponent(btnSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );
            SignUpLayerLayout.setVerticalGroup(
                SignUpLayerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(SignUpLayerLayout.createSequentialGroup()
                    .addGroup(SignUpLayerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(SignUpLayerLayout.createSequentialGroup()
                            .addGap(20, 20, 20)
                            .addComponent(Toggle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(SignUpLayerLayout.createSequentialGroup()
                            .addGap(30, 30, 30)
                            .addComponent(SignUp, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(30, 30, 30)
                    .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(10, 10, 10)
                    .addComponent(Name, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(20, 20, 20)
                    .addGroup(SignUpLayerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblEmaill, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblWE, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(10, 10, 10)
                    .addComponent(Email, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(20, 20, 20)
                    .addComponent(lblUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(10, 10, 10)
                    .addComponent(Username, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(20, 20, 20)
                    .addComponent(lblPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(10, 10, 10)
                    .addComponent(Password, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 40, Short.MAX_VALUE)
                    .addComponent(btnSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(30, 30, 30)
                    .addGroup(SignUpLayerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblHAA, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblSignIn))
                    .addGap(30, 30, 30))
            );

            javax.swing.GroupLayout BackgroundLayout = new javax.swing.GroupLayout(Background);
            Background.setLayout(BackgroundLayout);
            BackgroundLayout.setHorizontalGroup(
                BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(SignUpLayer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            );
            BackgroundLayout.setVerticalGroup(
                BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(BackgroundLayout.createSequentialGroup()
                    .addComponent(SignUpLayer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void btnSignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignUpActionPerformed
        new Thread(){@Override public void run() {
            if(Validate()){
                String Username = SHA256(txtUsername.getText());
                String Password = SHA256(String.valueOf(txtPassword.getPassword()));
                PopupOn("/Data/Gif/Up.gif", "Uploading your Infomation...");
                insertUS(new User(Username, Password, txtName.getText(), txtEmail.getText(), ""));
                PopupOff();
                if(WOptionPaneC(P,"Sign Up successfully !\nSign In with this account ?") == JOptionPane.YES_OPTION){
                    System.out.println("SignUp Successfully.");
                    USERNAME = Username;    readAvatar();
                    AChat("SignIn from SignUp");
                    dispose();
                }
            }
        }}.start();
    }//GEN-LAST:event_btnSignUpActionPerformed

    private void lblSignInMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSignInMousePressed
        new SignIn().setVisible(true);  dispose();
    }//GEN-LAST:event_lblSignInMousePressed

    private void ToggleMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ToggleMousePressed
        changeValueTheme();
        Toggle.setPic(Theme ? "/Data/Icon/ToggleOn.png" : "/Data/Icon/ToggleOff.png");
        showTheme();
    }//GEN-LAST:event_ToggleMousePressed

    private void SeePassMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SeePassMousePressed
        seePass = !seePass;
        if(seePass) {   txtPassword.setEchoChar((char) 0);  SeePass.setPic("/Data/Icon/Eye.png");}
        else        {   txtPassword.setEchoChar('*');       SeePass.setPic("/Data/Icon/Eyen't.png");}
    }//GEN-LAST:event_SeePassMousePressed

    public static void main(String args[]) {
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
        java.awt.EventQueue.invokeLater(() -> {
            new SignUp().setVisible(true);
        });
    }
    
    private final JComponent P = super.getRootPane();   //parent component
    private static boolean seePass = false;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private javax.swing.JPanel Email;
    private javax.swing.JPanel Name;
    private javax.swing.JPanel Password;
    private com.AnLa.IcoPanel SeePass;
    private javax.swing.JLabel SignUp;
    private javax.swing.JLayeredPane SignUpLayer;
    private com.AnLa.IcoPanel Toggle;
    private javax.swing.JPanel Username;
    private com.k33ptoo.components.KButton btnSignUp;
    private com.AnLa.IcoPanel icoMail;
    private com.AnLa.IcoPanel icoName;
    private com.AnLa.IcoPanel icoPassword;
    private com.AnLa.IcoPanel icoUsername;
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
        setTheme(Background);   setTheme(Toggle);
        setTheme(lblName);      setTheme(Name);     setTheme(icoName);  setTheme(txtName);
        setTheme(lblEmaill);    setTheme(Email);    setTheme(icoMail);  setTheme(txtEmail);
        setTheme(lblUsername);  setTheme(Username); setTheme(icoUsername);setTheme(txtUsername);
        setTheme(lblPassword);  setTheme(Password); setTheme(icoPassword);setTheme(SeePass);
        txtPassword.setForeground(   Color.decode(Theme ? "#F0F0F0" : "#2C3338") );
        setTheme(lblHAA);
    }
    private boolean Validate(){
        String un = txtUsername.getText();
        String pw = String.valueOf(txtPassword.getPassword());
        String name     = txtName.getText();
        String email    = txtEmail.getText();
        if(name.equals("")){        showError(P,"Name cannot be blank. !", Name, txtName);              return false; }else{deleError(Name);    }
        if(email.equals("")){       showError(P,"Email cannot be blank. !!!", Email, txtEmail);         return false; }else{deleError(Email);   }
        icoMail.setPic("/Data/Icon/MailNew.png");
        if(!email.matches(EMAIL)){  showError(P,"Email address is not valid. !",Email, txtEmail);       return false; }else{deleError(Email);   }
        try{selectUSbyMail(email);  showError(P,"Email address already exists. !",Email, txtEmail);     return false; }catch(Exception e){deleError(Email);     }
        icoMail.setPic("/Data/Icon/MailValid.png");
        if(un.equals("")){          showError(P,"Username cannot be blank. !", Username, txtUsername);  return false; }else{deleError(Username);}
        try{selectUS(SHA256(un));   showError(P,"Username is already taken. !",Username, txtUsername);  return false; }catch(Exception e){deleError(Username);  }
        if(pw.equals("")){          showError(P,"Password cannot be blank. !",Password, txtPassword);   return false; }else{deleError(Password);}
        return true;
    }
    private void PopupOn(String file, String text) {
        popup.setLocationRelativeTo(null);
        popup.icon.setIcon(new javax.swing.ImageIcon(getClass().getResource(file)));
        popup.txtNotifi.setText(text);
        popup.setVisible(true);
    }
    private void PopupOff(){    popup.dispose();    }
}