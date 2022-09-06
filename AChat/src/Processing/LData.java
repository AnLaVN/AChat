package Processing; //Processing Local Data
// Make By Bình An || AnLaVN || KatoVN

import ObjectClass.User;
import Frame.*;
import static Processing.DData.selectUS;
import java.awt.Color;
import java.io.*;
import java.net.URL;
import java.nio.file.*;
import java.security.*;
import javax.swing.*;

public class LData {
    public static final String EMAIL = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"+"[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
    public static boolean Theme = (Boolean) readData("src/Data/AppData/Seting.dat");
    public static String USERNAME = "", AVATAR = "";
    public static Frame.Popup popup = new Frame.Popup();
    //Theme
    public static void changeValueTheme(){Theme = !Theme; writeData("src/Data/AppData/Seting.dat", Theme);}
    public static void setTheme(javax.swing.JComponent o)       {
        javax.swing.JComponent j = null;
        if(o instanceof javax.swing.JPanel       pan) {j = pan;}
        if(o instanceof javax.swing.JLabel       lbl) {j = lbl;}
        if(o instanceof javax.swing.JRadioButton rdo) {j = rdo;}
        if(o instanceof javax.swing.JCheckBox    chk) {j = chk;}
        if(o instanceof javax.swing.JTextField   txt) {j = txt;}
        if(o instanceof javax.swing.JTextArea    tar) {j = tar;}
        if(o instanceof javax.swing.JTable       tbl) {j = tbl;}
        if(o instanceof javax.swing.JButton      btn) {j = btn;}
        j.setForeground  (   Color.decode(Theme ? "#F0F0F0" : "#2C3338") );
        j.setBackground  (   Color.decode(Theme ? "#363B41" : "#FFFFFF") );
    } //Function change theme of component
    //Look and feel, show and delete error
    public static JFileChooser windowsJFileChooser(JFileChooser chooser){
        LookAndFeel previousLF = UIManager.getLookAndFeel();
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            chooser = new JFileChooser();
            UIManager.setLookAndFeel(previousLF);
        } catch (IllegalAccessException | UnsupportedLookAndFeelException | InstantiationException | ClassNotFoundException e) {System.out.println("!!! Error trying to change Look and Feel Windows. !!!");}
        return chooser;
    }//fcn change Look and Feel of JFileChooser
    public static void WOptionPaneM(JComponent p, String mess)  {
        LookAndFeel previousLF = UIManager.getLookAndFeel();
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            JOptionPane.showMessageDialog(p, mess, "Message", 2);
            UIManager.setLookAndFeel(previousLF);
        } catch (IllegalAccessException | UnsupportedLookAndFeelException | InstantiationException | ClassNotFoundException e) {System.out.println("!!! Error trying to change Look and Feel MessageDialog. !!!");}
    }  //Windows Look and Feel of JOptionPane MessageDialog
    public static int WOptionPaneC(JComponent p, String mess)   {
        LookAndFeel previousLF = UIManager.getLookAndFeel();
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            int ConfirmDialog = JOptionPane.showConfirmDialog(p, mess, "Confirm", JOptionPane.YES_OPTION);
            UIManager.setLookAndFeel(previousLF);
            return ConfirmDialog;
        } catch (IllegalAccessException | UnsupportedLookAndFeelException | InstantiationException | ClassNotFoundException e) {
            System.out.println("!!! Error trying to change Look and Feel ConfirmDialog. !!!");
            throw new RuntimeException(e);
        }
    } //Windows Look and Feel of JOptionPane ConfirmDialog
    public static String WOptionI(JComponent p, String m, int o){
        LookAndFeel previousLF = UIManager.getLookAndFeel();
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            String InputDialog = JOptionPane.showInputDialog(p, m, "Input", o);
            UIManager.setLookAndFeel(previousLF);
            return InputDialog;
        } catch (IllegalAccessException | UnsupportedLookAndFeelException | InstantiationException | ClassNotFoundException e) {
            System.out.println("!!! Error trying to change Look and Feel ConfirmDialog. !!!");
            throw new RuntimeException(e);
        }
    } //Windows Look and Feel of JOptionPane InputDialog
    public static void showError(JComponent p, String text, JComponent panel, JComponent textfiled){
        panel.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, Color.red));
        WOptionPaneM(p, text);
        textfiled.requestFocusInWindow();
    }//fcn show error on component
    public static void deleError(JComponent t)                  {
        t.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(150, 150, 150)));
    }  //Function delete error on component
    //Data
    public static String SHA256(final String base)              {
        try{
            final MessageDigest digest = MessageDigest.getInstance("SHA-256");
            final byte[] hash = digest.digest(base.getBytes("UTF-8"));
            final StringBuilder hexString = new StringBuilder();
            for (int i = 0; i < hash.length; i++) {
                final String hex = Integer.toHexString(0xff & hash[i]);
                if(hex.length() == 1){ hexString.append('0'); }
                hexString.append(hex);}
            return hexString.toString();
        } catch(UnsupportedEncodingException | NoSuchAlgorithmException ex){   throw new RuntimeException(ex);   }
    } //Function hashing data
    public static void writeData(String filePath, Object Data)  {
        try{
            FileOutputStream fos = new FileOutputStream(filePath);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(Data);
            oos.flush();    oos.close();
            fos.flush();    fos.close();
        }catch(IOException e){   System.out.println("!!!Error trying to write file data. !!!");   }
    }  //Function write data to file
    public static Object readData(String filePath)              {
        try{
            FileInputStream fis = new FileInputStream(filePath);
            ObjectInputStream ois = new ObjectInputStream(fis);
            Object Data = ois.readObject();
            ois.close();    fis.close();
            return Data;
        }catch(IOException | ClassNotFoundException e){
            System.out.println("!!! Error trying to read file data. !!!");
            throw new RuntimeException(e);
        }
    } //Function read data from file
    //LocalUser
    public static void writeLocalUser(User u)                   {
        writeData("src/Data/AppData/LocalUser.dat", u);
    }  //Function hashing and save Username, Password of User to file "LocalUser.dat"
    public static User readLocalUser()                          {
        return (User) readData("src/Data/AppData/LocalUser.dat");
    }  //Function read and return User from file, and show them to console
    //Avatar
    public static void saveAvatar(String url)                   {
        try ( InputStream in = new URL(url).openStream()) {
            Path path = Paths.get(AVATAR);
            Files.deleteIfExists(path);
            Files.copy(in, path);
        }catch(Exception e){System.out.println("!!! Error trying to download Avatar from Cloundinary. !!!");}
    }  //Function save Avatar from Cloundinary to local
    public static void readAvatar()                             {
        String linkAvatar = selectUS(USERNAME).getAvatar();
        if(linkAvatar.equals("")){
            System.out.println("User doesn't have Avatar, get default Avatar.");
            AVATAR = !Theme ? "src\\Data\\Picture\\EmailHammer.png" : "src\\Data\\Picture\\QQ.png"; }
        else if(Files.notExists(Paths.get(AVATAR), java.nio.file.LinkOption.NOFOLLOW_LINKS)){
            System.out.println("Avatar not available on this device, waiting for download...");
            saveAvatar(linkAvatar);}
    }  //Function read Avatar path of User, if they dont have, set default
    public static void deleAvatar()                             {
        try{    Files.delete(Paths.get(AVATAR));    }
        catch(IOException e){System.out.println("!!! Error trying to delete Avatar. !!!");}
    }  //Function delete file Avatar when they remove account
    //SignIn, SignOut  
    public static void AChat(String text)                       {
        System.out.println(text + " Successfully.");
        new AChat().setVisible(true);
    }  //Open AChat with alert type signin
    public static void SignOut()                                {
        writeLocalUser(new User());
        System.out.println("SignOut Successfully.");
        System.exit(0);
    }  //Sign out AChat
}