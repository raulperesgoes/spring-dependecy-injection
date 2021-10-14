package guru.spring.framework.dependencyinjection.controllers;

import guru.spring.framework.dependencyinjection.services.GreetingService;
import org.springframework.stereotype.Controller;
import sun.awt.X11.XSystemTrayPeer;

import javax.management.remote.rmi._RMIConnection_Stub;

@Controller
public class MyController {
    private final GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello() {
         return greetingService.sayGreeting();
    }
}
