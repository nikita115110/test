package com.example.Ago.FileMeneger;

import lombok.Getter;
import lombok.Setter;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public abstract class FileMeneger {

    @Getter @Setter
    private String folder;

    public List<String> findAll(){
        List<String> list = new ArrayList<>();
        try (DirectoryStream<Path> files = Files.newDirectoryStream(Path.of(folder))) {
            for (Path path : files)
                list.add(path.getFileName().toString());
        } catch (IOException e) {
            e.printStackTrace();
        }

        return list;
    }



    public boolean find(String file){

        return true;
    }

}
