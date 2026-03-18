package hei.school.td1.controller;

import hei.school.td1.service.HelloService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    private final HelloService helloService;

    public HelloController(HelloService helloService) {
        this.helloService = helloService;
    }

    @GetMapping("/hello-world")
    public String helloWorld() {
        return helloService.getHelloMessage();
    }
}
