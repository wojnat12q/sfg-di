package guru.springframework.sftgi;

import guru.springframework.sftgi.controlers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SftgiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SftgiApplication.class, args);

		MyController controller = (MyController) ctx.getBean("myController");

		String greetings = controller.sayHello();

		System.out.println(greetings);
	}

}
