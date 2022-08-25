package Processing; //Processing Local Data
// Make By Bình An || AnLaVN || KatoVN

import Frame.AChat;
import Object.User;
import static Processing.DData.selectUS;
import java.awt.Color;
import java.io.*;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.security.*;
import javax.swing.*;

public class LData {
    //Variable
    public static final String EMAIL = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"+"[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
    public static boolean Theme = (Boolean) readData("src/Data/AppData/Seting.dat");
    public static String USERNAME = "", AVATAR = "";
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
        }catch(IOException e){   System.out.println("!!!Error try to write file data. !!!");   }
    }  //Function write data to file
    public static Object readData(String filePath)              {
        try{
            FileInputStream fis = new FileInputStream(filePath);
            ObjectInputStream ois = new ObjectInputStream(fis);
            Object Data = ois.readObject();
            ois.close();    fis.close();
            return Data;
        }catch(IOException | ClassNotFoundException e){
            System.out.println("!!! Error try to read file data. !!!");
            throw new RuntimeException(e);
        }
    } //Function read data from file
    public static void saveAvatar(String url)                   {
        try ( InputStream in = new URL(url).openStream()) {
            Path filePath = Paths.get("src\\Data\\Picture\\Avatar.png");
            Files.deleteIfExists(filePath);
            Files.copy(in, filePath);
        }catch(Exception e){System.out.println("!!! Error try to save as Image from Cloundinary. !!!");}
    }  //Function save Avatar from Cloundinary to local
    public static void readAvatar(){
        String linkAvatar = selectUS(USERNAME).getAvatar();
        if(linkAvatar.equals("")){  AVATAR = !Theme ? "src\\Data\\Picture\\EmailHammer.png" : "src\\Data\\Picture\\QQ.png"; }
        else{saveAvatar(linkAvatar);AVATAR = "src\\Data\\Picture\\Avatar.png";}
    }
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
    public static JFileChooser windowsJFileChooser(JFileChooser chooser){
        LookAndFeel previousLF = UIManager.getLookAndFeel();
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            chooser = new JFileChooser();
            UIManager.setLookAndFeel(previousLF);
        } catch (IllegalAccessException | UnsupportedLookAndFeelException | InstantiationException | ClassNotFoundException e) {System.out.println("!!! Error try to change Look and Feel Windows. !!!");}
        return chooser;
    }//fcn change Look and Feel of JFileChooser
    //LocalUser
    public static void writeLocalUser(User u)                   {
        writeData("src/Data/AppData/LocalUser.dat", u);
    }  //Function hashing and save Username, Password of User to file "LocalUser.dat"
    public static User readLocalUser()                          {
        return (User) readData("src/Data/AppData/LocalUser.dat");
    }  //Function read and return User from file, and show them to console
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