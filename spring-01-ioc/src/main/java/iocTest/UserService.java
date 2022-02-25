package iocTest;

public class UserService implements IUserService{

    private IUserDAO userdao;





    @Override
    public void getUser() {
        userdao.getUser();
    }
    @Override
    //使用set可以实现动态的值注入，使用set方法可以让用户控制创建的对象，程序被动的接收对象（工厂模式）
    public void setUserDao(IUserDAO userDao) {
        this.userdao = userDao;
    }


}
