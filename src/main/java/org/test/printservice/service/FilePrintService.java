package org.test.printservice.service;

import org.springframework.stereotype.Component;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

@Component("fileprinter")
public class FilePrintService implements PrintService {

    public void executePrint(String content) throws java.io.FileNotFoundException, java.io.UnsupportedEncodingException {
        PrintWriter writer = new PrintWriter("abc.txt", "UTF-8");
        writer.print(content);
        writer.close();
    }

}
