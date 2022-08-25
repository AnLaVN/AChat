package Frame;
// Make By Bình An || AnLaVN || KatoVN

import Object.*;
import static Processing.LData.*;
import static Processing.DData.*;
import static Processing.CData.*;
import static Frame.AChat.*;
import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.*;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;


public class Edit extends javax.swing.JFrame {

    public Edit() {
        initComponents();
        showTheme();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Background = new javax.swing.JPanel();
        Avatar = new ImgPanel(AVATAR, 100, 100);
        Images = new IcoPanel("/Data/Icon/Images.png", 30, 30);
        lblName = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        lblUsername = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        lblEmaill = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        lblOPassword = new javax.swing.JLabel();
        txtOPassword = new javax.swing.JPasswordField();
        lblNPassword = new javax.swing.JLabel();
        txtNPassword = new javax.swing.JPasswordField();
        chkSeePassword = new javax.swing.JCheckBox();
        btnSave = new com.k33ptoo.components.KButton();
        Delete = new IcoPanel("/Data/Icon/Remove.png", 40, 40);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Edit Account Form");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        Background.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

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

        Images.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Images.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ImagesMousePressed(evt);
            }
        });

        javax.swing.GroupLayout ImagesLayout = new javax.swing.GroupLayout(Images);
        Images.setLayout(ImagesLayout);
        ImagesLayout.setHorizontalGroup(
            ImagesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        ImagesLayout.setVerticalGroup(
            ImagesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        lblName.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblName.setText("Your Name");

        txtName.setBackground(new Color(0, 0, 0, 0));
        txtName.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtName.setToolTipText("Enter Your Name");
        txtName.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(150, 150, 150)));

        lblUsername.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblUsername.setText("New Username");

        txtUsername.setBackground(new Color(0, 0, 0, 0));
        txtUsername.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtUsername.setToolTipText("Enter New Username");
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

        lblOPassword.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblOPassword.setText("Old Password");

        txtOPassword.setBackground(new Color(0, 0, 0, 0));
        txtOPassword.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtOPassword.setToolTipText("Enter Your Old Password");
        txtOPassword.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(150, 150, 150)));

        lblNPassword.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblNPassword.setText("New Password");

        txtNPassword.setBackground(new Color(0, 0, 0, 0));
        txtNPassword.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtNPassword.setToolTipText("Enter New Password");
        txtNPassword.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(150, 150, 150)));

        chkSeePassword.setText("See Password ?");
        chkSeePassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkSeePasswordActionPerformed(evt);
            }
        });

        btnSave.setText("Save");
        btnSave.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnSave.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSave.setkBorderRadius(20);
        btnSave.setkEndColor(new java.awt.Color(0, 188, 212));
        btnSave.setkHoverEndColor(new Color(0, 188, 212, 155));
        btnSave.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        btnSave.setkHoverStartColor(new Color(224, 64, 251, 155));
        btnSave.setkSelectedColor(new java.awt.Color(255, 0, 0));
        btnSave.setkStartColor(new java.awt.Color(224, 64, 251));
        btnSave.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        Delete.setToolTipText("Remove Account");
        Delete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Delete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                DeleteMousePressed(evt);
            }
        });

        javax.swing.GroupLayout DeleteLayout = new javax.swing.GroupLayout(Delete);
        Delete.setLayout(DeleteLayout);
        DeleteLayout.setHorizontalGroup(
            DeleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );
        DeleteLayout.setVerticalGroup(
            DeleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout BackgroundLayout = new javax.swing.GroupLayout(Background);
        Background.setLayout(BackgroundLayout);
        BackgroundLayout.setHorizontalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addComponent(lblOPassword)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(Avatar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(Images, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNPassword)
                            .addComponent(txtOPassword)
                            .addComponent(txtEmail, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackgroundLayout.createSequentialGroup()
                                .addComponent(lblNPassword)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(chkSeePassword)
                                .addGap(8, 8, 8))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackgroundLayout.createSequentialGroup()
                                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblName))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblUsername)
                                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(BackgroundLayout.createSequentialGroup()
                                .addComponent(lblEmaill, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(20, 20, 20))
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addComponent(Delete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(125, 125, 125))))
        );
        BackgroundLayout.setVerticalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Images, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Avatar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addComponent(lblEmaill, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(lblOPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(txtOPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chkSeePassword))
                .addGap(0, 0, 0)
                .addComponent(txtNPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Delete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void chkSeePasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkSeePasswordActionPerformed
        if(chkSeePassword.isSelected()){    txtOPassword.setEchoChar((char) 0);  txtNPassword.setEchoChar((char)0); }
        else{                               txtOPassword.setEchoChar('*');       txtNPassword.setEchoChar('*');     }
    }//GEN-LAST:event_chkSeePasswordActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        if(Validate()){
            if(WOptionPaneC("Update your information ?\nYou will be Sign Out. !!!") == JOptionPane.YES_OPTION){
                String unform   = txtUsername.getText();                        //username on form
                String pwform   = String.valueOf(txtNPassword.getPassword());   //password on form
                String Username = unform.equals("") ? User.getUsername() : SHA256(unform);
                String Password = pwform.equals("") ? User.getPassword() : SHA256(pwform);
                String Name     = txtName.getText();
                String Email    = txtEmail.getText();
                String Avatar   = User.getAvatar();
                updateUS(USERNAME, new User(Username, Password, Name, Email, Avatar));
                writeLocalUser(new User());
                System.exit(0);
            }
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void ImagesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ImagesMousePressed
        JFileChooser SelectPic = windowsJFileChooser(new JFileChooser());
        FileFilter BoLoc = new FileNameExtensionFilter("JPEG file","jpg");
        SelectPic.setFileFilter(BoLoc);
        int response = SelectPic.showOpenDialog(null);
        if(response == JFileChooser.APPROVE_OPTION){
            String Link = uploadIMG(SelectPic.getSelectedFile().getAbsolutePath());
            saveAvatar(Link);       AVATAR = "src\\Data\\Picture\\Avatar.png";
            System.out.println("Avatar link file: " + Link);
            User.setAvatar(Link);   updateUS(USERNAME, User);
            WOptionPaneM("Change Avatar Successfully.\nNew Avatar will display after close this form.");
        }
    }//GEN-LAST:event_ImagesMousePressed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        txtName.setText(User.getName());
        txtEmail.setText(User.getEmail());
    }//GEN-LAST:event_formWindowOpened

    private void AvatarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AvatarMousePressed
        new Avatar().setVisible(true);
    }//GEN-LAST:event_AvatarMousePressed

    private void DeleteMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteMousePressed
        if(WOptionPaneC("Are you sure you want delete your account?\nYou can't undo this action") == JOptionPane.YES_OPTION){
            String confirmPass = WOptionI("Enter your Password to confirm deletion.",JOptionPane.WARNING_MESSAGE);
            if(!confirmPass.equals("") && User.getPassword().equals(SHA256(confirmPass))){
                deleteUS(USERNAME);
                System.out.println("Delete Account Successfully.");
                WOptionPaneM("Your account has been deleted.\nWe're so sad when you're gone.");
                System.exit(0);
            }else{
                WOptionPaneM("Incorrect Password. !!!\nBecause you are doing dangerous action.\nFor safety reasons, we will LogOut you.");
                SignOut();
            }
        }
    }//GEN-LAST:event_DeleteMousePressed

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
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Edit().setVisible(true);
            }
        });
    }
    //User user = readUS("67e571ffc1d92b62295a6f15b6f180996179cf967d75d3cfd2d30d11d2f5ce71");

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Avatar;
    private javax.swing.JPanel Background;
    private javax.swing.JPanel Delete;
    private javax.swing.JPanel Images;
    private com.k33ptoo.components.KButton btnSave;
    private javax.swing.JCheckBox chkSeePassword;
    private javax.swing.JLabel lblEmaill;
    private javax.swing.JLabel lblNPassword;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblOPassword;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JPasswordField txtNPassword;
    private javax.swing.JTextField txtName;
    private javax.swing.JPasswordField txtOPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables

    private void showTheme() {
        setTheme(Background);
        setTheme(Avatar);       setTheme(Images);       setTheme(Delete);
        setTheme(lblName);      setTheme(txtName);
        setTheme(lblUsername);  setTheme(txtUsername);
        setTheme(lblEmaill);    setTheme(txtEmail);     setTheme(chkSeePassword);
        setTheme(lblOPassword);  txtOPassword.setForeground(   Color.decode(Theme ? "#F0F0F0" : "#2C3338") );
        setTheme(lblNPassword);  txtNPassword.setForeground(   Color.decode(Theme ? "#F0F0F0" : "#2C3338") );
    }
    private boolean Validate(){
        String Username = txtUsername.getText();
        String Np       = String.valueOf(txtNPassword.getPassword());
        String Op       = String.valueOf(txtOPassword.getPassword());
        String Ouser    = User.getPassword();
        String Name     = txtName.getText();
        String Email    = txtEmail.getText();
        if(Name.equals(""))         {       showError("Name cannot be blank. !!!", txtName);        return false;   }else{deleError(txtName);}
        if(Username.equals(""))     {       WOptionPaneM("You don't enter a new Username.\nUsername will remain the same.");    }
        try{selectUS(SHA256(Username));     showError("Username is already taken. !!!",txtUsername);return false;   }catch(Exception e){deleError(txtUsername);}
        if(Email.equals(""))        {       showError("Email cannot be blank. !!!", txtEmail);      return false;   }else{deleError(txtEmail);}
        if(!Email.matches(EMAIL))   {       showError("Email address is not valid. !!!", txtEmail); return false;   }else{deleError(txtEmail);}
        if(Op.equals("") && Np.equals("")){ WOptionPaneM("You don't enter a new Password.\nPassword will remain the same.");   }
        else{
            if(Op.equals(""))       {       showError("Password cannot be changed without Old Password. !!!", txtOPassword);return false;   }else{deleError(txtOPassword);}
            if(!Ouser.equals(SHA256(Op))) { showError("Old password not match. !!!", txtOPassword);         return false;   }else{deleError(txtOPassword);}
            if(Np.equals(""))       {       showError("New Password cannot be blank. !!!", txtNPassword);   return false;   }else{deleError(txtNPassword);}
            if(Ouser.equals(SHA256(Np)))  { showError("New Password cannot be the same as your current. !!!", txtNPassword );return false;  }else{deleError(txtNPassword);}
        }
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
            JOptionPane.showMessageDialog(this, Message, "Message", 1);
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
    private String WOptionI(String Message, int Option){
        LookAndFeel previousLF = UIManager.getLookAndFeel();
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            String InputDialog = JOptionPane.showInputDialog(this, Message, "Input", Option);
            UIManager.setLookAndFeel(previousLF);
            return InputDialog;
        } catch (IllegalAccessException | UnsupportedLookAndFeelException | InstantiationException | ClassNotFoundException e) {
            System.out.println("!!! Error try to change Look and Feel ConfirmDialog. !!!");
            throw new RuntimeException(e);
        }
    }
}