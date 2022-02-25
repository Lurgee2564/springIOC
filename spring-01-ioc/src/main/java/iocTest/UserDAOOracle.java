package iocTest;

public class UserDAOOracle implements IUserDAO{

    @Override
    public void getUser() {
        System.out.println("Oracle获取用户的数据");
    }
}
