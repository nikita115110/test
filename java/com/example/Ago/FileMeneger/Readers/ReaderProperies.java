package com.example.Ago.FileMeneger.Readers;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReaderProperies  implements Reader{

    @Override
    public Properties read(String file) throws IOException {
        Properties properties = new Properties();
        FileInputStream fin = null;
        try {
            fin = new FileInputStream(file);
            properties.load((fin));
        }catch (IOException e){
        }
        return properties;
    }

}
