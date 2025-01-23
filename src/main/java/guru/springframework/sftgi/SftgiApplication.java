package guru.springframework.sftgi;

import guru.springframework.sftgi.controlers.*;
import guru.springframework.sftgi.datasorce.FakeDataSorce;
import guru.springframework.sftgi.service.PrototypeBean;
import guru.springframework.sftgi.service.SingletonBean;
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

		System.out.println("----------BEANS SCOPE--------");
		SingletonBean singletonBean1 = ctx.getBean(SingletonBean.class);
		System.out.println(singletonBean1.getMyScope());
		SingletonBean singletonBean2 = ctx.getBean(SingletonBean.class);
		System.out.println(singletonBean2.getMyScope());

		PrototypeBean prototypeBean1 = ctx.getBean(PrototypeBean.class);
		System.out.println(prototypeBean1.getMyScope());
		PrototypeBean prototypeBean2 = ctx.getBean(PrototypeBean.class);
		System.out.println(prototypeBean2.getMyScope());


		FakeDataSorce fakeDataSorce	= ctx.getBean(FakeDataSorce.class);
		System.out.println(fakeDataSorce.getUsername());
		System.out.println(fakeDataSorce.getPassword());
		System.out.println(fakeDataSorce.getJdbcurl());

	}

}
