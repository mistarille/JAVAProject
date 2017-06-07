package DAO;

import Model.User;

/**
 * Created by mazhanfeng on 2017/3/8.
 */
public class UserDAOImpl implements UserDAO {

    private UserDAOImpl userDAO;

    public String Save(User user) {
       return user.GetUsername();

    }

    public void setUserDAO(UserDAOImpl userDAO) {
        this.userDAO = userDAO;
    }

    public UserDAOImpl getUserDAO() {
        return userDAO;
    }
}
