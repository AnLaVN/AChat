package ObjectClass;
// Make By Bình An || AnLaVN || KatoVN
import java.io.Serializable;
public class Seting implements Serializable{
    private boolean Mode;
    private String Theme, Lang;

    public boolean isMode()  { return Mode;  }
    public String  getTheme(){ return Theme; }
    public String  getLang() { return Lang;  }
    public void setMode(boolean Mode)    { this.Mode = Mode;      }
    public void setTheme(String Theme)   { this.Theme = Theme;    }
    public void setLang(String Languages){ this.Lang = Languages; }
    public Seting() {}
    public Seting(boolean Mode, String Theme, String Lang) {
        this.Mode = Mode;
        this.Theme = Theme;
        this.Lang = Lang;
    }
}