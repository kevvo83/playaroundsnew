package org.test.printservice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.test.printservice.service.PrintService;

import java.util.Properties;

@RestController
public class PrintController {

    private static final Logger logobj = LoggerFactory.getLogger(PrintController.class);

    @Autowired
    @Qualifier("consoleprinter")
    private PrintService service;

    @RequestMapping("/")
    public void doPrinting()
    {
        try {
            service.executePrint("This is the Dependency Injection message printed");
            logobj.info("LogMessage, This is the Dependency Injection message printed");
        }
        catch (Exception exp){
            logobj.info("Exception encountered while serving Print Request");
        }
    }
}
