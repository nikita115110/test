package com.example.Ago.FileMeneger.Readers;

import java.io.IOException;
import java.util.List;

public interface Reader <T>{

      T read(String file) throws IOException;



}
