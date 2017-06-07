package Service;
import  Model.User;
import DAO.UserDAO;
/**
 * Created by mazhanfeng on 2017/3/8.
 */
public class UserServicesImpl implements UserService {
    private UserDAO userDAO;
    public String add(User user) {
          return userDAO.Save(user);
    }
    public UserDAO getUserDAO(){
        return  userDAO;
    }

    public void setUserDAO(UserDAO userDAO){
        this.userDAO=userDAO;
    }
}
