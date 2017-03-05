package springPractise;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by SG0221519 on 2/22/2017.
 */
public class TextEditorTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        TextEditor te = (TextEditor) context.getBean("textEditor");
        te.checkSpelling();
    }
}
