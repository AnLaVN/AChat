package Frame;
// Make By Bình An || AnLaVN || KatoVN

import Class.*;
import static Processing.DData.*;
import static Processing.LData.*;
import java.awt.Color;
import java.awt.Rectangle;
import java.awt.event.*;
import java.io.*;
import java.net.*;
import javax.swing.*;
import org.netbeans.lib.awtextra.AbsoluteConstraints;

public class AChat extends javax.swing.JFrame {
    
    public AChat() {
        initComponents();
        showTheme();
        Scroll.setVisible(false);
        ChatBoxLayer.setVisible(false);
        ButtonLayer.setVisible(true);
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
        Scroll = new javax.swing.JScrollPane();
        Chat = new javax.swing.JPanel();
        ChatBoxLayer = new javax.swing.JLayeredPane();
        txtChat = new javax.swing.JTextField();
        icon = new javax.swing.JPanel();
        ButtonLayer = new javax.swing.JLayeredPane();
        txtLabel = new javax.swing.JLabel();
        btnStart = new com.k33ptoo.components.KButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("AChat");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
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
                .addComponent(lblName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

        Scroll.setBorder(null);
        Scroll.setHorizontalScrollBar(null);
        Scroll.setVerticalScrollBar(new combo_suggestion.ScrollBarCustom());

        Chat.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        Scroll.setViewportView(Chat);

        txtChat.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtChat.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtChat.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(150, 150, 150)));
        txtChat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtChatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout iconLayout = new javax.swing.GroupLayout(icon);
        icon.setLayout(iconLayout);
        iconLayout.setHorizontalGroup(
            iconLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        iconLayout.setVerticalGroup(
            iconLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        ChatBoxLayer.setLayer(txtChat, javax.swing.JLayeredPane.DEFAULT_LAYER);
        ChatBoxLayer.setLayer(icon, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout ChatBoxLayerLayout = new javax.swing.GroupLayout(ChatBoxLayer);
        ChatBoxLayer.setLayout(ChatBoxLayerLayout);
        ChatBoxLayerLayout.setHorizontalGroup(
            ChatBoxLayerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ChatBoxLayerLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(txtChat, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(icon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        ChatBoxLayerLayout.setVerticalGroup(
            ChatBoxLayerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ChatBoxLayerLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(ChatBoxLayerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(icon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtChat, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );

        txtLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtLabel.setText("Click the button below to start a new chat !");

        btnStart.setText("Start");
        btnStart.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnStart.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnStart.setkBorderRadius(20);
        btnStart.setkEndColor(new java.awt.Color(0, 188, 212));
        btnStart.setkHoverEndColor(new Color(0, 188, 212, 155));
        btnStart.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        btnStart.setkHoverStartColor(new Color(224, 64, 251, 155));
        btnStart.setkSelectedColor(new java.awt.Color(255, 0, 0));
        btnStart.setkStartColor(new java.awt.Color(224, 64, 251));
        btnStart.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStartActionPerformed(evt);
            }
        });

        ButtonLayer.setLayer(txtLabel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        ButtonLayer.setLayer(btnStart, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout ButtonLayerLayout = new javax.swing.GroupLayout(ButtonLayer);
        ButtonLayer.setLayout(ButtonLayerLayout);
        ButtonLayerLayout.setHorizontalGroup(
            ButtonLayerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ButtonLayerLayout.createSequentialGroup()
                .addGap(148, 148, 148)
                .addComponent(btnStart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(ButtonLayerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 468, Short.MAX_VALUE)
                .addContainerGap())
        );
        ButtonLayerLayout.setVerticalGroup(
            ButtonLayerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ButtonLayerLayout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addComponent(txtLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnStart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        AChatLayer.setLayer(Header, javax.swing.JLayeredPane.DEFAULT_LAYER);
        AChatLayer.setLayer(Scroll, javax.swing.JLayeredPane.DEFAULT_LAYER);
        AChatLayer.setLayer(ChatBoxLayer, javax.swing.JLayeredPane.DEFAULT_LAYER);
        AChatLayer.setLayer(ButtonLayer, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout AChatLayerLayout = new javax.swing.GroupLayout(AChatLayer);
        AChatLayer.setLayout(AChatLayerLayout);
        AChatLayerLayout.setHorizontalGroup(
            AChatLayerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Scroll)
            .addComponent(ChatBoxLayer)
            .addGroup(AChatLayerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(ButtonLayer, javax.swing.GroupLayout.Alignment.TRAILING))
        );
        AChatLayerLayout.setVerticalGroup(
            AChatLayerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AChatLayerLayout.createSequentialGroup()
                .addComponent(Header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Scroll, javax.swing.GroupLayout.PREFERRED_SIZE, 517, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ChatBoxLayer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(AChatLayerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AChatLayerLayout.createSequentialGroup()
                    .addGap(0, 610, Short.MAX_VALUE)
                    .addComponent(ButtonLayer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
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

    private void btnStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStartActionPerformed
        Scroll.setVisible(true);
        Chat.removeAll();
        preHeight = 0; width = 0; line = 0; X = 0; Y = 0;
        ButtonLayer.setVisible(false);
        ChatBoxLayer.setVisible(true);
        validate();
        Chat.repaint();
        
        if(selectID(PortID)){
            System.out.println("Start with role: Client");
            try {
                Socket soc = new Socket("127.0.0.1",PortID);
                ps = new PrintStream(soc.getOutputStream());
                
                Thread th = new Thread(new ChatThread(soc){
                    @Override public void run() {
                        while (true) {
                            try {
                                String s = dis.readLine();
                                byte[] arr = s.getBytes("ISO-8859-1");
                                s = new String(arr, "UTF-8");
                                addLeftBox(s);
                            } catch (IOException ex) { ChatOut("Stranger has exited the chat !"); }
                        }
                    }});
                th.start();
            } catch (IOException ex) {  ex.printStackTrace(); }
        }
        else{
            insertID(PortID);
            System.out.println("Start with role: Server");
            try {            
                ServerSocket sv = new ServerSocket(PortID);
                Socket soc = sv.accept();
                ps = new PrintStream(soc.getOutputStream());
                
                Thread th = new Thread(new ChatThread(soc){
                    @Override public void run() {
                        while (true) {
                            try {
                                String s = dis.readLine();
                                byte[] arr = s.getBytes("ISO-8859-1");
                                s = new String(arr, "UTF-8");
                                addLeftBox(s);
                            } catch (IOException ex) { ChatOut("Stranger has exited the chat !"); }
                        }
                    }});
                th.start();
            } catch (IOException ex) {  ex.printStackTrace(); }
        }
    }//GEN-LAST:event_btnStartActionPerformed

    private void txtChatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtChatActionPerformed
       Chat();
    }//GEN-LAST:event_txtChatActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        deleteID(PortID);
    }//GEN-LAST:event_formWindowClosing

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
    
    private int PortID = 1234;
    public static final User User = selectUS(USERNAME);
    private final JComponent P = super.getRootPane();   //parent component
    private int preHeight = 0, width, line, X, Y;
    static PrintStream ps;
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLayeredPane AChatLayer;
    private com.AnLa.ImgPanel Avatar;
    private javax.swing.JPanel Background;
    private javax.swing.JLayeredPane ButtonLayer;
    private javax.swing.JPanel Chat;
    private javax.swing.JLayeredPane ChatBoxLayer;
    private com.AnLa.IcoPanel Edit;
    private javax.swing.JPanel Header;
    private javax.swing.JScrollPane Scroll;
    private com.AnLa.IcoPanel SignOut;
    private com.AnLa.IcoPanel Toggle;
    private com.k33ptoo.components.KButton btnStart;
    private javax.swing.JPanel icon;
    private javax.swing.JLabel lblName;
    private javax.swing.JTextField txtChat;
    private javax.swing.JLabel txtLabel;
    // End of variables declaration//GEN-END:variables

    private void showTheme(){
        setTheme(Background);
        setTheme(Header);   setTheme(Avatar);   setTheme(lblName);
        setTheme(Toggle);   setTheme(Edit);     setTheme(SignOut);
        setTheme(txtLabel);     setTheme(txtChat);
        setTheme(Chat);     Scroll.getVerticalScrollBar().setBackground(Color.decode(Theme ? "#363B41" : "#FFFFFF"));
    }
    private void Chat(){
        String chat = txtChat.getText();
        ps.println(chat);
        addRightBox(chat);
        txtChat.setText("");
    }
    private void ChatOut(String text){
        txtLabel.setText(text);
        ChatBoxLayer.setVisible(false);
        ButtonLayer.setVisible(true);
    }
    public void addRightBox(String text)   {
        com.k33ptoo.components.KGradientPanel cbox = new com.k33ptoo.components.KGradientPanel();
        javax.swing.JTextArea txt = new javax.swing.JTextArea();
        txt.setText(text);
        
        int num = 0;
        for(int i = 0; i < text.length() ; i++){ if(text.charAt(i) == 'w' || text.charAt(i) == 'm'){num++;} }
        width = text.length()*8+(text.matches("[A-Z]{1,}") ? 4*text.length() : (text.contains("m") || text.contains("w") ? 5+5*num : 5));
        line = width < 380 ? 1 : (width/380);
        X = width < 380 ? 380 - width + 50 : 50;
        Y = Y + preHeight + 20;
        preHeight = (line*22) + (line > 1 ? 20 : 0);
        
        cbox.setkBorderRadius(20);
        cbox.setkEndColor(new java.awt.Color(241, 135, 251));
        cbox.setkGradientFocus(180);
        cbox.setkStartColor(new java.awt.Color(67, 156, 251));
        cbox.setBackground(new Color(0,0,0,0));

        txt.setBackground(new Color(0,0,0,0));
        txt.setColumns(20);
        txt.setFont(new java.awt.Font("Tahoma", 0, 16));
        txt.setLineWrap(true);
        txt.setRows(1000);
        txt.setWrapStyleWord(true);
        txt.setBorder(null);
        txt.setEditable(false);
        
        javax.swing.GroupLayout cboxLayout = new javax.swing.GroupLayout(cbox);
        cbox.setLayout(cboxLayout);
        cboxLayout.setHorizontalGroup(
            cboxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cboxLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txt, javax.swing.GroupLayout.DEFAULT_SIZE, width < 380 ? width : 380, Short.MAX_VALUE)
                .addContainerGap())
        );
        cboxLayout.setVerticalGroup(
            cboxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cboxLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txt, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
                .addContainerGap())
        );
        setLocationRelativeTo(null);
        Chat.add(cbox, new AbsoluteConstraints(X, Y, -1, -1));
        Rectangle aRect = new Rectangle();
        aRect.y = Y + 50;
        Chat.scrollRectToVisible(aRect);
        validate();
        repaint();
    }
    public void addLeftBox(String text)    {
        com.k33ptoo.components.KGradientPanel cbox = new com.k33ptoo.components.KGradientPanel();
        javax.swing.JTextArea txt = new javax.swing.JTextArea();
        txt.setText(text);
        int num = 0;
        for(int i = 0; i < text.length() ; i++){ if(text.charAt(i) == 'w' || text.charAt(i) == 'm'){num++;} }
        width = text.length()*8+(text.matches("[A-Z]{1,}") ? 4*text.length() : (text.contains("m") || text.contains("w") ? 5+5*num : 5));
        line = width < 380 ? 1 : (width/380);
        X = 20;
        Y = Y + preHeight + 20;
        preHeight = (line*22) + (line > 1 ? 20 : 0);
        
        cbox.setkBorderRadius(20);
        cbox.setkEndColor(new java.awt.Color(150, 198, 234));
        cbox.setkGradientFocus(200);
        cbox.setkStartColor(new java.awt.Color(181, 151, 246));
        cbox.setBackground(new Color(0,0,0,0));
        
        txt.setBackground(new Color(0,0,0,0));
        txt.setColumns(20);
        txt.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txt.setLineWrap(true);
        txt.setRows(1000);
        txt.setWrapStyleWord(true);
        txt.setBorder(null);
        txt.setEditable(false);

        javax.swing.GroupLayout cboxLayout = new javax.swing.GroupLayout(cbox);
        cbox.setLayout(cboxLayout);
        cboxLayout.setHorizontalGroup(
            cboxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cboxLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txt, javax.swing.GroupLayout.DEFAULT_SIZE, width < 380 ? width : 380, Short.MAX_VALUE)
                .addContainerGap())
        );
        cboxLayout.setVerticalGroup(
            cboxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cboxLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txt, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
                .addContainerGap())
        );
        setLocationRelativeTo(null);
        Chat.add(cbox, new AbsoluteConstraints(X, Y, -1, -1));
        Rectangle aRect = new Rectangle();
        aRect.y = Y + 50;
        Chat.scrollRectToVisible(aRect);
        validate();
        repaint();
    }
}

abstract class ChatThread implements Runnable {
    InputStream in;
    BufferedInputStream bi;
    DataInputStream dis;
    public ChatThread(Socket client) {
        try {
            in = client.getInputStream();
            bi = new BufferedInputStream(in);
            dis = new DataInputStream(bi);
        } catch (IOException e) {   System.out.println("!!! Error try to create Chat Thread. !!!");}
    }
}