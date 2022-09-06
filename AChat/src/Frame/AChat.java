package Frame;
// Make By Bình An || AnLaVN || KatoVN

import ObjectClass.User;
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
        ChatOut("Click the button below to start a new chat !");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Background = new javax.swing.JPanel();
        AChatLayer = new javax.swing.JLayeredPane();
        Header = new javax.swing.JPanel();
        lblName = new javax.swing.JLabel();
        Avatar = new com.AnLa.ImgPanel();
        Edit = new com.AnLa.IcoPanel();
        Toggle = new com.AnLa.IcoPanel();
        icoCancel = new com.AnLa.IcoPanel();
        Scroll = new javax.swing.JScrollPane();
        Chat = new javax.swing.JPanel();
        ChatBoxLayer = new javax.swing.JLayeredPane();
        txtChat = new javax.swing.JTextField();
        iconLike = new com.AnLa.IcoPanel();
        ButtonLayer = new javax.swing.JLayeredPane();
        lblStart = new javax.swing.JLabel();
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
        Avatar.setToolTipText("View Avatar");
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

        Edit.setPic("/Data/Icon/EditUser.png");
        Edit.setBackground(new java.awt.Color(153, 255, 255));
        Edit.setToolTipText("Edit Account");
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
        Toggle.setToolTipText("Change Theme");
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

        icoCancel.setPic("/Data/Icon/Cancel.png");
        icoCancel.setBackground(new java.awt.Color(153, 255, 255));
        icoCancel.setToolTipText("Cancel Conversation");
        icoCancel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        icoCancel.setPreferredSize(new java.awt.Dimension(30, 30));
        icoCancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                icoCancelMousePressed(evt);
            }
        });

        javax.swing.GroupLayout icoCancelLayout = new javax.swing.GroupLayout(icoCancel);
        icoCancel.setLayout(icoCancelLayout);
        icoCancelLayout.setHorizontalGroup(
            icoCancelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        icoCancelLayout.setVerticalGroup(
            icoCancelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout HeaderLayout = new javax.swing.GroupLayout(Header);
        Header.setLayout(HeaderLayout);
        HeaderLayout.setHorizontalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(Avatar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(lblName, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                .addGap(10, 10, 10)
                .addComponent(Toggle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(Edit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(icoCancel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );
        HeaderLayout.setVerticalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderLayout.createSequentialGroup()
                .addGroup(HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(HeaderLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Edit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Toggle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(icoCancel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
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

        ChatBoxLayer.setPreferredSize(new java.awt.Dimension(480, 110));

        txtChat.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtChat.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtChat.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(150, 150, 150)));
        txtChat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtChatActionPerformed(evt);
            }
        });

        iconLike.setPic("/Data/Icon/Like.png");
        iconLike.setBackground(new java.awt.Color(153, 255, 255));
        iconLike.setToolTipText("Like Stranger");
        iconLike.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        iconLike.setPreferredSize(new java.awt.Dimension(50, 50));
        iconLike.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                iconLikeMousePressed(evt);
            }
        });

        javax.swing.GroupLayout iconLikeLayout = new javax.swing.GroupLayout(iconLike);
        iconLike.setLayout(iconLikeLayout);
        iconLikeLayout.setHorizontalGroup(
            iconLikeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        iconLikeLayout.setVerticalGroup(
            iconLikeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        ChatBoxLayer.setLayer(txtChat, javax.swing.JLayeredPane.DEFAULT_LAYER);
        ChatBoxLayer.setLayer(iconLike, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout ChatBoxLayerLayout = new javax.swing.GroupLayout(ChatBoxLayer);
        ChatBoxLayer.setLayout(ChatBoxLayerLayout);
        ChatBoxLayerLayout.setHorizontalGroup(
            ChatBoxLayerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ChatBoxLayerLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(txtChat)
                .addGap(10, 10, 10)
                .addComponent(iconLike, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );
        ChatBoxLayerLayout.setVerticalGroup(
            ChatBoxLayerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ChatBoxLayerLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(ChatBoxLayerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(iconLike, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtChat))
                .addGap(30, 30, 30))
        );

        lblStart.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblStart.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblStart.setText("Click the button below to start a new chat !");

        btnStart.setText("Start");
        btnStart.setToolTipText("Start new Conversation");
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

        ButtonLayer.setLayer(lblStart, javax.swing.JLayeredPane.DEFAULT_LAYER);
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
                .addComponent(lblStart, javax.swing.GroupLayout.DEFAULT_SIZE, 468, Short.MAX_VALUE)
                .addContainerGap())
        );
        ButtonLayerLayout.setVerticalGroup(
            ButtonLayerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ButtonLayerLayout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addComponent(lblStart)
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
            .addComponent(ChatBoxLayer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
        iconLike.setPic("/Data/Icon/Like.png");                                 //Reset icon like
        Chat.removeAll();                                                       //Remove all old chat message before
        preHeight = 0; width = 0; line = 0; X = 0; Y = 0; PortID = 1024;        //Reset position of Messeage bubble
        ChatIn();                                                               //Opean chat box
        boolean Status = false;                                                 //Declare Variable Status to know run with which role, if they true run at Server, else run at Client
        while(true){                                                            //Check Port is possible ? create a new one if imposiible
            try{ 
                IPAddress = InetAddress.getLocalHost().getHostAddress();        //Get IP Address of this device
                if(checkID(PortID)){Status = false; break;}                     //Check Port Available on Database, if available, assign value false, break and run at Client
                else{PortID++;}}                                                //Else Port not Available, increase the value and check again
            catch(RuntimeException e){                                          //Catch Exception when check PortID, if error, that mean this port doesn't exists, can be use
                System.out.println("\tPort: " + PortID + " Available.");        //Print Port to console
                insertID(PortID, IPAddress);                                    //Insert Port and IP Address to Database, for the latter User to connect to this Address
                Status = true; break;}                                          //Sssign value true, break and run at Server
            catch(UnknownHostException ex){ System.out.println("!!! Error trying to get the IP Address of this device. !!!"); }}
        System.out.println("\nStart at IP Address: " + IPAddress + "\tPort: " + PortID);
        if(Status){ startServer(); }                                            //If value of Status true, that mean run at Server, waiting for Client
        else{ updateID(PortID, false); startClient(); }                         //Else, update Port Available on Database to latter User can't join, and connect to Server
    }//GEN-LAST:event_btnStartActionPerformed

    private void txtChatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtChatActionPerformed
        String chat = txtChat.getText().trim();
        if(!chat.equals("")){
            ps.println(chat);
            addRightBox(chat);
            txtChat.setText(""); }
    }//GEN-LAST:event_txtChatActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        deleteID(PortID);
        System.out.println("Delete PortID : "+PortID);
    }//GEN-LAST:event_formWindowClosing

    private void iconLikeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconLikeMousePressed
        if(!StranLikeU){
            ps.println("!! You like Strangers like you. !!");
            addNotifiBox("You like Stranger. !!"); 
            iconLike.setPic("/Data/Icon/LikeColor.png"); }
        StranLikeU = true;
    }//GEN-LAST:event_iconLikeMousePressed

    private void icoCancelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icoCancelMousePressed
        try{
            if(soc !=null && !soc.isClosed()){
                if(WOptionPaneC(P, "Are you sure you want to exit the conversation.\nThis can't be undo.\nAnd the entire conversation will be deleted.") == JOptionPane.YES_OPTION){
                    deleteID(PortID);
                    System.out.println("Delete PortID : "+PortID);
                    soc.close();}}}
        catch(IOException e){  System.out.println("!!! Error trying to cancel Chat Thread. !!!");}
    }//GEN-LAST:event_icoCancelMousePressed

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
    
    private int PortID = 1024;  String IPAddress = null;
    public static final User User = selectUS(USERNAME);
    private final JComponent P = super.getRootPane();   //parent component
    private int preHeight = 0, width, line, X, Y;
    static PrintStream ps; static Thread th; static Socket soc;
    private boolean StranLikeU = false;
    
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
    private com.AnLa.IcoPanel Toggle;
    private com.k33ptoo.components.KButton btnStart;
    private com.AnLa.IcoPanel icoCancel;
    private com.AnLa.IcoPanel iconLike;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblStart;
    private javax.swing.JTextField txtChat;
    // End of variables declaration//GEN-END:variables

    private void showTheme()                {
        setTheme(Background);
        setTheme(Header);   setTheme(Avatar);   setTheme(lblName);
        setTheme(Toggle);   setTheme(Edit);     setTheme(icoCancel);
        setTheme(lblStart); setTheme(txtChat);  setTheme(iconLike); 
        setTheme(Chat);     Scroll.getVerticalScrollBar().setBackground(Color.decode(Theme ? "#363B41" : "#FFFFFF"));
    }
    private void ChatIn()                   {
        ButtonLayer.setVisible(false);
        ChatBoxLayer.setVisible(true);
        validate();
        repaint();
    }
    private void ChatOut(String text)       {
        lblStart.setText(text);
        ChatBoxLayer.setVisible(false);
        ButtonLayer.setVisible(true);
        validate();
        repaint();
    }
    private Thread creThread(Socket soc)    {
        addNotifiBox("'Ahihi' to say hello Stranger. Have fun.");
        return new Thread(new ChatThread(soc){
            @Override public void run() {
                while (true) {
                    try {
                        String s = br.readLine();
                        if(s == null){throw new IOException();}
                        if(s.equals("!! You like Strangers like you. !!")){addNotifiBox("Stranger like you. !!");}
                        else{   addLeftBox(s);  }
                    }catch (IOException ex) { 
                        try{soc.close();}catch(IOException e){}
                        ChatOut("Stranger has exited the chat !"); StranLikeU = false; break;}}}});
    }
    private void startClient()              {
        System.out.println("\tStart with role: Client");
        System.out.println("\tConnect to IP: " + selectIP(PortID) + "\tPort: " + PortID);
        try {
            soc = new Socket(selectIP(PortID), PortID);
            ps = new PrintStream(soc.getOutputStream());
            th = creThread(soc);
            th.start(); }
        catch(IOException ex){}
    }
    private void startServer()              {
        new Thread() {
            @Override public void run() {
                PopupOn("/Data/Gif/Chat.gif", "Waiting for a Stranger...");
                System.out.println("\tStart with role: Server");
                try {
                    ServerSocket sv = new ServerSocket(PortID);
                    soc = sv.accept();
                    System.out.println("\tConnected IP: " + soc.getRemoteSocketAddress().toString().replaceAll("/", ""));
                    PopupOff();
                    ps = new PrintStream(soc.getOutputStream());
                    th = creThread(soc);
                    th.start(); }
                catch(IOException ex){}
            }}.start();
    }
    private void addRightBox(String text)   {
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
    private void addLeftBox(String text)    {
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
    private void addNotifiBox(String text)  {
        javax.swing.JLabel Label = new javax.swing.JLabel();
        Label.setBackground(new Color(0,0,0,0));
        Label.setFont(new java.awt.Font("Tahoma", 0, 20));
        Label.setForeground(new java.awt.Color(150, 150, 150));
        Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Label.setText(text);
        Y = Y + preHeight + 20;
        preHeight = 30;
        Chat.add(Label, new AbsoluteConstraints(0, Y, 485, 30));
        Rectangle aRect = new Rectangle();
        aRect.y = Y + 50;
        Chat.scrollRectToVisible(aRect);
        validate();
        repaint();
    }
    private void PopupOn(String file, String text) {
        popup.setLocationRelativeTo(null);
        popup.icon.setIcon(new javax.swing.ImageIcon(getClass().getResource(file)));
        popup.txtNotifi.setText(text);
        popup.setVisible(true);
    }
    private void PopupOff(){    popup.dispose();    }
}
abstract class ChatThread implements Runnable {
    InputStream in;
    BufferedReader br;
    public ChatThread(Socket client) {
        try {
            in = client.getInputStream();
            br = new BufferedReader(new InputStreamReader(in));} 
        catch (IOException e) {   System.out.println("!!! Error trying to create Chat Thread. !!!");}
    }
}