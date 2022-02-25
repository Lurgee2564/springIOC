package springIOC.service;

import springIOC.DAO.IUserDAO;

public class UserService implements IUserService{
    private IUserDAO userDAO;
    @Override
    public void getUser() {
    userDAO.getUser();
    }

    @Override
    public void setUserDAO(IUserDAO userDAO) {
        this.userDAO = userDAO;
    }
}
