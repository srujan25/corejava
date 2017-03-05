package springPractise;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by SG0221519 on 2/22/2017.
 */
public class AdditionOfTwoNumbersTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        //Below line is required to initiate the bean, since we declared bean as lazy-init = true
        //If bean is lazy-int = false, we no need below line, Application context is only required. It initiates there only
        AdditionOfTwoNumbers add = (AdditionOfTwoNumbers) context.getBean("addProgram");
      //  context.getBean("addProgram");
    }

}
