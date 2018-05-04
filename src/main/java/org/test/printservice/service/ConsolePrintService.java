package org.test.printservice.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component("consoleprinter")
public class ConsolePrintService implements PrintService {

    private static final Logger logger = LoggerFactory.getLogger(ConsolePrintService.class);

    @Override
    public void executePrint(String content) {
        logger.info(content);
    }

    public boolean verifySuitability(int inta, int intb)
    {
        boolean ret = false;
        int result = inta + intb;
        logger.info("*** Verify Suitability Result is: " + result);
        return ret;
    }
}
