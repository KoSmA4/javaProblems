import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        String beanName = args[0];
        Programmer programmer = (Programmer) context.getBean(beanName);
        programmer.doCoding();
    }
}
