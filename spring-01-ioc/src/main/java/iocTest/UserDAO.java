package iocTest;

public class UserDAO implements IUserDAO{

    @Override
    public void getUser() {
        System.out.println("默认获取用户的数据");
    }
}
