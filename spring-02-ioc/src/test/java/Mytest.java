import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import springIOC.DAO.IUserDAO;
import springIOC.DAO.MySqlDAO;
import springIOC.DAO.OracleDAO;
import springIOC.DAO.UserDAO;
import springIOC.service.IUserService;
import springIOC.service.UserService;

public class Mytest {
    public static void main(String[] args) {
        //创建应用上下文
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
       // UserDAO user = (UserDAO) context.getBean("userDAO");

        //使用service对象调用
        //此时用户需要使用不同对象时，我们只需要修改xml配置文件即可，不需要更改代码来实现新的功能，或者使用新队对象
        UserService service = (UserService) context.getBean("userService");

        service.getUser();

    }
}
