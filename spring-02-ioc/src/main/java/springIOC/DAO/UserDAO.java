package springIOC.DAO;

import springIOC.DAO.IUserDAO;

public class UserDAO implements IUserDAO {

    @Override
    public void getUser() {
        System.out.println("用户调用");
    }
}
