package com.array.problems;

import java.io.File;    
import java.io.FileReader;    
import java.io.IOException;    
import java.io.BufferedReader;    

class Cleaner{    

    public static void main( String a[] )    
    {    
        String source = readFile("source.java");    

        System.out.println(source.replaceAll("(?:/\\*(?:[^*]|(?:\\*+[^*/]))*\\*+/)|(?://.*)",""));    

    }    


    static String readFile(String fileName) {    

        File file = new File(fileName);    

        char[] buffer = null;    

        try {    
                BufferedReader bufferedReader = new BufferedReader( new FileReader(file));    

                buffer = new char[(int)file.length()];    

                int i = 0;    
                int c = bufferedReader.read();    

                while (c != -1) {    
                    buffer[i++] = (char)c;    
                    c = bufferedReader.read();    
                }    

        } catch (IOException e) {    
            e.printStackTrace();    
        }    

        return new String(buffer);    
    }    

}    