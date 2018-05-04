package org.test.printservice.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public interface PrintService {
    void executePrint(String content) throws java.io.FileNotFoundException, java.io.UnsupportedEncodingException ;

    boolean verifySuitability(int vara, int varb);
}
