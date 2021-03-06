package hello;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@SpringBootApplication
public class Application {

    private static Logger log = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args)
    {
        SpringApplication.run(Application.class, args);
    }

    @Autowired
    JdbcTemplate jdbctemplate;

    public void run (String... strings) throws Exception
    {
        log.info("Inserting new Customer into Table");
    }
}
