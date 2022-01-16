package com.example.Ago.Utils.ChartsConverter;

import java.util.List;

public interface Converter <T>{

    Object [] convert(Object [] list);

    Object [] convert(List <T>list);

}
