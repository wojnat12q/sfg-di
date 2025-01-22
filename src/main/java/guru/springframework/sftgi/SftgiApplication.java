package guru.springframework.sftgi;

import guru.springframework.sftgi.controlers.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SftgiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SftgiApplication.class, args);

		PetController petController = ctx.getBean("petController", PetController.class);
		System.out.println("--- The Best Pet is ---");
		System.out.println(petController.whichPetIsTheBest());


		i18nController i18nController =(i18nController) ctx.getBean("i18nController");
		System.out.println(i18nController.sayHello());


		MyController myController = (MyController) ctx.getBean("myController");

		System.out.println("----------Primary bean");
		System.out.println(myController.sayHello());

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
