package ObjectClass;
// Make By Bình An || AnLaVN || KatoVN
import java.io.Serializable;
public class User implements Serializable{
    private String Username, Password, Name, Email, Avatar;
    public String getUsername() { return Username;  }
    public String getPassword() { return Password;  }
    public String getName()     { return Name;      }
    public String getEmail()    { return Email;     }
    public String getAvatar()   { return Avatar;    }
    public void setAvatar(String Avatar) {  this.Avatar = Avatar;   }
    public User(){}
    public User(String Username, String Password, String Name, String Email, String Avatar) {
        this.Username = Username;
        this.Password = Password;
        this.Name = Name;
        this.Email = Email;
        this.Avatar = Avatar;
    }
}