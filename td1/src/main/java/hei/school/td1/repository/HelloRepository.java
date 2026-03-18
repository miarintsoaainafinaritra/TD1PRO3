package hei.school.td1.repository;

import hei.school.td1.entity.Hello;
import org.springframework.stereotype.Repository;

@Repository
public class HelloRepository {

    public Hello findHelloMessage() {
        return new Hello("Hello World");
    }
}