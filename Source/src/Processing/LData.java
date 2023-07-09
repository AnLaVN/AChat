package Processing; //Processing Local Data
// Make By Bình An || AnLaVN || KatoVN

import ObjectClass.*;
import Frame.*;
import static Processing.DData.*;
import jaco.mp3.player.MP3Player;
import java.awt.Color;
import java.io.*;
import java.net.URL;
import java.nio.file.*;
import java.security.*;
import java.util.PropertyResourceBundle;
import java.util.ResourceBundle;
import javax.swing.*;

public class LData {
    public static Seting UserSetting = (Seting) readData("src/Data/AppData/Setting.dat");
    public static ResourceBundle Lang ;
    public static String Theme = "/Data/Icon/"+UserSetting.getTheme()+"/";
    public static boolean Mode = UserSetting.isMode();
    public static JFrame achatFrame, editFrame;
    public static Frame.Popup popup = new Frame.Popup();    //Popup need after Mode   
    public static MP3Player PlayerMS = new MP3Player();     //Player play music in background
    public static final String EMAIL = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"+"[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
    public static String USERNAME = "", AVATAR = "";
    //Set Mode
    public static void setMode(javax.swing.JComponent o)        {
        javax.swing.JComponent j = null;
        if(o instanceof javax.swing.JPanel       pan) {j = pan;}
        if(o instanceof javax.swing.JLabel       lbl) {j = lbl;}
        if(o instanceof javax.swing.JRadioButton rdo) {j = rdo;}
        if(o instanceof javax.swing.JCheckBox    chk) {j = chk;}
        if(o instanceof javax.swing.JTextField   txt) {j = txt;}
        if(o instanceof javax.swing.JTextArea    tar) {j = tar;}
        if(o instanceof javax.swing.JTable       tbl) {j = tbl;}
        if(o instanceof javax.swing.JButton      btn) {j = btn;}
        j.setForeground  (   Color.decode(Mode ? "#F0F0F0" : "#2C3338") );
        j.setBackground  (   Color.decode(Mode ? "#363B41" : "#FFFFFF") );
    } //Function change theme of component
    //Change Look and feel
    public static JFileChooser windowsJFileChooser()            {
        LookAndFeel previousLF = UIManager.getLookAndFeel();
        JFileChooser chooser = null;
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            chooser = new JFileChooser();
            UIManager.setLookAndFeel(previousLF);
        } catch (IllegalAccessException | UnsupportedLookAndFeelException | InstantiationException | ClassNotFoundException e) {
            System.out.println("\n!!! Error trying to change Look and Feel of File Chooser. !!!");}
        return chooser;
    } //Function change Look and Feel of JFileChooser
    public static JCheckBox windowsJCheckBox()                  {
        LookAndFeel previousLF = UIManager.getLookAndFeel();
        JCheckBox checkbox = null;
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            checkbox = new JCheckBox();
            UIManager.setLookAndFeel(previousLF);}
        catch (IllegalAccessException | UnsupportedLookAndFeelException | InstantiationException | ClassNotFoundException e) {
            System.out.println("\n!!! Error trying to change Look and Feel of Check Box. !!!");}
        return checkbox;
    } //Function change Look and Feel of JCheckBox
    public static JComboBox windowsJComboBox()                  {
        LookAndFeel previousLF = UIManager.getLookAndFeel();
        JComboBox combobox = null;
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            combobox = new JComboBox();
            UIManager.setLookAndFeel(previousLF);}
        catch (IllegalAccessException | UnsupportedLookAndFeelException | InstantiationException | ClassNotFoundException e) {
            System.out.println("\n!!! Error trying to change Look and Feel of Combo Box. !!!");}
        return combobox;
    } //Function change Look and Feel of JComboBox
    public static void WOptionPaneM(JComponent p, String mess)  {
        LookAndFeel previousLF = UIManager.getLookAndFeel();
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            JOptionPane.showMessageDialog(p, mess, "Message", 2);
            UIManager.setLookAndFeel(previousLF);
        } catch (IllegalAccessException | UnsupportedLookAndFeelException | InstantiationException | ClassNotFoundException e) {
            System.out.println("\n!!! Error trying to change Look and Feel of MessageDialog. !!!");}
    }  //Windows Look and Feel of JOptionPane MessageDialog
    public static int WOptionPaneC(JComponent p, String mess)   {
        LookAndFeel previousLF = UIManager.getLookAndFeel();
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            int ConfirmDialog = JOptionPane.showConfirmDialog(p, mess, "Confirm", JOptionPane.YES_OPTION);
            UIManager.setLookAndFeel(previousLF);
            return ConfirmDialog;
        } catch (IllegalAccessException | UnsupportedLookAndFeelException | InstantiationException | ClassNotFoundException e) {
            System.out.println("\n!!! Error trying to change Look and Feel of ConfirmDialog. !!!");
            throw new RuntimeException(e);}
    } //Windows Look and Feel of JOptionPane ConfirmDialog
    public static String WOptionI(JComponent p, String m, int o){
        LookAndFeel previousLF = UIManager.getLookAndFeel();
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            String InputDialog = JOptionPane.showInputDialog(p, m, "Input", o);
            UIManager.setLookAndFeel(previousLF);
            return InputDialog;
        } catch (IllegalAccessException | UnsupportedLookAndFeelException | InstantiationException | ClassNotFoundException e) {
            System.out.println("\n!!! Error trying to change Look and Feel of InputDialog. !!!");
            throw new RuntimeException(e);}
    } //Windows Look and Feel of JOptionPane InputDialog
    //Show and Delete Error
    public static void showError(JComponent p, String text, JComponent panel, JComponent textfiled){
        panel.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, Color.red));
        WOptionPaneM(p, text);
        textfiled.requestFocusInWindow();
    }//fcn show error on component
    public static void deleError(JComponent t)                  {
        t.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(150, 150, 150)));
    }  //Function delete error on component
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
            File file = new File(filePath.replaceAll("\\\\", "/"));
            file.setExecutable(true);
            file.setReadable(true);
            file.setWritable(true);
            FileOutputStream fos = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(Data);
            oos.flush();    oos.close();
            fos.flush();    fos.close();
        }catch(IOException e){   System.out.println("\n!!! Error trying to write file data. !!!");   }
    }  //Function write data to file
    public static Object readData(String filePath)              {
        try{
            File file = new File(filePath.replaceAll("\\\\", "/"));
            file.setExecutable(true);
            file.setReadable(true);
            file.setWritable(true);
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);
            Object Data = ois.readObject();
            ois.close();    fis.close();
            return Data;
        }catch(IOException | ClassNotFoundException e){
            System.out.println("\n!!! Error trying to read file data. !!!");
            throw new RuntimeException(e);}
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
            Files.copy(in, path, StandardCopyOption.REPLACE_EXISTING);
        }catch(Exception e){ System.out.println("\n!!! Error trying to download Avatar from Cloundinary. !!!");}
    }  //Function save Avatar from Cloundinary to local
    public static void readAvatar()                             {
        String linkAvatar = selectUS(USERNAME).getAvatar();
        if(linkAvatar.equals("")){
            System.out.println("\tUser doesn't have Avatar, get default Avatar.");
            AVATAR = !Mode ? "src/Data/Picture/venus.png" : "src/Data/Picture/mars.png"; }
        else if(Files.notExists(Paths.get(AVATAR), java.nio.file.LinkOption.NOFOLLOW_LINKS)){
            System.out.println("\tAvatar not available on this device, waiting for download...");
            saveAvatar(linkAvatar);}
    }  //Function read Avatar path of User, if they dont have, set default
    public static void deleAvatar()                             {
        try{    Files.delete(Paths.get(AVATAR));    }
        catch(IOException e){System.out.println("\n!!! Error trying to delete Avatar. !!!");}
    }  //Function delete file Avatar when they remove account
    //Music
    public static void setList()                                {
        File[] files = new File("src/Data/Sound/").listFiles();
        System.out.println("\nGet All List Music in src/Data/Sound/:");
        for (File file : files) {
            if (file.isFile()) {   
                System.out.println("\t"+file.getName());
                addList(file);  
            }
        }
        System.out.println("\tTotal: "+files.length+" Song.");
    } //Function make a List Music from all song in folder
    public static void addList(File file)                       { PlayerMS.addToPlayList(file);   }          //Function add a new song to folder and List Music
    //Setting
    public static void setSeting(boolean mode, String theme, String lang){ 
        Mode = mode;    Theme = "/Data/Icon/"+theme+"/";    getLang(lang);
        UserSetting = new Seting(mode, theme, lang);
        writeData("src/Data/AppData/Setting.dat", UserSetting); 
    }
    public static void getLang(String languages)                {
        try{
            FileInputStream fis = new FileInputStream("src/ObjectClass/Languages_"+languages+".properties");
            Lang = new PropertyResourceBundle(fis);
            fis.close();
        }catch(IOException e){System.out.println("\n!!! Error trying to read Languages.properties. !!!");}
    }  //Get languages from properties file
    //SignIn, SignOut  
    public static void AChat(String text)                       {
        System.out.println("\n" + text + " Successfully.");
        new AChat().setVisible(true);
    }  //Open AChat with alert type signin
    public static void SignOut()                                {
        writeLocalUser(new User());
        System.out.println("\nSignOut Successfully.");
        editFrame.dispose();    achatFrame.dispose();
        new SignIn().setVisible(true);
    }  //Sign out AChat
}