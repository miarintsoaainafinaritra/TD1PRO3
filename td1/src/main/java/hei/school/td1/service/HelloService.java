package hei.school.td1.service;

import hei.school.td1.entity.Hello;
import hei.school.td1.repository.HelloRepository;
import org.springframework.stereotype.Service;

@Service
public class HelloService {

    private final HelloRepository helloRepository;

    public HelloService(HelloRepository helloRepository) {
        this.helloRepository = helloRepository;
    }

    public String getHelloMessage() {
       
        Hello hello = helloRepository.findHelloMessage();
        return hello.getMessage();
    }
}
