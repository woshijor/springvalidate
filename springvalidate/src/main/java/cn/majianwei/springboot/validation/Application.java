package cn.majianwei.springboot.validation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@EnableAspectJAutoProxy(exposeProxy = true) // http://www.voidcn.com/article/p-zddcuyii-bpt.html
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
