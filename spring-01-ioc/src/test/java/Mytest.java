import iocTest.*;

public class Mytest {
    public static void main(String[] args) {

        UserService us =new UserService();
        ((IUserService) us).setUserDao(new UserDAOOracle());
        us.getUser();


    }
}
