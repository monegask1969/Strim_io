package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;

/**
 * Created by moneg on 05.03.2016.
 * парсить и подсчитывать текст с файла
 */
public class laba_2 {

    public static final String sourceFileName= "sourse.txt";
    public static final String destFileName= "dest.txt";

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new FileReader(sourceFileName));
        PrintWriter write=new PrintWriter(destFileName);

        String s=null;
        int words=0, lines=0,chars=0;
        while ((s=reader.readLine())!=null)
        {
            lines++;
            String[] ws=s.trim().split("\\s");
            words+=ws.length;
            for(String l:ws)
                chars+=l.length();

            write.println(s.toUpperCase());
        }
        reader.close();
        write.close();
        out.printf("Quantity of chars- %d; Quantity of words - %d; Quantity of lines - %d\n",chars,words,lines);
    }
}