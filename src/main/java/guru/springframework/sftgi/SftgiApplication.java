package guru.springframework.sftgi;

import guru.springframework.sftgi.controlers.ConstructionIncejtedControler;
import guru.springframework.sftgi.controlers.MyController;
import guru.springframework.sftgi.controlers.ProperyInjectedController;
import guru.springframework.sftgi.controlers.SetterInjectedcontroller;
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

		System.out.println("----------Property");

		ProperyInjectedController properyInjectedController = (ProperyInjectedController) ctx.getBean("properyInjectedController");
		System.out.println(properyInjectedController.getGreeting());

		System.out.println("----------Constructor");

		ConstructionIncejtedControler constructionIncejtedControler =(ConstructionIncejtedControler) ctx.getBean("constructionIncejtedControler");
		System.out.println(constructionIncejtedControler.getGreeting());

		System.out.println("----------Setter");

		SetterInjectedcontroller setterInjectedcontroller = (SetterInjectedcontroller) ctx.getBean("setterInjectedcontroller");
		System.out.println(setterInjectedcontroller.getGreeting());




	}

}
