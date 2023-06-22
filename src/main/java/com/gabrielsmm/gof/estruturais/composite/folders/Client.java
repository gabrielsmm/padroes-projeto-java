package com.gabrielsmm.gof.estruturais.composite.folders;

import com.gabrielsmm.gof.estruturais.composite.folders.model.File;
import com.gabrielsmm.gof.estruturais.composite.folders.model.FileSystemItem;
import com.gabrielsmm.gof.estruturais.composite.folders.model.Folder;

import java.util.Arrays;
import java.util.List;

public class Client {

    public static void main(String[] args) {

        FileSystemItem file1 = new File("File1.txt");
        FileSystemItem file2 = new File("File2.txt");
        FileSystemItem file3 = new File("File3.txt");
        FileSystemItem file4 = new File("File4.txt");
        FileSystemItem sf1 = new Folder("sf1", List.of(file1));
        FileSystemItem sf2 = new Folder("sf2", Arrays.asList(file2, sf1));
        FileSystemItem folder = new Folder("folder", Arrays.asList(sf2, file3, file4));

        folder.print("");

    }

}
