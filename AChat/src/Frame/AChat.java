package Frame;
// Make By Bình An || AnLaVN || KatoVN

import Object.*;
import static Processing.DData.*;
import static Processing.LData.*;
import java.awt.event.*;
import javax.swing.*;

public class AChat extends javax.swing.JFrame {
    
    public AChat() {
        initComponents();
        showTheme();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Background = new javax.swing.JPanel();
        AChatLayer = new javax.swing.JLayeredPane();
        Header = new javax.swing.JPanel();
        lblName = new javax.swing.JLabel();
        Avatar = new com.AnLa.ImgPanel();
        SignOut = new com.AnLa.IcoPanel();
        Edit = new com.AnLa.IcoPanel();
        Toggle = new com.AnLa.IcoPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("AChat");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        Header.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(204, 204, 204)));

        lblName.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

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
            .addGap(0, 50, Short.MAX_VALUE)
        );
        AvatarLayout.setVerticalGroup(
            AvatarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        SignOut.setPic("/Data/Icon/SignOut.png");
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
            .addGap(0, 30, Short.MAX_VALUE)
        );
        SignOutLayout.setVerticalGroup(
            SignOutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        Edit.setPic("/Data/Icon/EditUser.png");
        Edit.setBackground(new java.awt.Color(153, 255, 255));
        Edit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Edit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                EditMousePressed(evt);
            }
        });

        javax.swing.GroupLayout EditLayout = new javax.swing.GroupLayout(Edit);
        Edit.setLayout(EditLayout);
        EditLayout.setHorizontalGroup(
            EditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        EditLayout.setVerticalGroup(
            EditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

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
            .addGap(0, 30, Short.MAX_VALUE)
        );
        ToggleLayout.setVerticalGroup(
            ToggleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout HeaderLayout = new javax.swing.GroupLayout(Header);
        Header.setLayout(HeaderLayout);
        HeaderLayout.setHorizontalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(Avatar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(lblName, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(Toggle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(Edit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(SignOut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );
        HeaderLayout.setVerticalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderLayout.createSequentialGroup()
                .addGroup(HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(HeaderLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(SignOut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Edit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Toggle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(HeaderLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Avatar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(15, 15, 15))
        );

        AChatLayer.setLayer(Header, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout AChatLayerLayout = new javax.swing.GroupLayout(AChatLayer);
        AChatLayer.setLayout(AChatLayerLayout);
        AChatLayerLayout.setHorizontalGroup(
            AChatLayerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        AChatLayerLayout.setVerticalGroup(
            AChatLayerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AChatLayerLayout.createSequentialGroup()
                .addComponent(Header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 639, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout BackgroundLayout = new javax.swing.GroupLayout(Background);
        Background.setLayout(BackgroundLayout);
        BackgroundLayout.setHorizontalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(AChatLayer)
        );
        BackgroundLayout.setVerticalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(AChatLayer)
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

    private void AvatarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AvatarMousePressed
        new Avatar().setVisible(true);
    }//GEN-LAST:event_AvatarMousePressed

    private void SignOutMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SignOutMousePressed
        if(WOptionPaneC(P,"Are you sure you want SignOut ?\nYour Auto SignIn will be deleted.\nAnd you need SignIn manually in the next time.") == JOptionPane.YES_OPTION){
            SignOut();
        }
    }//GEN-LAST:event_SignOutMousePressed

    private void EditMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EditMousePressed
        Edit frame = new Edit();
        frame.setVisible(true);
        frame.addWindowListener(new WindowAdapter() {
            @Override public void windowClosing(WindowEvent e) {
//                AChat("Reload AChat");
//                dispose();
                Avatar.setPic(AVATAR);
            }
        });
    }//GEN-LAST:event_EditMousePressed

    private void ToggleMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ToggleMousePressed
        changeValueTheme();
        Toggle.setPic(Theme ? "/Data/Icon/ToggleOn.png" : "/Data/Icon/ToggleOff.png");
        showTheme();
    }//GEN-LAST:event_ToggleMousePressed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        lblName.setText(User.getName());
    }//GEN-LAST:event_formWindowOpened

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AChat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(() -> {
            new AChat().setVisible(true);
        });
    }
    
    public static final User User = selectUS(USERNAME);
    private final JComponent P = super.getRootPane();   //parent component

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLayeredPane AChatLayer;
    private com.AnLa.ImgPanel Avatar;
    private javax.swing.JPanel Background;
    private com.AnLa.IcoPanel Edit;
    private javax.swing.JPanel Header;
    private com.AnLa.IcoPanel SignOut;
    private com.AnLa.IcoPanel Toggle;
    private javax.swing.JLabel lblName;
    // End of variables declaration//GEN-END:variables

    private void showTheme(){
        setTheme(Background);
        setTheme(Header);
        setTheme(Avatar);   setTheme(lblName);
        setTheme(Toggle);   setTheme(Edit);     setTheme(SignOut);
    }
}