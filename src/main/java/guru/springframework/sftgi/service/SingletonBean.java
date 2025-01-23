package guru.springframework.sftgi.service;

import org.springframework.stereotype.Component;

@Component
public class SingletonBean {
    public SingletonBean() {
        System.out.println("Creating SingletonBean");
    }

    public String getMyScope() {
        return "singleton";
    }
}
