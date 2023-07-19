package org.example;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ReadExcelFile {
    public static void main (String[] args){
        try {
            // read the file
            // just for checking and see the changes
            //      File file = new File(pathname: "c:\\)
            FileInputStream fileInputStream = new FileInputStream(file);




        } catch (Exception e) {
            System.err.println("Error is :" +e.getMessage());
        }
    }

}
