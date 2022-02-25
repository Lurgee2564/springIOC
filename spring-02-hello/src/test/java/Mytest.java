import demo.jianjun.first.Hello;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mytest {
    public static void main(String[] args) {
        /*
        我们使用di注入，将对象交给spring管理对象之后
        开发者对对象的控制权交给了spring容器管理，相当于交给了用户选择对象
        * */
        //使用xml创建对象就必须使用classpathxmlapplicationcontext获取spring上下文
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        //使用context对象的getbean方法更具spring设置的对象名来获取对象
        Hello hello = (Hello) context.getBean("hello");
        //获取对象之后即可使用对象的方法
        System.out.println(hello.toString());

    }
    @Test
    public void t(){
        System.out.println("testtest");
    }

}
