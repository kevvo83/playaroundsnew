package hello;

import hello.config.Customer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;


@RestController
public class GreetingController {

    private static final String template ="Hello %s";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value="name", defaultValue="Worldy World")String name)
    {
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }

    @RequestMapping("/add")
    public Customer addNewCustomer(@RequestParam(value="customername", defaultValue="John Doe") String customername)
    {
        return new Customer(customername);
    }


}
