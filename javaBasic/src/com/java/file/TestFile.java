package com.java.file;

import java.io.File;
import java.io.IOException;

public class TestFile {
    public static void main(String[] args) throws IOException {
        String path = "D:" + File.separator + "studyDaily" + File.separator + ".gitignore2";
        File file = new File(path);
        if (file.exists()) {
            file.delete();
            System.out.println("存在");
        } else {
            file.createNewFile();
        }
    }
}
