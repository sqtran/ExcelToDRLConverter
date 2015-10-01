package com.honeybadger.drlconverter;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import org.drools.decisiontable.InputType;
import org.drools.decisiontable.SpreadsheetCompiler;

public class ExcelToDrlDemo {

    public static void main(String args[]) {
        // create an input stream
        InputStream is = null;
        try {
            // assign the excel to the input stream
            // mention the local directory path where your excel is kept
            // you can take any decision table (excel sheet) for testing
            is = new FileInputStream("src/main/resources/mediChipFPL.xls");
        } catch(FileNotFoundException e) {
            e.printStackTrace();
        }
        // create compiler class instance
        SpreadsheetCompiler sc = new SpreadsheetCompiler();
        // compile the excel to generate the (.drl) file
        
        String drl = sc.compile(is, InputType.XLS);

        // check the generated (.drl) file
        System.out.println("Generate DRL file is –: ");
        System.out.println(drl);
    }
}