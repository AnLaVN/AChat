package Processing; //Processing Database Data
// Make By Bình An || AnLaVN || KatoVN

import Class.User;
import static Processing.LData.USERNAME;
import java.sql.*;

public class DData {
    private static final String URL = "jdbc:sqlserver://localhost:1433;DatabaseName=AChatDB;encrypt=true;trustServerCertificate=true", USERNAMEDB = "sa", PASSWORDDB = "";
//    private static final String URL = "jdbc:sqlserver://AChatDB.mssql.somee.com;DatabaseName=AChatDB;encrypt=true;trustServerCertificate=true", USERNAMEDB = "AnLaVN_SQLLogin_1", PASSWORDDB = "xq9gx9ny7j";
    public static Connection con = null; 
    public static void connectDB()                              {
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            con = DriverManager.getConnection(URL, USERNAMEDB, PASSWORDDB);
        }catch(ClassNotFoundException | SQLException e){
            System.out.println("!!! Error try to connect Database. !!!");
            throw new RuntimeException(e);
        }
    }  //Function return a connection database
    public static PreparedStatement setQuery(String Query)      {
        try{    return con.prepareStatement(Query); }
        catch(SQLException e){
            System.out.println("!!! Error try to set query. !!!");
            throw new RuntimeException(e);
        }
    }  //fcn return a preparedStatement
    public static ResultSet executeQuery(PreparedStatement ps)  {
        try{    return ps.executeQuery();   }
        catch(SQLException e){
            System.out.println("!!! Error try to execute query. !!!");
            throw new RuntimeException(e);
        }
    }  //Function return a resultSet
    public static void insertUS(User user)                      {
        try {
            PreparedStatement ps = setQuery("insert into USERINFO values (?, ?, ?, ?, '')");
            ps.setString(1, user.getUsername());
            ps.setString(2, user.getPassword());
            ps.setString(3, user.getName());
            ps.setString(4, user.getEmail());
            if(ps.execute()){System.out.println("Insert User to database Successfully.");}
            ps.close();
        } catch (SQLException ex) { System.out.println("!!! Error try to Insert User to database. !!!");}
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
            System.out.println("!!! Error try to Select User from database. !!!");
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
            System.out.println("!!! Error try to Select User by Mail from database. !!!");
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
        } catch (SQLException ex) { System.out.println("!!! Error try to Update User to database. !!!");}
    } //Function update current User to database
    public static void deleteUS()                               {
        try {
            PreparedStatement ps = setQuery("delete from USERINFO where Username = ?");
            ps.setString(1, USERNAME);
            if(ps.execute()){   System.out.println("Delete User from Database Successfully.");  }
            ps.close(); 
        } catch (SQLException ex) { System.out.println("!!! Error try to Delete User from database. !!!");}
    }  //Function delete current User from database
    
    public static void insertID(int ID){
        try {
            PreparedStatement ps = setQuery("insert into CHATSQUEUE values (?, ?)");
            ps.setInt(1, ID);
            ps.setString(2, "67e571ffc1d92b62295a6f15b6f180996179cf967d75d3cfd2d30d11d2f5ce71");
            if(ps.execute()){System.out.println("Insert ID to database Successfully.");}
            ps.close();
        } catch (SQLException ex) { System.out.println("!!! Error try to Insert ID to database. !!!"); ex.printStackTrace();}
    }
    public static boolean selectID(int ID){
        try {
            PreparedStatement ps = setQuery("select HostUser from CHATSQUEUE where PortID = ?");
            ps.setInt(1, ID);
            ResultSet rs = executeQuery(ps);
            rs.next();
            String Username = rs.getString("HostUser");
            rs.close(); ps.close(); 
            return !Username.equals("");
        } catch (SQLException e) {
            System.out.println("!!! Error try to Select ID from database. !!!"); return false;}
    }
    public static void deleteID(int ID){
        try {
            PreparedStatement ps = setQuery("delete from CHATSQUEUE where PortID = ?");
            ps.setInt(1, ID);
            if(ps.execute()){   System.out.println("Delete ID from Database Successfully.");  }
            ps.close(); 
        } catch (SQLException ex) { System.out.println("!!! Error try to Delete ID from database. !!!");}
    }
}