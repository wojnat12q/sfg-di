package guru.springframework.sftgi.controlers;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {
    public String sayHello() {
        System.out.println("Hello World");

        return "i like potatos";
    }
}
