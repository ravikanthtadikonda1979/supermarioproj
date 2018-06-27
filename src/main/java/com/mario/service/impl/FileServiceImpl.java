package com.mario.service.impl;

import com.mario.service.FileService;

import java.io.*;

public class FileServiceImpl implements FileService {

    private String fileName;

    public FileServiceImpl(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public BufferedReader getFileData() {
        if (fileName == null || fileName.isEmpty()) return null;
        ClassLoader classLoader = this.getClass().getClassLoader();
        InputStream inputStream = classLoader.getResourceAsStream(this.fileName);
        if (inputStream == null) return null;
        return new BufferedReader(new InputStreamReader(inputStream));
    }
}
