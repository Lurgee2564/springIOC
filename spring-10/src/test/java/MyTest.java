
import demo.dao.UserMapper;
import demo.dao.UserMapperImpl;
import demo.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        UserMapper mapper = context.getBean("userMapper", UserMapper.class);
        int res = mapper.addUser(new User(5, "spring-mybatis", "20220226", "122344"));
        if(res==1){
            System.out.println("添加成功！");
        }
        List<User> userList = mapper.getUser();
        for (User user : userList) {
            System.out.println(user);
        }
    }
}
