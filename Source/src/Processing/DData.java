package Processing; //Processing Database Data
// Make By Bình An || AnLaVN || KatoVN

import ObjectClass.User;
import static Processing.LData.USERNAME;
import java.sql.*;

public class DData {
    public static Connection con = null;
    //Set connect query database
    public static void connectDB()                              {
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            con = DriverManager.getConnection(URL, USERNAMEDB, PASSWORDDB);
        }catch(ClassNotFoundException | SQLException e){
            System.out.println("\n!!! Error trying to connect Database. !!!");
            throw new RuntimeException(e);
        }
    }  //Function return a connection database
    public static PreparedStatement setQuery(String Query)      {
        try{    return con.prepareStatement(Query); }
        catch(SQLException e){
            System.out.println("\n!!! Error trying to set query. !!!");
            throw new RuntimeException(e);
        }
    }  //Function return a preparedStatement
    public static ResultSet executeQuery(PreparedStatement ps)  {
        try{    return ps.executeQuery();   }
        catch(SQLException e){
            System.out.println("\n!!! Error trying to execute query. !!!");
            throw new RuntimeException(e);
        }
    }  //Function return a resultSet
    //User
    public static void insertUS(User user)                      {
        try {
            PreparedStatement ps = setQuery("insert into USERINFO values (?, ?, ?, ?, '')");
            ps.setString(1, user.getUsername());
            ps.setString(2, user.getPassword());
            ps.setString(3, user.getName());
            ps.setString(4, user.getEmail());
            if(ps.execute()){System.out.println("Insert User to database Successfully.");}
            ps.close();
        } catch (SQLException ex) { System.out.println("\n!!! Error trying to Insert User to database. !!!");}
    } //Function insert new User to database
    public static User selectUS(String Username)                {
        try {
            PreparedStatement ps = setQuery("select * from USERINFO where Username = ?");
            ps.setString(1, Username);
            ResultSet rs = executeQuery(ps);
            rs.next();
            String Password = rs.getString("Password");
            String Name     = rs.getString("Name");
            String Email    = rs.getString("Email");
            String Avatar   = rs.getString("Avatar");
            rs.close(); ps.close(); 
            return new User(Username, Password, Name, Email, Avatar);
        } catch (SQLException e) {
            System.out.println("\n!!! Error trying to Select User from database. !!!");
            throw new RuntimeException(e);}
    } //Function select User from database
    public static User selectUSbyMail(String mail)              {
        try {
            PreparedStatement ps = setQuery("select * from USERINFO where Email = ?");
            ps.setString(1, mail);
            ResultSet rs = executeQuery(ps);
            rs.next();
            String Username = rs.getString("Username");
            String Password = rs.getString("Password");
            String Name     = rs.getString("Name");
            String Email    = rs.getString("Email");
            String Avatar   = rs.getString("Avatar");
            rs.close(); ps.close(); 
            return new User(Username, Password, Name, Email, Avatar);
        } catch (SQLException e) {
            System.out.println("\n!!! Error trying to Select User by Mail from database. !!!");
            throw new RuntimeException(e);}
    } //Function select User by Mail from database
    public static void updateUS(User user)                      {
        try {
            PreparedStatement ps = setQuery("update USERINFO set Username = ?, Password = ?, Name = ?, Email = ?, Avatar = ? where Username = ?");
            ps.setString(1, user.getUsername());
            ps.setString(2, user.getPassword());
            ps.setString(3, user.getName());
            ps.setString(4, user.getEmail());
            ps.setString(5, user.getAvatar());
            ps.setString(6, USERNAME);
            if(ps.execute()){System.out.println("Update User to Database Successfully.");}
            ps.close(); 
        } catch (SQLException ex) { System.out.println("\n!!! Error trying to Update User to database. !!!");}
    } //Function update current User to database
    public static void updatePWUS(String Username, String NP)   {
        try {
            PreparedStatement ps = setQuery("update USERINFO set Password = ? where Username = ?");
            ps.setString(1, NP);
            ps.setString(2, Username);
            if(ps.execute()){System.out.println("Update Password of User to Database Successfully.");}
            ps.close(); 
        } catch (SQLException ex) { System.out.println("\n!!! Error trying to Update Password of User to database. !!!");}
    } //Function update Passwrord of User to database
    public static void deleteUS()                               {
        try {
            PreparedStatement ps = setQuery("delete from USERINFO where Username = ?");
            ps.setString(1, USERNAME);
            if(ps.execute()){   System.out.println("Delete User from Database Successfully.");  }
            ps.close(); 
        } catch (SQLException ex) { System.out.println("\n!!! Error trying to Delete User from database. !!!");}
    }  //Function delete current User from database
    //PortID
    public static void insertID(int PortID, String IPAddress)   {
        try {
            PreparedStatement ps = setQuery("insert into CHATSQUEUE values (?, ?, ?)");
            ps.setInt(1, PortID);
            ps.setString(2, IPAddress);
            ps.setBoolean(3, true);
            if(ps.execute()){System.out.println("Insert PortID to database Successfully.");}
            ps.close();
        } catch (SQLException ex) { System.out.println("\n!!! Error trying to Insert ID to database. !!!");}
    }
    public static String selectIP(int PortID)                   {
        try {
            PreparedStatement ps = setQuery("select IPAddress from CHATSQUEUE where PortID = ?");
            ps.setInt(1, PortID);
            ResultSet rs = executeQuery(ps);
            rs.next(); 
            String IPAddress = rs.getString("IPAddress");
            rs.close(); ps.close(); 
            return IPAddress;
        } catch (SQLException e) {
            System.out.println("\n!!! Error trying to Select PortID from database. !!!"); throw new RuntimeException(e);}
    }
    public static boolean checkID(int PortID)                   {
        try {
            PreparedStatement ps = setQuery("select * from CHATSQUEUE where PortID = ?");
            ps.setInt(1, PortID);
            ResultSet rs = executeQuery(ps);
            rs.next(); 
            boolean Available = rs.getBoolean("Available");
            rs.close(); ps.close(); 
            return Available;
        } catch (SQLException e) {
            System.out.println("\n!!! Error trying to Select PortID from database. !!!"); throw new RuntimeException(e);}
    }
    public static void updateID(int PortID, boolean Available)  {
        try {
            PreparedStatement ps = setQuery("update CHATSQUEUE set Available = ? where PortID = ?");
            ps.setBoolean(1, Available);
            ps.setInt(2, PortID);
            if(ps.execute()){   System.out.println("Update PortID to Database Successfully.");  }
            ps.close(); 
        } catch (SQLException ex) { System.out.println("\n!!! Error trying to Update ID from database. !!!");}
    }
    public static void deleteID(int PortID)                     {
        try {
            PreparedStatement ps = setQuery("delete from CHATSQUEUE where PortID = ?");
            ps.setInt(1, PortID);
            if(ps.execute()){   System.out.println("Delete PortID to Database Successfully.");  }
            ps.close(); 
        } catch (SQLException ex) { System.out.println("\n!!! Error trying to Delete ID from database. !!!");}
    }
}