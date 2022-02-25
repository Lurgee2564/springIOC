package iocTest;

public class UserDAOSql implements IUserDAO{

    @Override
    public void getUser() {
        System.out.println("Mysql获取用户的数据");
    }
}
