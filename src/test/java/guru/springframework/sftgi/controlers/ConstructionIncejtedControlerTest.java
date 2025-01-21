package guru.springframework.sftgi.controlers;

import guru.springframework.sftgi.service.GreetingsServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ConstructionIncejtedControlerTest {

    ConstructionIncejtedControler controller;

    @BeforeEach
    void setUp() {
        controller = new ConstructionIncejtedControler(new GreetingsServiceImpl());
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}