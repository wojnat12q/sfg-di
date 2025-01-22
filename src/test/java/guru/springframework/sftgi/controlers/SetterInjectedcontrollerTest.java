package guru.springframework.sftgi.controlers;


import guru.springframework.sftgi.service.ConstructorGreetingsService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



class SetterInjectedcontrollerTest {

    SetterInjectedcontroller controller;

    @BeforeEach
    void setUp() {
        controller = new SetterInjectedcontroller();
        controller.setGreetingsService(new ConstructorGreetingsService());
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}