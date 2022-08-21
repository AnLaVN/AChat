package Processing;
// Make By Bình An || AnLaVN || KatoVN

import Frame.AChat;
import Object.User;
import java.awt.Color;
import java.io.*;
import java.security.*;
import java.sql.*;
import java.util.HashMap;
import java.util.Map;
import javax.swing.*;

public class Data {
    //Variable
    public static final String EMAIL = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"+"[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
    public static boolean Theme = (Boolean) readData("src/Data/AppData/Seting.dat");
    public static String USERNAME = "";
    public static Map<String, String> mapUS = readAUS();   //Read all User from database
    
    public static final String URL = "jdbc:sqlserver://localhost:1433;DatabaseName=AChatDB;encrypt=true;trustServerCertificate=true";
    public static final String USERNAMEDB = "as", PASSWORDDB = "";
    //public static final String URL = "jdbc:sqlserver://AChatDB.mssql.somee.com;DatabaseName=AChatDB;encrypt=true;trustServerCertificate=true";
    //public static final String USERNAMEDB = "AnLaVN_SQLLogin_1", PASSWORDDB = "xq9gx9ny7j";
    
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
    public static void AChat(String text){
        System.out.println(text + " Successfully.");
        new AChat().setVisible(true);
    }
    public static void SignOut(){
        writeLocalUser(new User());
        System.out.println("SignOut Successfully.");
        System.exit(0);
    }
    //Database
    public static Connection connectDB()                        {
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            return DriverManager.getConnection(URL, USERNAMEDB, PASSWORDDB);
        }catch(ClassNotFoundException | SQLException e){
            System.out.println("!!! Error try to connect Database. !!!");
            throw new RuntimeException(e);
        }
    }  //Function return a connection database
    public static PreparedStatement setQuery(Connection con, String Query){
        try{    return con.prepareStatement(Query); }
        catch(SQLException e){
            System.out.println("!!! Error try to set query. !!!");
            throw new RuntimeException(e);
        }
    } //fcn return a preparedStatement
    public static ResultSet executeQuery(PreparedStatement ps)  {
        try{    return ps.executeQuery();   }
        catch(SQLException e){
            System.out.println("!!! Error try to execute query. !!!");
            throw new RuntimeException(e);
        }
    }  //Function return a resultSet
    public static void writeUS(User user)                       {
        try {
            Connection con = connectDB();
            PreparedStatement ps = setQuery(con, "insert into NGUOIDUNG values (?, ?, ?, ?, '')");
            ps.setString(1, user.getUsername());
            ps.setString(2, user.getPassword());
            ps.setString(3, user.getName());
            ps.setString(4, user.getEmail());
            if(ps.execute()){System.out.println("Insert User to database Successfully.");}
            ps.close(); con.close();
        } catch (SQLException ex) { System.out.println("!!! Error try to Insert User to database. !!!");}
    } //Function insert User to database
    public static User readUS(String Username)                  {
        try {
            Connection con = connectDB();
            PreparedStatement ps = setQuery(con, "select * from NGUOIDUNG where Username = ?");
            ps.setString(1, Username);
            ResultSet rs = executeQuery(ps);
            rs.next();
            String Password = rs.getString("Password");
            String Name     = rs.getString("Name");
            String Email    = rs.getString("Email");
            String Avatar   = rs.getString("Avatar");
            rs.close(); ps.close(); con.close();
            return new User(Username, Password, Name, Email, Avatar);
        } catch (SQLException e) {
            System.out.println("!!! Error try to Select User from database. !!!");
            throw new RuntimeException(e);}
    } //Function select User from database
    public static void updateUS(String Username, User user)     {
        try {
            Connection con = connectDB();
            PreparedStatement ps = setQuery(con, "update NGUOIDUNG set Username = ?, Password = ?, Name = ?, Email = ?, Avatar = ? where Username = ?");
            ps.setString(1, user.getUsername());
            ps.setString(2, user.getPassword());
            ps.setString(3, user.getName());
            ps.setString(4, user.getEmail());
            ps.setString(5, user.getAvatar());
            ps.setString(6, Username);
            if(ps.execute()){System.out.println("Update User to Database Successfully.");}
            ps.close(); con.close();
        } catch (SQLException ex) { System.out.println("!!! Error try to Update User to database. !!!");}
    } //Function update User to database
    public static void deleteUS(String Username){
        try {
            Connection con = connectDB();
            PreparedStatement ps = setQuery(con, "delete from NGUOIDUNG where Username = ?");
            ps.setString(1, Username);
            if(ps.execute()){System.out.println("Delete User from Database Successfully.");}
            ps.close(); con.close();
        } catch (SQLException ex) { System.out.println("!!! Error try to Delete User from database. !!!");}
    }
    public static Map<String, String> readAUS()                 {
        try {
            Connection con = connectDB();
            PreparedStatement ps = setQuery(con, "select * from NGUOIDUNG");
            ResultSet rs = executeQuery(ps);
            Map<String, String> mapUS = new HashMap<>();
            while(rs.next()){   mapUS.put(rs.getString("Username"), rs.getString("Password"));    }
            rs.close(); ps.close(); con.close();
            return mapUS;
        } catch (SQLException e) {
            System.out.println("!!! Error try to read value User of database. !!!");
            throw new RuntimeException(e);
        }
    } //Function select All User from database
}