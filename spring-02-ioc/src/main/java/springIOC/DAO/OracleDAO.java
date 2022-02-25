package springIOC.DAO;

import springIOC.DAO.IUserDAO;

public class OracleDAO implements IUserDAO {
    @Override
    public void getUser() {
        System.out.println("Oracle调用");
    }
}
