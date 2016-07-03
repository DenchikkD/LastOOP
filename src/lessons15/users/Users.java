package lessons15.users;

import javax.swing.*;

/**
 * Created by Denni on 29.06.2016.
 */
public class Users {

    private JTextField LOgin ;
    private JPasswordField password ;
    private String sLOgin ;
    private String spassword ;


    public Users() {
    }

    public Users(String LOgin, String password) {
        this.sLOgin = LOgin;
        this.spassword = password;
    }
    public Users(JTextField LOgin, JPasswordField password) {
        this.LOgin = LOgin;
        this.password = password;
    }

    public JTextField getLOgin() {
        return LOgin;
    }

    public JPasswordField getPassword() {
        return password;
    }

    public String getsLOgin() {
        return sLOgin;
    }

    public String getSpassword() {
        return spassword;
    }
}
