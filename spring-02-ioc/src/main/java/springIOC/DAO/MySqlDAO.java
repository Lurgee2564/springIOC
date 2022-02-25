package springIOC.DAO;

public class MySqlDAO implements IUserDAO{

    @Override
    public void getUser() {
        System.out.println("Mysql调用");
    }
}
