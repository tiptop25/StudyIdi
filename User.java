/**
 * Created by superova on 28.06.2015.
 */
public class User {
    String Nameuser;
    String Password;
    String Mail;

    public User(String nameuser, String password, String mail) {
        Nameuser = nameuser;
        Password = password;
        Mail = mail;
    }

    @Override
    public String toString() {
        return "User{" +
                "Nameuser='" + Nameuser + '\'' +
                ", Password='" + Password + '\'' +
                ", Mail='" + Mail + '\'' +
                '}';
    }

}
