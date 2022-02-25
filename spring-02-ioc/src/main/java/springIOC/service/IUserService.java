package springIOC.service;

import springIOC.DAO.IUserDAO;

public interface IUserService {
    void getUser();
    void setUserDAO(IUserDAO userDAO);
}
