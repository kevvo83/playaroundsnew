package hello.config;

import java.util.concurrent.atomic.AtomicInteger;

public class Customer {

    private static AtomicInteger counter = new AtomicInteger();

    private String name;
    private int id;

    public Customer(String name) {
        this.name = name;
        this.id = counter.incrementAndGet();
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
