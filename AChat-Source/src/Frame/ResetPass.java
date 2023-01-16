package Frame;
// Make By Bình An || AnLaVN || KatoVN

import ObjectClass.User;
import static Processing.DData.*;
import static Processing.LData.*;
import java.awt.Color;
import java.awt.event.*;
import java.io.IOException;
import java.util.regex.*;
import javax.swing.*;
import javax.mail.*;
import java.util.Properties;
import javax.imageio.ImageIO;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class ResetPass extends javax.swing.JFrame {
    
    public ResetPass() {
        initComponents();
        try { setIconImage(ImageIO.read(getClass().getResource("/Data/Picture/Logo.png"))); } 
        catch (IOException ex) {System.out.println(ex);}
        showMode();
        lblVerifyCode.setVisible(false);
        VerifyCode.setVisible(false);
        lblNPassword.setVisible(false);
        NPassword.setVisible(false);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Background = new javax.swing.JPanel();
        ResetPassLayer = new javax.swing.JLayeredPane();
        ResetForgotPass = new javax.swing.JLabel();
        lblEmaill = new javax.swing.JLabel();
        lblWE = new javax.swing.JLabel();
        Email = new javax.swing.JPanel();
        icoMail = new com.AnLa.IcoPanel();
        txtEmail = new javax.swing.JTextField();
        btnAction = new com.k33ptoo.components.KButton();
        lblRMP = new javax.swing.JLabel();
        lblSignIn = new javax.swing.JLabel();
        VerifyCode = new javax.swing.JPanel();
        txtCode1 = new javax.swing.JTextField();
        txtCode2 = new javax.swing.JTextField();
        txtCode3 = new javax.swing.JTextField();
        txtCode4 = new javax.swing.JTextField();
        txtCode5 = new javax.swing.JTextField();
        txtCode6 = new javax.swing.JTextField();
        lblVerifyCode = new javax.swing.JLabel();
        lblNPassword = new javax.swing.JLabel();
        NPassword = new javax.swing.JPanel();
        icoNP = new com.AnLa.IcoPanel();
        txtNPassword = new javax.swing.JPasswordField();
        icoSeeNP = new com.AnLa.IcoPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Reset Password");
        setResizable(false);

        ResetForgotPass.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        ResetForgotPass.setForeground(new java.awt.Color(102, 102, 255));
        ResetForgotPass.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ResetForgotPass.setText(Lang.getString("ForgotYPW"));

        lblEmaill.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblEmaill.setText(Lang.getString("EYEmail"));

        lblWE.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        lblWE.setForeground(new java.awt.Color(255, 0, 0));
        lblWE.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblWE.setText(Lang.getString("IvaEM"));

        Email.setBackground(new java.awt.Color(0, 0, 255));
        Email.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(150, 150, 150)));

        icoMail.setPic(Theme+"MailEdit.png");
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
                    .addComponent(txtEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 345, Short.MAX_VALUE))
            );
            EmailLayout.setVerticalGroup(
                EmailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(EmailLayout.createSequentialGroup()
                    .addGroup(EmailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(icoMail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );

            btnAction.setText(Lang.getString("CEAddress"));
            btnAction.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
            btnAction.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
            btnAction.setkBorderRadius(20);
            btnAction.setkEndColor(new java.awt.Color(0, 188, 212));
            btnAction.setkHoverEndColor(new Color(0, 188, 212, 155));
            btnAction.setkHoverForeGround(new java.awt.Color(255, 255, 255));
            btnAction.setkHoverStartColor(new Color(224, 64, 251, 155));
            btnAction.setkSelectedColor(new java.awt.Color(255, 0, 0));
            btnAction.setkStartColor(new java.awt.Color(224, 64, 251));
            btnAction.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
            btnAction.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnActionActionPerformed(evt);
                }
            });

            lblRMP.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
            lblRMP.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            lblRMP.setText(Lang.getString("RMYP"));

            lblSignIn.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
            lblSignIn.setForeground(new java.awt.Color(51, 153, 255));
            lblSignIn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            lblSignIn.setText(Lang.getString("SignIn"));
            lblSignIn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
            lblSignIn.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mousePressed(java.awt.event.MouseEvent evt) {
                    lblSignInMousePressed(evt);
                }
            });

            VerifyCode.setBackground(new java.awt.Color(0, 0, 255));
            VerifyCode.setToolTipText("Enter the code we was send in email.");

            txtCode1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
            txtCode1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
            txtCode1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(51, 102, 255)));
            txtCode1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
            txtCode1.addKeyListener( new KeyAdapter() {public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (((c < '0') || (c > '9') || txtCode1.getText().length() >= 1)) {e.consume();}
                if((c >= '0') && (c <= '9')){txtCode2.requestFocusInWindow();}
            }});

            txtCode2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
            txtCode2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
            txtCode2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(51, 102, 255)));
            txtCode2.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
            txtCode2.addKeyListener( new KeyAdapter() {public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (((c < '0') || (c > '9') || txtCode2.getText().length() >= 1)) {e.consume();}
                if(c == KeyEvent.VK_BACK_SPACE){txtCode1.requestFocusInWindow();}
                if((c >= '0') && (c <= '9')){txtCode3.requestFocusInWindow();}
            }});

            txtCode3.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
            txtCode3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
            txtCode3.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(51, 102, 255)));
            txtCode3.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
            txtCode3.addKeyListener( new KeyAdapter() {public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (((c < '0') || (c > '9') || txtCode3.getText().length() >= 1)) {e.consume();}
                if(c == KeyEvent.VK_BACK_SPACE){txtCode2.requestFocusInWindow();}
                if((c >= '0') && (c <= '9')){txtCode4.requestFocusInWindow();}
            }});

            txtCode4.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
            txtCode4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
            txtCode4.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(51, 102, 255)));
            txtCode4.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
            txtCode4.addKeyListener( new KeyAdapter() {public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (((c < '0') || (c > '9') || txtCode4.getText().length() >= 1)) {e.consume();}
                if(c == KeyEvent.VK_BACK_SPACE){txtCode3.requestFocusInWindow();}
                if((c >= '0') && (c <= '9')){txtCode5.requestFocusInWindow();}
            }});

            txtCode5.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
            txtCode5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
            txtCode5.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(51, 102, 255)));
            txtCode5.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
            txtCode5.addKeyListener( new KeyAdapter() {public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (((c < '0') || (c > '9') || txtCode5.getText().length() >= 1)) {e.consume();}
                if(c == KeyEvent.VK_BACK_SPACE){txtCode4.requestFocusInWindow();}
                if((c >= '0') && (c <= '9')){txtCode6.requestFocusInWindow();}
            }});

            txtCode6.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
            txtCode6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
            txtCode6.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(51, 102, 255)));
            txtCode6.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
            txtCode6.addKeyListener( new KeyAdapter() {public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (((c < '0') || (c > '9') || txtCode6.getText().length() >= 1)) {e.consume();}
                if(c == KeyEvent.VK_BACK_SPACE){txtCode5.requestFocusInWindow();}
            }});

            javax.swing.GroupLayout VerifyCodeLayout = new javax.swing.GroupLayout(VerifyCode);
            VerifyCode.setLayout(VerifyCodeLayout);
            VerifyCodeLayout.setHorizontalGroup(
                VerifyCodeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(VerifyCodeLayout.createSequentialGroup()
                    .addGap(15, 15, 15)
                    .addComponent(txtCode1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(26, 26, 26)
                    .addComponent(txtCode2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(26, 26, 26)
                    .addComponent(txtCode3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(26, 26, 26)
                    .addComponent(txtCode4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(26, 26, 26)
                    .addComponent(txtCode5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(26, 26, 26)
                    .addComponent(txtCode6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(15, 15, 15))
            );
            VerifyCodeLayout.setVerticalGroup(
                VerifyCodeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(VerifyCodeLayout.createSequentialGroup()
                    .addGroup(VerifyCodeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtCode1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtCode2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtCode3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtCode4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtCode5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtCode6, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 5, Short.MAX_VALUE))
            );

            lblVerifyCode.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
            lblVerifyCode.setText(Lang.getString("ECB"));

            lblNPassword.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
            lblNPassword.setText(Lang.getString("NPass"));

            NPassword.setBackground(new java.awt.Color(0, 0, 255));
            NPassword.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(150, 150, 150)));
            NPassword.setPreferredSize(new java.awt.Dimension(370, 50));

            icoNP.setPic(Theme+"Password.png");
            icoNP.setBackground(new java.awt.Color(153, 255, 255));

            javax.swing.GroupLayout icoNPLayout = new javax.swing.GroupLayout(icoNP);
            icoNP.setLayout(icoNPLayout);
            icoNPLayout.setHorizontalGroup(
                icoNPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGap(0, 45, Short.MAX_VALUE)
            );
            icoNPLayout.setVerticalGroup(
                icoNPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGap(0, 45, Short.MAX_VALUE)
            );

            txtNPassword.setBackground(new Color(0, 0, 0, 0));
            txtNPassword.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
            txtNPassword.setToolTipText("Enter New Password");
            txtNPassword.setBorder(null);

            icoSeeNP.setPic(Theme+"Eyen't.png");
            icoSeeNP.setBackground(new java.awt.Color(153, 255, 255));
            icoSeeNP.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
            icoSeeNP.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mousePressed(java.awt.event.MouseEvent evt) {
                    icoSeeNPMousePressed(evt);
                }
            });

            javax.swing.GroupLayout icoSeeNPLayout = new javax.swing.GroupLayout(icoSeeNP);
            icoSeeNP.setLayout(icoSeeNPLayout);
            icoSeeNPLayout.setHorizontalGroup(
                icoSeeNPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGap(0, 45, Short.MAX_VALUE)
            );
            icoSeeNPLayout.setVerticalGroup(
                icoSeeNPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGap(0, 45, Short.MAX_VALUE)
            );

            javax.swing.GroupLayout NPasswordLayout = new javax.swing.GroupLayout(NPassword);
            NPassword.setLayout(NPasswordLayout);
            NPasswordLayout.setHorizontalGroup(
                NPasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(NPasswordLayout.createSequentialGroup()
                    .addComponent(icoNP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(10, 10, 10)
                    .addComponent(txtNPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
                    .addGap(10, 10, 10)
                    .addComponent(icoSeeNP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, 0))
            );
            NPasswordLayout.setVerticalGroup(
                NPasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(NPasswordLayout.createSequentialGroup()
                    .addGroup(NPasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(icoNP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(icoSeeNP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtNPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(5, 5, 5))
            );

            ResetPassLayer.setLayer(ResetForgotPass, javax.swing.JLayeredPane.DEFAULT_LAYER);
            ResetPassLayer.setLayer(lblEmaill, javax.swing.JLayeredPane.DEFAULT_LAYER);
            ResetPassLayer.setLayer(lblWE, javax.swing.JLayeredPane.DEFAULT_LAYER);
            ResetPassLayer.setLayer(Email, javax.swing.JLayeredPane.DEFAULT_LAYER);
            ResetPassLayer.setLayer(btnAction, javax.swing.JLayeredPane.DEFAULT_LAYER);
            ResetPassLayer.setLayer(lblRMP, javax.swing.JLayeredPane.DEFAULT_LAYER);
            ResetPassLayer.setLayer(lblSignIn, javax.swing.JLayeredPane.DEFAULT_LAYER);
            ResetPassLayer.setLayer(VerifyCode, javax.swing.JLayeredPane.DEFAULT_LAYER);
            ResetPassLayer.setLayer(lblVerifyCode, javax.swing.JLayeredPane.DEFAULT_LAYER);
            ResetPassLayer.setLayer(lblNPassword, javax.swing.JLayeredPane.DEFAULT_LAYER);
            ResetPassLayer.setLayer(NPassword, javax.swing.JLayeredPane.DEFAULT_LAYER);

            javax.swing.GroupLayout ResetPassLayerLayout = new javax.swing.GroupLayout(ResetPassLayer);
            ResetPassLayer.setLayout(ResetPassLayerLayout);
            ResetPassLayerLayout.setHorizontalGroup(
                ResetPassLayerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(ResetPassLayerLayout.createSequentialGroup()
                    .addGap(10, 10, 10)
                    .addComponent(ResetForgotPass, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(ResetPassLayerLayout.createSequentialGroup()
                    .addGap(70, 70, 70)
                    .addComponent(lblRMP, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(lblSignIn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(ResetPassLayerLayout.createSequentialGroup()
                    .addGap(40, 40, 40)
                    .addGroup(ResetPassLayerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(VerifyCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblVerifyCode)
                        .addComponent(lblNPassword)
                        .addComponent(NPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(ResetPassLayerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(ResetPassLayerLayout.createSequentialGroup()
                                .addComponent(lblEmaill, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblWE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(Email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ResetPassLayerLayout.createSequentialGroup()
                    .addGap(90, 90, 90)
                    .addComponent(btnAction, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(90, 90, 90))
            );
            ResetPassLayerLayout.setVerticalGroup(
                ResetPassLayerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(ResetPassLayerLayout.createSequentialGroup()
                    .addGap(50, 50, 50)
                    .addComponent(ResetForgotPass, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(80, 80, 80)
                    .addGroup(ResetPassLayerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblEmaill, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblWE, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(20, 20, 20)
                    .addComponent(Email, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(30, 30, 30)
                    .addComponent(lblVerifyCode, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(20, 20, 20)
                    .addComponent(VerifyCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(30, 30, 30)
                    .addComponent(lblNPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(20, 20, 20)
                    .addComponent(NPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                    .addComponent(btnAction, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(30, 30, 30)
                    .addGroup(ResetPassLayerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblRMP, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblSignIn))
                    .addGap(30, 30, 30))
            );

            javax.swing.GroupLayout BackgroundLayout = new javax.swing.GroupLayout(Background);
            Background.setLayout(BackgroundLayout);
            BackgroundLayout.setHorizontalGroup(
                BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(ResetPassLayer)
            );
            BackgroundLayout.setVerticalGroup(
                BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(ResetPassLayer)
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

    private void btnActionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActionActionPerformed
        switch (Procedure) {
            case 0:
                if(VerifyEmail()){
                    VerifyCodeNumber = (int) Math.round(Math.random()*999999);
                    SendVerifyCode(EmailAddress, ResetUser.getName(), VerifyCodeNumber);
                    Procedure = 1;}
                break;
            case 1:
                if(VerifyEmail() && VerifyCode()){ Procedure = 2; }
                break;
            case 2:
                if(VerifyEmail() && VerifyCode() && VerifyPass()){ 
                    updatePWUS(UsernameReset, NewPassword); 
                    System.out.println("\nChanged Password: \n\tUsername: "+UsernameReset+"\n\tPassword: "+NewPassword);
                    WOptionPaneM(P, "Your password has been changed.");
                    lblSignInMousePressed(null);}
                break;
        }
    }//GEN-LAST:event_btnActionActionPerformed

    private void lblSignInMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSignInMousePressed
        new SignIn().setVisible(true);  dispose();
    }//GEN-LAST:event_lblSignInMousePressed

    private void icoSeeNPMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icoSeeNPMousePressed
        seeNP = !seeNP;
        if(seeNP)   {   txtNPassword.setEchoChar((char) 0);  icoSeeNP.setPic(Theme+"Eye.png");}
        else        {   txtNPassword.setEchoChar('*');       icoSeeNP.setPic(Theme+"Eyen't.png");}
    }//GEN-LAST:event_icoSeeNPMousePressed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ResetPass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(() -> {
            new ResetPass().setVisible(true);
        });
    }
    
    private final JComponent P = super.getRootPane();   //parent component
    private static boolean seeNP = false;
    private static String EmailAddress = "", UsernameReset, NewPassword;
    private static User ResetUser;
    private static int Procedure = 0, VerifyCodeNumber = 000000;
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private javax.swing.JPanel Email;
    private javax.swing.JPanel NPassword;
    private javax.swing.JLabel ResetForgotPass;
    private javax.swing.JLayeredPane ResetPassLayer;
    private javax.swing.JPanel VerifyCode;
    private com.k33ptoo.components.KButton btnAction;
    private com.AnLa.IcoPanel icoMail;
    private com.AnLa.IcoPanel icoNP;
    private com.AnLa.IcoPanel icoSeeNP;
    private javax.swing.JLabel lblEmaill;
    private javax.swing.JLabel lblNPassword;
    private javax.swing.JLabel lblRMP;
    private javax.swing.JLabel lblSignIn;
    private javax.swing.JLabel lblVerifyCode;
    private javax.swing.JLabel lblWE;
    private javax.swing.JTextField txtCode1;
    private javax.swing.JTextField txtCode2;
    private javax.swing.JTextField txtCode3;
    private javax.swing.JTextField txtCode4;
    private javax.swing.JTextField txtCode5;
    private javax.swing.JTextField txtCode6;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JPasswordField txtNPassword;
    // End of variables declaration//GEN-END:variables

    private void showMode(){
        setMode(Background);   setMode(lblRMP);
        setMode(Email);        setMode(lblEmaill);    setMode(txtEmail); setMode(icoMail);
        setMode(VerifyCode);   setMode(lblVerifyCode);for(int i = 0 ; i < 6 ; i++){setMode((JComponent)VerifyCode.getComponent(i));}
        setMode(NPassword);    setMode(lblNPassword); setMode(txtNPassword); setMode(icoNP);    setMode(icoSeeNP);
    }
    private boolean VerifyEmail(){
        icoMail.setPic(Theme+"MailEdit.png");
        btnAction.setText(Lang.getString("CEAddress"));
        EmailAddress = txtEmail.getText();
        if(!EmailAddress.matches(EMAIL)){  showError(P,Lang.getString("IvaEA"),Email, txtEmail);   return false;}else{deleError(Email); }
        try{
            ResetUser = selectUSbyMail(EmailAddress); 
            UsernameReset=ResetUser.getUsername();  
            deleError(Email); }
        catch(Exception e){showError(P, Lang.getString("EmailDH"),Email,txtEmail); return false;}
        icoMail.setPic(Theme+"MailValid.png");
        lblVerifyCode.setVisible(true);
        VerifyCode.setVisible(true);
        btnAction.setText(Lang.getString("VerifyCode"));
        return true;
    }
    private boolean VerifyCode(){
        btnAction.setText(Lang.getString("VerifyCode"));
        String code = "";
        for(int i = 0 ; i < 6 ; i++){ code += ((JTextField)VerifyCode.getComponent(i)).getText(); }
        if(code.equals("")){
            WOptionPaneM(P, Lang.getString("EVC"));
            return false;
        }
        int verifycode = Integer.valueOf(code);
        if(verifycode != VerifyCodeNumber ){
            WOptionPaneM(P, Lang.getString("VDM"));
            for(int i = 0 ; i < 6 ; i++){ ((JTextField)VerifyCode.getComponent(i)).setText(""); }
            return false;}
        lblNPassword.setVisible(true);
        NPassword.setVisible(true);
        btnAction.setText(Lang.getString("RMP"));
        return true;
    }
    private boolean VerifyPass(){
        String NP = String.valueOf(txtNPassword.getPassword());// New Password
        String HashNP = SHA256(NP);
        if(NP.equals("")){
            WOptionPaneM(P, Lang.getString("NPassBL"));
            return false; }
        if(HashNP.equals(ResetUser.getPassword())){
            WOptionPaneM(P, Lang.getString("NPassS"));
            return false; }
        NewPassword = HashNP;
        return true;
    }
    private void SendVerifyCode(String UserEmail, String Name, int VerifyCode){
        new Thread(){@Override public void run() {
            PopupOn("/Data/Gif/Email.gif",Lang.getString("SUC"));
            try{
                Properties p = new Properties();
                p.put("mail.smtp.auth", "true");
                p.put("mail.smtp.starttls.enable", "true");
                p.put("mail.smtp.host", "smtp.gmail.com"); 
                p.put("mail.smtp.port", 587);

                final String Email= "[This content has been censored by AnLaVN owner.]", Pass = "[This content has been censored by AnLaVN owner.]";

                Session s = Session.getInstance(p, new javax.mail.Authenticator() {
                    @Override protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(Email, Pass); }
                    });

                String from = "[This content has been censored by AnLaVN owner.]", to = UserEmail;
                String html = String.valueOf(readData("src/Data/AppData/VerifyCodeTemplate.dat"));
                String TieuDe = Lang.getString("YVC"), NoiDung = html.replaceAll("Name", Name).replaceAll("VerifyCode", String.valueOf(VerifyCode));

                Message msg = new MimeMessage(s);
                msg.setFrom(new InternetAddress(from));
                msg.setRecipients(Message.RecipientType.TO, InternetAddress.parse(to));
                msg.setSubject(TieuDe);
                msg.setContent(NoiDung, "text/html");
                Transport.send(msg);
                PopupOff();
            } catch (MessagingException ex) { ex.printStackTrace(); }
        }}.start();
    }
    private void PopupOn(String file, String text) {
        popup.setLocationRelativeTo(null);
        popup.icon.setIcon(new javax.swing.ImageIcon(getClass().getResource(file)));
        popup.txtNotifi.setText(text);
        popup.setVisible(true);
    }
    private void PopupOff(){    popup.dispose();    }
}