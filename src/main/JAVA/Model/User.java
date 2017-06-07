package Model;

/**
 * Created by mazhanfeng on 2017/3/8.
 */
public class User {
    private String UserName;
    private String password;
    public String GetUsername()
    {
        return UserName;
    }
    public void SetUserName(String userName)
    {
        this.UserName = userName;
    }

    public  String Getpassword(){
        return password;
    }
    public void Setpassword(String password)
    {
        this.password=password;
    }

}
