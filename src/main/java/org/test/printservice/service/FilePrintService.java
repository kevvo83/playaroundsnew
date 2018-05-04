package org.test.printservice.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.PrintWriter;

@Component("fileprinter")
public class FilePrintService implements PrintService {

    private Logger logger = LoggerFactory.getLogger(FilePrintService.class);

    public void executePrint(String content) throws java.io.FileNotFoundException, java.io.UnsupportedEncodingException {
        PrintWriter writer = new PrintWriter("abc.txt", "UTF-8");
        writer.print(content);
        writer.close();
    }

    public boolean verifySuitability(int vara, int varb)
    {
        boolean ret = false;

        try (PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("abc.txt")))) {
            int result = vara + varb;
            out.println("*** Verify Suitability Result is: " + result);
            ret = true;
        }
        catch (Exception exp)
        {
            System.out.println("Exception encountered of type:" + exp.getMessage());
            System.out.println("Stack Trace:" + exp.getMessage());
        }
        return ret;
    }

}
