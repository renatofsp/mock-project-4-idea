package com.toUse;

import java.io.InputStream;
import java.util.Scanner;

public class MyXmlReader {


    public String readXMLFile(){
        InputStream file= this.getClass().getClassLoader().getResourceAsStream("xmlFileToRead.xml");
        Scanner s = new Scanner(file).useDelimiter("\\A");
        String result = s.hasNext() ? s.next() : "";
        return result;
    }
}
