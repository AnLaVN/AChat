package Frame;
// Make By Bình An || AnLaVN || KatoVN

import static Processing.CData.*;
import static Processing.DData.*;
import static Processing.LData.*;
import static Frame.AChat.*;
import ObjectClass.User;
import java.awt.Color;
import java.awt.event.*;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.filechooser.*;

public class Edit extends javax.swing.JFrame {

    public Edit() {
        initComponents();
        try { setIconImage(ImageIO.read(getClass().getResource("/Data/Picture/Logo.png"))); } 
        catch (IOException ex) {System.out.println(ex);}
        showMode();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Background = new javax.swing.JPanel();
        EditLayer = new javax.swing.JLayeredPane();
        Avatar = new com.AnLa.ImgPanel();
        icoImage = new com.AnLa.IcoPanel();
        Scroll = new javax.swing.JScrollPane();
        EditZone = new javax.swing.JPanel();
        lblName = new javax.swing.JLabel();
        Name = new javax.swing.JPanel();
        icoName = new com.AnLa.IcoPanel();
        txtName = new javax.swing.JTextField();
        lblUsername = new javax.swing.JLabel();
        Username = new javax.swing.JPanel();
        icoUsername = new com.AnLa.IcoPanel();
        txtUsername = new javax.swing.JTextField();
        lblEmail = new javax.swing.JLabel();
        Email = new javax.swing.JPanel();
        icoEmail = new com.AnLa.IcoPanel();
        txtEmail = new javax.swing.JTextField();
        lblOPassword = new javax.swing.JLabel();
        OPassword = new javax.swing.JPanel();
        icoOP = new com.AnLa.IcoPanel();
        txtOPassword = new javax.swing.JPasswordField();
        icoSeeOP = new com.AnLa.IcoPanel();
        lblNPassword = new javax.swing.JLabel();
        NPassword = new javax.swing.JPanel();
        icoNP = new com.AnLa.IcoPanel();
        txtNPassword = new javax.swing.JPasswordField();
        icoSeeNP = new com.AnLa.IcoPanel();
        DangerZone = new javax.swing.JPanel();
        icoRemove = new com.AnLa.IcoPanel();
        SignOut = new com.AnLa.IcoPanel();
        lblSignOut = new javax.swing.JLabel();
        lblRemove = new javax.swing.JLabel();
        btnUpdate = new com.k33ptoo.components.KButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle(Lang.getString("Edit")
        );
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        EditLayer.setPreferredSize(new java.awt.Dimension(480, 720));

        Avatar.setPic(AVATAR);
        Avatar.setBackground(new java.awt.Color(153, 153, 255));
        Avatar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Avatar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                AvatarMousePressed(evt);
            }
        });

        javax.swing.GroupLayout AvatarLayout = new javax.swing.GroupLayout(Avatar);
        Avatar.setLayout(AvatarLayout);
        AvatarLayout.setHorizontalGroup(
            AvatarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        AvatarLayout.setVerticalGroup(
            AvatarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        icoImage.setPic(Theme+"Camera.png");
        icoImage.setBackground(new java.awt.Color(153, 255, 255));
        icoImage.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        icoImage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                icoImageMousePressed(evt);
            }
        });

        javax.swing.GroupLayout icoImageLayout = new javax.swing.GroupLayout(icoImage);
        icoImage.setLayout(icoImageLayout);
        icoImageLayout.setHorizontalGroup(
            icoImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        icoImageLayout.setVerticalGroup(
            icoImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        Scroll.setBorder(null);
        Scroll.setVerticalScrollBar(new combo_suggestion.ScrollBarCustom());

        EditZone.setPreferredSize(new java.awt.Dimension(460, 900));

        lblName.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblName.setText(Lang.getString("Name"));

        Name.setBackground(new java.awt.Color(0, 0, 255));
        Name.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(150, 150, 150)));
        Name.setPreferredSize(new java.awt.Dimension(370, 50));

        icoName.setPic(Theme+"NameUser.png");
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
                .addComponent(txtName, javax.swing.GroupLayout.DEFAULT_SIZE, 347, Short.MAX_VALUE))
        );
        NameLayout.setVerticalGroup(
            NameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NameLayout.createSequentialGroup()
                .addGroup(NameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(icoName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5))
        );

        lblUsername.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblUsername.setText(Lang.getString("Username"));

        Username.setBackground(new java.awt.Color(0, 0, 255));
        Username.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(150, 150, 150)));
        Username.setPreferredSize(new java.awt.Dimension(370, 50));

        icoUsername.setPic(Theme+"User.png");
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
        txtUsername.setToolTipText("Enter New Username");
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
                .addComponent(txtUsername, javax.swing.GroupLayout.DEFAULT_SIZE, 347, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        UsernameLayout.setVerticalGroup(
            UsernameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UsernameLayout.createSequentialGroup()
                .addGroup(UsernameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(icoUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5))
        );

        lblEmail.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblEmail.setText(Lang.getString("CEmail"));

        Email.setBackground(new java.awt.Color(0, 0, 255));
        Email.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(150, 150, 150)));
        Email.setPreferredSize(new java.awt.Dimension(370, 50));

        icoEmail.setPic(Theme+"MailEdit.png");
        icoEmail.setBackground(new java.awt.Color(153, 255, 255));

        javax.swing.GroupLayout icoEmailLayout = new javax.swing.GroupLayout(icoEmail);
        icoEmail.setLayout(icoEmailLayout);
        icoEmailLayout.setHorizontalGroup(
            icoEmailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 45, Short.MAX_VALUE)
        );
        icoEmailLayout.setVerticalGroup(
            icoEmailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 45, Short.MAX_VALUE)
        );

        txtEmail.setBackground(new Color(0, 0, 0, 0));
        txtEmail.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtEmail.setToolTipText("Enter Your Email Address");
        txtEmail.setBorder(null);

        javax.swing.GroupLayout EmailLayout = new javax.swing.GroupLayout(Email);
        Email.setLayout(EmailLayout);
        EmailLayout.setHorizontalGroup(
            EmailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EmailLayout.createSequentialGroup()
                .addComponent(icoEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(txtEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 347, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        EmailLayout.setVerticalGroup(
            EmailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EmailLayout.createSequentialGroup()
                .addGroup(EmailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(icoEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5))
        );

        lblOPassword.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblOPassword.setText(Lang.getString("OPass"));

        OPassword.setBackground(new java.awt.Color(0, 0, 255));
        OPassword.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(150, 150, 150)));
        OPassword.setPreferredSize(new java.awt.Dimension(370, 50));

        icoOP.setPic(Theme+"Password.png");
        icoOP.setBackground(new java.awt.Color(153, 255, 255));

        javax.swing.GroupLayout icoOPLayout = new javax.swing.GroupLayout(icoOP);
        icoOP.setLayout(icoOPLayout);
        icoOPLayout.setHorizontalGroup(
            icoOPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 45, Short.MAX_VALUE)
        );
        icoOPLayout.setVerticalGroup(
            icoOPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 45, Short.MAX_VALUE)
        );

        txtOPassword.setBackground(new Color(0, 0, 0, 0));
        txtOPassword.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtOPassword.setToolTipText("Enter Your Old Password");
        txtOPassword.setBorder(null);

        icoSeeOP.setPic(Theme+"Eyen't.png");
        icoSeeOP.setBackground(new java.awt.Color(153, 255, 255));
        icoSeeOP.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        icoSeeOP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                icoSeeOPMousePressed(evt);
            }
        });

        javax.swing.GroupLayout icoSeeOPLayout = new javax.swing.GroupLayout(icoSeeOP);
        icoSeeOP.setLayout(icoSeeOPLayout);
        icoSeeOPLayout.setHorizontalGroup(
            icoSeeOPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 45, Short.MAX_VALUE)
        );
        icoSeeOPLayout.setVerticalGroup(
            icoSeeOPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 45, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout OPasswordLayout = new javax.swing.GroupLayout(OPassword);
        OPassword.setLayout(OPasswordLayout);
        OPasswordLayout.setHorizontalGroup(
            OPasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OPasswordLayout.createSequentialGroup()
                .addComponent(icoOP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(txtOPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 292, Short.MAX_VALUE)
                .addGap(10, 10, 10)
                .addComponent(icoSeeOP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        OPasswordLayout.setVerticalGroup(
            OPasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OPasswordLayout.createSequentialGroup()
                .addGroup(OPasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(icoOP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtOPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(icoSeeOP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5))
        );

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
                .addComponent(txtNPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 292, Short.MAX_VALUE)
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

        DangerZone.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(255, 0, 0)), Lang.getString("Danger"), javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 24), new java.awt.Color(255, 0, 0)));
        DangerZone.setPreferredSize(new java.awt.Dimension(402, 185));

        icoRemove.setPic(Theme+"Remove.png");
        icoRemove.setBackground(new java.awt.Color(153, 255, 255));
        icoRemove.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        icoRemove.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                icoRemoveMousePressed(evt);
            }
        });

        javax.swing.GroupLayout icoRemoveLayout = new javax.swing.GroupLayout(icoRemove);
        icoRemove.setLayout(icoRemoveLayout);
        icoRemoveLayout.setHorizontalGroup(
            icoRemoveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        icoRemoveLayout.setVerticalGroup(
            icoRemoveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        SignOut.setPic(Theme+"SignOut.png");
        SignOut.setBackground(new java.awt.Color(153, 255, 255));
        SignOut.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SignOut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                SignOutMousePressed(evt);
            }
        });

        javax.swing.GroupLayout SignOutLayout = new javax.swing.GroupLayout(SignOut);
        SignOut.setLayout(SignOutLayout);
        SignOutLayout.setHorizontalGroup(
            SignOutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        SignOutLayout.setVerticalGroup(
            SignOutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        lblSignOut.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblSignOut.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblSignOut.setText(Lang.getString("SignOut"));

        lblRemove.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblRemove.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblRemove.setText(Lang.getString("RemoveAcc"));

        javax.swing.GroupLayout DangerZoneLayout = new javax.swing.GroupLayout(DangerZone);
        DangerZone.setLayout(DangerZoneLayout);
        DangerZoneLayout.setHorizontalGroup(
            DangerZoneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DangerZoneLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(DangerZoneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblSignOut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblRemove, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20)
                .addGroup(DangerZoneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(icoRemove, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SignOut, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );
        DangerZoneLayout.setVerticalGroup(
            DangerZoneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DangerZoneLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(DangerZoneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblSignOut, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SignOut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(25, 25, 25)
                .addGroup(DangerZoneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(icoRemove, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblRemove, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout EditZoneLayout = new javax.swing.GroupLayout(EditZone);
        EditZone.setLayout(EditZoneLayout);
        EditZoneLayout.setHorizontalGroup(
            EditZoneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EditZoneLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(EditZoneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(EditZoneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(DangerZone, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(NPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 402, Short.MAX_VALUE)
                        .addComponent(Email, javax.swing.GroupLayout.DEFAULT_SIZE, 402, Short.MAX_VALUE)
                        .addComponent(Username, javax.swing.GroupLayout.DEFAULT_SIZE, 402, Short.MAX_VALUE)
                        .addComponent(Name, javax.swing.GroupLayout.DEFAULT_SIZE, 402, Short.MAX_VALUE)
                        .addComponent(lblName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblOPassword, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(OPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 402, Short.MAX_VALUE)
                        .addComponent(lblUsername, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblEmail, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        EditZoneLayout.setVerticalGroup(
            EditZoneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EditZoneLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(lblUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(Username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(lblEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(Email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(lblOPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(OPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(lblNPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(NPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(DangerZone, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );

        Scroll.setViewportView(EditZone);

        btnUpdate.setText(Lang.getString("Update"));
        btnUpdate.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnUpdate.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnUpdate.setkBorderRadius(20);
        btnUpdate.setkEndColor(new java.awt.Color(0, 188, 212));
        btnUpdate.setkHoverEndColor(new Color(0, 188, 212, 155));
        btnUpdate.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        btnUpdate.setkHoverStartColor(new Color(224, 64, 251, 155));
        btnUpdate.setkSelectedColor(new java.awt.Color(255, 0, 0));
        btnUpdate.setkStartColor(new java.awt.Color(224, 64, 251));
        btnUpdate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        EditLayer.setLayer(Avatar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        EditLayer.setLayer(icoImage, javax.swing.JLayeredPane.DEFAULT_LAYER);
        EditLayer.setLayer(Scroll, javax.swing.JLayeredPane.DEFAULT_LAYER);
        EditLayer.setLayer(btnUpdate, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout EditLayerLayout = new javax.swing.GroupLayout(EditLayer);
        EditLayer.setLayout(EditLayerLayout);
        EditLayerLayout.setHorizontalGroup(
            EditLayerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EditLayerLayout.createSequentialGroup()
                .addGroup(EditLayerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(EditLayerLayout.createSequentialGroup()
                        .addGap(175, 175, 175)
                        .addComponent(Avatar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(icoImage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(EditLayerLayout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EditLayerLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Scroll, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        EditLayerLayout.setVerticalGroup(
            EditLayerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EditLayerLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(EditLayerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Avatar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(icoImage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addComponent(Scroll, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout BackgroundLayout = new javax.swing.GroupLayout(Background);
        Background.setLayout(BackgroundLayout);
        BackgroundLayout.setHorizontalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addComponent(EditLayer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        BackgroundLayout.setVerticalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addComponent(EditLayer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Background, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Background, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void AvatarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AvatarMousePressed
        new Avatar().setVisible(true);
    }//GEN-LAST:event_AvatarMousePressed

    private void icoImageMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icoImageMousePressed
        JFileChooser SelectPic = windowsJFileChooser();
        FileFilter BoLoc = new FileNameExtensionFilter("Images file","jpg", "png");
        SelectPic.setFileFilter(BoLoc);
        int response = SelectPic.showOpenDialog(null);
        if(response == JFileChooser.APPROVE_OPTION){
            new Thread(){@Override public void run() {
                PopupOn("/Data/Gif/FileUpload.gif", Lang.getString("UYA"));
                AVATAR = "src/Data/Picture/"+USERNAME+".png";
                System.out.println("\nAvatars are being uploaded, please wait...");
                String Link = uploadIMG(SelectPic.getSelectedFile().getAbsolutePath());
                PopupOn("/Data/Gif/Down.gif", Lang.getString("DYA"));
                saveAvatar(Link);
                System.out.println("Avatar link file: " + Link);
                String userAvatar = currentUser.getAvatar();
                if(!userAvatar.equals("")){ deleteIMG(userAvatar);  }
                currentUser.setAvatar(Link);   updateUS(currentUser);
                Avatar.setPic(AVATAR);
                PopupOff();
            }}.start();
        }
    }//GEN-LAST:event_icoImageMousePressed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        if(Validate()){
            if(WOptionPaneC(P, Lang.getString("UPACC")+"\n"+Lang.getString("SOUT")) == JOptionPane.YES_OPTION){
                String unform   = txtUsername.getText();                        //username on form
                String pwform   = String.valueOf(txtNPassword.getPassword());   //password on form
                String username = unform.equals("") ? currentUser.getUsername() : SHA256(unform);
                String password = pwform.equals("") ? currentUser.getPassword() : SHA256(pwform);
                String name     = txtName.getText();
                String email    = txtEmail.getText();
                String avatar   = currentUser.getAvatar();
                updateUS(new User(username, password, name, email, avatar));
                writeLocalUser(new User());
                SignOut();
            }
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void icoRemoveMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icoRemoveMousePressed
        if(WOptionPaneC(P, Lang.getString("DEACC1")+"\n"+Lang.getString("UNDO")) == JOptionPane.YES_OPTION){
            String confirmPass = WOptionI(P, Lang.getString("ENTERPW"), JOptionPane.WARNING_MESSAGE);
            if(confirmPass != null && !confirmPass.equals("") && currentUser.getPassword().equals(SHA256(confirmPass))){
                new Thread(){@Override public void run() {
                    popup = new Popup();
                    PopupOn("/Data/Gif/Trash.gif", Lang.getString("DEYA"));
                    String userAva = currentUser.getAvatar();
                    if(!userAva.equals("")){    deleteIMG(userAva); deleAvatar();   }
                    deleteUS(); System.out.println("\nDelete Account Successfully.");
                    PopupOff();
                    WOptionPaneM(P, Lang.getString("DEACC2")+"\n"+Lang.getString("GONE"));
                    SignOut();
                }}.start();
            }else if(confirmPass != null){
                WOptionPaneM(P, Lang.getString("INCOR1")+"\n"+Lang.getString("INCOR2")+"\n"+Lang.getString("INCOR3"));
                SignOut();
            }
        }
    }//GEN-LAST:event_icoRemoveMousePressed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        txtName.setText(currentUser.getName());
        txtEmail.setText(currentUser.getEmail());
        editFrame = this;
    }//GEN-LAST:event_formWindowOpened

    private void icoSeeOPMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icoSeeOPMousePressed
        seeOP = !seeOP;
        if(seeOP)   {   txtOPassword.setEchoChar((char) 0);  icoSeeOP.setPic(Theme+"Eye.png");}
        else        {   txtOPassword.setEchoChar('*');       icoSeeOP.setPic(Theme+"Eyen't.png");}
    }//GEN-LAST:event_icoSeeOPMousePressed

    private void icoSeeNPMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icoSeeNPMousePressed
        seeNP = !seeNP;
        if(seeNP)   {   txtNPassword.setEchoChar((char) 0);  icoSeeNP.setPic(Theme+"Eye.png");}
        else        {   txtNPassword.setEchoChar('*');       icoSeeNP.setPic(Theme+"Eyen't.png");}
    }//GEN-LAST:event_icoSeeNPMousePressed

    private void SignOutMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SignOutMousePressed
        if(WOptionPaneC(P, Lang.getString("SOUT1")+"\n"+Lang.getString("SOUT2")+"\n"+Lang.getString("SOUT3")) == JOptionPane.YES_OPTION){
            SignOut();
        }
    }//GEN-LAST:event_SignOutMousePressed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Edit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(() -> {
            new Edit().setVisible(true);
        });
    }
    
    private final JComponent P = super.getRootPane();   //parent component
    private static boolean seeOP = false, seeNP = false;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.AnLa.ImgPanel Avatar;
    private javax.swing.JPanel Background;
    private javax.swing.JPanel DangerZone;
    private javax.swing.JLayeredPane EditLayer;
    private javax.swing.JPanel EditZone;
    private javax.swing.JPanel Email;
    private javax.swing.JPanel NPassword;
    private javax.swing.JPanel Name;
    private javax.swing.JPanel OPassword;
    private javax.swing.JScrollPane Scroll;
    private com.AnLa.IcoPanel SignOut;
    private javax.swing.JPanel Username;
    private com.k33ptoo.components.KButton btnUpdate;
    private com.AnLa.IcoPanel icoEmail;
    private com.AnLa.IcoPanel icoImage;
    private com.AnLa.IcoPanel icoNP;
    private com.AnLa.IcoPanel icoName;
    private com.AnLa.IcoPanel icoOP;
    private com.AnLa.IcoPanel icoRemove;
    private com.AnLa.IcoPanel icoSeeNP;
    private com.AnLa.IcoPanel icoSeeOP;
    private com.AnLa.IcoPanel icoUsername;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblNPassword;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblOPassword;
    private javax.swing.JLabel lblRemove;
    private javax.swing.JLabel lblSignOut;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JPasswordField txtNPassword;
    private javax.swing.JTextField txtName;
    private javax.swing.JPasswordField txtOPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
    
    private void showMode() {
        setMode(Background);   setMode(Avatar);       setMode(icoImage);     
        setMode(EditZone);     Scroll.getVerticalScrollBar().setBackground(Color.decode(Mode ? "#363B41" : "#FFFFFF"));
        setMode(lblName);      setMode(Name);         setMode(icoName);      setMode(txtName);
        setMode(lblUsername);  setMode(Username);     setMode(icoUsername);  setMode(txtUsername);
        setMode(lblEmail);     setMode(Email);        setMode(icoEmail);     setMode(txtEmail);
        setMode(lblOPassword); setMode(OPassword);    setMode(icoOP);        setMode(icoSeeOP);
        txtOPassword.setForeground(   Color.decode(Mode ? "#F0F0F0" : "#2C3338") );
        setMode(lblNPassword); setMode(NPassword);    setMode(icoNP);        setMode(icoSeeNP);
        setMode(lblNPassword);  txtNPassword.setForeground(   Color.decode(Mode ? "#F0F0F0" : "#2C3338") );
        setMode(DangerZone);   setMode(lblSignOut);   setMode(SignOut);      setMode(lblRemove);    setMode(icoRemove);
    }
    private boolean Validate(){
        icoEmail.setPic(Theme+"MailEdit.png");
        String username = txtUsername.getText();
        String Np       = String.valueOf(txtNPassword.getPassword());
        String Op       = String.valueOf(txtOPassword.getPassword());
        String Ouser    = currentUser.getPassword();
        String name     = txtName.getText();
        String email    = txtEmail.getText();
        if(name.equals("")              ){  showError(P, Lang.getString("NameBL"),  Name,   txtName);   return false; }else{deleError(Name);}
        if(username.equals("")          ){WOptionPaneM(P,Lang.getString("YDE")+Lang.getString("Username")+".\n"+Lang.getString("Username")+" "+Lang.getString("RTS"));}
        try{selectUS(SHA256(username));     showError(P, Lang.getString("UNEX"),    Username, txtUsername);return false; }catch(Exception e){deleError(Username);}
        if(email.equals("")             ){  showError(P, Lang.getString("EmailBL"), Email,  txtEmail);  return false; }else{deleError(Email);}
        if(!email.matches(EMAIL)        ){  showError(P, Lang.getString("IvaEA"),   Email,  txtEmail);  return false; }else{deleError(Email);}
        icoEmail.setPic(Theme+"MailValid.png");
        if(Op.equals("")&&Np.equals("") ){WOptionPaneM(P,Lang.getString("YDE")+Lang.getString("Password")+".\n"+Lang.getString("Password")+" "+Lang.getString("RTS"));}
        else{
            if(Op.equals("")            ){  showError(P, Lang.getString("PWChange"),OPassword,txtOPassword);  return false; }else{deleError(OPassword);}
            if(!Ouser.equals(SHA256(Op))){  showError(P, Lang.getString("OPassM"),  OPassword,txtOPassword);  return false; }else{deleError(OPassword);}
            if(Np.equals("")            ){  showError(P, Lang.getString("NPassBL"), NPassword,txtNPassword);  return false; }else{deleError(NPassword);}
            if(Ouser.equals(SHA256(Np)) ){  showError(P, Lang.getString("NPassS"),  NPassword,txtNPassword);  return false; }else{deleError(NPassword);}
        }
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